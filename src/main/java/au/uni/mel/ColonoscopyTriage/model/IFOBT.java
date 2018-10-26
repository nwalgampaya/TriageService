package au.uni.mel.ColonoscopyTriage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IFOBT")
public class IFOBT {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="positiveifobt")
	private boolean positiveIFOBT;
	
	@Column(name="nbcsporother")
	private boolean NBCSPOrOther;
	
	
	public boolean isIspositiveIFOBT() {
		return positiveIFOBT;
	}
	public void setpositiveIFOBT(boolean positiveIFOBT) {
		this.positiveIFOBT = positiveIFOBT;
	}
	public boolean isNBCSPOrOther() {
		return NBCSPOrOther;
	}
	public void setNBCSPOrOther(boolean nBCSPOrOther) {
		NBCSPOrOther = nBCSPOrOther;
	}
	
	@Override
	public String toString() {
		return "IFOBT [ispositiveIFOBT=" + positiveIFOBT + ", NBCSPOrOther=" + NBCSPOrOther + "]";
	}
	
	
}
