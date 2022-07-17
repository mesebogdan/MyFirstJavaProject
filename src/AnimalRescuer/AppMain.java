package AnimalRescuer;

import AnimalRescuer.Activities.OutdoorActivity;
import AnimalRescuer.Animalfood.AnimalFood;
import AnimalRescuer.animal.Animal;
import AnimalRescuer.animal.cat.Cat;
import AnimalRescuer.animal.cat.Siamese;
import AnimalRescuer.animal.dog.Chiwawa;
import AnimalRescuer.animal.dog.Dog;
import AnimalRescuer.animal.duck.Duck;
import AnimalRescuer.animal.duck.GoldenDuck;
import AnimalRescuer.people.Adoption;
import AnimalRescuer.people.Veterinarian;

public class AppMain {

    public static void main(String[] args) {

        Dog ralph = new Dog();
        System.out.println(ralph.getName());
        ralph.setName("Ralph");
        ralph.play();
        ralph.favouritefood();
        ralph.favouritegames();

        Dog bruno=new Dog();
        bruno.setName("Bruno");
        System.out.println(bruno.getName());
        bruno.setRace("ciobanesc");
        System.out.println(bruno.getRace());
        bruno.setAge(4);
        System.out.println(bruno.getAge());
        bruno.setHappyFeet(5);
        System.out.println(bruno.getHappyFeet());

        Dog brunel=new Dog();
        brunel.setName("Brunel");
        System.out.println(brunel.getName());
        brunel.setAge(6);
        brunel.setRace("streeter");
        System.out.println(brunel.getAge());

        Adoption mariaTheGreat = new Adoption();
        mariaTheGreat.setName("Maria The Great");
        System.out.println(mariaTheGreat.getName());
        mariaTheGreat.moneytoinvest();

        AnimalFood food = new AnimalFood();
        food.setName("Pedigri");
        System.out.println(food.getName());
        food.setPriceindollar(100);
        System.out.println(food.getPriceindollar());
        food.setQuantity(50);
        System.out.println(food.getQuantity());
        food.setStock(10);
        System.out.println(food.getStock());

        OutdoorActivity activity = new OutdoorActivity();
        activity.playoutside();

        Veterinarian theVet = new Veterinarian();
        theVet.setName("Coco Carasco");
        System.out.println(theVet.getName());
        theVet.specialization();

        Siamese fluffy= new Siamese();
        fluffy.favouritefood();

        Dog pitty= new Chiwawa();
        pitty.play();

        Duck ducky=new Duck();
        ducky.eat();

    }
}
