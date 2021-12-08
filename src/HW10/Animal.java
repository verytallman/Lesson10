package HW10;

public class Animal {
    public String food;
    public String location;
    public String noise;

    public void makeNoise(){
        System.out.println("The animal could make a noise.");
    }
    public void eat(){
        System.out.println("The animal could eat some "+food);
    }
    public void sleep(){
        System.out.println("The animal could sleep in "+location);
    }
}
