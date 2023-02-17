package onetoone;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private int page;
	private String pqual;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "per")
	private Passport pt;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pmob")
	private List<Mobiles> mob;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "percou",
			joinColumns        = {@JoinColumn(name = " fkppid")},
			inverseJoinColumns = {@JoinColumn(name = "fkccid")}		
		    )
	private List<Course> cou;
	
	public int getPid() {
		return pid;
	}
	public List<Course> getCou() {
		return cou;
	}
	public void setCou(List<Course> cou) {
		this.cou = cou;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getPqual() {
		return pqual;
	}
	public void setPqual(String pqual) {
		this.pqual = pqual;
	}
	public Passport getPt() {
		return pt;
	}
	public void setPt(Passport pt) {
		this.pt = pt;
	}
	public List<Mobiles> getMob() {
		return mob;
	}
	public void setMob(List<Mobiles> mob) {
		this.mob = mob;
	}

	
}
