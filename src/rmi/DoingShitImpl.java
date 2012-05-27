package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DoingShitImpl extends UnicastRemoteObject implements DoingShit {
	private static final long serialVersionUID = 2027805285496770621L;

	protected DoingShitImpl() throws RemoteException {
		super();
	}

	@Override
	public void incrementByOne(MyInteger i) throws RemoteException {
		System.out.println("Got request");
		System.out.println("Value before: " + i.getValue());
		i.incrementByOne();
		System.out.println("Value after: " + i.getValue());
	}
	
}
