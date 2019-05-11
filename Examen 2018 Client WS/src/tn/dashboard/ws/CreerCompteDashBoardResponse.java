
package tn.dashboard.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creerCompteDashBoardResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creerCompteDashBoardResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeValidation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerCompteDashBoardResponse", propOrder = {
    "codeValidation"
})
public class CreerCompteDashBoardResponse {

    protected int codeValidation;

    /**
     * Gets the value of the codeValidation property.
     * 
     */
    public int getCodeValidation() {
        return codeValidation;
    }

    /**
     * Sets the value of the codeValidation property.
     * 
     */
    public void setCodeValidation(int value) {
        this.codeValidation = value;
    }

}
