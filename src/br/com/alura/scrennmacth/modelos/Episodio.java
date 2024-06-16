package br.com.alura.scrennmacth.modelos;

import br.com.alura.screnmacht.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private int totalVisualizacao;
    public int getTotalVisualizacao() {
		return totalVisualizacao;
	}
	public void setTotalVisualizacao(int totalVisualizacao) {
		this.totalVisualizacao = totalVisualizacao;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	private Serie serie;
	@Override
	public int getClassificacao() {
		// TODO Auto-generated method stub
		if (totalVisualizacao > 100) {
			return 4;
		}else {
			return 2;
		}
		
	}
}

   