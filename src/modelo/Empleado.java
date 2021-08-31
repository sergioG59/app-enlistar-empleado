package modelo;

public class Empleado {
private String nombre;
private String apellido;
private char genero;
private String fecha_de_ingreso;
private String fecha_de_nacimiento;
private double salario;

 public Empleado (String pNom,String pApe,char pGen,String pFecha_de_ingreso,String pFecha_de_nacimiento,double pSal) {
	 nombre = pNom;
	 apellido = pApe;
	 genero = pGen;
	 fecha_de_ingreso = pFecha_de_ingreso;
	 fecha_de_nacimiento = pFecha_de_nacimiento;
	 salario = pSal;
 }
 public Empleado (String pNom, String String,  char c, String string2, double sal) {
	 nombre = pNom;
	 apellido = "";
	 fecha_de_ingreso = "";
	 fecha_de_nacimiento = "";
 }
// getters y setters
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public char getGenero() {
	return genero;
}
public void setGenero(char genero) {
	this.genero = genero;
}
public String getFecha_de_ingreso() {
	return fecha_de_ingreso;
}
public void setFecha_de_ingreso(String fecha_de_ingreso) {
	this.fecha_de_ingreso = fecha_de_ingreso;
}
public String getFecha_de_nacimiento() {
	return fecha_de_nacimiento;
}
public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
	this.fecha_de_nacimiento = fecha_de_nacimiento;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}
@Override
public String toString() {
	return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", fecha_de_ingreso="
			+ fecha_de_ingreso + ", fecha_de_nacimiento=" + fecha_de_nacimiento + ", salario=" + salario + "]\n";
}
 
 
 
}
