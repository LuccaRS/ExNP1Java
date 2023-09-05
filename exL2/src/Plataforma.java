public class Plataforma {
    String nome = "Xilften";
    Serie[] series = new Serie[10];

    void mostraInfo() {
        System.out.println("***** Info Plataforma *****");
        System.out.println("Nome: " + this.nome);

        System.out.println("\n***** Info Série *****");
        for (int i = 0; i < series.length; i++)
            if (series[i] != null)
                series[i].mostraInfo();
    }

    void addSerie(Serie serie) {
        for (int i = 0; i < series.length; i++) {
            if (series[i] == null) {
                series[i] = serie;
                break;
            }
        }
    }

    int maiorSerie = 0;
    int posMaior; //Posição onde foi armazenada a maior série

    String serieMaisLongaFinalizada() {
        for (int i = 0; i < series.length; i++) {
            if (series[i] != null) {
                if (series[i].finalizada) {
                    if (series[i].temporadas > maiorSerie) {
                        maiorSerie = series[i].temporadas; // Adiciona a série para comparar com as outras
                        posMaior = i; //Marca a posição da maior série
                    }
                }
            }
        }
        return series[posMaior].nome;
    }

    int cont3Temp = 0;
    int qtdSerie = 0;
    int contNotas = 0;

    void mediaPorcentagem() {
        for (int i = 0; i < series.length; i++) {
            if (series[i] != null) {
                if (series[i].temporadas >= 3) {
                    cont3Temp++;
                    contNotas += series[i].nota;
                }
                qtdSerie++;
            }
        }

        float porcentagem = (float) (cont3Temp / qtdSerie) * 100; //Porcentagem de séries com mais de 3 temporadas
        double media = (double) contNotas / cont3Temp; // Media das notas das séries que possuem 3 temporadas

        System.out.println(" -> " + porcentagem + "% das séries tem mais de 3 temporadas.");
        System.out.println(" -> Média das notas: " + media);
    }
}