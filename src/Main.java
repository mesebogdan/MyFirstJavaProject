import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        printmyname();

        Calculator calc = new Calculator();

        System.out.println("operatia 1: " + calc.operatia1(-5, 8, 6));
        System.out.println("operatia 2: " + calc.operatia2(55, 9, 9));
        System.out.println("operatia 3: " + calc.operatia3(20,-3, 5, 8));
        System.out.println("operatia 4: " + calc.operatia4(5, 15, 3, 2, 8, 3));


        System.out.println("operatie adunare: " + calc.adunare(10, 8));
        System.out.println("operatie scadere: " + calc.scadere(10, 8));
        System.out.println("operatie inmultire: " + calc.inmultire(10, 8));
        System.out.println("operatie impartire: " + calc.impartire(10, 8));


        Print print = new Print();

        print.JavaLogo();
        print.omulet();


        System.out.println("operatie media numerelor: " + calc.medianumerelor(10, 8, 6));
        System.out.println("operatie restul impartirii: " + calc.restulimpartirii(10, 7));
        System.out.println("operatie Fahrenheit to Celsius: " + calc.FahrenheittoCelsius(100));
        System.out.println("operatie inch to cm: " + calc.inchtocm(200));



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






    }

