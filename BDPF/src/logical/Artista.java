package logical;

public class Artista extends Persona {
	private String iDArtista;
	private String nombreArtistico;
	private String paisProcedencia;
	private String rolIntegrante;
	private String produccion;
	

	public Artista(String iDPersona, String primer_Nombre, String segundo_Nombre, String primer_Apellido,
			String segundo_Apellido, String fecha_Nacimiento, String genero, String lugar_Nacimiento, String cedula,
			String iDArtista, String nombreArtistico, String paisProcedencia, String rolIntegrante,
			String produccion) {
		super(iDPersona, primer_Nombre, segundo_Nombre, primer_Apellido, segundo_Apellido, fecha_Nacimiento, genero,
				lugar_Nacimiento, cedula);
		iDArtista = iDArtista;
		nombreArtistico = nombreArtistico;
		paisProcedencia = paisProcedencia;
		rolIntegrante = rolIntegrante;
		produccion = produccion;
	}


	public String getiDArtista() {
		return iDArtista;
	}


	public void setiDArtista(String iDArtista) {
		iDArtista = iDArtista;
	}


	public String getnombreArtistico() {
		return nombreArtistico;
	}


	public void setnombreArtistico(String nombreArtistico) {
		nombreArtistico = nombreArtistico;
	}


	public String getpaisProcedencia() {
		return paisProcedencia;
	}


	public void setpaisProcedencia(String paisProcedencia) {
		paisProcedencia = paisProcedencia;
	}


	public String getrolIntegrante() {
		return rolIntegrante;
	}


	public void setrolIntegrante(String rolIntegrante) {
		rolIntegrante = rolIntegrante;
	}


	public String getproduccion() {
		return produccion;
	}


	public void setproduccion(String produccion) {
		produccion = produccion;
	}

}
