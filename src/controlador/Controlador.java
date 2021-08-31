package controlador;

import modelo.Empleado;
import modelo.Empresa;
import vista.VistaConsola;

public class Controlador {
	private String nomb, ape,f_in,f_na;
	private double sal;
	private char gen;
	public Controlador ( ) {
		VistaConsola vc = new VistaConsola();
		Empresa empresa = new Empresa();
		Empleado empleado1 = new Empleado(nomb,ape,gen,f_in,sal);
		nomb = vc.leerString("ingresa nombre del empleado:");
		ape = vc.leerString("ingresa el apellido:");
		gen = vc.leerChar("ingresa el genero:");
		f_in = vc.leerString("ingrese fecha de ingreso:");
		f_na = vc.leerString("ingrece fecha de nacimiento:");
		sal = vc.leerDouble("ingree el salario");
		vc.leerString("");
		vc.mostrarMensaje(nomb+""+ape+""+f_in+""+f_na+""+sal);
	
	Empleado empleado2 = new Empleado(nomb,ape,gen,f_in,sal);
	nomb = vc.leerString("ingresa nombre del empleado:");
	ape = vc.leerString("ingresa el apellido:");
	gen = vc.leerChar("ingresa el genero:");
	f_in = vc.leerString("ingrese fecha de ingreso:");
	f_na = vc.leerString("ingrece fecha de nacimiento:");
	sal = vc.leerDouble("ingree el salario");
	vc.leerString("");
	vc.mostrarMensaje(nomb+""+ape+""+f_in+""+f_na+""+sal);
	

    empresa.setEmpleado1(empleado1);
    empresa.setEmpleado2(empleado2);
    
    vc.mostrarMensaje(empresa.listarEmpleado());
    vc.mostrarMensaje(nomb);
    vc.mostrarMensaje(ape);
    vc.mostrarMensaje(gen);
    vc.mostrarMensaje(f_in);
    vc.mostrarMensaje(f_na);
    vc.mostrarMensaje(sal);
}
}

