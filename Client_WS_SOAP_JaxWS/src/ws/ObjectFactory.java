
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListComptes_QNAME = new QName("http://ws/", "listComptes");
    private final static QName _ListComptesResponse_QNAME = new QName("http://ws/", "listComptesResponse");
    private final static QName _ConversionEuroToDHResponse_QNAME = new QName("http://ws/", "conversionEuroToDHResponse");
    private final static QName _ConsulterCompte_QNAME = new QName("http://ws/", "consulterCompte");
    private final static QName _ConsulterCompteResponse_QNAME = new QName("http://ws/", "consulterCompteResponse");
    private final static QName _ConversionEuroToDH_QNAME = new QName("http://ws/", "conversionEuroToDH");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListComptes }
     * 
     */
    public ListComptes createListComptes() {
        return new ListComptes();
    }

    /**
     * Create an instance of {@link ListComptesResponse }
     * 
     */
    public ListComptesResponse createListComptesResponse() {
        return new ListComptesResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToDHResponse }
     * 
     */
    public ConversionEuroToDHResponse createConversionEuroToDHResponse() {
        return new ConversionEuroToDHResponse();
    }

    /**
     * Create an instance of {@link ConsulterCompte }
     * 
     */
    public ConsulterCompte createConsulterCompte() {
        return new ConsulterCompte();
    }

    /**
     * Create an instance of {@link ConsulterCompteResponse }
     * 
     */
    public ConsulterCompteResponse createConsulterCompteResponse() {
        return new ConsulterCompteResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToDH }
     * 
     */
    public ConversionEuroToDH createConversionEuroToDH() {
        return new ConversionEuroToDH();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listComptes")
    public JAXBElement<ListComptes> createListComptes(ListComptes value) {
        return new JAXBElement<ListComptes>(_ListComptes_QNAME, ListComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listComptesResponse")
    public JAXBElement<ListComptesResponse> createListComptesResponse(ListComptesResponse value) {
        return new JAXBElement<ListComptesResponse>(_ListComptesResponse_QNAME, ListComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDHResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversionEuroToDHResponse")
    public JAXBElement<ConversionEuroToDHResponse> createConversionEuroToDHResponse(ConversionEuroToDHResponse value) {
        return new JAXBElement<ConversionEuroToDHResponse>(_ConversionEuroToDHResponse_QNAME, ConversionEuroToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterCompte")
    public JAXBElement<ConsulterCompte> createConsulterCompte(ConsulterCompte value) {
        return new JAXBElement<ConsulterCompte>(_ConsulterCompte_QNAME, ConsulterCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterCompteResponse")
    public JAXBElement<ConsulterCompteResponse> createConsulterCompteResponse(ConsulterCompteResponse value) {
        return new JAXBElement<ConsulterCompteResponse>(_ConsulterCompteResponse_QNAME, ConsulterCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversionEuroToDH")
    public JAXBElement<ConversionEuroToDH> createConversionEuroToDH(ConversionEuroToDH value) {
        return new JAXBElement<ConversionEuroToDH>(_ConversionEuroToDH_QNAME, ConversionEuroToDH.class, null, value);
    }

}
