import java.rmi.RemoteException;

import ws.BanqueServiceProxy;
import ws.Compte;

public class ClientJaxWS {

	public static void main(String[] args) {
		
		//proxy basee sur AXIS <=> STUB
		//wsimport -s . http://localhost:8686/BanqueWS?wsdl
		BanqueServiceProxy proxy = new BanqueServiceProxy();
		try {
			System.out.println(proxy.conversionEuroToDH(50));
			Compte c = proxy.consulterCompte(0);
			System.out.println("Code : "+ c.getCode());
			System.out.println("Solde : "+ c.getSolde()+ " DHs");
			System.out.println("Date : "+ c.getDateCreation());
			
			Compte[] comptes = proxy.listComptes();
			for(Compte cp : comptes) {
				System.out.println("Code : "+ cp.getCode());
				System.out.println("Solde : "+ cp.getSolde()+ " DHs");
				System.out.println("Date : "+ cp.getDateCreation());
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
