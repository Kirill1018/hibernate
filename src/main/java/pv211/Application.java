package pv211;
import jakarta.persistence.*;
import java.util.Set;
import java.util.HashSet;
@Entity
@Table(name = "application")
public class Application {
	@Id
	@GeneratedValue
	long id;
	String name = new String();//application name
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "applType", joinColumns = { @JoinColumn(name = "applId") }, inverseJoinColumns = { @JoinColumn(name = "typeId") })
	Set<Type> types = new HashSet<Type>();//application types
	public Application() { }
	public Application(long identificator, String behalf) {
		this.setId(identificator);
		this.setName(behalf);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;//setting identifier
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;//setting behalf
	}
	public Set<Type> getTypes() {
		return types;
	}
	public void setTypes(Set<Type> types) {
		this.types = types;//setting types of applications
	}
}