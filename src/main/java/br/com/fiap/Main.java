package br.com.fiap;

import br.com.fiap.repository.CategoriaRepository;
import br.com.fiap.repository.ProdutoRepository;
import br.com.fiap.view.CategoriaView;
import br.com.fiap.view.ProdutoView;

public class Main {
    public static void main(String[] args) {

        var repoCategoria = new CategoriaRepository();
        var repo = new ProdutoRepository();

        var categoria = CategoriaView.form();
        var produto = ProdutoView.form();

        repoCategoria.save(categoria);
        repo.save(produto);

    }
}