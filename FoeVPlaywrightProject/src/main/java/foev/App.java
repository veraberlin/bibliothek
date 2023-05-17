package foev;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import foev.entity.MonthlyCharge;
import foev.service.MonthlyChargeParser;

import java.util.List;
import java.util.regex.Pattern;

public class App {
    private static final String TEXT="Essensgeld 05-2023";
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
            Page page = browser.newPage();

            login(page);
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Vorlagen")).click();
            page.getByText("Lastschriftvorlagen").click();
            //Loop begin
            List<MonthlyCharge> charges = MonthlyChargeParser.createMonthlyChargeList();
            page.pause();
            for (MonthlyCharge charge : charges){
                System.out.println("Starting with Charge:" + charge.getMandant());
                page.getByRole(AriaRole.SEARCHBOX, new Page.GetByRoleOptions().setName("Suchen")).click();
                page.getByRole(AriaRole.SEARCHBOX, new Page.GetByRoleOptions().setName("Suchen")).fill(charge.getMandant());

                page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(Pattern.compile(
                        charge.getMandant() + " E" +
                                "(.*?)" + //Anything
                                "\\|Lastschrift Vorlage Menü")))
                        .getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Menü")).click();
                page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Bearbeiten")).click();

                page.getByLabel("Betrag").click();
                page.getByLabel("Betrag").fill(String.valueOf(charge.getAmount()));
                page.getByLabel("Verwendungszweck").click();
                page.getByLabel("Verwendungszweck").fill(TEXT);
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Speichern")).click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Zur Übersicht")).click();
                System.out.println("Done with Charge:" + charge.getMandant());
            }
            page.pause();
            //Loop ende
            System.out.println(page.title());
        }
    }

    private static void login(Page page) {
        page.navigate("https://www.rb-hessennord.de/services_auth/auth-ui/?v=6f3f766fab08c71d80dba9acecfb4baa&client_id=fkp&redirect_uri=https:%2F%2Fwww.rb-hessennord.de%2Fservices_cloud%2Fportal%2Fportal-oauth%2Flogin");
        page.getByLabel("VR-NetKey oder Alias").click();
        page.getByLabel("VR-NetKey oder Alias").fill("");
        page.getByLabel("PIN").click();
        page.getByLabel("PIN").fill("");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Anmelden")).click();
    }

}