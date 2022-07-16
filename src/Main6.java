import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {


        LogicalOperations op = new LogicalOperations();

        List<Integer> mylist = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            mylist.add(i);
        }
        op.numbertonewrowex1(mylist);

        List<Integer> otherlissst = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            otherlissst.add(i);
        }
        op.addlastex2(otherlissst, 57);

        List<Integer> mylist2 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            mylist2.add(i);
        }
        op.printnumberbackwardex4(mylist2);

        op.addfirstex6(otherlissst, 22);

        List<Integer> nnn = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            nnn.add(i);
        }
        op.pozitiasinumarulafisateex7(nnn);







        List<Integer> unorderedList = new ArrayList<>();
        unorderedList.add(5);
        unorderedList.add(111);
        unorderedList.add(112);
        unorderedList.add(67);

        System.out.println(op.gethighestnrex8(unorderedList));

        List<Integer> kkk = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            kkk.add(i);
        }
            op.printrealandnormalnumberex3(kkk, 3);

        op.stringnumberstringex5(otherlissst, 2, "jkjkj");



    }
}
