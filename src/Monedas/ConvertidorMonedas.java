package Monedas;

import javax.swing.JOptionPane;

public class ConvertidorMonedas {
	
	
	
	
	  static double pesosMXDolar(double pesosMX){
		    double dolar = pesosMX/18.8193;
		    return dolar;
		    }  
	  static double pesosMXEuros(double pesosMX){
		    double euros = pesosMX/20.1847;
		    return euros;
		    } 
	  static double pesosMXLibrasEsterlinas(double pesosMX){
		    double librasEsterlinas = pesosMX/23.0345;
		    return librasEsterlinas;
		    } 
	  
	  static double pesosMXYenJapones(double pesosMX){
		    double yenJapones = pesosMX/0.142917;
		    return yenJapones;
		    } 
	  
	  static double pesosMXWonSurcoreano(double pesosMX){
		    double wonSulCoreano = (pesosMX/0.0144108);
		    return wonSulCoreano;
		    } 
	  
	  // Moneda extrajera a pesos

	  static double dolarPesosMX(double dolar){
		    double pesosMX = dolar/0.0537302;
		    return pesosMX;
		    }  
	  static double eurosPesosMX(double euro){
		    double pesosMX = euro/0.0498811;
		    return pesosMX;
		    } 
	  static double librasEsterlinasPesosMX(double libraEs){
		    double pesosMX = libraEs/0.0439387;
		    return pesosMX;
		    } 
	  
	  static double yenJaponesPesosMX(double yenJ){
		    double pesosMX = yenJ/7.11569;
		    return pesosMX;
		    } 
	  
	  static double wonSurcoreanoPesosMX(double wonSur){
		    double pesosMX = wonSur/70.2420;
		    return pesosMX;
		    } 
	  public void metodo1() {
		   String pesosMXDolar= "Pesos a Dolar";
    	   String pesosMxEuro= "Pesos a Euros";
    	   String pesoMxLibraE = "Pesos a Libras Esterlinas";
    	   String pesosMXYenJ ="Pesos a Yen Japones";
    	   String pesosMXWonSur = "Pesos a Won Sur Coreano";
    	   
    	   //moneda extrajera a pesos
    	   String dolarPesosMX= "Dolar a Pesos";
    	   String euroPesosMX= "Eurosa Pesos";
    	   String libraEPesosMX = "Libras Esterlinas a Pesos";
    	   String yenJPesosMX ="Yen Japones a Pesos";
    	   String wonSurPesosMX = "Won Sur Coreano a Pesos";
    	  
           String  moneda = JOptionPane.showInputDialog(null, "Seleciona a que moneda deseas realizar "
           		+ "la conversion de la moneda de tu pais","Monedas", JOptionPane.PLAIN_MESSAGE,null, new Object[] 
           				{"Seleciona", "Pesos a Dolar", "Pesos a Euros", "Pesos a Libras Esterlinas","Pesos a Yen Japones","Pesos a Won Sur Coreano",
           						"Dolar a Pesos","Euros a Pesos","Libras Esterlinas a Pesos","Yen Japones a Pesos","Won Sur Coreano a Pesos"}, "Seleciona").toString();
           
      	           	   
             if (moneda == pesosMXDolar  ) {
            	 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
            	 JOptionPane.showMessageDialog(null, valor + " pesos MX equivale a "+ pesosMXDolar(valor)+" Dolares");
             }else if (moneda == pesosMxEuro) {
            	 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
            	 JOptionPane.showMessageDialog(null, valor + " pesos MX equivale a "+pesosMXEuros(valor)+ " Euros");                	 
             }else if (moneda == pesoMxLibraE  ) {
            	 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
            	 JOptionPane.showMessageDialog(null, valor + " pesos MX equivale a "+pesosMXLibrasEsterlinas(valor)+" Libras Esterlinas");;
             }else  if (moneda == pesosMXYenJ) {
            	 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
            	 JOptionPane.showMessageDialog(null, valor + " pesos MX equivale a "+pesosMXYenJapones(valor)+" Yen Japoneses");
             } else if (moneda == pesosMXWonSur) {
            	 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
            	 JOptionPane.showMessageDialog(null, valor + " pesos MX equivale a "+pesosMXWonSurcoreano(valor)+" Won Surcoreano");                	 
             }
             //Moneda extranjera a pesos
             
             if (moneda == dolarPesosMX  ) {
            	 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
            	 JOptionPane.showMessageDialog(null, valor + " Dolares equivale a "+ dolarPesosMX(valor)+ " pesos MX");
             }else if (moneda == euroPesosMX) {
            	 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
            	 JOptionPane.showMessageDialog(null, valor + " Euros equivale a "+ eurosPesosMX(valor)+ " pesos MX");                	 
             }else if (moneda == libraEPesosMX  ) {
            	 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
            	 JOptionPane.showMessageDialog(null, valor + " Libras Estrelinas equivale a "+ librasEsterlinasPesosMX(valor)+ " pesos MX");;
             }else  if (moneda == yenJPesosMX) {
            	 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
            	 JOptionPane.showMessageDialog(null, valor + " Yen Japones a "+ yenJaponesPesosMX(valor)+ " pesos MX");
             } else if (moneda == wonSurPesosMX) {
            	 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar")+ " pesos MX");
            	 JOptionPane.showMessageDialog(null, valor + " Won MXSurcoreano equivale a "+ wonSurcoreanoPesosMX(valor)+ " pesos MX");                	 
             }

	  }
	 
		
}
