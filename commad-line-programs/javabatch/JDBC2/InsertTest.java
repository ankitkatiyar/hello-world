import java.sql.*;
import java.util.*;
import java.io.*;

class InsertTest
{
public static void main(String ar[])
{
try
{
Properties p=new Properties();
p.load(new FileInputStream("data.properties"));
Class.forName(p.getProperty("driverclass"));
Connection con=DriverManager.getConnection(p.getProperty("connectionstring"),p.getProperty("user"),p.getProperty("password"));
PreparedStatement stmt=con.prepareStatement("insert into emp1 values(?,?,?,?)");
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
while(true)
{
System.out.println("Enter EmpId");
int id=Integer.parseInt(b.readLine());
System.out.println("Enter EmpName");
String n=b.readLine();
System.out.println("Enter Empjob");
String j=b.readLine();
System.out.println("Enter EmpSalary");
int s=Integer.parseInt(b.readLine());
stmt.setInt(1,id);
stmt.setString(2,n);
stmt.setString(3,j);
stmt.setInt(4,s);
stmt.executeUpdate();
System.out.println("Want to insert more records, yes/no ?");
String ans=b.readLine();
if(ans.equals("no"))
break;
}
con.close();
System.out.println("Records are successfully inserted");

}catch(Exception e)
{
System.out.println(e);
}
}
}