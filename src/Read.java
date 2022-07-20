import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {

    public double getDouble() {
        double number = 0;
        boolean repeat;
        Scanner scan = new Scanner(System.in);
        do {
            try {
                System.out.println("Please enter a number: ");
                number = scan.nextDouble();
                repeat = false;
            } catch (InputMismatchException exception) {
                System.out.println("Please enter a valid number. Your given character is: " + scan.next());
                repeat = true;
            }
        } while (repeat);
        return number;
    }

    public float getFloat(){
        float number=0;
        boolean repeat;
        Scanner scanner=new Scanner(System.in);
        do {
            try {
                System.out.println("Please enter a new number: ");
                number = scanner.nextFloat();
                repeat = false;
            } catch (InputMismatchException exception) {
                System.out.println("Please enter a new valid number. Your given character is: " + scanner.nextFloat());
                repeat = true;
            }
        } while (repeat);
            return number;
        }

}
