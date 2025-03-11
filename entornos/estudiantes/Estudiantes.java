package estudiantes;

public class Estudiantes {

	private static final int MAYOR_EDAD = 18;

	private String nombre;

	private String apellidos;

	private int edad;

	private String matricula;
	
	boolean esMayorEdad = edad >= MAYOR_EDAD;
	
	public void inscribir() {

		
		if (esMayorEdad) {

			printMatriculado();

			printNombre();

			printApellidos();

			printEdad();

			printMatricula();

		}

	}

	private void printMatricula() {
		System.out.println("Matrícula: " + matricula);
	}

	private void printEdad() {
		System.out.println("Edad: " + edad);
	}

	private void printApellidos() {
		System.out.println("Apellidos: " + apellidos);
	}

	private void printNombre() {
		System.out.println("Nombre: " + nombre);
	}

	private void printMatriculado() {
		System.out.println(
				"El estudiante " + nombre + " " + apellidos + " con matrícula " + matricula + " está inscrito.");
	}

	public void asistirClase() {

		boolean esMayorEdad = edad >= MAYOR_EDAD;
		if (esMayorEdad) {

			System.out.println("El estudiante " + nombre + " " + apellidos + " está asistiendo a clase.");

		}

	}

}
