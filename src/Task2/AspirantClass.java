package Task2;

public class AspirantClass extends StudentClass{
        public String scienceWork;

    public AspirantClass(String firstName, String lastName, String group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    public double getScholarship(){
        if (averageMark == 5.0){
            System.out.print("Стипендия равна: ");
            return 200;
        }else {
            System.out.print("Стипендия равна: ");
            return 180;
        }
    }
}
