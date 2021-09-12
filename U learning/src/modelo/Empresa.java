package modelo;
public class Empresa 	{
private Empleado empleado1 ;
private Empleado empleado2;

public Empresa() {
	empleado1 = null;
	empleado2 = null;
}

public Empleado getEmpleado1() {
	return empleado1;
}

public void setEmpleado1(Empleado empleado1) {
	this.empleado1 = empleado1;
}

public Empleado getEmpleado2() {
	return empleado2;
}

public void setEmpleado2(Empleado empleado2) {
	this.empleado2 = empleado2;
}



public String listarEmpleado() {
	return empleado1.toString()+empleado2.toString();
	}
}
