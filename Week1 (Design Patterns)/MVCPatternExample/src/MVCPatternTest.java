public class MVCPatternTest {
    public static void main(String[] args) {
        //Create a Student object (Model)
        Student student = new Student();
        student.setName("Mayank");
        student.setId("2141011185");
        student.setGrade("A");

        //Create a StudentView object (View)
        StudentView view = new StudentView();

        //Create a StudentController object (Controller)
        StudentController controller = new StudentController(student, view);

        //Display initial student details
        controller.updateView();

        //Update student details
        controller.setStudentName(" Mayank");
        controller.setStudentGrade("A+");

        //Display updated student details
        controller.updateView();
    }
}
