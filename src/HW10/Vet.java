package HW10;

public class Vet {

    public void treatAnimal (Animal animal){
        System.out.println("На приеме у ветиринара:");
        System.out.println("Животное: "+animal.animalType+".");
        System.out.println("Имя животного: "+animal.name+".");
        System.out.println(animal.name + " обычно спит " + animal.location+".");
        System.out.println("");

    }
}
