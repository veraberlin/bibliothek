package foev.entity;

public class MonthlyCharge {

    public MonthlyCharge(String mandant, String text, String amountAsString) {
        this.mandant = mandant;
        this.amount = amountAsString;
        this.text = text;
    }

    private String mandant;
    private String amount;
    private String text;


    public String getMandant() {
        return mandant;
    }

    public String getAmount() {
        return amount;
    }

    public String getText() {
        return text;
    }
}
