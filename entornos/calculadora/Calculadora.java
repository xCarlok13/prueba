package calculadora;
/**
 * 
 * Programa calculadora: Suma, Resta, Multiplicación, Division, Valor
 * @author Carlos Badia
 * @version version 1.0
 * @since 14/02/2025
 */
public class Calculadora {
	private static final double PI = 3.141592;
	private static final double E = 2.71828;

	public Calculadora() {
	}

	/**
	 * Suma
	 * @param a numero double
	 * @param b numero double
	 * @return suma de a más b
	 */
	public double sumar(double a, double b) {
		return a+b;
	}

	/**
	 * Resta
	 * @param a numero double
	 * @param b numero double
	 * @return resta de a menos b
	 */
	public double restar(double a, double b) {
		return a-b;
	}

	/**
	 *  Multiplicación
	 * @param a numero double
	 * @param b numero double
	 * @return multiplicacion de a por b
	 */
	public double multiplicar(double a, double b) {
		return a*b;
	}

	/**
	 * División
	 * @param a numero double
	 * @param b numero double
	 * @return división de a entre b
	 */
	public double dividir(double a, double b) {
		return a/b;
	}

	/**
	 * Potencia
	 * @param base
	 * @param exponente
	 * @return base elevada al exponente
	 */
	public double potencia(double base, double exponente) {
		return Math.pow(base,exponente);
	}

	/**
	 * Valor absoluto
	 * @param valor numero double
	 * @return valor absoluto de valor
	 */
	public double valorAbsoluto(double valor) {
		return Math.abs(valor);
	}

}