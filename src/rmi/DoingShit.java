package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DoingShit extends Remote {
	
	public void incrementByOne(MyInteger i) throws RemoteException;
	
}
