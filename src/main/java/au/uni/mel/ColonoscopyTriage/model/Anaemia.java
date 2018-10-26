package au.uni.mel.ColonoscopyTriage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "anaemia")
public class Anaemia {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="anaemia")
	private boolean anaemia;

	@Column(name="criticalfactor")
	private boolean criticalFactor;
	
	@Column(name="othersymptoms")
	private boolean otherSymptoms;

	@Column(name="likelycause")
	private boolean likelyCause;
	
	@Column(name="likelynongastrountreated")
	private boolean likelyNonGastroUntreated;

	@Column(name="age")
	private boolean age;

	public boolean isAnaemia() {
		return anaemia;
	}

	public void setAnaemia(boolean anaemia) {
		this.anaemia = anaemia;
	}

	public boolean isCriticalFactor() {
		return criticalFactor;
	}

	public void setCriticalFactor(boolean criticalFactor) {
		this.criticalFactor = criticalFactor;
	}

	public boolean isOtherSymptoms() {
		return otherSymptoms;
	}

	public void setOtherSymptoms(boolean otherSymptoms) {
		this.otherSymptoms = otherSymptoms;
	}

	public boolean isLikelyCause() {
		return likelyCause;
	}

	public void setLikelyCause(boolean likelyCause) {
		this.likelyCause = likelyCause;
	}

	public boolean isLikelyNonGastroUntreated() {
		return likelyNonGastroUntreated;
	}

	public void setLikelyNonGastroUntreated(boolean likelyNonGastroUntreated) {
		this.likelyNonGastroUntreated = likelyNonGastroUntreated;
	}

	public boolean isAge() {
		return age;
	}

	public void setAge(boolean age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Anaemia [anaemia=" + anaemia + ", criticalFactor=" + criticalFactor + ", otherSymptoms=" + otherSymptoms
				+ ", likelyCause=" + likelyCause + ", likelyNonGastroUntreated=" + likelyNonGastroUntreated + ", age="
				+ age + "]";
	}

}
