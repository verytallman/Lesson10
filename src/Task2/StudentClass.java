package Task2;

public class StudentClass {
    public String firstName;
    public String lastName;
    public String group;
    public double averageMark;

    public StudentClass(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship(){
        if (averageMark == 5.0){
            System.out.print("Стипендия равна: ");
            return 100;
        }else {
            System.out.print("Стипендия равна: ");
            return 80;
        }
    }


}
