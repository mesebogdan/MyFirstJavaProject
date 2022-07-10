public class Main5 {
    public static void main(String[] args) {
        LogicalOperations op =new LogicalOperations();
        int[] myarray= op.myarrayy(100);
        op.printarray(myarray);

        int[] otherarray=op.evennumber22(100);
        op.printevennumberarray(otherarray);
        System.out.println(op.averagefromarraynumbers(otherarray));

        String[] myarraystring={"m", "s", "e"};
        System.out.println();
        if (op.istrueorfalsearray(myarraystring, "e")){
            System.out.println("aceasta este litera");
        }
        else
            System.out.println("nu aceasta este litera");
        }

}
