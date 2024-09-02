package com.modelagemUML.iphone;

import com.modelagemUML.iphone.funcionalidades.AparelhoTelefonico;
import com.modelagemUML.iphone.funcionalidades.NavegadorInternet;
import com.modelagemUML.iphone.funcionalidades.ReprodutorMusical;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Aparelho ligado!");
        Iphone iphone = new Iphone();
        iphone.tocar();
        iphone.selecionarMusica("Nirvana - Come as you are");
        iphone.pausar();
        iphone.ligar("81 99999-9999");
        iphone.iniciarCorreioVoz();
        iphone.atender();
        iphone.exibirPagina("https://dio.com.br");
        iphone.atualizarPagina();
        iphone.adcionarNovaAba();
    }

    @Override
    public void ligar(String numero) {
        System.out.println("ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefone!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz!");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("exibindo pagina: " + url);
    }

    @Override
    public void adcionarNovaAba() {
        System.out.println("Adcionando nova aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println(musica);
    }
}