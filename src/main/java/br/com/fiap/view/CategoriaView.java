package br.com.fiap.view;

import br.com.fiap.model.Categoria;

import javax.swing.*;

public abstract class CategoriaView {

    private CategoriaView() {
    }

    public static Categoria form() {
        var nome = JOptionPane.showInputDialog("Nome da categoria");
        var categoria = new Categoria();
        categoria.setNome(nome.toUpperCase().trim());
        return categoria;
    }

}
