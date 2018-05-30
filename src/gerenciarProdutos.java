import java.util.Date;

import produtos.perecivel;
import produtos.produto;

public class gerenciarProdutos {
	produto todosProdutos[];
	
	public void adicionar(produto prod) {
		todosProdutos[todosProdutos.length] = prod;
	}
	
	public Boolean remover(int codigo) {
		Boolean output = false;
		
		if (codigo > 0) {
			todosProdutos[codigo] = null;
		}
		
		return output;
	}
	
	public produto buscar(int codigo) {
		produto output = null;
		
		if (codigo > 0) {
			output = todosProdutos[codigo];
		}
		
		return output;
	}
	
	/// Tipos serao Eletronico, Movel ou Perecivel
	public String listarTipo(String tipo) {
		StringBuilder output = new StringBuilder();
		
		for (produto prod:todosProdutos) {
			if (prod.tipo().equals(tipo)) {
				output.append("\n" + prod.getData());
			}
		}
		
		return output.toString();
	}

	public String listarEstoqueMenorQue(int qtd) {
		Boolean vazio = qtd == 0;
		StringBuilder output = new StringBuilder();
		
		for (produto prod : todosProdutos) {
			//Produtos com quantidade menor que 1 (0), devem estar vazios 
			if (prod.getQtd() < (vazio ? 1 : qtd)) {
				output.append("\n" + prod.getData());
			}
		}
		
		return output.toString();
	}
	
	public String listarPorValidade(Date validade) {
		StringBuilder output = new StringBuilder();
		
		for (produto prod : todosProdutos) {
			if (prod.tipo() == "Perecivel") {
				perecivel per = (perecivel)prod;
				if (per.validade == validade) {
					output.append("\n" + prod.getData());	
				}
			}
		}
		
		return output.toString();
	}
	
	public double venderProduto(int codigo, int quantidade) {
		double output = -1;
		
		if (codigo > 0) {
			if (todosProdutos[codigo] != null) {
				output = todosProdutos[codigo].vender(quantidade);
			}
		}
		
		return output;
	}
	
	public Boolean comprarProduto(int codigo, int quantidade) {
		Boolean output = false;
		
		if (codigo > 0) {
			if (todosProdutos[codigo] != null) {
				todosProdutos[codigo].comprar(quantidade);
				output = true;
			}
		}
		
		return output;
	}
	
	public String listarTudo() {
		StringBuilder output = new StringBuilder();
		
		for (produto prod:todosProdutos) {
			output.append("\n" + prod.getData());
		}
		
		return output.toString();
	}
}
