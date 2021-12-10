package HW10;

//        Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
//        Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
//        Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
//        Dog, Cat, Horse переопределяют методы makeNoise, eat.
//        Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
//        Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
//        Пусть этот метод распечатывает food и location пришедшего на прием животного.
//        В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
//        В цикле отправляйте их на прием к ветеринару.


import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();
        animal.eat();
        animal.sleep();

        Animal dog = new Dog("43kg","25 km/h");
        dog.noise = "гав";
        dog.food = "каша с мясом";
        dog.location = "в квартире";
        dog.name = "Вишенка";
        dog.animalType = "Собакен";

        dog.sleep();
        dog.eat();
        dog.makeNoise();


        Animal cat = new Cat("22 hours per day");
        cat.food = "корм";
        cat.noise = "мяу";
        cat.location = "на кровати";
        cat.name = "Шерлок";
        cat.animalType = "Кот";

        cat.sleep();
        cat.eat();
        cat.makeNoise();
        cat.sleepCounter();

        Animal horse = new Horse("45 km/h");
        horse.noise = "игого";
        horse.food = "сахарок";
        horse.location = "в стойле";
        horse.name = "Брауни";
        horse.animalType = "Лошадь";

        Animal horse2 = new Horse("43 km/h");
        horse2.noise = horse.noise;
        horse2.food = "яблоки";
        horse2.location = horse.location;
        horse2.name = "Сырок";
        horse2.animalType = horse.animalType;

        horse.sleep();
        horse.eat();
        horse.makeNoise();

        Vet vet = new Vet();

        Animal[] AnimalArray = new Animal[]{dog,cat,horse,horse2};
        int i;
        for (i = 0; i <AnimalArray.length; i++){
            vet.treatAnimal(AnimalArray[i]);
        }





    }

}
