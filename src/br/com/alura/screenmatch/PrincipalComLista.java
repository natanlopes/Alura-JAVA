package br.com.alura.screenmatch;

import java.util.ArrayList;

import br.com.alura.scrennmacth.modelos.Filme;
import br.com.alura.scrennmacth.modelos.Serie;
import br.com.alura.scrennmacth.modelos.Titulo;
public class PrincipalComLista {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Filme outroFilme = new Filme("Avatar",2023);
		 outroFilme.avalia(10);
		 Filme meuFilme = new Filme("O poderoso chefão",2004);
		 meuFilme.avalia(9);
		 var filmeNatan = new Filme("eu sou a lenda",2008);
		 filmeNatan.avalia(7);
		 Serie minhaSerie = new Serie("Lost",2000);
       ArrayList<Titulo> list = new ArrayList<>();
       list.add(meuFilme);
       list.add(outroFilme);
       list.add(filmeNatan);
       list.add(minhaSerie);
       for (Titulo item : list) {
    	   System.out.println(item.getNome());
    	   if (item instanceof Filme filme && filme.getClassificacao() > 2) {
    		   System.out.println("Classificação : " +  filme.getClassificacao());
    		   }
	}

       
       
	}

}
