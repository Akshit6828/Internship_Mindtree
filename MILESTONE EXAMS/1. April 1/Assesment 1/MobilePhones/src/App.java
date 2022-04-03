import java.sql.*;
public class App {

    static ResultSet rs = null;
    static Statement stmt = null;
    static Connection con = null;
    public static void main(String[] args) throws Exception {
        try {

            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Open a connection
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mindtree_1", "root", "akshit@2000");

            stmt = con.createStatement();

            // Executing a query
            String q1 = "SELECT NAME, BRAND FROM Mobile WHERE DISPLAY = (SELECT MAX(DISPLAY) FROM Mobile);";
            rs = stmt.executeQuery(q1);
            while(rs.next()){
                System.out.println(rs.getString(1) + "  " + rs.getString(2));
            }

                con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
