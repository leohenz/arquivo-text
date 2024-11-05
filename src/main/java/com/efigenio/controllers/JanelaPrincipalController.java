package com.efigenio.controllers;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.efigenio.App;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class JanelaPrincipalController {

    @FXML private ListView<String> alunosListView;

    @FXML
    private Button cadastrar;

    @FXML
    private void initialize() {
        carregarAlunos();
    }
    private void carregarAlunos() {
        List<String> alunos = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/efigenio/arquivo_de_texto.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                alunos.add(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        alunosListView.getItems().addAll(alunos);
    }

    @FXML
    private void alterarParaCadastro() throws IOException {
        App.setRoot("JanelaCadastro");
    }

    

}

