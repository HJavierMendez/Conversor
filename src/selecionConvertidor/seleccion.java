package selecionConvertidor;

import javax.swing.JOptionPane;

import Monedas.ConvertidorMonedas;
import Temperatura.ConversorTemperatura;

public class seleccion {

public static void main(String[] args) {
	
	String opcionMoneda = "Conversor de Monedas";
	String opcionTemperatura = "Conversor de temperatura";
	
	ConvertidorMonedas conversionMonedas = new ConvertidorMonedas();  
	ConversorTemperatura conversionTemperatura = new ConversorTemperatura();
	
	
	
	String  convertir = JOptionPane.showInputDialog(null, "Seleciona la conversion que deseas realizar ","Conversor", JOptionPane.PLAIN_MESSAGE,null, new Object[] 
       			{"Seleciona", "Conversor de Monedas", "Conversor de temperatura"}, "Seleciona").toString();
	
	
	
	try {

		if (convertir == opcionMoneda ) {
		conversionMonedas.metodo1();
	}else if (convertir == opcionTemperatura ) {
		conversionTemperatura.Metodo2();
	}else {
		
	}
		}
		catch(Exception e) {
		  JOptionPane.showMessageDialog(null, "No ingreso un valor correcto");
		}

	
	
}
	
	
}
