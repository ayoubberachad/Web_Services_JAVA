package client;

import java.rmi.RemoteException;

import bdcc.BanqueServiceProxy;

public class ClientWS  {
	
	
	public static void main(String[] args) throws Exception {
		
		BanqueServiceProxy PX = new BanqueServiceProxy();
		System.out.println(PX.getCompte(1));
		
		
		
		
		
	}
	

}
