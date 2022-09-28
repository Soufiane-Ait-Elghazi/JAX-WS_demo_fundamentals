
import java.util.List;

import ws.BanqueService;
import ws.BanqueWS;
import ws.Compte;

public class ClientJaxWS {

	public static void main(String[] args) {
		
		//proxy basee sur JaxWS java native <=> STUB
		//wsimport -s . http://localhost:8686/BanqueWS?wsdl
		
		BanqueService proxy =  new  BanqueWS().getBanqueServicePort();
		System.out.println(((BanqueService) proxy).conversionEuroToDH(50));
		Compte c = ((BanqueService) proxy).consulterCompte(0);
		System.out.println("Code : "+ c.getCode());
		System.out.println("Solde : "+ c.getSolde()+ " DHs");
		System.out.println("Date : "+ c.getDateCreation());
		
		List<Compte> comptes = ((BanqueService) proxy).listComptes();
		for(Compte cp : comptes) {
			System.out.println("Code : "+ cp.getCode());
			System.out.println("Solde : "+ cp.getSolde()+ " DHs");
			System.out.println("Date : "+ cp.getDateCreation());
		}
	}

}
