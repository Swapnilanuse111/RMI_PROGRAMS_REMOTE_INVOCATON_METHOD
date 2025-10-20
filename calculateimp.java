  import java.rmi.*;           
import java.rmi.server.*;
public class calculateimp extends UnicastRemoteObject  implements calculate
{

public calculateimp() throws RemoteException
{

}
public int add(int a,int b) throws RemoteException
{
 int ad=a+b;
 return ad;
 }
/*public int substract(int m,int n) throws RemoteException
   //{
   // int s=m-n;
   return s;

    //s}*/
}


