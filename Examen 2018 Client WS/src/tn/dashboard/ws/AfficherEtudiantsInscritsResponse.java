
package tn.dashboard.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for afficherEtudiantsInscritsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="afficherEtudiantsInscritsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="etudiantsInscrits" type="{http://ws.dashboard.tn/}etudiant" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "afficherEtudiantsInscritsResponse", propOrder = {
    "etudiantsInscrits"
})
public class AfficherEtudiantsInscritsResponse {

    protected List<Etudiant> etudiantsInscrits;

    /**
     * Gets the value of the etudiantsInscrits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etudiantsInscrits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEtudiantsInscrits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Etudiant }
     * 
     * 
     */
    public List<Etudiant> getEtudiantsInscrits() {
        if (etudiantsInscrits == null) {
            etudiantsInscrits = new ArrayList<Etudiant>();
        }
        return this.etudiantsInscrits;
    }

}
