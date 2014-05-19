package dorg.model;
import java.io.Serializable;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORY")
//@NamedQuery(name = 'User.findUserByEmail', query = 'select u from User u where u.email = :email')

public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	//public static final String FIND_BY_EMAIL = 'User.findUserByEmail';
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY, mappedBy="CATEGORY")
	private List<Product> prods;
	private String img;
	public void setId(int id) {	this.id=id;	}
	public int getId() { return id;	}
	public void setName(String n) {name=n;}
	public void setProds(List<Product> p){prods=p;}
	public void setImg(String s){img=s;}
	public String getImg(){return img;}
	public String getName(){return name;}
	public List<Product> getProds(){return prods;}
	
}
