package cuarentena;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Conector instancia = Conector.getInstancia();
		// Ejercicio 3
		try {
			ArrayList<String> listPaciente = instancia.getPaciente();
			for (String nombres : listPaciente) {
				System.out.println(nombres);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// Ejercicio 4
		// Se agrego i para crear un salto de linea con el if marcado con "*"
		// tomando n cuenta el numero de tipos de datos(entidades)
		// que se quieren mostrar, en este caso:
		// nro(consultorio),nombre(doctor),apellidos(doctor)
		try {
			ArrayList<String> listDoctorConsultorio = instancia.getDoctorConsultorio();
			int i = 0;
			for (String elemento : listDoctorConsultorio) {
				System.out.print(elemento);
				System.out.print(" ");
				i++;
				if (i % 3 == 0) {
					System.out.println();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
