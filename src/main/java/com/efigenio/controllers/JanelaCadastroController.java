package com.efigenio.controllers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.efigenio.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class JanelaCadastroController {

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

    Scanner teclado = new Scanner(System.in);

    @FXML
    public void alterarParaNotas() throws IOException {
        String nome = field1.getText();
        String nascimento = field2.getText();
        String cpf = field3.getText();
        String email = field4.getText();

        System.out.println("Nome: " + nome);
        System.out.println("Nascimento: " + nascimento);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);

        try (BufferedWriter file = new BufferedWriter(new FileWriter("src/main/java/com/efigenio/arquivo_de_texto.txt",true))) {
            file.write(""+nome+"; "+nascimento+"; "+cpf+"; "+email);
        }catch(IOException e){
            e.printStackTrace();
        }
        App.setRoot("JanelaNotas");

}
}

    
