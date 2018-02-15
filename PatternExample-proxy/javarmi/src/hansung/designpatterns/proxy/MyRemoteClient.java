package hansung.designpatterns.proxy;

import java.rmi.Naming;

public class MyRemoteClient {
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}
	
	public void go()  {
		try {
			MyRemote service = (MyRemote) Naming.lookup("rmi://localhost/RemoteHello"); //sutb객체 반환
			String s = service.sayHello(); //Client object
			System.out.println(s);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
