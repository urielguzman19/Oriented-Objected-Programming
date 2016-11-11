package mx.com.everis.herintclabs;

public abstract class OperacionesAritmeticas {
		
	public abstract double realizarSuma();
	
	public abstract double realizarResta();
	
	public abstract double realizarMuliplicacion();
	
	public abstract double realizarDivision();
	
	public String imprimeSuma()
	{
		return ("Resultado de Operación Suma es = " + realizarSuma());		
	}
	public String imprimeResta()
	{
		return ("Resultado de Operación Resta es = " + realizarResta());		
	}
	public String imprimeMultiplicacion()
	{
		return ("Resultado de Operación Multiplicación es = " + realizarMuliplicacion());		
	}
	public String imprimeDivision()
	{
		return ("Resultado de Operación Divisón es = " + realizarDivision());	
	}
	
	
	

}
