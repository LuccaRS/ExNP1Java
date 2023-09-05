public class Produto {
    int codigoSerie;
    String nome;
    String categoria;
    int quantidade;
    double valor;

    void mostrarInfos() {
        System.out.println("Código série: " + codigoSerie);
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor: R$ " + valor);
        System.out.print("\n");
    }
}
