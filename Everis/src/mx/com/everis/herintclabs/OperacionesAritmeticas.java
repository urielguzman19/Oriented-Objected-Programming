package mx.com.everis.herintclabs;

public abstract class OperacionesAritmeticas {
		
	public abstract double realizarSuma();
	
	public abstract double realizarResta();
	
	public abstract double realizarMuliplicacion();
	
	public abstract double realizarDivision();
	
	public String imprimeSuma()
	{
		return ("Resultado de Operaci�n Suma es = " + realizarSuma());		
	}
	public String imprimeResta()
	{
		return ("Resultado de Operaci�n Resta es = " + realizarResta());		
	}
	public String imprimeMultiplicacion()
	{
		return ("Resultado de Operaci�n Multiplicaci�n es = " + realizarMuliplicacion());		
	}
	public String imprimeDivision()
	{
		return ("Resultado de Operaci�n Divis�n es = " + realizarDivision());	
	}
	
	
	

}
