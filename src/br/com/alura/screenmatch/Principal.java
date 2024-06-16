package br.com.alura.screenmatch;
import br.com.alura.screnmacht.calculos.CalculadoraDeTempo;
import br.com.alura.screnmacht.calculos.FiltroRecomendacao;
import br.com.alura.scrennmacth.modelos.Episodio;
import br.com.alura.scrennmacth.modelos.Filme;
import br.com.alura.scrennmacth.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Serie minhaSerie = new Serie();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        meuFilme.setNome("O poderoso chefão");
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
   
     minhaSerie.setNome("Lost");
     minhaSerie.exibeFichaTecnica();
     minhaSerie.setTemporadas(10);
     minhaSerie.setEpisodiosPorTemporada(10);
     minhaSerie.setMinutosPorEpisodio(50);
     System.out.println("Duração da serie: " + minhaSerie.getDuracaoEmMinutos());
     
     Filme outroFilme = new Filme();
     outroFilme.setNome("Avatar");
     outroFilme.setAnoDeLancamento(2023);
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
     
    }
}