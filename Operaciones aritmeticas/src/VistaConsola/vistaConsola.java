package VistaConsola;

import APROXIMADOS.Prestaciones;
import java.util.Scanner;

public class vistaConsola {
	 Scanner sc; 
	 public vistaConsola(){
			sc = new Scanner(System.in);
		}
		
		public void mostrarMensaje(String pMen) {
		System.out.println(pMen);
		}
		
	    public double leerDouble(String pMen) {
	    System.out.println(pMen);
		return sc.nextDouble();
		 }
				
		public int leerInt(int pMen) {
		System.out.println(pMen);
		return sc.nextInt(0);
		}
				
		public void mostrarMensaje(double salario, int antiguedad) {
			System.out.println(salario);
			System.out.println(antiguedad);
		}
				   
			   

	 
	 
	 
}
