package dorg.model;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = 'USER')
@NamedQuery(name = 'User.findUserByEmail', query = 'select u from User u where u.email = :email')

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String FIND_BY_EMAIL = 'User.findUserByEmail';
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true)
	private String email;
	private String password;
	@Column(name="USERNAME")
	private String login;
	@Enumerated(EnumType.STRING)
	private Role role;
	public int getId() {
		return id;// get and set
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String n) {
		login=n;
	}
	public String getPassword() {
		return password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role r) {
		role=r;		
	}
	public boolean isAdmin() {
		return Role.ADMIN.equals(role);
	}
	public boolean isUser() {
		return Role.USER.equals(role);
	}
	@Override
	public int hashCode() {
	return getId();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof User) {
			User user = (User) obj;
		    return user.getId() == id;
	}
		  return false;
	}

}
