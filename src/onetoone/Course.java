package onetoone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Course {

	@Id
	@GeneratedValue
	private int cid;
	private String cname;
	private int cdur;
	private double cfee;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "percou",
			joinColumns        = {@JoinColumn(name = " fkccid")},
			inverseJoinColumns = {@JoinColumn(name = "fkppid")}		
		    )

	
	private List<Person> pcou;

	
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCdur() {
		return cdur;
	}

	public void setCdur(int cdur) {
		this.cdur = cdur;
	}

	public double getCfee() {
		return cfee;
	}

	public void setCfee(double cfee) {
		this.cfee = cfee;
	}

	public List<Person> getPcou() {
		return pcou;
	}

	public void setPcou(List<Person> pcou) {
		this.pcou = pcou;
	}
	
	
	
}
