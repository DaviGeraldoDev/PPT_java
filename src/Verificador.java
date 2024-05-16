public class Verificador {
    public String resultado_jogo(Player p1, Player p2) {
        String winnerRound;
        System.out.println(p1.getJogada());
        System.out.println(p2.getJogada());
        int result = p1.getJogada() - p2.getJogada();

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
