package calculadora;


public class Calcula {

	float num1;
	float num2;

	public float somar(float num1, float num2) {
		float resultado = num1 + num2;
		return resultado;
	}

	public float subtrair(float num1, float num2) {
		float resultado = num1 - num2;
		return resultado;
	}

	public float multiplicar(float num1, float num2) {
		float resultado = num1 * num2;
		return resultado;
	}

	public float dividir(float num1, float num2) {
		float resultado = num1 / num2;
		return resultado;
	}

}
