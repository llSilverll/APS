package produtos;

public class movel extends produto {

	public movel(int codigo, String nome, String fabricante, double valor, String tipoMaterial) {
		super(codigo, nome, fabricante, valor);
		this.tipoMaterial = tipoMaterial;
	}
	
	String tipoMaterial;

	@Override
	public double vender(int quantidade) {
		double valor = -1;
		
		if (quantidade > 0 && qtd >= quantidade) {
			qtd -= quantidade;
			valor = quantidade * this.valor;
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
	public String tipo() {
		return "Movel";
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println(String.format("Código: {0}\nNome: {1}\nFabricante: {2}\nValor: R${3}\nTipo de Material: {4}", codigo, nome, fabricante, valor, tipoMaterial));
	}
	
	@Override
	public String getData() {
		return String.format("Código: {0}\nNome: {1}\nFabricante: {2}\nValor: R${3}\nTipo de Material: {4}", codigo, nome, fabricante, valor, tipoMaterial);
	}

}
