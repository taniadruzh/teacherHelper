package Obj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Student {
    private int idStudent;
    private String studentName;
    private String serName;
    private String phone;
    private String email;


    public Student(int idStudent, String studentName) {
        this.idStudent = idStudent;
        this.studentName = studentName;
    }

    public Student(String studentName, String serName, String phone, String email) {
        this.studentName = studentName;
        this.serName = serName;
        this.phone = phone;
        this.email = email;
    }
}
