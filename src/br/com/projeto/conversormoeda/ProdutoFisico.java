package br.com.projeto.conversormoeda;

import br.com.projeto.conversormoeda.interfaces.Calculavel;

public class ProdutoFisico implements Calculavel{

	private double preco;
	public ProdutoFisico(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        double taxaAdicional = 0.05; // 5% de taxa adicional
        return preco * (1 + taxaAdicional);
    }

    // Getters e setters, se necessário


}
