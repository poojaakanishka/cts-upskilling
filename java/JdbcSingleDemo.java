/*
31. Basic JDBC Connection
• Objective: Connect Java with a relational database.
• Task: Connect to a local MySQL/SQLite database and retrieve data.
• Instructions:
o Set up a database with a students table.
o Write code to load the JDBC driver, create a connection, execute a SELECT query, and
print results.
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcSingleDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "your_password";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            String createTable = "CREATE TABLE IF NOT EXISTS students ("
                    + "id INT PRIMARY KEY, "
                    + "name VARCHAR(50), "
                    + "age INT)";
            stmt.executeUpdate(createTable);

            stmt.executeUpdate("INSERT IGNORE INTO students VALUES (1, 'Arun', 20)");
            stmt.executeUpdate("INSERT IGNORE INTO students VALUES (2, 'Meena', 19)");
            stmt.executeUpdate("INSERT IGNORE INTO students VALUES (3, 'Kavi', 21)");

            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            System.out.println("Student Details:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " - " +
                        rs.getString("name") + " - " +
                        rs.getInt("age")
                );
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}