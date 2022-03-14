package cts.clase;

import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {

	public abstract List<Aplicant> readAplicants(String file);

	public void readAplicant(Scanner scanner, Aplicant aplicant) {

		String nume = scanner.next();
		String prenume = scanner.next();
		int varsta = scanner.nextInt();
		int punctaj = scanner.nextInt();
		int nr = scanner.nextInt();
		String[] denumireProiecte = new String[nr];
		for (int i = 0; i < nr; i++)
			denumireProiecte[i] = scanner.next();

		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setDenumireProicete(nr, denumireProiecte);

	}
}
