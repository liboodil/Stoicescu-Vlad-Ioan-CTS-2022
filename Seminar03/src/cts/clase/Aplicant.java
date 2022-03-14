package cts.clase;

import java.util.Arrays;

public abstract class Aplicant {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nr_proiecte;
	protected String[] denumireProiect;

	public static int pragPunctaj;

	public static void setPragPunctaj(int pragPunctaj) {
		Aplicant.pragPunctaj = pragPunctaj;
	}

	public Aplicant() {
		super();
	}

	public void afisareSumaFinantata(int suma) {
		System.out
				.println("Aplicantul " + getNume() + " " + getPrenume() + " primeste " + suma + " Euro/zi in proiect.");
	}

	public void setDenumireProicete(int nr_proiecte, String[] denumireProiecte) {
		this.nr_proiecte = nr_proiecte;
		this.denumireProiect = new String[nr_proiecte];
		for (int i = 0; i < nr_proiecte; i++) {
			this.denumireProiect[i] = denumireProiecte[i];
		}
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void afisareAcceptanta() {
		if (punctaj > pragPunctaj) {
			System.out.println("Aplicantul " + nume + " " + prenume + " a fost acceptat.");
		} else {
			System.out.println("Aplicantul " + nume + " " + prenume + " nu a fost acceptat.");
		}
	}

	public int getPunctaj() {
		return punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nume=");
		builder.append(nume);
		builder.append(", Prenume=");
		builder.append(prenume);
		builder.append(", Varsta=");
		builder.append(varsta);
		builder.append(", Punctaj=");
		builder.append(punctaj);
		builder.append(", Nr_proiecte=");
		builder.append(nr_proiecte);
		builder.append(", DenumireProiect=");
		builder.append(Arrays.toString(denumireProiect));
		return builder.toString();
	}

}
