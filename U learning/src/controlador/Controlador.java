package controlador;
import modelo.Empleado;
import modelo.Empresa;
import vista.VistaConsola;

public class Controlador {
	private String nomb,ape;
	private int di, me, anac;
	private int edad;
	private double sal;
	private char gen;
	public Controlador( ) {
		VistaConsola vc = new VistaConsola();
		Empresa empresa = new Empresa();
		Empleado empleado1 = new Empleado(nomb,ape, gen, di, me, anac, edad , sal);
		nomb = vc.leerString("Ingrese el nombre de empleado:");
	    ape = vc.leerString("Ingrese el apellido:");
	    gen = vc.leerChar("Ingrese el genero:");
		di = vc.leerInt("Ingrese dia de nacimiento:");
		me = vc.leerInt("Ingrese mes de nacimiento");
		anac = vc.leerInt("Ingrese año de nacimiento");
		sal = vc.leerDouble("Ingrese el salario:");
		vc.leerString("");
		vc.mostrarMensaje(nomb+"" + ape+""+ gen+"" + di+"" + anac+"" + sal+ "");
		
		Empleado empleado2 = new Empleado(nomb, ape, gen, di, me, anac, sal);
		nomb = vc.leerString("Ingrese el nombre de empleado:");
	    ape = vc.leerString("Ingrese el apellido:");
	    gen = vc.leerChar("Ingresar genero:");
		di = vc.leerInt("Ingrese dia de nacimiento:");
    	me = vc.leerInt("Ingrese mes de nacimiento:");
		anac = vc.leerInt("Ingrese año de nacimiento;");
		sal = vc.leerDouble("Ingrese salario:");
		vc.leerString("");
		vc.mostrarMensaje(nomb+" " + ape+" "+ di + " " + me +anac+ " " + sal);
		
		empresa.setEmpleado1(empleado1);
		empresa.setEmpleado2(empleado2);
	    
	    vc.mostrarMensaje(empresa.listarEmpleado());
	    vc.mostrarMensaje(nomb);
	    vc.mostrarMensaje(ape);
	    vc.mostrarMensaje(gen);
	    vc.mostrarMensaje(di);
	    vc.mostrarMensaje(me);
	    vc.mostrarMensaje(anac);
	    vc.mostrarMensaje(sal);
	    
	}
	}
	
