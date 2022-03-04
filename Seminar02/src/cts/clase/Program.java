package cts.clase;

import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AplicantReader reader = new AngajatReader();

		listaAngajati = reader.readAplicants("angajati.txt");
		for (Aplicant angajat : listaAngajati)
			System.out.println(angajat.toString());
	}

}
