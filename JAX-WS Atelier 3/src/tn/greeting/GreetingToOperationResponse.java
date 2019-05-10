
package tn.greeting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for greetingToOperationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="greetingToOperationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="greetingTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "greetingToOperationResponse", propOrder = {
    "greetingTo"
})
public class GreetingToOperationResponse {

    protected String greetingTo;

    /**
     * Gets the value of the greetingTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGreetingTo() {
        return greetingTo;
    }

    /**
     * Sets the value of the greetingTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGreetingTo(String value) {
        this.greetingTo = value;
    }

}
