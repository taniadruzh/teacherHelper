package Runners;


import Impl.RunnerStud;
import Obj.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentRunnerFile implements RunnerStud {
    @Override
    public ArrayList read() {
        return null;
    }

    @Override
    public void write(ArrayList<Student> students) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,true))) {
            for (Student student : students) {
                bw.write(INSERT_SCRIPT +"('" +student.getStudentName() + "', '" + student.getSerName() + "', '" + student.getPhone()+"', '"+student.getEmail()+"');");
                bw.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static final String INSERT_SCRIPT ="INSERT INTO teacher_help.student (name, ser_name, phone, email) VALUES ";

    private static final String FILENAME = "D:\\_aJavaBestTeam\\teacher_helper\\teacherHelper\\src\\main\\resources\\insert_student2.sql";


    public void writeInsertScript() {

        ArrayList<Student> students = new ArrayList<>();
        for (int i=0; i<=30; i++){
            students.add(new Student("Avrik"+i,"Botov"+i,"099079"+i,"aaa"+i+"@gmail.com"));
        }
        write(students);



    }
}
