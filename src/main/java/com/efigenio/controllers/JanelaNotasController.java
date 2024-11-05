package com.efigenio.controllers;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.efigenio.App;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class JanelaNotasController {

    @FXML
    private TextField field1;

    @FXML
    private TextField field2;

    @FXML
    private TextField field3;

    @FXML
    private TextField field4;

    @FXML
    private Button incluir;

    @FXML
    private Button voltar;

    @FXML
    private Double media;

    @FXML
    private void voltarParaCadastro() throws IOException {
        App.setRoot("JanelaCadastro");
    }
    @FXML
    private void salvarDados2() throws IOException {
        Double n1 = Double.parseDouble(field1.getText());
        Double n2 = Double.parseDouble(field2.getText());
        Double n3 = Double.parseDouble(field3.getText());
        Double n4 = Double.parseDouble(field4.getText());
        
        media = (n1+n2+n3+n4) /4;

        try (BufferedWriter file = new BufferedWriter(new FileWriter("src/main/java/com/efigenio/arquivo_de_texto.txt", true))) {
            file.write("; " + n1 + "; " + n2 + "; " + n3 + "; " + n4 + "; " + media);
            file.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        App.setRoot("JanelaPrincipal");

}
}
