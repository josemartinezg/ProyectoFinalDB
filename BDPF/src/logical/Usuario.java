package logical;

public class Usuario extends Persona {
	private String iDUsuario;
	private String contrasenna;
	private String fechaRegistro;
	private String fechaUltAcceso;
	public Usuario(String iDPersona, String primer_Nombre, String segundo_Nombre, String primer_Apellido,
			String segundo_Apellido, String fecha_Nacimiento, String genero, String lugar_Nacimiento, String cedula,
			String iDUsuario, String contrasenna, String fechaRegistro, String fechaUltAcceso) {
		super(iDPersona, primer_Nombre, segundo_Nombre, primer_Apellido, segundo_Apellido, fecha_Nacimiento, genero,
				lugar_Nacimiento, cedula);
		iDUsuario = iDUsuario;
		contrasenna = contrasenna;
		fechaRegistro = fechaRegistro;
		fechaUltAcceso = fechaUltAcceso;
	}
	public String getiDUsuario() {
		return iDUsuario;
	}
	public void setiDUsuario(String iDUsuario) {
		iDUsuario = iDUsuario;
	}
	public String getcontrasenna() {
		return contrasenna;
	}
	public void setcontrasenna(String contrasenna) {
		contrasenna = contrasenna;
	}
	public String getfechaRegistro() {
		return fechaRegistro;
	}
	public void setfechaRegistro(String fechaRegistro) {
		fechaRegistro = fechaRegistro;
	}
	public String getfechaUltAcceso() {
		return fechaUltAcceso;
	}
	public void setfechaUltAcceso(String fechaUltAcceso) {
		fechaUltAcceso = fechaUltAcceso;
	}
}
