package logical;

public class Tema {
	private String iDTema;
	private String titulo;
	private String fechaLanzamiento;
	private String genero;
	public Tema(String iDTema, String titulo, String fechaLanzamiento, String genero) {
		super();
		this.iDTema = iDTema;
		this.titulo = titulo;
		this.fechaLanzamiento = fechaLanzamiento;
		this.genero = genero;
	}
	public String getiDTema() {
		return iDTema;
	}
	public void setiDTema(String iDTema) {
		this.iDTema = iDTema;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFechaLanzamiento() {
		return fechaLanzamiento;
	}
	public void setFechaLanzamiento(String fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
