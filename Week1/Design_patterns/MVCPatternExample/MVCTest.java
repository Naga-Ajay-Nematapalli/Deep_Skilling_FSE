public class MVCTest {

    public static void main(String[] args) {

        Student student = new Student("Ajay", "CSBS101", "A");
        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        System.out.println("Initial Student Record:");
        controller.updateView();

        System.out.println("\nUpdated Student Record:");
        controller.setStudentName("Naga Ajay");
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}