import model.Produto;
import repository.Caixa;
import service.ProdutoService;

public class Main {
    public static void main(String[] args) {

        ProdutoService service = new ProdutoService();

        Produto p1 = new Produto("Mouse", 50, "Eletrônicos");
        Produto p2 = new Produto("Cadeira", 120, "Móveis");
        Produto p3 = new Produto("Xbox", 3500, "VídeoGame");

        service.adicionarProduto(p1);
        service.adicionarProduto(p2);
        service.adicionarProduto(p3);

        System.out.println("Todos os produtos");
        service.listarProdutos();

        System.out.println("\nProdutos acima de 100:");
        service.listarProdutosCaros(100);

        System.out.println("\nCategoria Eletrônicos:");
        service.listarCategorias("Eletrônicos");

        Caixa<Produto> caixa = new Caixa<>();
        caixa.guardar(p1);

        System.out.println("\nProduto guardado na caixa:");
        System.out.println(caixa.abrir());
    }
}