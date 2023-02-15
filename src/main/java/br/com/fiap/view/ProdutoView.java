package br.com.fiap.view;

import br.com.fiap.model.Produto;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class ProdutoView {

    private ProdutoView() {
    }

    public static Produto form() {

        Produto celular = new Produto();

        String nome = JOptionPane.showInputDialog("Nome do produto");
        String descricao = JOptionPane.showInputDialog("Descrição do produto");
        BigDecimal preco = new BigDecimal(JOptionPane.showInputDialog("Preço do produto"));

        return celular.setNome(nome).setDescricao(descricao).setPreco(preco).setFabricacao(LocalDate.now());
    }

}
