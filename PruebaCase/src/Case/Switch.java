package Case;

import java.util.Scanner;

public class Switch {
	Scanner teclado = new Scanner(System.in);;
	
	private void menuOpcion1() {
		System.out.println("Menu Opci�n 1:");
		System.out.println("1. Opci�n 1 Sub Men�.");
		System.out.println("2. Retornar al men� principal.");
		System.out.println("Digite la opci�n que desea: ");
		int opcion = teclado.nextInt();
		switch (opcion) {
		    case 1:
			    System.out.println("Entre a la opci�n 1 SubMenu");
			    break;
		    case 2:
		    	System.out.println("Voy a retornar al menu principal");
			    menuPrincipal();
			    break;
		    default:
		    	System.out.println("Obci�n no valida");
		    	menuOpcion1();
		    	break;
		}
		
	}
	
	public void menuPrincipal() { 
		System.out.println("Menu Principal:");
		System.out.println("1. Opci�n 1.");
		System.out.println("2. Opci�n 2.");
		System.out.println("3. Salir.");
		System.out.println("Digite la opci�n que desea: ");
		int opcion = teclado.nextInt();
		switch (opcion) {
		    case 1:
			    System.out.println("Entre a la opci�n 1");
			    menuOpcion1();
			    break;
		    case 2:
		    	System.out.println("Entre a la opci�n 2");
			    break;
		    case 3:
		    	System.out.println("Entre a la opci�n 3");
		    	System.exit(0);
		    	break;
		    default:
		    	System.out.println("Obci�n no valida");
		    	menuPrincipal();
		    	break;
		}
	}
	
	public static void main(String[] args) {
		Switch s = new Switch();
		s.menuPrincipal();
	}

}
