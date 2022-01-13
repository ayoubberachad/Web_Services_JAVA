package ws;

import javax.xml.ws.Endpoint;

import bdcc.BanqueService;

public class Servers {
	public static void main(String[] args) {
		String url="http://0.0.0.0:8086/";
		BanqueService services = new BanqueService();
		
		Endpoint.publish(url, services );
		System.out.println("web :"+url); 
		
	}

}

// Consulter le fichier WSDL : http://localhost:8086/BanqueWS?wsdl
// Pour consomer les Web Service cote client utiliser type de project Web Service Client
