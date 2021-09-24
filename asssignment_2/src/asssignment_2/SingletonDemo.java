package asssignment_2;


public class SingletonDemo {

	public static void main(String[] args) {
		 
		singleobject instance1 = singleobject.getInstance();
		singleobject instance2 = singleobject.getInstance();
		instance1.count= 0;
		System.out.println("count = " + instance2.count);
		System.out.println("count = " + instance1.count);
		System.out.println("check is equal : " + (instance1 == instance2)); //true
		
		
		connection telnetConnection = connection.getInstance(connection.TELNET); 
		connection telnetConnection2 = connection.getInstance(connection.TELNET); 
			
		telnetConnection.count = 1;
		if(telnetConnection == telnetConnection2) {  
		};
		System.out.println(telnetConnection2.count);
		
		connection sshConnection = connection.getInstance(connection.SSH); 
		sshConnection.count = 2;
		System.out.println(telnetConnection2.count);
		System.out.println(sshConnection.count);
		connection.getInstance(connection.HTTP); 
		
		@SuppressWarnings("unused")
		connection scpconnection2 = connection.getInstance(connection.SCP); 
		
		connection.getInstance(connection.HTTP); 

		connection.release(connection.TELNET);
		connection telnetconnection2 = connection.getInstance(connection.TELNET);

		connection.getCurrentConnections(); 
		
		connection.send("My message", telnetconnection2);
		connection.send("My message", telnetconnection2);
		

	}

}
