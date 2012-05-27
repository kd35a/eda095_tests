package rmi;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	
	public static void main(String[] args) {
		try {
			DoingShit ds = new DoingShitImpl();
			Registry r = LocateRegistry.createRegistry(1099);
			r.bind("doingshit", ds);
			System.out.println("This shit is now running.");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			e.printStackTrace();
		}
	}
	
}
