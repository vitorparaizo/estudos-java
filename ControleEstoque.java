
import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    String nomeDescricao;
    int qtdEmEstoque;
    double precoUnitario;
    String categoria;
    int qtdMinima;

    Produto(String nomeDescricao, int qtdEmEstoque, double precoUnitario, String categoria, int qtdMinima) {
        this.nomeDescricao = nomeDescricao;
        this.qtdEmEstoque = qtdEmEstoque;
        this.precoUnitario = precoUnitario;
        this.categoria = categoria;
        this.qtdMinima = qtdMinima;
    }

    double calcularSubtotal() {
        return qtdEmEstoque * precoUnitario;
    }
}

public class ControleEstoque {
    static ArrayList<Produto> listaProdutos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 8) {
            System.out.println("menu:");
            System.out.println("1 - cadastrar produto");
            System.out.println("2 - listar produtos");
            System.out.println("3 - filtrar por categoria");
            System.out.println("4 - ordenar por nome");
            System.out.println("5 - remover produto");
            System.out.println("6 - atualizar preco");
            System.out.println("7 - listagem com subtotal por categoria");
            System.out.println("8 - sair");
            System.out.print("opcao: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1: cadastrarProduto(); break;
                case 2: listarProdutos(); break;
                case 3: filtrarCategoria(); break;
                case 4: ordenarProdutos(); break;
                case 5: removerProduto(); break;
                case 6: atualizarPreco(); break;
                case 7: listarComSubtotal(); break;
                case 8: System.out.println("encerrando"); break;
                default: System.out.println("opcao invalida");
            }
        }
    }

    static void cadastrarProduto() {
        System.out.print("nome ou descricao: ");
        String nome = sc.nextLine();
        System.out.print("qtd em estoque: ");
        int qtd = Integer.parseInt(sc.nextLine());
        System.out.print("preco unitario: ");
        double preco = Double.parseDouble(sc.nextLine());
        System.out.print("categoria: ");
        String categoria = sc.nextLine();
        System.out.print("qtd minima: ");
        int qtdMin = Integer.parseInt(sc.nextLine());

        listaProdutos.add(new Produto(nome, qtd, preco, categoria, qtdMin));
        System.out.println("produto cadastrado");
    }

    static void listarProdutos() {
        for (Produto p : listaProdutos) {
            System.out.println(p.nomeDescricao + " | estoque: " + p.qtdEmEstoque + " | preco: R$" + p.precoUnitario + " | categoria: " + p.categoria);
        }
    }

    static void filtrarCategoria() {
        System.out.print("categoria: ");
        String cat = sc.nextLine();
        for (Produto p : listaProdutos) {
            if (p.categoria.equalsIgnoreCase(cat)) {
                System.out.println(p.nomeDescricao + " | estoque: " + p.qtdEmEstoque + " | preco: R$" + p.precoUnitario);
            }
        }
    }

    static void ordenarProdutos() {
        listaProdutos.sort((a, b) -> a.nomeDescricao.compareToIgnoreCase(b.nomeDescricao));
        System.out.println("produtos ordenados");
    }

    static void removerProduto() {
        System.out.print("nome do produto: ");
        String nome = sc.nextLine();
        listaProdutos.removeIf(p -> p.nomeDescricao.equalsIgnoreCase(nome));
        System.out.println("produto removido");
    }

    static void atualizarPreco() {
        System.out.print("nome do produto: ");
        String nome = sc.nextLine();
        for (Produto p : listaProdutos) {
            if (p.nomeDescricao.equalsIgnoreCase(nome)) {
                System.out.print("novo preco: ");
                p.precoUnitario = Double.parseDouble(sc.nextLine());
                System.out.println("preco atualizado");
                return;
            }
        }
        System.out.println("produto nao encontrado");
    }

    static void listarComSubtotal() {
        double totalGeral = 0;
        ArrayList<String> categorias = new ArrayList<>();

        for (Produto p : listaProdutos) {
            if (!categorias.contains(p.categoria)) {
                categorias.add(p.categoria);
            }
        }

        for (String cat : categorias) {
            System.out.println("categoria " + cat);
            double subtotal = 0;
            for (Produto p : listaProdutos) {
                if (p.categoria.equalsIgnoreCase(cat)) {
                    double valor = p.calcularSubtotal();
                    System.out.println(p.nomeDescricao + " - " + p.qtdEmEstoque + " - " + p.precoUnitario + " = " + valor);
                    subtotal += valor;
                }
            }
            System.out.println("subtotal: R$" + subtotal);
            totalGeral += subtotal;
        }

        System.out.println("total geral: R$" + totalGeral);
    }
}
