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
	  
	  static double pesosMXWonSurCoreano(double pesosMX){
		    double wonSulCoreano = (pesosMX/0.0144108);
		    return wonSulCoreano;
		    } 
	  public void metodo1() {
		   String dolar= "Pesos a Dolar";
    	   String euro= "Pesos a Euros";
    	   String libraE = "Pesos a Libras Esterlinas";
    	   String yen ="Pesos a Yen Japones";
    	   String won = "Pesos a Won Sur Coreano";
    	  
           String  moneda = JOptionPane.showInputDialog(null, "Seleciona a que moneda deseas realizar "
           		+ "la conversion de la moneda de tu pais","Monedas", JOptionPane.PLAIN_MESSAGE,null, new Object[] 
           				{"Seleciona", "Pesos a Dolar", "Pesos a Euros", "Pesos a Libras Esterlinas","Pesos a Yen Japones","Pesos a Won Sur Coreano"}, "Seleciona").toString();
           
      	           	   
             if (moneda == dolar  ) {
            	 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
            	 JOptionPane.showMessageDialog(null, pesosMXDolar(valor));
             }else if (moneda == euro) {
            	 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
            	 JOptionPane.showMessageDialog(null, pesosMXEuros(valor));                	 
             }else if (moneda == libraE  ) {
            	 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
            	 JOptionPane.showMessageDialog(null, pesosMXLibrasEsterlinas(valor));;
             }else  if (moneda == yen) {
            	 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
            	 JOptionPane.showMessageDialog(null, pesosMXYenJapones(valor));
             } else if (moneda == won) {
            	 double  valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la cantidad a acambiar"));
            	 JOptionPane.showMessageDialog(null, pesosMXWonSurCoreano(valor));                	 
             }

	  }
	 
		
}
