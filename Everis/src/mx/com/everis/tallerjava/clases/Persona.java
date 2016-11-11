package mx.com.everis.tallerjava.clases;

public class Persona {
	
	protected String nombre;
	private String apellido;
	private int edad;
	
	protected void caminar()
	{
		System.out.println(nombre + " esta corriendo");
	}
	
	public void comer()
	{
		System.out.println(nombre + " esta comiendo");		
	}
	
    public void beber()
	{
		System.out.println(nombre + " esta bebiendo");			
	}	
	

}
