package Temperatura;

import java.util.Scanner;

public class V2 {
 
    //celsius
	static double celciusFahrenheit(double Celcius){
        double Fahrenheit = (Celcius * 1.8) + 32;
        return Fahrenheit;
        }
	
	static double celsiusKelvin(double celsius){
        double kelvin = celsius+ 273.15;
        return kelvin;
        }
	
	//Fahrenheit
	
	static double fahrenheitCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) /1.8;
	    return celsius;
	}
	
	static double fahrenheitKelvin(double fahrenheit) {
		double kelvin = (fahrenheit - 32) / 1.8 + 273.15;
	    return kelvin;
	}
	
	//kelvin
	static double kelvinCelsius(double kelvin) {
		double celsius = kelvin -273.15;
		return celsius;
	}
	
	static double KelvinFahrenheit(double kelvin) {
		double fahrenheit = (kelvin - 273.15)*1.8+32;
		return fahrenheit;
	}
			
	public  void Metodo2() {
				
		int temperatura = 0;
		double valor;
		
		 Scanner sc = new Scanner(System.in); //Se crea el lector
		 System.out.println("Selecione la conversion que desea realizar\n"
		 		+ "opcion 1 Celsius a Fahrenheit \n"
		 		+ "opcion 2 Celsius a Kelvin\n"
		 		+ "opcion 3 Fahrenheit a Celsius\n"
		 		+ "opcion 4 Fahrenheit a Kelvin\n"
		 		+ "opcion 5 Kelvin a celsius\n"
		 		+ "opcion 6 Kelvin a Fahrenheit"
				 );  
		 temperatura = sc .nextInt();
		 
		 Scanner sc1 = new Scanner(System.in); //Se crea el lector
		 System.out.println("Ingrese Grados centigrados");//Se pide un dato al usuario
	
		 if (1 == temperatura){
			 valor = sc1 .nextInt();
			 System.out.println(celciusFahrenheit(valor)); 
		 }else if(2 == temperatura){
			 valor = sc1 .nextInt();
			 System.out.println(celsiusKelvin(valor)); 
		 }else if(3 == temperatura){
			 valor = sc1 .nextInt();
			 System.out.println(fahrenheitCelsius(valor)); 
		 }else if(4 == temperatura){
			 valor = sc1 .nextInt();
			 System.out.println(fahrenheitKelvin(valor)); 
		 }else if(5 == temperatura){
			 valor = sc1 .nextInt();
			 System.out.println(kelvinCelsius(valor)); 
		 }else if(6 == temperatura){
			 valor = sc1 .nextInt();
			 System.out.println(KelvinFahrenheit(valor)); 
		 }
	
	}

}

