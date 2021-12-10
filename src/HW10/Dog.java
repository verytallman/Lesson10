package HW10;

public class Dog extends Animal {
    public String bodyMass;
    public String speed;

    public Dog(String bodyMass, String speed) {
        this.bodyMass = bodyMass;
        this.speed = speed;
    }

    public void makeNoise(){
        System.out.println("Dog "+name+" could make a noise like "+noise+".");
    }

    public void eat(){
        System.out.println("Dog "+name+" could eat some "+food+".");
    }

    public void sleep(){
        System.out.println("Dog "+name+" could sleep "+location+".");
    }

    public void maxSpeed (){
        System.out.println("Dog "+name+" maximum speed is "+speed+".");
    }

}
