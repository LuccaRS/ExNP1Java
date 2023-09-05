import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Supermercado supermercado = new Supermercado();
        supermercado.nome = "Maristela";
        supermercado.cnpj = "125234235323";
        supermercado.endereco = "Rua do supermercado";
        supermercado.numTelefone = "40028922";


        boolean controle = true;

        while (controle) {
            System.out.println("\n°°°·.°·..·°¯°·._.· Portal do supermercado Maristela ·._.·°¯°·.·°·.·°°°");
            System.out.println("1. Adicionar produtos");
            System.out.println("2. Mostrar info do supermercado e produtos");
            System.out.println("3. Mostrar quantidade de cada categoria");
            System.out.println("4. Mostrar info de produto mais caro e mais barato");
            System.out.println("5. Sair");
            System.out.print("Digite um opção: ");
            int opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    Produto novoProduto = new Produto();
                    System.out.println("***** Adicionando produtos *****");
                    System.out.print("Nome: ");
                    sc.nextLine();
                    novoProduto.nome = sc.nextLine();

                    System.out.print("Código série: ");
                    novoProduto.codigoSerie = sc.nextInt();

                    System.out.print("Categoria: ");
                    sc.nextLine();
                    novoProduto.categoria = sc.nextLine();

                    System.out.print("Quantidade: ");
                    novoProduto.quantidade = sc.nextInt();

                    System.out.print("Valor: ");
                    novoProduto.valor = sc.nextInt();

                    supermercado.addProduto(novoProduto);
                    break;
                case 2:
                    supermercado.mostrarInfo();
                    break;
                case 3:
                    supermercado.contarCategorias();
                    break;
                case 4:
                    supermercado.mostrarMaisCaroBarato();
                    break;
                case 5:
                    controle = false;
                    break;
                default:
                    System.out.println("Opção inválida!!!");
                    break;
            }
        }
        sc.close();
    }
}
