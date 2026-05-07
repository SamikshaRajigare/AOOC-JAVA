import java.sql.*;

public class DisplayStudent {
    public static void main(String[] args) {
        try {
        
            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college", "root", "password");


            Statement stmt = con.createStatement();

        
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

        
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("marks"));
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
