package br.com.alura.screenmatch;
import java.util.ArrayList;

import br.com.alura.screnmacht.calculos.CalculadoraDeTempo;
import br.com.alura.screnmacht.calculos.FiltroRecomendacao;
import br.com.alura.scrennmacth.modelos.Episodio;
import br.com.alura.scrennmacth.modelos.Filme;
import br.com.alura.scrennmacth.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",2004);
        Serie minhaSerie = new Serie("Lost",2000);
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        FiltroRecomendacao filtro = new FiltroRecomendacao();
//        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
     meuFilme.exibeFichaTecnica();
     meuFilme.avalia(10);
     meuFilme.avalia(10);
     meuFilme.avalia(10);
//     System.out.println(meuFilme.somaDasAvaliacoes);
     System.out.println("meu total de avaliaçao e: "+meuFilme.getTotalDeAvaliacoes());
     System.out.println(meuFilme.obterMedia());
   
//     minhaSerie.setNome("Lost");
     minhaSerie.exibeFichaTecnica();
     minhaSerie.setTemporadas(10);
     minhaSerie.setEpisodiosPorTemporada(10);
     minhaSerie.setMinutosPorEpisodio(50);
     System.out.println("Duração da serie: " + minhaSerie.getDuracaoEmMinutos());
     
     Filme outroFilme = new Filme("Avatar",2023);
//     outroFilme.setNome("Avatar");
//     outroFilme.setAnoDeLancamento(2023);
     outroFilme.setDuracaoEmMinutos(300);
     calculadora.inclui(meuFilme);
     calculadora.inclui(outroFilme);
     calculadora.inclui(minhaSerie);
     System.out.println(calculadora.getTempoTotal());
     
     filtro.filtra(meuFilme);
     
     Episodio episodio = new Episodio();
     episodio.setNumero(1);
     episodio.setSerie(minhaSerie);
     episodio.setTotalVisualizacao(300);
     filtro.filtra(episodio);
     
     var filmeNatan = new Filme("eu sou a lenda",2008);
     filmeNatan.setDuracaoEmMinutos(200);
//     filmeNatan.setNome("eu sou a lenda");
//     filmeNatan.setAnoDeLancamento(2008);
     filmeNatan.avalia(9.5);
     ArrayList<Filme> listaDeFilmes = new ArrayList<Filme>();
     listaDeFilmes.add(outroFilme);
     listaDeFilmes.add(meuFilme);
     listaDeFilmes.add(filmeNatan);
     System.out.println("Tamanho da lista: " + listaDeFilmes.size());
     System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
     System.out.println(listaDeFilmes);
     System.out.println("Filmes: " + listaDeFilmes.get(0).toString());

     
     
     
    }
}