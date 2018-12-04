package logical;

import java.util.ArrayList;

public class Produccion {
	private String iDProduccion;
	private String titulo;
	private String fechaLanzamiento;
	private String generoPrincipalProduccion;
	private String precio;
	private String fechaInicio;
	private ArrayList<Artista> artistasProduccion;
	private ArrayList<Agrupacion> gruposProduccion;
	private ArrayList<Tema>	temasProduccion;
	public Produccion(String iDProduccion, String titulo, String fechaLanzamiento, String generoPrincipalProduccion,
			String precio, String fechaInicio, ArrayList<Artista> artistasProduccion,
			ArrayList<Agrupacion> gruposProduccion, ArrayList<Tema> temasProduccion) {
		super();
		this.iDProduccion = iDProduccion;
		this.titulo = titulo;
		this.fechaLanzamiento = fechaLanzamiento;
		this.generoPrincipalProduccion = generoPrincipalProduccion;
		this.precio = precio;
		this.fechaInicio = fechaInicio;
		this.artistasProduccion = artistasProduccion;
		this.gruposProduccion = gruposProduccion;
		this.temasProduccion = temasProduccion;
	}
	public String getiDProduccion() {
		return iDProduccion;
	}
	public void setiDProduccion(String iDProduccion) {
		this.iDProduccion = iDProduccion;
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
	public String getGeneroPrincipalProduccion() {
		return generoPrincipalProduccion;
	}
	public void setGeneroPrincipalProduccion(String generoPrincipalProduccion) {
		this.generoPrincipalProduccion = generoPrincipalProduccion;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public ArrayList<Artista> getArtistasProduccion() {
		return artistasProduccion;
	}
	public void setArtistasProduccion(ArrayList<Artista> artistasProduccion) {
		this.artistasProduccion = artistasProduccion;
	}
	public ArrayList<Agrupacion> getGruposProduccion() {
		return gruposProduccion;
	}
	public void setGruposProduccion(ArrayList<Agrupacion> gruposProduccion) {
		this.gruposProduccion = gruposProduccion;
	}
	public ArrayList<Tema> getTemasProduccion() {
		return temasProduccion;
	}
	public void setTemasProduccion(ArrayList<Tema> temasProduccion) {
		this.temasProduccion = temasProduccion;
	}
}
