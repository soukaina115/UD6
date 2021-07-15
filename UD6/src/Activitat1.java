import javax.swing.JOptionPane;

public class Activitat1 {
	
	public static void main(String[] args) {
		
		String texto= "";
		
		//Declaro esta variable para mostrar el resultado final
		
		double resultado=0;
		String eleccion=JOptionPane.showInputDialog("Intrdouce una figura: circulo, triangulo, cuadrado ");
		switch (eleccion) {
		
       //segun figura
		case "circulo":
			texto=JOptionPane.showInputDialog("Introduce el radio");
			int radio=Integer.parseInt(texto);
			resultado=areaCirculo(radio);
			break;
			
		case "triangulo":
			texto=JOptionPane.showInputDialog("Introduce la base");
			int base=Integer.parseInt(texto);
			texto=JOptionPane.showInputDialog("Introduce la altura");
			int altura=Integer.parseInt(texto);
			resultado=areaTriangulo(base, altura);
			break;
			
		case "cuadrado":
			texto=JOptionPane.showInputDialog("Introduce la medida de un lado");
			int lado=Integer.parseInt(texto);
			resultado=areaCuadrado(lado);
			break;
		
			default:
				System.out.println("No has introducido una figura correcta ");
		 }
		System.out.println("El area del "+eleccion+" es " +resultado);
		
	}
	
	private static double areaCirculo(int radio) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static double areaTriangulo(int base, int altura) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static double areaCuadrado(int lado) {
		// TODO Auto-generated method stub
		return 0;
	}
}