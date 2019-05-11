
package tn.dashboard.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creerCompteDashBoard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creerCompteDashBoard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nouveauCompteDashboard" type="{http://ws.dashboard.tn/}etudiant" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerCompteDashBoard", propOrder = {
    "nouveauCompteDashboard"
})
public class CreerCompteDashBoard {

    protected Etudiant nouveauCompteDashboard;

    /**
     * Gets the value of the nouveauCompteDashboard property.
     * 
     * @return
     *     possible object is
     *     {@link Etudiant }
     *     
     */
    public Etudiant getNouveauCompteDashboard() {
        return nouveauCompteDashboard;
    }

    /**
     * Sets the value of the nouveauCompteDashboard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Etudiant }
     *     
     */
    public void setNouveauCompteDashboard(Etudiant value) {
        this.nouveauCompteDashboard = value;
    }

}
