public class Serie {

    Diretor diretor;

    public Serie() {
        diretor = new Diretor();
    }

    String nome;
    double nota;
    int temporadas;
    boolean finalizada;

    void mostraInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Diretor: " + diretor.nome);
        System.out.println("Nota: " + this.nota);
        System.out.println("Temporadas: " + this.temporadas);
        if (finalizada)
            System.out.println("Série já finalizada");
        else
            System.out.println("Série ainda não finalizada");
        System.out.print("\n");
    }
}
