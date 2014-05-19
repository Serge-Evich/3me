package dorg.model;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "ORDERS")
//@NamedQuery(name = 'User.findUserByEmail', query = 'select u from User u where u.email = :email')

public class Orders implements Serializable {
	private static final long serialVersionUID = 1L;
	//public static final String FIND_BY_EMAIL = 'User.findUserByEmail';
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne(cascade= {CascadeType.REFRESH}, fetch=FetchType.LAZY)
    @JoinColumn(name="CUST_ID", nullable=false)
	private Customer customer;
	@ManyToOne(cascade= {CascadeType.REFRESH}, fetch=FetchType.LAZY)
    @JoinColumn(name="PROD_ID", nullable=false)
	private Product prod;
	private String startdate;
	private String enddate;
	@Column(name = "moneyset")
	private boolean moneytrans;
	private boolean moneyget;
	private int quantity;
	private double amount;
	private int orderno;
	
	public void setStartdate(String sd){startdate=sd;}
	public String getStartdate(){return startdate;}
	public void setOrderno(int on){orderno=on;}
	public int getOrderno(){return orderno;}
	public void setId(int id) {	this.id=id;	}
	public int getId() { return id;	}
	public void setProd(Product p) {prod=p;}
	public void setEnddate(String ed) {enddate=ed;}
	public void setMoneytrans(boolean mt) {moneytrans=mt;}
	public void setMoneyget(boolean mg){moneyget=mg;}
	public void setQuantity(int q){quantity=q;}
	public void setAmount(double a){amount=a;}
	public Product getProd(){return prod;}
	public String getEnddate(){return enddate;}
	public boolean getMoneytrans(){return moneytrans;}
	public boolean getMoneyget(){return moneyget;}
	public int getQuantity(){return quantity;}
	public double getAmount(){return amount;}
	public void setCustomer(Customer c) { customer =c;}
	public Customer getCustomer(){return customer;}
}
