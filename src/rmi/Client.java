package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
	
	public static void main(String[] args) {
		try {
			DoingShit ds = (DoingShit)Naming.lookup("rmi://localhost:1099/doingshit");
			MyInteger i = new MyInteger(2);
			System.out.println("Value before: " + i.getValue());
			ds.incrementByOne(i);
			System.out.println("Value after: " + i.getValue());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
	
}
