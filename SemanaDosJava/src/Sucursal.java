import java.util.LinkedList;

public class Sucursal {

	private String nombre;
	private int identificador;
	private String direccion;
	private String telefono;
	private String rut;
	LinkedList<Empleado> empleados = new LinkedList<Empleado>();

	public Sucursal(String nombre, int identificador, String direccion, String telefono, String rut) {

		this.nombre = nombre;
		this.identificador = identificador;
		this.direccion = direccion;
		this.telefono = telefono;
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
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

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public LinkedList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(LinkedList<Empleado> empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		return "Sucursal [nombre=" + nombre + ", identificador=" + identificador + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", rut=" + rut + ", empleados=" + empleados + "]";
	}

}
