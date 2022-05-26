package aluraCurrencyConverter;

import javax.swing.JOptionPane;

public class Main {

	private static final double tasausd = 119.06;
	private static final double tasaeur = 126.93;
	private static final double tasagbp = 148.80;
	private static final double tasayen = 0.94;
	private static final double tasakrw = 0.094;


	public static void main(String[] args) {

		// CUADRO DE DIALOGO SOLICITANDO CONVERSOR

		String conversor = JOptionPane.showInputDialog("Bienvenido al conversor de ALURA \n"
				+ "Seleccione que conversor desea utilizar: \n \n  " + "M para moneda - G para grados");

		do {

			if (conversor.equalsIgnoreCase("m")) {
				convertirMoneda();
				conversor = JOptionPane.showInputDialog(
						"Seleccione que conversor desea utilizar: \n \n" + "M para moneda - G para grados");
			} else if (conversor.equalsIgnoreCase("g")) {
				convertirUnidad();
				conversor = JOptionPane.showInputDialog(
						"Seleccione que conversor desea utilizar: \n \n" + "M para moneda - G para grados");
			}

			else {
				conversor = JOptionPane.showInputDialog(
						"Seleccione que conversor desea utilizar: \n \n" + "M para moneda - G para grados");
			}

		} while (!conversor.equalsIgnoreCase("0-963-52"));

	}

	// METODOS

	private static void convertirMoneda() {

		String operacion = JOptionPane
				.showInputDialog("ingrese el tipo de conversion \n1-ARS a otra moneda \n2-Otra moneda a ARS");

		double valor = Double.parseDouble((JOptionPane.showInputDialog("Ingrese el valor a convertir")));

		if (operacion.equalsIgnoreCase("1")) {
			convertirFromArs(valor);
		} else if (operacion.equalsIgnoreCase("2")) {
			convertirToArs(valor);
		} else {
			operacion = JOptionPane
					.showInputDialog("ingrese el tipo de conversion \n1-ARS a otra moneda \n2-Otra moneda a ARS");
		}
	}

	private static void convertirToArs(double valor) {

		double resultado = 0;

		String moneda = JOptionPane.showInputDialog("que moneda quiere convertir a ARS? \n" + "1-USD \n" + "2-EUR \n"
				+ "3-GBP \n" + "4-YEN \n" + "5-KRW \n");

		if ((moneda.equalsIgnoreCase("1")) || (moneda.equalsIgnoreCase("2")) || (moneda.equalsIgnoreCase("3"))
				|| (moneda.equalsIgnoreCase("4")) || (moneda.equalsIgnoreCase("5"))) {

			switch (moneda) {

			case "1":
				resultado = valor * tasausd;
				moneda = "USD";
				break;
			case "2":
				resultado = valor * tasaeur;
				moneda = "EUR";
				break;
			case "3":
				resultado = valor * tasagbp;
				moneda = "GBP";
				break;
			case "4":
				resultado = valor * tasayen;
				moneda = "YEN";
				break;
			case "5":
				resultado = valor * tasakrw;
				moneda = "KRW";
				break;
			}
			JOptionPane.showMessageDialog(null, valor + " ARS es igual a " + resultado + " " + moneda);
		} else {
			System.out.println("error en la moneda");

		}
	}

	private static void convertirFromArs(double valor) {

		double resultado = 0;

		String moneda = JOptionPane.showInputDialog("desde que moneda lo quiere convertir? \n" + "1-USD \n" + "2-EUR \n"
				+ "3-GBP \n" + "4-YEN \n" + "5-KRW \n");

		if ((moneda.equalsIgnoreCase("1")) || (moneda.equalsIgnoreCase("2")) || (moneda.equalsIgnoreCase("3"))
				|| (moneda.equalsIgnoreCase("4")) || (moneda.equalsIgnoreCase("5"))) {
			switch (moneda) {

			case "1":
				resultado = valor / tasausd;
				moneda = "USD";
				break;
			case "2":
				resultado = valor / tasaeur;
				moneda = "EUR";
				break;
			case "3":
				resultado = valor / tasagbp;
				moneda = "GBP";
				break;
			case "4":
				resultado = valor / tasayen;
				moneda = "YEN";
				break;
			case "5":
				resultado = valor / tasakrw;
				moneda = "KRW";
				break;
			}
			JOptionPane.showMessageDialog(null, valor + " ARS es igual a " + resultado + " " + moneda);

		} else {
			System.out.println("error en la moneda");
		}
	}

	private static void convertirUnidad() {
		String operacion = JOptionPane
				.showInputDialog("ingrese el tipo de conversion \n1-Celsius a Farenheit \n2-Farenheit a Celcius");

		double valor = Double.parseDouble((JOptionPane.showInputDialog("Ingrese el valor a convertir")));

		if (operacion.equalsIgnoreCase("1")) {
			JOptionPane.showMessageDialog(null, valor + " grados Celsius es igual a " + ((valor*9/5)+32) + " grados Farenheit");
		} else if (operacion.equalsIgnoreCase("2")) {
			JOptionPane.showMessageDialog(null, valor + " grados Farenheit es igual a " + ((valor-32)*9/5) + " grados Celsius");
		} else {
			operacion = JOptionPane
					.showInputDialog("ingrese el tipo de conversion \\n1-Celsius a Farenheit \\n2-Farenheit a Celcius");
		}
	}
}