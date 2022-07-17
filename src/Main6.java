import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {


        LogicalOperations op = new LogicalOperations();

        List<Integer> mylist = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            mylist.add(i);
        }
        op.numberToNewRowEx1(mylist);

        List<Integer> otherlissst = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            otherlissst.add(i);
        }
        op.addLastEx2(otherlissst, 57);

        List<Integer> kkk = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            kkk.add(i);
        }
        op.printRealAndNormalNumberEx3(kkk, 3);

        List<Integer> mylist2 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            mylist2.add(i);
        }
        op.printNumberBackwardEx4(mylist2);

        List<String> myStringList = new ArrayList<>();
        myStringList.add("Pozitia 1");
        myStringList.add("Pozitia 2");
        myStringList.add("Pozitia 3");
        myStringList.add("Pozitia 4");

        op.stringNumberStringeEx5(myStringList, 2, "alta pozitia");

        op.addFirstEx6(otherlissst, 22);

        List<Integer> nnn = new ArrayList<>();
        for (int i =45; i <= 50; i++) {
            nnn.add(i);
        }
        op.pozitiaSiNumaruEx7(nnn);

        List<Integer> unorderedList = new ArrayList<>();
        unorderedList.add(5);
        unorderedList.add(111);
        unorderedList.add(112);
        unorderedList.add(67);

        System.out.println(op.getHighestNrEx8(unorderedList));




    }
}
