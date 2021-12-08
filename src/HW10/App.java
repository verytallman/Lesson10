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


public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.location = "house";
        animal.food = "apple";

        Animal dog = new Dog("43kg","25 km/h");
        dog.noise = "woof";
        dog.food = "meat and porridge";
        dog.location = "in the apartment";
        dog.eat();
        dog.makeNoise();

        Animal cat = new Cat();
        cat.food = "feed";
        cat.noise = "meow";
        cat.location = "on the couch";
        cat.eat();
        cat.makeNoise();






    }

}
