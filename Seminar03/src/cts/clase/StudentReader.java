package cts.clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {

	@Override
	public List<Aplicant> readAplicants(String file) {
		Scanner input = null;
		try {
			input = new Scanner(new File(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		input.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Student student = new Student();
			readAplicant(input, student);
			int an_studii = input.nextInt();
			String facultate = (input.next()).toString();

			student.setAn_studii(an_studii);
			student.setFacultate(facultate);

			studenti.add(student);
		}
		input.close();
		return studenti;
	}

}
