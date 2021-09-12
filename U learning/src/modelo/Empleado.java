package modelo;

import java.util.Calendar;

public class Empleado {
	

private String nombre;
private String apellido;
private char genero;
private Fecha fechaNac; 
private Fecha fechaIng;
private int Edad;
private int Antigüedad;
private double salario;
Calendar fecha = Calendar.getInstance();

public Empleado(String pNom,String pApe, char pGen, Fecha pFeIn, Fecha  pFeN, int pEda, int pAn ,double pSal) {
	nombre = pNom;
	apellido = pApe;
	genero = pGen;
	fechaIng = pFeIn;
	fechaNac = pFeN;
	Edad = pEda;
	Antigüedad = pAn;
	salario = pSal;
}


public Empleado(String pNom, String string, int i,Fecha fechaIng,Fecha fechaNac ,int edad, double sal) {
    nombre = pNom;
    apellido = "";
    fechaNac = null;
    fechaIng = null;
    Edad = 0;
   	Antigüedad = 0;
    salario = 0; 
    }

public void darEdad() {
	 fecha.get(Calendar.YEAR);
	    fecha.get(Calendar.MONTH);
	    fecha.get(Calendar.DAY_OF_MONTH);
	    fechaNac.getAnio();
	    fechaNac.getMes();
	    
}

//getters y setter


public Empleado(String nomb, String ape, char gen, int di, int me,int an, int edad2, double sal) {
	// TODO Auto-generated constructor stub
}


public Empleado(String nomb, String ape, char gen, int di, int me, int anac, double sal) {
	// TODO Auto-generated constructor stub
}


public Calendar getFecha() {
	return fecha;
}


public void setFecha(Calendar fecha) {
	this.fecha = fecha;
}


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
public Fecha getFechaNac() {
	return fechaNac;
}
public int getEdad() {
	return Edad;
}
public void setEdad(int edad) {
	this.Edad = edad;
}
public int getAntigüedad() {
	return Antigüedad;
}
public void setAntigüedad(int antiguedad) {
	this.Antigüedad = antiguedad;
}

public void setFechaIng(Fecha fechaIng) {
	this.fechaIng = fechaIng;
}
public Fecha getFechaIng() {
	return fechaIng;
}
public void setFechaNac(Fecha fechaNac) {
	this.fechaNac = fechaNac;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}
@Override
public String toString() {
	return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", fechaIng="
			+ fechaIng + ", fechaNac=" + fechaNac + ", Edad=" + Edad +", Antigüedad=" + Antigüedad +" ,salario=" + salario + "]\n";
}




}
      

