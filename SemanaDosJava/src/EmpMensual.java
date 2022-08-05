
public class EmpMensual extends Empleado {

	private double salarioMensual;
	private String tipoRegimen;
	Sucursal sucursal = null;

	public EmpMensual(String nombre, String apellido, int numeroBPS, int numeroFuncionario, String direccion,
			String telefono, double salarioMensual, String tipoRegimen) {
		super(nombre, apellido, numeroBPS, numeroFuncionario, direccion, telefono);

		// TODO Auto-generated constructor stub
		this.salarioMensual = salarioMensual;
		this.tipoRegimen = tipoRegimen;

	}

	public double getSueldo() {
		double sueldo = salarioMensual;
		return sueldo;
	}

	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}

	public String getTipoRegimen() {
		return tipoRegimen;
	}

	public void setTipoRegimen(String tipoRegimen) {
		this.tipoRegimen = tipoRegimen;
	}

}
