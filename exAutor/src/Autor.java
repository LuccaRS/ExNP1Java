public class Autor {
    String nome;
    int anoNascimento;
    String profissao;

    void mostraInfos(){
        System.out.println("\n*** Informações do autor ***");
        System.out.println("Nome: " + this.nome);
        System.out.println("Ano de nascimento: " + anoNascimento);
        System.out.println("Profissão: " + profissao);
    }
}
