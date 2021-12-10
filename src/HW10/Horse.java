package HW10;

public class Horse extends Animal{
    public String maxSpeed;

    public Horse(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void makeNoise(){
        System.out.println("Horse "+name+" could make noise like "+noise+".");
        System.out.println("");
    }

    public void eat(){
        System.out.println("Horse "+name+" could eat some "+food+".");
        System.out.println("");
    }

    public void maxSpeed(){
        System.out.println("Horse "+name+" maximum speed is "+maxSpeed+".");
        System.out.println("");
    }
}
