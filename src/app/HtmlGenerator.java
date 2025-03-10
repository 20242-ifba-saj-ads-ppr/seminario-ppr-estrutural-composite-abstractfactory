package app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HtmlGenerator {
    public static void generate(String html){
        String modalHtml = generateModalHtml();
        String finalHtml = generateHtmlPage(html.toString(), modalHtml);
        writeToFile(finalHtml, "formulario.html");
    }

    private static String generateModalHtml() {
        return "<script>" +
                "function openModal(action) {" +
                "  alert('Você clicou no botão ' + action + '. Nome: ' + document.querySelector('input').value);" +
                "}" +
                "</script>";
    }

    private static String generateHtmlPage(String content, String modalHtml) {
        return "<!DOCTYPE html>" +
                "<html lang=\"pt-BR\">" +
                "<head>" +
                "  <meta charset=\"UTF-8\">" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
                "  <title>Cadastro de Usuário</title>" +
                "</head>" +
                "<body>" +
                content +
                modalHtml +
                "</body>" +
                "</html>";
    }

    private static void writeToFile(String content, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
            System.out.println("Arquivo HTML gerado com sucesso: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
