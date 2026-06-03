/*
33. Transaction Handling in JDBC
• Objective: Use JDBC transactions.
• Task: Simulate a money transfer between two accounts.
• Instructions:
o Create accounts table with balances.
o Implement a transfer method with Connection.setAutoCommit(false).
o Commit if both debit and credit succeed, else rollback.
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JdbcTransactionDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/bank";
        String user = "root";
        String password = "your_password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);


            Statement stmt = con.createStatement();
            String createTable = "CREATE TABLE IF NOT EXISTS accounts ("
                    + "id INT PRIMARY KEY, "
                    + "name VARCHAR(50), "
                    + "balance INT)";
            stmt.executeUpdate(createTable);


            stmt.executeUpdate("INSERT IGNORE INTO accounts VALUES (1, 'Arun', 5000)");
            stmt.executeUpdate("INSERT IGNORE INTO accounts VALUES (2, 'Meena', 3000)");

            con.setAutoCommit(false);

            int fromId = 1;
            int toId = 2;
            int amount = 1000;

            try {
                PreparedStatement debit = con.prepareStatement(
                        "UPDATE accounts SET balance = balance - ? WHERE id = ?"
                );
                debit.setInt(1, amount);
                debit.setInt(2, fromId);
                debit.executeUpdate();

                PreparedStatement credit = con.prepareStatement(
                        "UPDATE accounts SET balance = balance + ? WHERE id = ?"
                );
                credit.setInt(1, amount);
                credit.setInt(2, toId);
                credit.executeUpdate();

                con.commit();
                System.out.println("Transaction Successful: Money Transferred");

            } catch (Exception e) {
                con.rollback();
                System.out.println("Transaction Failed. Rolled Back!");
                System.out.println("Error: " + e.getMessage());
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Connection Error: " + e.getMessage());
        }
    }
}