import java.util.Scanner;

import javax.swing.text.PlainDocument;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Infome seu nome: ");
        String playerName = input.nextLine();

        Player p1 = new Player(playerName);
        Player p2 = new Player("CPU");

        

    }

}