package bdcc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

	@WebMethod(operationName = "ConversionEuroToDh")

	public double conversion(@WebParam(name = "montant") double mt, @WebParam(name = "Dollar") double test) {
		return test * mt;
	}
	
	
	
	
	
	@WebMethod(operationName = "getCompte")
	public Compte getCompte(@WebParam(name = "code") int code) {
		Compte cp1 = new Compte(code, Math.random() * 9000, new Date());
		return cp1;
	}

	@WebMethod(operationName = "getListCompte")
	public List<Compte> compte() {
		ArrayList<Compte> comptes = new ArrayList<>();
		comptes.add(new Compte(1, Math.random() * 9000, new Date()));
		comptes.add(new Compte(2, Math.random() * 9000, new Date()));
		comptes.add(new Compte(3, Math.random() * 9000, new Date()));
		return comptes;
	}

}
