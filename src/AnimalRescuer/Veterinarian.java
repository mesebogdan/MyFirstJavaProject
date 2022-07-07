package AnimalRescuer;

public class Veterinarian {

    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public void specialization(){
        System.out.println("He is specialized in small dogs");
    }

}
