package AnimalRescuer.animal;

public class Animal {
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

    public void favouritefood(){
        System.out.println("He likes pizza");
    }
    public void favouritegames(){
        System.out.println("Getting the ball back");
    }
    public void eat(){
        System.out.println("eating dog food");
    }
    public void sleep(){
        System.out.println("snores...zzz");
    }
    public void speak(){
        System.out.println("Ham");
    }
    public void play(){
        System.out.println("Playing fetch");
    }
}
