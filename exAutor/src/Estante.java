public class Estante {
    int idEstante;
    char letra;
    Livro[] livros = new Livro[120];

    void addLivros(Livro livro) {
        for (int i = 0; i < livros.length; i++)
            if (livros[i] == null)
                livros[i] = livro;
    }

    int contDrama = 0;
    int contSuspense = 0;
    int contOustros = 0;
    int contLivrosTotal = 0;

    void porcentagemGen() {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                contLivrosTotal++;
                if (livros[i].genLiterario.equalsIgnoreCase("Drama"))
                    contDrama++;
                if (livros[i].genLiterario.equalsIgnoreCase("Suspense"))
                    contSuspense++;
                else
                    contOustros++;
            }

            float porcDrama = (float) contDrama / contLivrosTotal;
            float porcSuspense = (float) contSuspense / contLivrosTotal;
            float porcOutros = (float) contOustros / contLivrosTotal;

            System.out.println("Drama: " + (porcDrama * 100) + "%");
            System.out.println("Suspense: " + (porcSuspense * 100) + "%");
            System.out.println("Outros: " + (porcOutros * 100) + "%");
        }
    }

    int minPag = 0;
    int maxPag = 1000;

    Livro livroMaior;
    Livro livroMenor;

    void livroMaisEMenosPag() {
        for (int i = 0; i < livros.length; i++) {
            if(livros[i].qtdFolhas > minPag)
                livroMaior = livros[i];
            if(livros[i].qtdFolhas < maxPag)
                livroMenor = livros[i];
        }
        System.out.println("*** Livro com menos páginas ***");
        System.out.println(livroMenor.titulo);
        System.out.println(livroMenor.qtdFolhas);
        System.out.println("*** Livro com mais páginas ***");
        System.out.println(livroMaior.titulo);
        System.out.println(livroMaior.qtdFolhas);
    }

    void mostraInfos() {
        System.out.println("\n***** Informações da estante *****");
        System.out.println("ID: " + this.idEstante);
        System.out.println("Letra: " + this.letra);
        for (int i = 0; i < livros.length; i++)
            if (livros[i] != null)
                livros[i].mostraInfos();
    }
}