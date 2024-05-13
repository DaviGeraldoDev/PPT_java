public class Player {
    int jogada;
    public Player(int jogada) {
        this.jogada = jogada;
    }

    public int get_jogada() {
        return jogada;
    }
    public String verifica_jogada(int jogada2) {
        String result = "Vitória";
        if (jogada != jogada2) {
            switch (jogada){
                case 0:
                    if(jogada2 == 1){
                        result = "Derrota";
                        return result;
                    } return result;

                case 1:
                    if(jogada2 == 2){
                        result = "Derrota";
                        return result;
                    } return result;

                case 2:
                    if(jogada2 == 0){
                        result = "Derrota";
                        return result;
                    } return result;
            }
        } return "Empate";
    }
}
