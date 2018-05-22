import Obj.Student;
import Runners.StudentRunnerDB;
import Runners.StudentRunnerFile;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i<30;i++) {
            students.add(new Student(i,"Ivanov_"+i));
        }
        // getStudentsFromDB();
        StudentRunnerFile st = new StudentRunnerFile();
        st.write(students);

        students = st.read();
    }
}
