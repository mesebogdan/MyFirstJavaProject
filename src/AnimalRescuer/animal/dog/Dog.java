package AnimalRescuer.animal.dog;

import AnimalRescuer.animal.Animal;

public abstract class Dog extends Animal {


    public void waveTail(){
        System.out.println("Waving the tail");
    }

    public abstract void favouritefood();
    public abstract void favouritegames();

    @Override
    public void eat(){
        System.out.println("eating dog food");
    }

    @Override
    public void sleep(){
        System.out.println("snores...zzz");
    }
    @Override
    public void speak(){
        System.out.println("Ham");
    }

    @Override
    public void play() {
        System.out.println("Playing fetch");
    }
}
