package Principal;

public class Pelicula {

	private int Id;
	private String Nombre;
	private Genero genero;
	
	static int idPelicula = 0;
	
	//constructor
	public Pelicula() {
		idPelicula++;
		this.Id = idPelicula;
	}
	
	public Pelicula( String Nombre, Genero genero) {
		idPelicula++;
		this.Id = idPelicula;
		this.Nombre = Nombre;
		this.genero = genero;
	}

	

	
	
	
	
	
}
