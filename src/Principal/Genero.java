package Principal;

public class Genero {
	private String Genero;

    public Genero(String Genero) {
        this.Genero = Genero;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return Genero;
    }
}

