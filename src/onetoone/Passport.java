package onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Passport {
	
	@Id
	@GeneratedValue
	private int ppid;
	private String pnum;
	private String ploc;
	private String pexpdate;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkpid")
	private Person per;
	
	
	public int getPpid() {
		return ppid;
	}
	public void setPpid(int ppid) {
		this.ppid = ppid;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getPloc() {
		return ploc;
	}
	public void setPloc(String ploc) {
		this.ploc = ploc;
	}
	public String getPexpdate() {
		return pexpdate;
	}
	public void setPexpdate(String pexpdate) {
		this.pexpdate = pexpdate;
	}
	public Person getPer() {
		return per;
	}
	public void setPer(Person per) {
		this.per = per;
	}
	
	
	

}
