import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Student {
    private int idStudent;
    private String studentName;


    public Student(int idStudent, String studentName) {
        this.idStudent = idStudent;
        this.studentName = studentName;
    }
}
