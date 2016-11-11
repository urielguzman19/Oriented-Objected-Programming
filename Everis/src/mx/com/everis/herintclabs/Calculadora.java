package mx.com.everis.herintclabs;

public class Calculadora extends OperacionesAritmeticas {
	private double numero1;
	private double numero2;
	
	public Calculadora(double num1, double num2) {
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
	public double realizarResta() {
		
		return numero1 - numero2;
	}
	@Override
	public double realizarMuliplicacion() {
		
		return numero1 * numero2;
	}
	@Override
	public double realizarDivision() {
		
		return numero1 / numero2;
	}
	
	

}
