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

	public static int getIdPelicula() {
		return idPelicula;
	}
	public static String ProximoId() {
		return " "+idPelicula;
	}

	@Override
	public String toString() {
		return "" + Id + "," + Nombre + "," + genero + "";
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero string) {
		genero=string; 
	}

	

	
	
	
	
	
}
