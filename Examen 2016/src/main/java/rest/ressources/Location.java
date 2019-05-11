package rest.ressources;

import javax.xml.bind.annotation.XmlElement;

public class Location {
	private float latitude;
	private float tude;

	public float getLatitude() {
		return latitude;
	}

	@XmlElement
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getTude() {
		return tude;
	}

	@XmlElement(name = "longitude")
	public void setTude(float tude) {
		this.tude = tude;
	}

}
