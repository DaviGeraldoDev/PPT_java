import java.util.Scanner;

import javax.swing.text.PlainDocument;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Infome seu nome: ");
        String playerName = input.nextLine();

        Player p1 = new Player(playerName);
        Player p2 = new Player("CPU");
        Verificador verificador = new Verificador();

        int jogadap1 = p1.escolhe_jogada();
        int jogadap2 = p2.jogada_randomica();

        int resultado = verificador.resultado_jogada(jogadap1, jogadap2);
        String vencedor = verificador.resultado_jogo(p1, p2, resultado);

        System.out.println(vencedor);
    }

}