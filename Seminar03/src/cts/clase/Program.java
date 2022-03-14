package cts.clase;

import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AplicantReader reader = new AngajatReader();

		listaAngajati = reader.readAplicants("angajati.txt");
		for (Aplicant aplicant : listaAngajati) {
			System.out.println(aplicant.toString());
			System.out.println();
			aplicant.afisareAcceptanta();
			System.out.println();
			aplicant.afisareSumaFinantata(3000);
			System.out.println();
		}
	}

}
