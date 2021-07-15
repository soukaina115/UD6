public class Activitat2 {
	
	public static void main(String[] args) {
		
		String texto=JOptionPane.showInputDialog("Introduce el limite");
		
		int limite=Integer.parseInt(texto);
		texto=JoptionPane.showInputDialog("Introduce un numero");
		int numero1=Integer.parseInt(texto);
		texto=JOptionPane.showInputDialgo("Introduce un numero");
		int numero2=Integer.parseInt(texto);
		
		//Generamos los numeros
	   
		for(int i=0; i<limite;i++)  {
			System.out.println(generaNumero(numero1, numero2));	
		}	
	}

	private static char[] generaNumero(int numero1, int numero2) {
	
	 return ((int)Math.floor(Math.random()*(num2-num1)+num1));
	}
	
}