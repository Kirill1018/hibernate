package pv211;
import jakarta.persistence.*;
@Entity
public class Program {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	long id;
	String name = new String();//program name
	@ManyToOne
	Customer customer = new Customer();//user's object
	public Program() { }
	public Program(long identificator, String behalf) {
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
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;//setting user's object
	}
}