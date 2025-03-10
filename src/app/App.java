package app;

import app.composites.Card;
import app.composites.Panel;
import app.leafs.Button;
import app.leafs.Image;
import app.leafs.TextField;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String submitFunction = "alert('Você clicou no botão Enviar: ' + document.querySelector('input').value)";
        String cancelFunction = "alert('Você clicou no botão Cancelar ' + document.querySelector('input').value)";

        Button btnSubmit = new Button("Enviar", "background-color: blue; color: white; padding: 10px;", submitFunction);
        Button btnCancel = new Button("Cancelar", "background-color: red; color: white; padding: 10px;", cancelFunction);
        TextField txtName = new TextField("Digite seu nome", "width: 200px;");
        txtName.setValue("Leandro");
        Image profilePic = new Image("https://lh3.googleusercontent.com/a-/ALV-UjVR7lDGPK3OwV2OXcOJ3eyVuJCrGO2X5Lrk-FpdZlzSB_7OUbg=s75-c", "Foto de Perfil", "width: 100px; border-radius: 50%;");

        Panel formPanel = new Panel("border: 1px solid #ccc; padding: 20px;");
        formPanel.addComponent(profilePic);
        formPanel.addComponent(txtName);
        formPanel.addComponent(btnSubmit);
        formPanel.addComponent(btnCancel);

        Card userCard = new Card("Cadastro de Usuário", "border: 2px solid black; padding: 40px;");
        userCard.addComponent(formPanel);


        StringBuilder html = new StringBuilder();
        userCard.render(html, 0);

        System.out.println(html);

        HtmlGenerator.generate(html.toString());

    }


}
