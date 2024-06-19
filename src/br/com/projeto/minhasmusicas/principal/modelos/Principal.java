package br.com.projeto.minhasmusicas.principal.modelos;

public class Principal {

	public static void main(String[] args) {
		Musicas minhaMusica = new Musicas();
		Podcast meuPodcast = new Podcast();
		minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");


        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcos Mendes");


        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }
		
	}
	
}
