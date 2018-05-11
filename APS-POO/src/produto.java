public abstract class produto {
	
	public produto(int codigo, String nome, String fabricante, double valor) {
		setCodigo(codigo);
		setNome(nome);
		setFabricante(fabricante);
		setValor(valor);
	}
	
	int codigo;
	String nome;
	String fabricante;
	int qtd;
	double valor;
	
	public abstract double vender(int quantidade);	
	public abstract void comprar(int quantidade);
	public abstract void imprimir();
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome != null && nome.length() > 0) {
			this.nome = nome;	
		}
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		if (fabricante != null && fabricante.length() > 0) {
			this.fabricante = fabricante;	
		}
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		if (valor > 0) {
			this.valor = valor;	
		}
	}
}
