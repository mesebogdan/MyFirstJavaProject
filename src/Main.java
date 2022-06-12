import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        printmyname();

        System.out.println(operatia1(-5, 8, 6));
        System.out.println(operatia2(55, 9, 9));
        System.out.println(operatia3(20,-3, 5, 8));
        System.out.println(operatia4(5, 15, 3, 2, 8, 3));

        Calculator calc = new Calculator();

        System.out.println(calc.adunare(10, 8));
        System.out.println(calc.scadere(10, 8));
        System.out.println(calc.inmultire(10, 8));
        System.out.println(calc.impartire(10, 8));

        Print print = new Print();

        print.JavaLogo();
        print.omulet();

        System.out.println(calc.medianumerelor(10, 8, 6));
        System.out.println(calc.restulimpartirii(10, 7));
        System.out.println(calc.FahrenheittoCelsius(100));
        System.out.println(calc.inchtocm(200));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter distance in meters: ");
        double distanta = scanner.nextDouble();
        System.out.println("Please enter hours: ");
        double ore = scanner.nextDouble();
        System.out.println("Please enter minutes: ");
        double minute = scanner.nextDouble();
        System.out.println("Please enter seconds: ");
        double secunde = scanner.nextDouble();

        System.out.println("Your speed in m/s is: " + calc.speedinms(distanta, ore, minute, secunde) +
                "\nYour speed in km/h is: " + calc.speedinkm(distanta, ore, minute, secunde) +
                "\nYour speed in mph is: " + calc.speedinmile(distanta, ore, minute, secunde));

    }
    public static void printmyname(){
        System.out.println("Hello \nMesesan Bogdan");
    }

    public static int operatia1(int x, int y, int z) {
        return x + y * z;
    }
    public static int operatia2(int x, int y, int z) {
        return (x + y) % z;
    }
    public static double operatia3(double x, double y, double z, double p) {
        return x + ( y * z / p);
    }
    public static double operatia4(double x, double y, double z, double p, double m, double n){
        return x + ( y / z * p ) - ( m % n );

    }

}