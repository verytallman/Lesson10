package HW10;

public class Cat extends Animal {
    public String timeSpendToSleep;

    public Cat(String timeSpendToSleep) {
        this.timeSpendToSleep = timeSpendToSleep;
    }

    public void makeNoise(){
        System.out.println("Cat "+name+" could make a noise like "+noise+".");
        System.out.println("");
    }

    public void eat(){
        System.out.println("Cat "+name+" could eat some "+food+".");
        System.out.println("");
    }

    public void sleep(){
        System.out.println("Cat "+name+" could sleep "+location+".");
        System.out.println("");
    }

    public void sleepCounter(){
        System.out.println("Cat "+name + " sleeps for about "+timeSpendToSleep+".");
        System.out.println("");
    }
}
