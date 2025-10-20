import java.rmi.*;
public interface calculate extends Remote
{
public int add(int a,int b) throws RemoteException;
//public int substract(int m,int n)throws RemoteException;
}


