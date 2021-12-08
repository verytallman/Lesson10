package HW10;

public class Dog extends Animal {
    public String bodyMass;
    public String speed;

    public Dog(String bodyMass, String speed) {
        this.bodyMass = bodyMass;
        this.speed = speed;
    }

    public void makeNoise(){
        System.out.println("The dog could make a noise like "+noise);
    }

    public void eat(){
        System.out.println("The dog could eat some "+food);
    }

}
