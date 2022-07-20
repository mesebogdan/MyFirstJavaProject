package AnimalRescuer.animal.cat;

import AnimalRescuer.animal.Animal;

public abstract class Cat extends Animal {
    public void favouritefood(){
        System.out.println("He likes milk");
    }
    public void favouritegames(){
        System.out.println("Rolling the ball");
    }
    public void eat(){
        System.out.println("eating cat food");
    }
    public void sleep(){
        System.out.println("snores...grrrrr");
    }
    public abstract void speak();

    public abstract void play();

}
