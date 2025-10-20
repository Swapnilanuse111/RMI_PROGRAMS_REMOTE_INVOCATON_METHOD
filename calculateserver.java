import java.rmi.*;
import java.rmi.server.*;
import javax.naming.*;
public class calculateserver
{
public static void main(String args[])
{
try
{
System.out.println("constructing server implementation...");
calculateimp c1=new calculateimp();
Context namingcontext=new InitialContext();
namingcontext.bind("rmi:cal",c1);
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
