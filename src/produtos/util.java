package produtos;
public class util {
	static String v110 = "110";
	static String v220 = "220";
	static String vBi = "Bivolt";
	
	public static double vender(int qtdPedida, int qtd, double valor) {
		if (qtdPedida > 0 && qtd >= qtdPedida) {
			qtd -= qtdPedida;
			valor = qtdPedida * valor;
		}
		
		return valor;
	}
}