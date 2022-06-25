package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {
        Dog ralph = new Dog();
        System.out.println(ralph.name);
        ralph.play();
        ralph.favouritefood();
        ralph.favouritegames();

        Adoption mariaTheGreat = new Adoption();
        System.out.println(mariaTheGreat.name);
        mariaTheGreat.moneytoinvest();

        AnimalFood food = new AnimalFood();
        System.out.println(food.name);
        System.out.println(food.priceindollar);
        System.out.println(food.quantity);
        System.out.println(food.stock);

        OutdoorActivity activity = new OutdoorActivity();
        activity.playoutside();

        Veterinarian theVet = new Veterinarian();
        System.out.println(theVet.name);
        theVet.specialization();
    }
}
