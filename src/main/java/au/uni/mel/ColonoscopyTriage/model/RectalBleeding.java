package au.uni.mel.ColonoscopyTriage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "rectalbleeding")
public class RectalBleeding {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="rectalbleeding")
	private boolean rectalBleeding;

	@Column(name="othercriticalfactor")
	private boolean otherCriticalFactor;

	@Column(name="otersymptoms")
	private boolean oterSymptoms;	
	
	@Column(name="bleedingmorethan12mnths")
	private boolean bleedingMoreThan12Mnths;
	
	@Column(name="ageunder50")
	private boolean ageUnder50;
	
	@Column(name="anorectalorfailedhaemo")
	private boolean anorectalOrFailedhaemo;
	
	public boolean isRectalBleeding() {
		return rectalBleeding;
	}
	public void setRectalBleeding(boolean rectalBleeding) {
		this.rectalBleeding = rectalBleeding;
	}
	public boolean isOtherCriticalFactor() {
		return otherCriticalFactor;
	}
	public void setOtherCriticalFactor(boolean otherCriticalFactor) {
		this.otherCriticalFactor = otherCriticalFactor;
	}
	public boolean isOterSymptoms() {
		return oterSymptoms;
	}
	public void setOterSymptoms(boolean oterSymptoms) {
		this.oterSymptoms = oterSymptoms;
	}
	public boolean isBleedingMoreThan12Mnths() {
		return bleedingMoreThan12Mnths;
	}
	public void setBleedingMoreThan12Mnths(boolean bleedingMoreThan12Mnths) {
		this.bleedingMoreThan12Mnths = bleedingMoreThan12Mnths;
	}
	public boolean isAgeUnder50() {
		return ageUnder50;
	}
	public void setAgeUnder50(boolean ageUnder50) {
		this.ageUnder50 = ageUnder50;
	}
	public boolean isAnorectalOrFailedhaemo() {
		return anorectalOrFailedhaemo;
	}
	public void setAnorectalOrFailedhaemo(boolean anorectalOrFailedhaemo) {
		this.anorectalOrFailedhaemo = anorectalOrFailedhaemo;
	}
	
	@Override
	public String toString() {
		return "RectalBleeding [rectalBleeding=" + rectalBleeding + ", otherCriticalFactor=" + otherCriticalFactor
				+ ", oterSymptoms=" + oterSymptoms + ", bleedingMoreThan12Mnths=" + bleedingMoreThan12Mnths
				+ ", ageUnder50=" + ageUnder50 + ", anorectalOrFailedhaemo=" + anorectalOrFailedhaemo + "]";
	}
	
	
}
