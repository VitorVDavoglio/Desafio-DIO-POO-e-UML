package Aparelho;

import Musica.Ipod;
import Navegador.Internet;
import Telefone.AparelhoTelefonico;

public class Iphone {
	public static void main(String[] args) {
		Ipod ipod = new Ipod();
		
		System.out.println("Reprodutor Musical: ");
		ipod.tocar();
		ipod.pausar();
		ipod.selecionarMusica();
		System.out.println("");
		
		Internet internet = new Internet();
		System.out.println("Navegador na Internet:");
		internet.ligar();
		internet.atender();
		internet.iniciarCorreioVoz();
		System.out.println("");
		
		AparelhoTelefonico telefone = new AparelhoTelefonico();
		System.out.println("Aparelho Telefônico: ");
		telefone.exibirPagina();
		telefone.adicionandoNovaAba();
		telefone.atualizarPagina();
		
		System.out.println("Finalização do programa.");
	}
}
