import java.sql.*;

public class App {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mindtree_sql", "root", "akshit@2000");
            // here mindtree_sql is database name, root is username and password
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next())
                System.out.println(rs.getString(1) + "  " + rs.getInt(2));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}