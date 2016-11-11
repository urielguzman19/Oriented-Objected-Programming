package mx.com.everis.herintclabs;

public class TestOperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Clase para probar herencia a través de una clase abstracta "+
                           "calculando operaciones aritméticas básicas");
		
		Calculadora prueba1= new Calculadora (5,4);
		System.out.println(prueba1.imprimeSuma());
		System.out.println(prueba1.imprimeResta());
		System.out.println(prueba1.imprimeDivision());
		System.out.println(prueba1.imprimeMultiplicacion());

	}

}
