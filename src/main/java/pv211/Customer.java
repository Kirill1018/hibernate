package pv211;
import jakarta.persistence.*;
import java.util.Set;
import java.util.HashSet;
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	long id;
	String name = new String();//customer's name
	@OneToMany(mappedBy = "customer")
	Set<Program> programs = new HashSet<Program>();//program collection
	public Customer() { }
	public Customer(long identificator, String behalf) {
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
	public Set<Program> getPrograms() {
		return programs;
	}
	public void setPrograms(Set<Program> programs) {
		this.programs = programs;//setting collection of programs
	}
}