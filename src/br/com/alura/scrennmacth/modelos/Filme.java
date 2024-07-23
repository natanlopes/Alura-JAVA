package br.com.alura.scrennmacth.modelos;

import br.com.alura.screnmacht.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel{
	private String diretor;

	public Filme(String nome,int anoDeLancamento ) {
		// TODO Auto-generated constructor stub
		super(nome, anoDeLancamento);
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		// TODO Auto-generated method stub
		return (int) obterMedia() / 2;
	}
 @Override
 public String toString() {
     return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
 }
	
	
	
}