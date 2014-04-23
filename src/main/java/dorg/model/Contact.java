package dorg.model;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = 'CONTACT')
@NamedQuery(name = 'User.findUserByEmail', query = 'select u from User u where u.email = :email')

public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;
	//public static final String FIND_BY_EMAIL = 'User.findUserByEmail';
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne(cascade= {CascadeType.REFRESH}, fetch=FetchType.LAZY)
    @JoinColumn(name="CUST_ID", nullable=false)
	private Customer customer;
	private String mobphone1;
	private String mobphone2;
	private String phone;
	public void setId(int id) {
		this.id=id;
	}
	public int getId() { return id;	}
	public void setPhone1(String p) {mobphone1=p;}
	public void setPhone2(String p) {mobphone2=p;}
	public void setPhone(String p) {phone=p;}
	public String getPhone1(){return mobphone1;}
	public String getPhone2(){return mobphone2;}
	public String getPhone(){return phone;}
	public void setCustomer(Customer c) { customer =c;}
		
}
