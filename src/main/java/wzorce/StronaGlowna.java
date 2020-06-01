package wzorce;

import java.util.List;

public class StronaGlowna {

    StudentService studentService = new StudentsServiceZaslepka();

    public void printStudent() {
        List<Student> students = studentService.getStudents();
        for (Student student : students) {
            System.out.println(student);
            //wstawienie studentow do odpowiednich kontrolek
        }
    }
}
