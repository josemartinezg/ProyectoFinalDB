package logical;

public class Persona {
	private String iDPersona;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String fechaNacimiento;
	private String genero;
	private String lugarNacimiento;
	private String cedula;
	
	public Persona(String iDPersona, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String fechaNacimiento, String genero, String lugarNacimiento, String cedula) {
		super();
		this.iDPersona = iDPersona;
		primerNombre = primerNombre;
		segundoNombre = segundoNombre;
		primerApellido = primerApellido;
		segundoApellido = segundoApellido;
		fechaNacimiento = fechaNacimiento;
		genero = genero;
		lugarNacimiento = lugarNacimiento;
		cedula = cedula;
	}
	public String getiDPersona() {
		return iDPersona;
	}
	public void setiDPersona(String iDPersona) {
		this.iDPersona = iDPersona;
	}
	public String getprimerNombre() {
		return primerNombre;
	}
	public void setprimerNombre(String primerNombre) {
		primerNombre = primerNombre;
	}
	public String getsegundoNombre() {
		return segundoNombre;
	}
	public void setsegundoNombre(String segundoNombre) {
		segundoNombre = segundoNombre;
	}
	public String getprimerApellido() {
		return primerApellido;
	}
	public void setprimerApellido(String primerApellido) {
		primerApellido = primerApellido;
	}
	public String getsegundoApellido() {
		return segundoApellido;
	}
	public void setsegundoApellido(String segundoApellido) {
		segundoApellido = segundoApellido;
	}
	public String getfechaNacimiento() {
		return fechaNacimiento;
	}
	public void setfechaNacimiento(String fechaNacimiento) {
		fechaNacimiento = fechaNacimiento;
	}
	public String getgenero() {
		return genero;
	}
	public void setgenero(String genero) {
		genero = genero;
	}
	public String getlugarNacimiento() {
		return lugarNacimiento;
	}
	public void setlugarNacimiento(String lugarNacimiento) {
		lugarNacimiento = lugarNacimiento;
	}
	public String getcedula() {
		return cedula;
	}
	public void setcedula(String cedula) {
		cedula = cedula;
	}
}
