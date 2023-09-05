import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plataforma plataforma = new Plataforma();
        boolean controle = true;

        while (controle) {
            System.out.println("\n***** Xilften *****");
            System.out.println("1. Adicionar séries");
            System.out.println("2. Mostrar info plataforma e séries");
            System.out.println("3. Série com maior número de temporadas que já foi finalizada");
            System.out.println("4. A porcentagem do número de séries e a média aritmética de notas das que possuem 3 ou mais temporadas");
            System.out.println("5. Sair");
            System.out.print("Digite uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Serie serie = new Serie();
                    System.out.println("\n***** Adicionando série *****");

                    sc.nextLine();
                    System.out.print("Nome: ");
                    serie.nome = sc.nextLine();

                    System.out.print("Diretor: ");
                    serie.diretor.nome = sc.nextLine();

                    System.out.print("Nota: ");
                    serie.nota = sc.nextInt();
                    System.out.print("Temporada: ");
                    serie.temporadas = sc.nextInt();

                    System.out.println("Finalizada? ");
                    System.out.println("1. SIM   2. NÃO");
                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1:
                            serie.finalizada = true;
                            break;
                        case 2:
                            serie.finalizada = false;
                            break;
                    }
                    plataforma.addSerie(serie);
                    break;
                case 2:
                    plataforma.mostraInfo();
                    break;
                case 3:
                    System.out.println(" -> Nome da série: " + plataforma.serieMaisLongaFinalizada());
                    break;
                case 4:
                    plataforma.mediaPorcentagem();
                    break;
                case 5:
                    controle = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
