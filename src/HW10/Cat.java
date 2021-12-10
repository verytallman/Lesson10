package HW10;

public class Cat extends Animal {
    public String timeSpendToSleep;

    public Cat(String timeSpendToSleep) {
        this.timeSpendToSleep = timeSpendToSleep;
    }

    public void makeNoise(){
        System.out.println("Cat "+name+" could make a noise like "+noise+".");
    }

    public void eat(){
        System.out.println("Cat "+name+" could eat some "+food+".");
    }

    public void sleep(){
        System.out.println("Cat "+name+" could sleep "+location+".");
    }

    public void sleepCounter(){
        System.out.println("Cat "+name + " sleeps for about "+timeSpendToSleep+".");
    }
}
