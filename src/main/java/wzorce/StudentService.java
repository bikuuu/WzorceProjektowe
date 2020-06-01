package wzorce;

import java.util.List;

public interface StudentService {

    List<Student> getStudents();

    void saveStudents(List<Student> studnets);

    double calculateAverage(String id);
}
