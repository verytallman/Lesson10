package Task2;



//Создайте пример наследования, реализуйте класс Student и класс Aspirant,
// аспирант отличается от студента наличием некой научной работы.
//        а) Класс Student содержит переменные: String firstName, lastName, group.
//        А также, double averageMark, содержащую среднюю оценку.
//        б) Создать переменную типа Student, которая ссылается на объект типа Aspirant.
//        в) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
//        Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в классе Aspirant.
//        Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
//        г) Создать массив типа Student, содержащий объекты класса Student и Aspirant.
//        Вызвать метод getScholarship() для каждого элемента массива.


public class App {
    public static void main(String[] args) {
        StudentClass Student = new StudentClass("Alexey","Dehtiarov","PA-16-13",
                4.4);

        AspirantClass Aspirant = new AspirantClass("Oleg","Tololaev","PA-08-12",
                5.0,"Некая научная работа");

        StudentClass[] studentArray = new StudentClass[]{Student, Aspirant};
        for (StudentClass s : studentArray){
            System.out.println(s.getScholarship());
        }

    }
}
