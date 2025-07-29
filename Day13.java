import java.io.File;
import java.io.FileWriter;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) throws Exception {
//        String filepath = "../input.txt";
//        FileWriter writer = new FileWriter(filepath);
//        String name = "Sam";
//        double perc = 84.7625;
//        String data = String.format("%s scored %.1f%%",name,perc);
//        Scanner reader = new Scanner(file);
//        int n = reader.nextInt();
//        String[] fruits = new String[n];
//        for (int i=0;i<n;i++){
//            fruits[i] = reader.next();
//        }
//        int x = reader.nextInt();
//        writer.write(data);
//        writer.close();
          String driver = "com.mysql.cj.jdbc.Driver";
          Class.forName(driver);
          System.out.println("Driver loaded successfully");
          //set classpath=../mysql-connector.jar;.
          // url format: protocol://ipaddress:portno/resourcePath
          //String url = "";
          // PreparedStatement ps = con.prepareStatement(query);
          // ResultSet rs = ps.executeQuery();
          // While(rs.next())
          //{
          //  String message = rs.getString("message")
          //  System.out.println(message);
          //}
          // con.close();
//          Class.forName("com.mysql.cj.jdbc.Driver");
//          String url = "";
//          String user = "";
//          String pass = "";
        //PreparedStatement ps = com.prepareStatement(query);
//        String query = "Insert into students values(?,?,?";
//        PreparedStatement ps = con.prepareStatement(query);
//        ps.setInt(1,roll);
//        ps.setString(2,name);
//        ps.setDouble(3.cgpa);
//        ps.executeUpdate();
//        con.close;

    }
}
