public class Verificador {
    public int resultado_jogada(int jogada1, int jogada2) {
        int resultado = jogada1 - jogada2;
        return resultado;
    }

    public String resultado_jogo(Player p1, Player p2, int result) {
        String winnerRound;

        if(result == 0) {
          winnerRound = "Ninguém (Empate)";
        } else {
          if(result == -1 || result == 2) {
            winnerRound = p2.getName();
          } else {
            winnerRound = p1.getName();
          }
        }
        return ("\nVencedor: " + winnerRound);
      }
    
}
