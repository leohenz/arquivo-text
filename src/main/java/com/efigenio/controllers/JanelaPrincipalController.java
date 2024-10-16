package com.efigenio.controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.efigenio.models.Pessoa;

public class JanelaPrincipalController {
    public void initialize() {

        String path = "/home/luiz/IdeaProjects/texto/src/main/java/com/efigenio/arquivo_de_texto.txt"; // getClass().getResource("../arquivo_de_texto.txt").toString();
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.write("Olá, mundo!\n");
            writer.write("Escrevendo no arquivo.\n");
            System.out.println("Dados escritos com sucesso!");
            writer.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } catch (Exception e) {
        }

        try {
            String caminho = "/home/luiz/IdeaProjects/texto/src/main/java/com/efigenio/arquivo_de_texto.txt"; // getClass().getResource("../arquivo_de_texto.txt").toString();
            FileReader file = new FileReader(caminho);
            BufferedReader reader = new BufferedReader(file);

            while (reader.ready()) {
                String nome = reader.readLine().split(",")[0];

                Pessoa pessoa = new Pessoa();
                pessoa.setNome(nome);

                System.out.println(pessoa.getNome());
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage());
        }
    }
}
