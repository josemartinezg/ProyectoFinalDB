package logical;

import java.util.ArrayList;

public class Agrupacion {
	private String iDAgrupacion;
	private String nombreAgrupacion;
	private String fechaFormacion;
	private String paisProcedencia;
	private ArrayList<Artista> artistasGrupo;
	public Agrupacion(String iDAgrupacion, String nombreAgrupacion, String fechaFormacion, String paisProcedencia,
			ArrayList<Artista> artistasGrupo) {
		super();
		iDAgrupacion = iDAgrupacion;
		nombreAgrupacion = nombreAgrupacion;
		fechaFormacion = fechaFormacion;
		paisProcedencia = paisProcedencia;
		this.artistasGrupo = artistasGrupo;
	}
	public String getiDAgrupacion() {
		return iDAgrupacion;
	}
	public void setiDAgrupacion(String iDAgrupacion) {
		iDAgrupacion = iDAgrupacion;
	}
	public String getnombreAgrupacion() {
		return nombreAgrupacion;
	}
	public void setnombreAgrupacion(String nombreAgrupacion) {
		nombreAgrupacion = nombreAgrupacion;
	}
	public String getfechaFormacion() {
		return fechaFormacion;
	}
	public void setfechaFormacion(String fechaFormacion) {
		fechaFormacion = fechaFormacion;
	}
	public String getpaisProcedencia() {
		return paisProcedencia;
	}
	public void setpaisProcedencia(String paisProcedencia) {
		paisProcedencia = paisProcedencia;
	}
	public ArrayList<Artista> getArtistasGrupo() {
		return artistasGrupo;
	}
	public void setArtistasGrupo(ArrayList<Artista> artistasGrupo) {
		this.artistasGrupo = artistasGrupo;
	}
}
