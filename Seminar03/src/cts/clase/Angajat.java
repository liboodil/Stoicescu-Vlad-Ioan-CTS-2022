package cts.clase;

public class Angajat extends Aplicant {
	private String ocupatie;
	private int salariu;

	public Angajat() {
		super();

	}

	public String getOcupatie() {
		return ocupatie;
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public int getSalariu() {
		return salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	@Override
	public String toString() {
		return "Angajat: " + super.toString() + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
	}

}
