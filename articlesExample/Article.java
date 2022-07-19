package articlesExample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Article {
	
	@XmlAttribute
	Integer id;
	@XmlElement
	String name;
	@XmlElement
	String type;
	@XmlElement
	String price;
	@XmlElement
	String weight;
	@XmlElement
	String quantity;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Article() {
		super();
	}
	
	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", weight=" + weight
				+ ", quantity=" + quantity + "]";
	}
	
	

}
