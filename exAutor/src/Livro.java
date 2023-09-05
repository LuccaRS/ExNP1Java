public class Livro {
    String titulo;
    String genLiterario;
    int qtdFolhas;
    String editora;
    Autor autor;
    public Livro(){
        autor = new Autor();
    }

    void mostraInfos(){
        System.out.println("\n**** Informações do livro ****");
        System.out.println("Título: " + this.titulo);
        System.out.println("Gênero literário: " + this.genLiterario);
        System.out.println("Quantidade de folhas: " + this.qtdFolhas);
        System.out.println("Editora: " + this.editora);
        autor.mostraInfos();
    }
}
