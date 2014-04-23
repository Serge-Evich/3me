package dorg.model;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = 'CUSTOMER')
//@NamedQuery(name = 'User.findUserByEmail', query = 'select u from User u where u.email = :email')
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	//public static final String FIND_BY_EMAIL = 'User.findUserByEmail';
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	@MapsId
	private User user;
	private String name;
	private String surname;
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY, mappedBy="CUSTOMER")
	private List<Contact> contacts;
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY, mappedBy="CUSTOMER")
	private List<Address> addresses;
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY, mappedBy="CUSTOMER")
	private List<Orders> orders;
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String s) {
		surname = s;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User u) {
		user=u;
	}
	
	public List<Contact> getContacts(){return contacts;}
	public List<Address> getAdresses(){return addresses;}
	public List<Orders> getOrders(){return orders;}
	public void setContacts(List<Contact> c){contacts=c;}
	public void setAddresses(List<Address> a){addresses=a;}
	
	@Override
	public int hashCode() {
	return getId();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			Customer customer = (Customer) obj;
		    return customer.getId() == id;
	}
		  return false;
	}

}
