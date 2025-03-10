package app;

import java.util.ArrayList;
import java.util.List;

public class AppWithoutComposite {
    public static void main(String[] args) {
        var botao1 = new Botao("Enviar");
        var botao2 = new Botao("Cancelar");
        var imagem = new Imagem("logo.png");

        Formulario formulario = new Formulario();
        formulario.adicionarBotao(botao1);
        formulario.adicionarBotao(botao2);
        formulario.adicionarImagem(imagem);

        System.out.println(formulario.renderizar());
    }
}

class Botao {
    private String texto;

    public Botao(String texto) {
        this.texto = texto;
    }

    public String renderizar() {
        return "<button>" + texto + "</button>";
    }
}

class Imagem {
    private String src;

    public Imagem(String src) {
        this.src = src;
    }

    public String renderizar() {
        return "<img src='" + src + "' />";
    }
}

class Formulario {
    private List<Botao> botoes = new ArrayList<>();
    private List<Imagem> imagens = new ArrayList<>();

    public void adicionarBotao(Botao botao) {
        botoes.add(botao);
    }

    public void adicionarImagem(Imagem imagem) {
        imagens.add(imagem);
    }

    public String renderizar() {
        StringBuilder html = new StringBuilder("<form>");
        for (Botao botao : botoes) {
            html.append(botao.renderizar());
        }
        for (Imagem imagem : imagens) {
            html.append(imagem.renderizar());
        }
        html.append("</form>");
        return html.toString();
    }
}

