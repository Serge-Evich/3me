package dorg.model;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
//@NamedQuery(name = 'User.findUserByEmail', query = 'select u from User u where u.email = :email')


public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	//public static final String FIND_BY_EMAIL = 'User.findUserByEmail';
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double price;
	private String attrib1;
	private String attrib2;
	private String attrib3;
	private String attrib4;
	private String attrib5;
	private String img;
	public void setId(int id) {	this.id=id;	}
	public int getId() { return id;	}
	public void setName(String n) {name=n;}
	public void setPrice(double p) {price=p;}
	public void setAttrib1(String a) {attrib1=a;}
	public void setAttrib2(String a) {attrib2=a;}
	public void setAttrib3(String a) {attrib3=a;}
	public void setAttrib4(String a) {attrib4=a;}
	public void setAttrib5(String a) {attrib5=a;}
	public void setImg(String s){img=s;}
	public String getName(){return name;}
	public double getPrice(){return price;}
	public String getAttrib1(){return attrib1;}
	public String getAttrib2(){return attrib2;}
	public String getAttrib3(){return attrib3;}
	public String getAttrib4(){return attrib4;}
	public String getAttrib5(){return attrib5;}
	public String getImg(){return img;}
	
}
