package mx.com.everis.herintclabs;

public class TestOperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Clase para probar herencia a trav�s de una clase abstracta "+
                           "calculando operaciones aritm�ticas b�sicas");
		
		Calculadora prueba1= new Calculadora (5,4);
		System.out.println(prueba1.imprimeSuma());
		System.out.println(prueba1.imprimeResta());
		System.out.println(prueba1.imprimeDivision());
		System.out.println(prueba1.imprimeMultiplicacion());

	}

}
