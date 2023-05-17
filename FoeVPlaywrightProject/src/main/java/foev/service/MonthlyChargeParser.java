package foev.service;

import foev.entity.MonthlyCharge;

import java.util.ArrayList;
import java.util.List;

public class MonthlyChargeParser {

    private MonthlyChargeParser(){
    }

    public static List<MonthlyCharge> createMonthlyChargeList(){
        List<MonthlyCharge> monthlyCharges = new ArrayList<>();

        monthlyCharges.add(new MonthlyCharge("MGL-FV000137_1","Böcker, Richard","57,8"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000184","Bröcker, Niklas","64,6"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000165_1","Cusig, Vincent-Levi","64,6"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000186","Daniel, Marlon","64,6"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000189","Gellner, Zoe","64,6"));

        monthlyCharges.add(new MonthlyCharge("MGL-FV000182","Diederich, Leonie","64,6"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000117","Edlich, Zoe Sophie","64,6"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000179","Köhler, Ben","64,6"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000170","Köhler, Felix","54,4"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000187","Nowak, Noah Konstantin","64,6"));

        monthlyCharges.add(new MonthlyCharge("MGL-FV000162","Alvarez, Adriano","54,4"));

        monthlyCharges.add(new MonthlyCharge("MGL-FV000163","Bürger-Emden, Mattis","54,4"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000160","Gruner, Tobias","44,2"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000170_2","Köhler, Lina","44,2"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000132_1","Nuhn, Marie","17"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000175","Schrader, Elise","10,2"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000165_2","Cusig, Lene-Luise","0"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000129_1","Giambalo, Nevio","54,4"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000167_1","Günther, Nala","54,4"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000167_2","Günther, Romy","54,4"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000171","Kortümm, Thea","54,4"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000173","Petrovszki, Jonas Bence","17"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000174","Pötzl, Ben","17"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000176","Tobolik, Sophie","54,4"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000154_1","Woldemichael, Jonathan","44,2"));


        monthlyCharges.add(new MonthlyCharge("MGL-FV000141","Boenke, Noel","64,6"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000117_1","Edlich, Jan Levi","64,6"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000147","Heide, Maria","54,4"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000153","Schwarzbach, Henriette","64,6"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000154_2","Woldemichael, Esey","54,4"));

        monthlyCharges.add(new MonthlyCharge("MGL-FV000150","Kann, Mia","54,4"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000139","Wamser, Luca","54,4"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000177","Zarei, Arad","64,6"));

        monthlyCharges.add(new MonthlyCharge("MGL-FV000137_2","Böcker, Mathilda","54,4"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000129_2","Giambalvo, Gioia","64,6"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000132_2","Nuhn, Sarah","17"));
        monthlyCharges.add(new MonthlyCharge("MGL-FV000130","Wehrwein, Mila","64,6"));

        return monthlyCharges;
    }

}
