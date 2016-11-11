
public class Persona {
	/*
	 Nombre, Apellido, Edad
	 Clase- Persona
	 Atributos- Nombre, apellido, edad
	 Métodos: caminar(), comer(), beber()
	 Objeto
	 Instancia
	 private,protected, default (package), public- 4 Modificadores de Acceso
	 palabra reservada
	 */
	
	private String nombre;
	private String apellido;
	private int edad;
	
	public void caminar()
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
	
	public static void main (String args [])
	{
		Persona p = new Persona();
		
		/*Mala Practica*/
		p.nombre = "Gustavo";
		p.apellido = "Sanchez";
		p.edad = 15;
		
		p.caminar();
		p.comer();
		p.beber();
	}
}
