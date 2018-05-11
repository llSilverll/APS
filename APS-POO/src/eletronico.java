public class eletronico extends produto {

	public eletronico(int codigo, String nome, String fabricante, double valor, volts voltagem, String potencia, eficiencias eficiencia) {
		super(codigo, nome, fabricante, valor);
		this.voltagem = voltagem;
		this.potencia = potencia;
		this.eficiencia = eficiencia;
	}
	
	public enum volts{
		_110("110"), _220("220"), Bivolt("Bivolt");
		
		private final String value;
		
		private volts (String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
	}
	
	public enum eficiencias{
		a('A'), b('B'), c('C'), d('D'), e('E');
		
		private final char value;
		
		private eficiencias(char value) {
			this.value = value;
		}
		
		public char getValue() {
			return value;
		}
	}
	
	public volts voltagem;
	public String potencia;
	public eficiencias eficiencia;
	
	@Override
	public double vender(int quantidade) {
		double valor = -1;
		
		if (quantidade > 0 && qtd >= quantidade) {
			qtd -= quantidade;
			valor = quantidade * valor;
		}
		
		return valor;
	}

	@Override
	public void comprar(int quantidade) {
		// TODO Auto-generated method stub
		if (quantidade > 0) {
			qtd += quantidade;
		}
	}

	@Override
	public void imprimir() {
		System.out.println(String.format("Código: {0}\nNome: {1}\nFabricante: {2}\nValor: R${3}\nVoltagem: {4}\nPotência: {5}\n" +
				"Eficiência: {6}", codigo, nome, fabricante, valor, voltagem.getValue(), potencia, eficiencia.getValue()));		
	}

}