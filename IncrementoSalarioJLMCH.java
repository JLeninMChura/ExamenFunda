/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "INCREMENTOALSALARIODEUNPROFESORJLMCH.java."

import java.io.*;
import java.math.*;

public class incrementoalsalariodeunprofesorjlmch {

	public static void main(String args[]) {
		double i;
		double salario_inicial;
		double salario_recibido;
		double year;
		for (i=1;i<=6;i++) {
			System.out.println("PROCESO "+i);
			salario_inicial = 1400;
			year = i;
			salario_recibido = salario_inicial*Math.pow((1.1),(year));
			System.out.println("Valor de salario inicial: "+salario_inicial);
			System.out.println("Valor de salario recibido: "+salario_recibido);
			System.out.println("Valor de year: "+year);
		}
	}


}

