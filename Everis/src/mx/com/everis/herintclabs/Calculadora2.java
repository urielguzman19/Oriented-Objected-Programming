package mx.com.everis.herintclabs;

public class Calculadora2 implements OperacionesAritmeticas2 {
	
	private double numero1;	
	private double numero2;	
	

	public Calculadora2(double num1, double num2) {
		numero1 = num1;
		numero2 = num2;
	}
	
	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	@Override
	public double realizarSuma() {		
		return numero1 + numero2;
	}

	@Override
	public String imprimeSuma() {		
		return ("Resultado de Operación Suma es = " + realizarSuma());
	}

	@Override
	public double realizarResta() {
		return numero1 - numero2;
	}

	@Override
	public String imprimeResta() {
		return ("Resultado de Operación Resta es = " + realizarResta());
	}

	@Override
	public double realizarMultiplicacion() {
		return numero1 * numero2;
	}

	@Override
	public String imprimeMultiplicacion() {
		return ("Resultado de Operación Multiplicación es = " + realizarMultiplicacion());
	}

	@Override
	public double realizarDivision() {
		return numero1 / numero2;
	}

	@Override
	public String imprimeDivision() {
		return ("Resultado de Operación División es = " + realizarDivision());
	}
	

}
