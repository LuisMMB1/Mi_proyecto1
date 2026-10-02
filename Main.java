package git;

import java.util.Scanner;

public class tarea1_Git {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
		
		int t = 0;//almacenamos el timpo en segundos
		int minutos = 0, segundos=0, horas=0, dias=0;
		
		System.out.println("Dame un tiempo en segundos: ");
		t = sc.nextInt();
		
		//Algoritmo de conversion
		
		//Minetras t sea igual o mayor a 60 haz
		while(t>=60){
		//imcremento un minuto
		//Quito 60 segundos a t	
		minutos++;
		t=t-60;
		}
		segundos = t;
		
		//MInetras minutos sea mayor igual a 60 haz
		while(minutos>=60) {
			horas++;
			minutos=minutos-60;
		}
		
		while(horas>=24) {
			dias++;
			horas=horas-24;
		}
		
		//Salida
		System.out.println("Dias: "+dias);
		System.out.println("Horas: "+horas);
		System.out.println("minutos: "+minutos);
		System.out.println("segundos: "+segundos);
	 
 }

}