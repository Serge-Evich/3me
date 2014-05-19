package dorg.model;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
//@NamedQuery(name = 'User.findUserByEmail', query = 'select u from User u where u.email = :email')

public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	//public static final String FIND_BY_EMAIL = 'User.findUserByEmail';
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne(cascade= {CascadeType.REFRESH}, fetch=FetchType.LAZY)
    @MapsId
	private Customer customer;
	private String country;
	private String city;
	private String village;
	private String street;
	private int strnumber;
	private int postcode;
	
	public void setId(int id) {	this.id=id;	}
	public int getId() { return id;	}
	public void setCountry(String c) {country=c;}
	public void setCity(String c) {city=c;}
	public void setVillage(String v) {village=v;}
	public void setStrnumber(int sn){strnumber=sn;}
	public void setPostcode(int pc){postcode=pc;}
	public void setStreet(String s){street=s;}
	public String getStreet(){return street;}
	public String getCountry(){return country;}
	public String getCity(){return city;}
	public String getVillage(){return village;}
	public int getStrnumber(){return strnumber;}
	public int getPostcode(){return postcode;}
	public void setCustomer(Customer c) { customer =c;}
}
