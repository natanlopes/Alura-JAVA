package br.com.projeto.conversormoeda;

public class Livro {

	private double preco;

    public Livro(double preco) {
        this.preco = preco;
    }

    public double calcularPrecoFinal() {
        double desconto = 0.10; // 10% de desconto
        return preco * (1 - desconto);
    }

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
