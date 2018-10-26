package au.uni.mel.ColonoscopyTriage.model;

public class Symptoms {

	public Anaemia anaemia;
	public IFOBT ifobt;
	public RectalBleeding bleeding;
	public AlteredBowelHabit alteredBowelHabit;
	
	
	public Anaemia getAnaemia() {
		return anaemia;
	}
	public void setAnaemia(Anaemia anaemia) {
		this.anaemia = anaemia;
	}
	public IFOBT getIfobt() {
		return ifobt;
	}
	public void setIfobt(IFOBT ifobt) {
		this.ifobt = ifobt;
	}
	public RectalBleeding getBleeding() {
		return bleeding;
	}
	public void setBleeding(RectalBleeding bleeding) {
		this.bleeding = bleeding;
	}
	public AlteredBowelHabit getAlteredBowelHabit() {
		return alteredBowelHabit;
	}
	public void setAlteredBowelHabit(AlteredBowelHabit alteredBowelHabit) {
		this.alteredBowelHabit = alteredBowelHabit;
	}
	@Override
	public String toString() {
		return "Symtoms [anaemia=" + anaemia + ", ifobt=" + ifobt + ", bleeding=" + bleeding + ", alteredBowelHabit="
				+ alteredBowelHabit + "]";
	}
	
	
	
}
