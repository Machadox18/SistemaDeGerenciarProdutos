package service;

import model.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdutoService {

    private List<Produto> produtos = new ArrayList<>();
    private Map<String, List<Produto>> categorias = new HashMap<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);

        categorias.computeIfAbsent(produto.categoria(), k -> new ArrayList<>()).add(produto);
    }

    public void listarProdutos() {
        produtos.forEach(System.out::println);
    }
}
