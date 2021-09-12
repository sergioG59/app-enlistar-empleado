package vista;
import java.util.Scanner;

public class VistaConsola {
	
	Scanner sc;
	public VistaConsola(){
		sc = new Scanner(System.in);
	}
	
	public void mostrarMensaje(String pMen) {
		System.out.println(pMen);
	}

	
	public String leerString(String pMen) {
		System.out.println(pMen);
		return sc.nextLine();
		}
	
   public double leerDouble(String pMen) {
	System.out.println(pMen);
	return sc.nextDouble();
	   
   }
   
   public int leerFecha(int pMen) {
	   System.out.println(pMen);
	   return sc.nextInt();
   }
   
   public char leerChar(String pMen) {
	   System.out.println(pMen);
	   return sc.next().charAt(0); 
   }

public void mostrarMensaje(char gen) {
	System.out.println(gen);
	
}
public void mostrarMensaje(int edad, int antigüedad) {
	System.out.println(edad);
	System.out.println(antigüedad);
}

public void mostrarMensaje(int di, int me, int anac){
    System.out.println(di);
    System.out.println(me);
    System.out.println(anac);
}

public void mostrarMensaje(double sal) {
	System.out.println(sal);
	
}

public int leerInt(int pMen) {
	System.out.println(pMen);
	return sc.nextInt(0);
}

public int leerInt(String string) {
	// TODO Auto-generated method stub
	return 0;
}
}
 //System.out.println(empleado1.getNombre());