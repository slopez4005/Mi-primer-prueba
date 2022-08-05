
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sucursal suc1 = new Sucursal("Casa Central", 1, "Montevideo", "28082828", "259142368838");
		Sucursal suc2 = new Sucursal("Sucursal Durazno", 3, "Durazno", "25823698", "248648282536");

		EmpJornalero jornalero1 = new EmpJornalero("Juan", "Zabala", 328672, 68, "Durazno", "26223858", 215.5, 120);
		EmpJornalero jornalero2 = new EmpJornalero("Pedro", "Rosen", 669825, 3, "Montevideo", "2852639", 280, 100.5);

		EmpMensual mensual1 = new EmpMensual("Romina", "Paito", 333458, 50, "Durazno", "2528655", 38000, "Comercial");
		EmpMensual mensual2 = new EmpMensual("Lucas", "Manzi", 225698, 45, "Montevideo", "2887469", 38500, "Comercial");

		suc1.empleados.add(jornalero2);
		suc1.empleados.add(mensual2);

		suc2.empleados.add(jornalero1);
		suc2.empleados.add(mensual1);

		System.out
				.println("Gastos por concepto de sueldos en Sucursal " + suc1.getNombre() + ": " + gastosSueldo(suc1));
		System.out
				.println("Gastos por concepto de sueldos en Sucursal " + suc2.getNombre() + ": " + gastosSueldo(suc2));

	}

	public static double gastosSueldo(Sucursal suc) {

		double sueldos = 0;
		for (Empleado emp : suc.empleados) {

			sueldos = sueldos + emp.getSueldo();
		}
		return sueldos;
	}

}
