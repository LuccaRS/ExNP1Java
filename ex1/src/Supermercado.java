public class Supermercado {
    String nome; // Nome do supermercado
    String cnpj; //CNPJ
    String endereco; // Endereço do supermercado
    String numTelefone; // Telefone do supermercado
    Produto[] produtos = new Produto[30]; // Array com 30 posições para alocar os produtos

    void addProduto(Produto p) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                produtos[i] = p;
                break;
            }
        }
    }

    void mostrarInfo() {
        System.out.println("\n***** Info do supermercado *****");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Número do telefone: " + numTelefone);
        System.out.println("\n***** Info dos produtos *****");
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null)
                produtos[i].mostrarInfos();
        }
    }

    int contHigiene = 0;
    int contUtensilios = 0;
    int contAlimenticios = 0;

    void contarCategorias() {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                if (produtos[i].categoria.equalsIgnoreCase("Higiene")) {
                    contHigiene++;
                } else if (produtos[i].categoria.equalsIgnoreCase("Utensílios")) {
                    contUtensilios++;
                } else if (produtos[i].categoria.equalsIgnoreCase("Alimentícios")) {
                    contAlimenticios++;
                }
            }
        }
        System.out.println("\n***** Quantidade por categoria *****");
        System.out.println("Higiene: " + contHigiene);
        System.out.println("Utensílios: " + contUtensilios);
        System.out.println("Alimentícios: " + contAlimenticios);
    }

    double maiorValor = 0;
    double menorValor = 1000;
    int posMenor; // Posição do produto de menor valor
    int posMaior; // Posição do produto de maoir valor

    void mostrarMaisCaroBarato() {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                if (produtos[i].valor > maiorValor) {
                    maiorValor = produtos[i].valor;
                    posMaior = i;
                } else if (produtos[i].valor < menorValor) {
                    menorValor = produtos[i].valor;
                    posMenor = i;
                }
            }
        }

        System.out.println("\n -> Produto com menor valor");
        System.out.println("Nome: " + produtos[posMenor].nome);
        System.out.println("Valor: R$ " + menorValor);
        System.out.print("\n");
        System.out.println(" -> Produto com maior valor");
        System.out.println("Nome: " + produtos[posMaior].nome);
        System.out.println("Valor: R$ " + maiorValor);
    }
}