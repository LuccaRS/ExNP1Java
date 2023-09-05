import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estante novaEstante = new Estante();
        Livro novoLivro = new Livro();

        boolean controle = true;
        novaEstante.letra = 'a';
        novaEstante.idEstante = 1234;

        while (controle) {
            int opcao;
            System.out.println("\n");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Mostrar infos");
            System.out.println("3. Porcentagem de cada gênero");
            System.out.println("4. Livros com mais e menos páginas");
            System.out.println("5. Sair");
            System.out.print("Digite uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n ***** Adicionando livro *****");
                    sc.nextLine();
                    System.out.print("Título: ");
                    novoLivro.titulo = sc.nextLine();

                    System.out.print("Gênero literário: ");
                    novoLivro.genLiterario = sc.nextLine();

                    System.out.print("Quantidade de folhas: ");
                    novoLivro.qtdFolhas = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Editora: ");
                    novoLivro.editora = sc.nextLine();

                    System.out.print("Nome autor: ");
                    novoLivro.autor.nome = sc.nextLine();

                    System.out.print("Ano nascimento: ");
                    novoLivro.autor.anoNascimento = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Profissão: ");
                    novoLivro.autor.profissao = sc.nextLine();

                    novaEstante.addLivros(novoLivro);
                    break;
                case 2:
                    novaEstante.mostraInfos();
                    break;
                case 3:
                    novaEstante.porcentagemGen();
                    break;
                case 4:
                    novaEstante.livroMaisEMenosPag();
                    break;
                case 5:
                    controle = false;
                    break;
            }
        }
    }
}
