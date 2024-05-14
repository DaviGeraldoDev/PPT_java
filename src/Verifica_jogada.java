public class Verifica_jogada {
    private int resultado_jogada(int jogada1, int jogada2) {
        int resultado = jogada1 - jogada2;
        return resultado;
    }

    private void resultado_jogo(Player p1, Player p2, int result) {
        String winnerRound;

        if(result == 0) {
          winnerRound = "EMPATE!";
        } else {
          if(result == -1 || result == 2) {
            winnerRound = p2.getName();
          } else {
            winnerRound = p1.getName();
          }
        }
        System.out.println("\nVencedor: " + winnerRound + "\n");
      }
    
}
