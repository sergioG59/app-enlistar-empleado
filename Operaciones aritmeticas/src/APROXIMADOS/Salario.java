package APROXIMADOS; 
public class Salario {
 public static void main(String[] args) {
	 
	 double salario=1580000, rf;
	 rf = salario * (11/100.0);
if (salario < 2000000 && rf >= 1700000) {
	salario = salario -(0.5 * rf);
}
else {
	salario = salario - rf;
}
	 System.out.println("Las prestaciones sociales son:" +salario+ rf);
 }
}
