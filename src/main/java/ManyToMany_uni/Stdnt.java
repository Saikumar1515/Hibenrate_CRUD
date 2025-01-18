package ManyToMany_uni;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Stdnt {
	
	@Id
	private int roll_no;
	private String name;
	private String email;
	
	@ManyToMany
	private List<Subject> sub;

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Subject> getSub() {
		return sub;
	}

	public void setSub(List<Subject> sub) {
		this.sub = sub;
	}

}
