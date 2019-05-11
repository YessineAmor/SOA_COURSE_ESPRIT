
package tn.dashboard.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tn.dashboard.ws package. 
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

    private final static QName _AffichageInformationEtudiantResponse_QNAME = new QName("http://ws.dashboard.tn/", "affichageInformationEtudiantResponse");
    private final static QName _AfficherEtudiantsInscrits_QNAME = new QName("http://ws.dashboard.tn/", "afficherEtudiantsInscrits");
    private final static QName _AfficherEtudiantsInscritsResponse_QNAME = new QName("http://ws.dashboard.tn/", "afficherEtudiantsInscritsResponse");
    private final static QName _ValiderCompteDashBoardResponse_QNAME = new QName("http://ws.dashboard.tn/", "validerCompteDashBoardResponse");
    private final static QName _CreerCompteDashBoard_QNAME = new QName("http://ws.dashboard.tn/", "creerCompteDashBoard");
    private final static QName _AffichageInformationEtudiant_QNAME = new QName("http://ws.dashboard.tn/", "affichageInformationEtudiant");
    private final static QName _CreerCompteDashBoardResponse_QNAME = new QName("http://ws.dashboard.tn/", "creerCompteDashBoardResponse");
    private final static QName _Etudiant_QNAME = new QName("http://ws.dashboard.tn/", "etudiant");
    private final static QName _ValiderCompteDashBoard_QNAME = new QName("http://ws.dashboard.tn/", "validerCompteDashBoard");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tn.dashboard.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AfficherEtudiantsInscritsResponse }
     * 
     */
    public AfficherEtudiantsInscritsResponse createAfficherEtudiantsInscritsResponse() {
        return new AfficherEtudiantsInscritsResponse();
    }

    /**
     * Create an instance of {@link ValiderCompteDashBoardResponse }
     * 
     */
    public ValiderCompteDashBoardResponse createValiderCompteDashBoardResponse() {
        return new ValiderCompteDashBoardResponse();
    }

    /**
     * Create an instance of {@link AffichageInformationEtudiantResponse }
     * 
     */
    public AffichageInformationEtudiantResponse createAffichageInformationEtudiantResponse() {
        return new AffichageInformationEtudiantResponse();
    }

    /**
     * Create an instance of {@link AfficherEtudiantsInscrits }
     * 
     */
    public AfficherEtudiantsInscrits createAfficherEtudiantsInscrits() {
        return new AfficherEtudiantsInscrits();
    }

    /**
     * Create an instance of {@link CreerCompteDashBoardResponse }
     * 
     */
    public CreerCompteDashBoardResponse createCreerCompteDashBoardResponse() {
        return new CreerCompteDashBoardResponse();
    }

    /**
     * Create an instance of {@link CreerCompteDashBoard }
     * 
     */
    public CreerCompteDashBoard createCreerCompteDashBoard() {
        return new CreerCompteDashBoard();
    }

    /**
     * Create an instance of {@link AffichageInformationEtudiant }
     * 
     */
    public AffichageInformationEtudiant createAffichageInformationEtudiant() {
        return new AffichageInformationEtudiant();
    }

    /**
     * Create an instance of {@link Etudiant }
     * 
     */
    public Etudiant createEtudiant() {
        return new Etudiant();
    }

    /**
     * Create an instance of {@link ValiderCompteDashBoard }
     * 
     */
    public ValiderCompteDashBoard createValiderCompteDashBoard() {
        return new ValiderCompteDashBoard();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffichageInformationEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.dashboard.tn/", name = "affichageInformationEtudiantResponse")
    public JAXBElement<AffichageInformationEtudiantResponse> createAffichageInformationEtudiantResponse(AffichageInformationEtudiantResponse value) {
        return new JAXBElement<AffichageInformationEtudiantResponse>(_AffichageInformationEtudiantResponse_QNAME, AffichageInformationEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherEtudiantsInscrits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.dashboard.tn/", name = "afficherEtudiantsInscrits")
    public JAXBElement<AfficherEtudiantsInscrits> createAfficherEtudiantsInscrits(AfficherEtudiantsInscrits value) {
        return new JAXBElement<AfficherEtudiantsInscrits>(_AfficherEtudiantsInscrits_QNAME, AfficherEtudiantsInscrits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherEtudiantsInscritsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.dashboard.tn/", name = "afficherEtudiantsInscritsResponse")
    public JAXBElement<AfficherEtudiantsInscritsResponse> createAfficherEtudiantsInscritsResponse(AfficherEtudiantsInscritsResponse value) {
        return new JAXBElement<AfficherEtudiantsInscritsResponse>(_AfficherEtudiantsInscritsResponse_QNAME, AfficherEtudiantsInscritsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValiderCompteDashBoardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.dashboard.tn/", name = "validerCompteDashBoardResponse")
    public JAXBElement<ValiderCompteDashBoardResponse> createValiderCompteDashBoardResponse(ValiderCompteDashBoardResponse value) {
        return new JAXBElement<ValiderCompteDashBoardResponse>(_ValiderCompteDashBoardResponse_QNAME, ValiderCompteDashBoardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerCompteDashBoard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.dashboard.tn/", name = "creerCompteDashBoard")
    public JAXBElement<CreerCompteDashBoard> createCreerCompteDashBoard(CreerCompteDashBoard value) {
        return new JAXBElement<CreerCompteDashBoard>(_CreerCompteDashBoard_QNAME, CreerCompteDashBoard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffichageInformationEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.dashboard.tn/", name = "affichageInformationEtudiant")
    public JAXBElement<AffichageInformationEtudiant> createAffichageInformationEtudiant(AffichageInformationEtudiant value) {
        return new JAXBElement<AffichageInformationEtudiant>(_AffichageInformationEtudiant_QNAME, AffichageInformationEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerCompteDashBoardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.dashboard.tn/", name = "creerCompteDashBoardResponse")
    public JAXBElement<CreerCompteDashBoardResponse> createCreerCompteDashBoardResponse(CreerCompteDashBoardResponse value) {
        return new JAXBElement<CreerCompteDashBoardResponse>(_CreerCompteDashBoardResponse_QNAME, CreerCompteDashBoardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Etudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.dashboard.tn/", name = "etudiant")
    public JAXBElement<Etudiant> createEtudiant(Etudiant value) {
        return new JAXBElement<Etudiant>(_Etudiant_QNAME, Etudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValiderCompteDashBoard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.dashboard.tn/", name = "validerCompteDashBoard")
    public JAXBElement<ValiderCompteDashBoard> createValiderCompteDashBoard(ValiderCompteDashBoard value) {
        return new JAXBElement<ValiderCompteDashBoard>(_ValiderCompteDashBoard_QNAME, ValiderCompteDashBoard.class, null, value);
    }

}
