
public class Empleado {

	private String nombre;
	private String apellido;
	private int numeroBPS;
	private int numeroFuncionario;
	private String direccion;
	private String telefono;

	public Empleado(String nombre, String apellido, int numeroBPS, int numeroFuncionario, String direccion,
			String telefono) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroBPS = numeroBPS;
		this.numeroFuncionario = numeroFuncionario;
		this.direccion = direccion;
		this.telefono = telefono;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumeroBPS() {
		return numeroBPS;
	}

	public void setNumeroBPS(int numeroBPS) {
		this.numeroBPS = numeroBPS;
	}

	public int getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(int numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", numeroBPS=" + numeroBPS
				+ ", numeroFuncionario=" + numeroFuncionario + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}

	public double getSueldo() {
		double sueldo = 0.0;
		return sueldo;
	}

}
