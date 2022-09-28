package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Compte;


@WebService(serviceName = "BanqueWS")
public class BanqueService {
	
   @WebMethod(operationName = "conversionEuroToDH")
   public double conversion(@WebParam(name = "montant")double mt) {
	   return mt * 11 ;
   }
   

	public Compte consulterCompte(@WebParam(name = "code")int code) {
		System.out.println("Consultation du compte "+code);
		Compte compte = new  Compte();
		compte.setCode(1);
		compte.setDateCreation(new Date());
		compte.setSolde(Math.random()*1000);
		return compte;
	}

	
	public List<Compte> listComptes(){
		System.out.println("Consultation de comptes");
		List<Compte> comptes = new ArrayList<>();
		comptes.add(new Compte(2, Math.random()*1000,new Date()));
		comptes.add(new Compte(3, Math.random()*1000,new Date()));
		comptes.add(new Compte(4, Math.random()*1000,new Date()));
		comptes.add(new Compte(5, Math.random()*1000,new Date()));
		return comptes;
	}
}
