package hansung.designpatterns.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

	//Service object

	protected MyRemoteImpl() throws RemoteException {}

	public String sayHello() throws RemoteException {
		return "Server syas, 'Hey'";
	}
	
	public static void main(String[] args) {
		try{
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("RemoteHello", service); //stub객체 등록
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
