package au.uni.mel.ColonoscopyTriage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alteredbowelhabit")
public class AlteredBowelHabit {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="bowelhabitless12mnth")
	private boolean bowelHabitless12mnth;
	
	@Column(name="criticalfactor")
	private boolean criticalFactor;
	
	@Column(name="othersymptoms")
	private boolean otherSymptoms;
	
	public boolean isBowelHabitless12mnth() {
		return bowelHabitless12mnth;
	}
	public void setBowelHabitless12mnth(boolean bowelHabitless12mnth) {
		this.bowelHabitless12mnth = bowelHabitless12mnth;
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
	
	@Override
	public String toString() {
		return "AlteredBowelHabit [bowelHabitless12mnth=" + bowelHabitless12mnth + ", criticalFactor=" + criticalFactor
				+ ", otherSymptoms=" + otherSymptoms + "]";
	}
	
	
	
}
