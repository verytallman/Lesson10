package HW10;

public class Vet {

    public void treatAnimal (Animal animal){
        System.out.println("Пришедшее на прием животное");
        System.out.println(animal.name);
        System.out.println(animal.name + " обычно спит " + animal.location);

    }
}
