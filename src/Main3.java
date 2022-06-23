public class Main3 {

    public static void main(String[] args) {

        LogicalOperations op = new LogicalOperations();

        int biggest= op.checkBiggerNumber(10, 56);
        System.out.println("ex.3.Bigger number is: "+ biggest);

        String textinput = "FastTrack2";
        System.out.println("ex.4.Text to show: " + op.verifytext(textinput));

        String text = "FastTrackIT";
        int number = 2;
        System.out.println("ex.5." + op.textandnumbertoshow(text, number));

        int nr = 7;
        System.out.println("ex.6." + op.snowshow(nr));

        String greater= op.greaternumbers(99);
        System.out.println("ex.7." + greater);

        int numberno = 8;
        op.switchnumber(numberno);

        int numero = 100;
        System.out.println("ex.9. Even number? : " + op.isNumberEven(numero));

        int varsta = 19;
        System.out.println("ex.10. Is he eligible to vote?: " + op.isEligibleToVote(varsta));

    }
}
