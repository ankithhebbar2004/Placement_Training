import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class fileName {
    public static void main(String[] args) throws Exception {
        // Load the MySQL JDBC driver class (this must match the class name inside the JAR)
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded successfully!");

        // Connect to database
        // url format://ipaddress:portno/resourcePath
        String dbName = "";
        String url = "jdbc:mysql://localhost:3306/" + dbName;
        String user = "";
        String pass = "";
        Connection con = DriverManager.getConnection(url, user, pass);
        /*
        int roll = 45;
        String name = "Nandan";
        double cgpa = 8.5'
        String query = "insert into (table name) values(?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, roll);
        ps.setString(2, name);
        ps.setDouble(3, cgpa);
        ps.executeUpdate();
        con.close();
         */
        PreparedStatement ps = con.prepareStatement("select * from (table_name)");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            String message = rs.getString("(column name)");
            System.out.println(message);// If data type od column is int then getInt() method
        }
        con.close();
    }
}