
public class EmpJornalero extends Empleado {

	private double valorHora;
	private double horasMes;
	Sucursal sucursal = null;

	public EmpJornalero(String nombre, String apellido, int numeroBPS, int numeroFuncionario, String direccion,
			String telefono, double valorHora, double horasMes) {
		super(nombre, apellido, numeroBPS, numeroFuncionario, direccion, telefono);
		// TODO Auto-generated constructor stub

		this.valorHora = valorHora;
		this.horasMes = horasMes;

	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getHorasMes() {
		return horasMes;
	}

	public void setHorasMes(double horasMes) {
		this.horasMes = horasMes;
	}

	public double getSueldo() {
		double sueldo = horasMes * valorHora;
		return sueldo;
	}

	@Override
	public String toString() {
		return "EmpJornalero [valorHora=" + valorHora + ", horasMes=" + horasMes + "]";
	}

	/*
	 * public void cargarHorasMes(String mes,int cantHoras) {
	 * 
	 * if (mes.equalsIgnoreCase("enero")) {
	 * 
	 * this.horasMes[0]=cantHoras; } if (mes.equalsIgnoreCase("febrero")) {
	 * 
	 * this.horasMes[1]=cantHoras; } if (mes.equalsIgnoreCase("marzo")) {
	 * 
	 * this.horasMes[2]=cantHoras; } if (mes.equalsIgnoreCase("abril")) {
	 * 
	 * this.horasMes[3]=cantHoras; } if (mes.equalsIgnoreCase("mayo")) {
	 * 
	 * this.horasMes[4]=cantHoras; } if (mes.equalsIgnoreCase("junio")) {
	 * 
	 * this.horasMes[5]=cantHoras; } if (mes.equalsIgnoreCase("julio")) {
	 * 
	 * this.horasMes[6]=cantHoras; } if (mes.equalsIgnoreCase("agosto")) {
	 * 
	 * this.horasMes[7]=cantHoras; } if (mes.equalsIgnoreCase("setiembre")) {
	 * 
	 * this.horasMes[8]=cantHoras; } if (mes.equalsIgnoreCase("octubre")) {
	 * 
	 * this.horasMes[9]=cantHoras; } if (mes.equalsIgnoreCase("noviembre")) {
	 * 
	 * this.horasMes[10]=cantHoras; } if (mes.equalsIgnoreCase("diciembre")) {
	 * 
	 * this.horasMes[11]=cantHoras; }
	 * 
	 * }
	 * 
	 * 
	 * public double getSueldoMes(String mes) {
	 * 
	 * if (mes.equalsIgnoreCase("enero")) {
	 * 
	 * double sueldo = horasMes[0]* valorHora; return sueldo; }if
	 * (mes.equalsIgnoreCase("febrero")) {
	 * 
	 * double sueldo = horasMes[1]* valorHora; return sueldo; }if
	 * (mes.equalsIgnoreCase("marzo")) {
	 * 
	 * double sueldo = horasMes[2]* valorHora; return sueldo; }if
	 * (mes.equalsIgnoreCase("abril")) {
	 * 
	 * double sueldo = horasMes[3]* valorHora; return sueldo; }if
	 * (mes.equalsIgnoreCase("mayo")) {
	 * 
	 * double sueldo = horasPorMes[4]* valorHora; return sueldo; }if
	 * (mes.equalsIgnoreCase("junio")) {
	 * 
	 * double sueldo = horasMes[5]* valorHora; return sueldo; }if
	 * (mes.equalsIgnoreCase("julio")) {
	 * 
	 * double sueldo = horasMes[6]* valorHora; return sueldo; }if
	 * (mes.equalsIgnoreCase("agosto")) {
	 * 
	 * double sueldo = horasMes[7]* valorHora; return sueldo; }if
	 * (mes.equalsIgnoreCase("setiembre")) {
	 * 
	 * double sueldo = horasMes[8]* valorHora; return sueldo; }if
	 * (mes.equalsIgnoreCase("octubre")) {
	 * 
	 * double sueldo = horasMes[9]* valorHora; return sueldo; }if
	 * (mes.equalsIgnoreCase("noviembre")) {
	 * 
	 * double sueldo = horasMes[10]* valorHora; return sueldo; }if
	 * (mes.equalsIgnoreCase("diciembre")) {
	 * 
	 * double sueldo = horasMes[11]* valorHora; return sueldo; }
	 * 
	 * return 0.0; }
	 */

}
