package wzorce;

import java.util.ArrayList;
import java.util.List;

public class StudentsServiceZaslepka implements StudentService {
    @Override
    public List<Student> getStudents() {
        List<Student> listaStudentow = new ArrayList<Student>();
        listaStudentow.add(new Student());
        listaStudentow.add(new Student());
        listaStudentow.add(new Student());
        return null;
    }

    @Override
    public void saveStudents(List<Student> studnets) {

    }

    @Override
    public double calculateAverage(String id) {
        return 0;
    }
}
