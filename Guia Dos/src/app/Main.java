package app;

import java.util.Scanner;

import clase.Cuenta;

public class Main {

	public static void main(String[] args) {
		int option = 0;
		float valor = 0;
		Cuenta unaCuenta=null;

		Scanner scan = new Scanner(System.in);

	while (option != 6) {
			System.out.println("1- Crear cuenta vacia \n 2- Crear cuenta con saldo inicial \n 3- Ingresar dinero \n 4- Sacar dinero \n 5- Ver saldo \n 6- Exit");
			option = scan.nextInt();
			switch (option) {
			case 1:
				unaCuenta = new Cuenta();
				break;
			case 2:
				System.out.println("Ingrese la cantidad de saldo inicial./n");
				valor = scan.nextFloat();
				unaCuenta = new Cuenta(valor);
				break;
			case 3:
				if (unaCuenta != null) {
					System.out.println("Ingrese la cantidad de saldo inicial.\n");
					valor = scan.nextFloat();
					unaCuenta.IngresarDinero(valor);
				} else {
					System.out.println("Cree una cuenta primero con alguna de las opciones 1 o 2");
				}
				break;
			case 4:
				boolean rta;
				if (unaCuenta != null) {
					System.out.println("Ingrese la cantidad de plata a retirar.");
					valor = scan.nextFloat();
					rta = unaCuenta.SacarDinero(valor);
					if (rta == true) {
						System.out.println("Dinero retirado exitosamente");
					} else {
						System.out.println("No posee saldo suficiente. ");
					}

				} else {
					System.out.println("Cree una cuenta primero con alguna de las opciones 1 o 2. ");
				}
				break;
			case 5:
				if (unaCuenta != null) {
					float plata = unaCuenta.ObtenerSaldo();
					System.out.println("Su saldo es: "+plata);
				} else {
					System.out.println("Cree una cuenta primero con alguna de las opciones 1 o 2. ");
				}
				break;
			case 6:
				System.out.println("Gracias por usar sistemas Paulita's");

				break;
			}
		}
	}

}
