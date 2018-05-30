package produtos;
import java.util.Date;

public class perecivel extends produto {

	public perecivel(int codigo, String nome, String fabricante, double valor, Date validade, Boolean refrigerado) {
		super(codigo, nome, fabricante, valor);
		// TODO Auto-generated constructor stub
		this.refrigerado = refrigerado;
		this.validade = validade;
	}

	Boolean refrigerado;
	public Date validade; 
	
	@Override
	public double vender(int quantidade) {
		// TODO Auto-generated method stub
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
		return "Perecivel";
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println(String.format("Código: {0}\nNome: {1}\nFabricante: {2}\nValor: R${3}\nValidade: {4}\nRefrigerado: {5}", codigo, nome, fabricante, valor, validade, refrigerado));
	}
	
	@Override
	public String getData() {
		return String.format("Código: {0}\nNome: {1}\nFabricante: {2}\nValor: R${3}\nValidade: {4}\nRefrigerado: {5}", codigo, nome, fabricante, valor, validade, refrigerado);
	}

}
