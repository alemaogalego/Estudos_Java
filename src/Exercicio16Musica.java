public class Exercicio16Musica {
    String musica = "Despacito";
    String artista = "Luis Fonsi";
    int anoLancamento = 2017;
    double somaAvaliacoes = 0;
    int totalAvaliacoes = 0;

    void exibirFichaTecnica() {
        System.out.println("Música: " + musica);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void avaliar(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;

    }

    double avaliarMedia() {
        return (totalAvaliacoes == 0) ? 0 : somaAvaliacoes / totalAvaliacoes;
    }

    static void executar() {
        Exercicio16Musica musica = new Exercicio16Musica();

        musica.exibirFichaTecnica();

        // Exemplos de avaliações pra testar
        musica.avaliar(10);
        musica.avaliar(8);
        musica.avaliar(9);

        System.out.println("Média de avaliações: " + musica.avaliarMedia());
    }
}
