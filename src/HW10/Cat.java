package HW10;

public class Cat extends Animal {
    public String timeSpendToSleep;


    public void makeNoise(){
        System.out.println("The cat could make a noise like "+noise);
    }

    public void eat(){
        System.out.println("The animal cat could eat some "+food);
    }

    public void sleepCounter(){
        System.out.println("Your cat sleeps for about "+timeSpendToSleep);
    }
}
