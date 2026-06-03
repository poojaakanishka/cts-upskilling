/*
32. Insert and Update Operations in JDBC
• Objective: Perform insert/update SQL queries from Java.
• Task: Add and modify student data using JDBC.
• Instructions:
o Create a StudentDAO class.
o Implement methods to insert new records and update student details.
o Use PreparedStatement for parameterized queries.
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

class StudentDAO {

    private Connection con;

    public StudentDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "your_password"
            );

            Statement stmt = con.createStatement();
            String createTable = "CREATE TABLE IF NOT EXISTS students ("
                    + "id INT PRIMARY KEY, "
                    + "name VARCHAR(50), "
                    + "age INT)";
            stmt.executeUpdate(createTable);

        } catch (Exception e) {
            System.out.println("Connection Error: " + e.getMessage());
        }
    }

    public void insertStudent(int id, String name, int age) {
        try {
            String query = "INSERT INTO students VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);

            int result = ps.executeUpdate();
            System.out.println(result + " record inserted.");

        } catch (Exception e) {
            System.out.println("Insert Error: " + e.getMessage());
        }
    }

    public void updateStudent(int id, String name, int age) {
        try {
            String query = "UPDATE students SET name = ?, age = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setInt(3, id);

            int result = ps.executeUpdate();
            System.out.println(result + " record updated.");

        } catch (Exception e) {
            System.out.println("Update Error: " + e.getMessage());
        }
    }
}

public class StudentDAODemo {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        dao.insertStudent(1, "Arun", 20);
        dao.insertStudent(2, "Meena", 19);
        
        dao.updateStudent(2, "Meena Sharma", 20);
    }
}