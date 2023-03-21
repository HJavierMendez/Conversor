package Temperatura;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

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
				String Opcion1= "Celsius a Fahrenheit";
				String Opcion2= "Celsius a Kelvin";
				String Opcion3 = "Fahrenheit a Celsius";
				String Opcion4= "Fahrenheit a Kelvin";
				String Opcion5= "Kelvin a celsius";
				String Opcion6= " Kelvin a Fahrenheit";
	

		
		String  temperatura = JOptionPane.showInputDialog(null, "Seleciona la temperarura que deseas convertir ","Temperatura", JOptionPane.PLAIN_MESSAGE,null, new Object[] 
           				{"Seleciona", "Celsius a Fahrenheit", "Celsius a Kelvin", "Fahrenheit a Celsius","Fahrenheit a Kelvin","Kelvin a celsius","Kelvin a Fahrenheit"}, "Seleciona").toString();
       
				 

		 if (Opcion1 == temperatura){
			 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
			 JOptionPane.showMessageDialog(null, celciusFahrenheit(valor));
		 }else if(Opcion2 == temperatura){
			 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
			 JOptionPane.showMessageDialog(null, celsiusKelvin(valor));
		 }else if(Opcion3 == temperatura){
			 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
			 JOptionPane.showMessageDialog(null, fahrenheitCelsius(valor));
		 }else if(Opcion4 == temperatura){
			 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
			 JOptionPane.showMessageDialog(null, fahrenheitKelvin(valor));
		 }else if(Opcion5 == temperatura){
			 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
			 JOptionPane.showMessageDialog(null, kelvinCelsius(valor)); 
		 }else if(Opcion6 == temperatura){
			 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
			 JOptionPane.showMessageDialog(null, KelvinFahrenheit(valor));
		 }else {
      		JOptionPane.showMessageDialog(null, "No se selecionada nada");
      	}
	
	}

}
