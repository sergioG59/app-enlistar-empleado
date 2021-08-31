package vista;
import java.util.Scanner;
public class VistaConsola {
Scanner sc;
public VistaConsola() {
	sc = new Scanner(System.in);
}
public void mostrarMensaje(String pMen) {
	System.out.println(pMen);
}

public void mostrarMensaje(char gen) {
	System.out.print(gen);

}
public void mostrarMensaje(double sal) {
	System.out.println(sal);
}

public String leerString(String pMen) {
	System.out.println(pMen);
	return sc.nextLine();
	
}
public double leerDouble(String pMen) {
	System.out.println(pMen);
	return sc.nextDouble();
} 
public char leerChar(String pMen) {
	System.out.println(pMen);
	return sc.next().charAt(0);
}
    

}

