
package ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param code
     * @return
     *     returns ws.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consulterCompte", targetNamespace = "http://ws/", className = "ws.ConsulterCompte")
    @ResponseWrapper(localName = "consulterCompteResponse", targetNamespace = "http://ws/", className = "ws.ConsulterCompteResponse")
    @Action(input = "http://ws/BanqueService/consulterCompteRequest", output = "http://ws/BanqueService/consulterCompteResponse")
    public Compte consulterCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @return
     *     returns java.util.List<ws.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listComptes", targetNamespace = "http://ws/", className = "ws.ListComptes")
    @ResponseWrapper(localName = "listComptesResponse", targetNamespace = "http://ws/", className = "ws.ListComptesResponse")
    @Action(input = "http://ws/BanqueService/listComptesRequest", output = "http://ws/BanqueService/listComptesResponse")
    public List<Compte> listComptes();

    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversionEuroToDH", targetNamespace = "http://ws/", className = "ws.ConversionEuroToDH")
    @ResponseWrapper(localName = "conversionEuroToDHResponse", targetNamespace = "http://ws/", className = "ws.ConversionEuroToDHResponse")
    @Action(input = "http://ws/BanqueService/conversionEuroToDHRequest", output = "http://ws/BanqueService/conversionEuroToDHResponse")
    public double conversionEuroToDH(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

}