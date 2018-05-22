

import java.sql.*;
import java.util.ArrayList;

public class StudentRunner implements Runner{

    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/teacher_helper";
    private static final String user = "root";
    private static final String password = "йцукен";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void main(String args[]) {
       // getStudentsFromDB();
        setStudentsToDB();
    }

    private static void setStudentsToDB() {

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            String query = " insert into student (name, ser_name, phone, email)"  + " values (?, ?, ?, ?)";

            for (int i = 0; i<30;i++) {
                // create the mysql insert preparedstatement
                PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setString(1, "name_" + i);
                preparedStmt.setString(2, "ser_name_" + i);
                preparedStmt.setString(3, String.valueOf(i * 111111));
                preparedStmt.setString(4, "asd" + i + "@gmail.com");

                // execute the preparedstatement
                preparedStmt.execute();
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }

    }

    public static void getStudentsFromDB(){
        String query = "select idstudent, name from student";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            rs = stmt.executeQuery(query);
            ArrayList<Student> students = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("idstudent");
                String name = rs.getString("name");
                students.add(new Student(id, name));
                System.out.println(id +" "+name);
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }
    }

}