import java.rmi.*;
import java.util.*;
import javax.naming.*;
import java.rmi.server.*;
public class calculateclient
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter two nos");
int a=in.nextInt();
int b=in.nextInt();
String url="rmi://localhost/";
try
{
Context namingContext=new InitialContext();
calculate p1=(calculate)namingContext.lookup(url+"cal");
int x=p1.add(a,b);
System.out.println("Addition is "+x);
/*int y=p1.substract(a,b);
//System.out.println("substraction is "+y);*/
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
