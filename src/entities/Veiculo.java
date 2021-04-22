package entities;

public class Veiculo {

	private String nome;
	private double preco;
	private int ano;

	public Veiculo() {

	}

	public Veiculo(String nome, double preco, int ano) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome + ", " + ano);
		sb.append("\nPreço normal: R$" + String.format("%.2f", preco));
		sb.append("\nValor do desconto: " + String.format("%.2f", desconto()));
		sb.append("\nPreço com desconto: " + String.format("%.2f", preco - desconto())+"\n");
		return sb.toString();
		// return nome + ", " + String.format("%.2f", preco - desconto()) + ", " + ano;
	}

	public double desconto() {
		if (ano <= 2000) {// desconto 12%
			return preco * 0.12;
		} else {// desconto 7%
			return preco * 0.07;
		}
	}

}
