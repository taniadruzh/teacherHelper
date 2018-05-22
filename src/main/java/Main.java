import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i<30;i++) {
            students.add(new Student(i,"Ivanov_"+i));
        }
        // getStudentsFromDB();
        StudentRunner st = new StudentRunner();
        st.write(students);

        students = st.read();
    }
}
