import controller.LivrariaController;
import model.Caixa;
import model.Livro;
import model.TipoProduto;
import service.EstoqueService;
import service.EstoqueServiceImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Caixa caixa = new Caixa(0d);
        LivrariaController livraria = new LivrariaController();

        ArrayList<String> generos = new ArrayList<>();
        generos.add("Tecnologia");
        generos.add("Programação");
        Livro livro1 = new Livro(1L, "Codificador Limpo", 150.0, TipoProduto.LIVRO, generos, "Uncle Bob", "Alta Books");
        Livro livro2 = new Livro(2L, "Codigo Limpo", 200.0, TipoProduto.LIVRO, generos, "Uncle Bob", "Alta Books");
        Livro livro3 = new Livro(3L, "Arquitetura Limpa", 250.0, TipoProduto.LIVRO, generos, "Uncle Bob", "Alta Books");

        System.out.println("Caixa iniciado: " + caixa.getSaldo());
        System.out.println("=====================");
        EstoqueService estoque = new EstoqueServiceImpl();
        estoque.adicionarProduto(livro1);
        estoque.adicionarProduto(livro2);
        estoque.adicionarProduto(livro3);

        System.out.println();
        System.out.println("Estoque");
        System.out.println("=====================");
        estoque.verProduto(1L);
        estoque.listagemEstoqueCompleto();

        System.out.println();
        System.out.println("=====================");
        livraria.comprarMercadoria(livro1, caixa, estoque);
        System.out.println("Caixa após venda: " + caixa.getSaldo());


    }
}