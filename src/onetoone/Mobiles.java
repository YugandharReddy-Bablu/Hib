package onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Mobiles {
	
	
	@Id
	@GeneratedValue
	private int mid;
	private String mnum;
	private String msim;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fkmid")
	private Person pmob;
	
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMnum() {
		return mnum;
	}
	public void setMnum(String mnum) {
		this.mnum = mnum;
	}
	public String getMsim() {
		return msim;
	}
	public void setMsim(String msim) {
		this.msim = msim;
	}
	public Person getPmob() {
		return pmob;
	}
	public void setPmob(Person pmob) {
		this.pmob = pmob;
	}
	
	
	

}
