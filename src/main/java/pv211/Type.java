package pv211;
import jakarta.persistence.*;
import java.util.Set;
import java.util.HashSet;
@Entity
@Table(name = "type")
public class Type {
	@Id
	@GeneratedValue
	long id;
	String name = new String();//setting name of type
	@ManyToMany(mappedBy = "types")
	Set<Application> applications = new HashSet<Application>();//application collection
	public Type() { }
	public Type(long identificator, String behalf) {
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
	public Set<Application> getApplications() {
		return applications;
	}
	public void setApplications(Set<Application> applications) {
		this.applications = applications;//setting collection of applications
	}
}