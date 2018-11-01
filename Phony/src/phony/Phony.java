// Authors: Vert, David; May, Cullen; Westmoreland, Donavan;
package phony;
import java.util.*;
public class Phony {

    public static void main(String[] args) {
        IncomeCall mehFist = new IncomeCall("999-666-6969");
        OutCall callMeh = new OutCall("417-741-1379", 12.34);
        IncomeCall mehk = new IncomeCall("666-999-6969");
        OutCall k9 = new OutCall("417-156-2956", 116.32);
        IncomeCall menStan = new IncomeCall("869-485-9696");
        OutCall cali = new OutCall("369-867-5301", 25.26);
        IncomeCall beats = new IncomeCall("816-424-7648");
        OutCall foneCall = new OutCall("987-526-4816", 2.25);
        IncomeCall incomeCali = new IncomeCall("156-986-1829");
        OutCall outing = new OutCall("416-682-4197", 6996.12);
        
        ArrayList<PhoneCall> army = new ArrayList<PhoneCall>();
        army.add(mehFist);
        army.add(callMeh);
        army.add(mehk);
        army.add(k9);
        army.add(menStan);
        army.add(cali);
        army.add(beats);
        army.add(foneCall);
        army.add(incomeCali);
        army.add(outing);
        
        for (int x = 0; x < army.size(); x++) {
            army.get(x).MakeMeh();
        }
    }
}
