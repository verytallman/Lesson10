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
//        animal.makeNoise();
//        animal.eat();
//        animal.sleep();

        Animal dog = new Dog("43kg","25 km/h");
        dog.noise = "woof";
        dog.food = "meat and porridge";
        dog.location = "in the apartment";
        dog.name = "Cherry";

//        dog.sleep();
//        dog.eat();
//        dog.makeNoise();


        Animal cat = new Cat("22 hours per day");
        cat.food = "feed";
        cat.noise = "meow";
        cat.location = "on the couch";
        cat.name = "Sherlock";

//        cat.sleep();
//        cat.eat();
//        cat.makeNoise();

        Animal horse = new Horse("45 km/h");
        horse.noise = "brrr";
        horse.food = "sugar";
        horse.location = "horse stalls";
        horse.name = "Brownie";

        Animal horse2 = new Horse("43 km/h");
        horse2.noise = "brrr";
        horse2.food = "apples";
        horse2.location = "horse stalls";
        horse2.name = "Cheese";


//        horse.sleep();
//        horse.eat();
//        horse.makeNoise();

        Vet vet = new Vet();
//        vet.treatAnimal(dog);
//        vet.treatAnimal(cat);
//        vet.treatAnimal(horse);



        Animal[] AnimalArray = new Animal[]{dog,cat,horse,horse2};
        int i;
        for (i = 0; i <AnimalArray.length; i++){
            vet.treatAnimal(AnimalArray[i]);
        }





    }

}
