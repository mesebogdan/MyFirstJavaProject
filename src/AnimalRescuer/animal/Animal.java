package AnimalRescuer.animal;

public abstract class Animal {
    private int age;
    private String race;
    private String name;
    private String colour;
    private double weight;
    private int heightCm;
    private int healthLevel;
    private int starvingLevel;
    private int happyFeet;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getRace(){
        return race;
    }
    public void setRace(String race){
        this.race=race;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour=colour;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public int getHeightCm(){
        return heightCm;
    }
    public void setHeightCm(int heightCm){
        this.heightCm=heightCm;
    }
    public int getHealthLevel(){
        return healthLevel;
    }
    public void setHealthLevel(int healthLevel){
        this.healthLevel=healthLevel;
    }
    public int getStarvingLevel(){
        return starvingLevel;
    }
    public void setStarvingLevel(int starvingLevel){
        this.starvingLevel=starvingLevel;
    }
    public int getHappyFeet(){
        return happyFeet;
    }
    public void setHappyFeet(int happyFeet){
        this.happyFeet=happyFeet;
    }

    public abstract void favouritefood();
    public abstract void favouritegames();
    public abstract void eat();
    public abstract void sleep();
    public abstract void speak();
    public abstract void play();
}
