package HW10;

public class Horse extends Animal{
    public String maxSpeed;
    public String noise;

    public void makeNoise(){
        System.out.println("The dog could make noise like "+noise);
    }

    public void eat(){
        System.out.println("The animal could eat some "+food);
    }

    public void maxSpeed(){
        System.out.println("The horses maximum speed is "+maxSpeed);
    }
}
