import java.util.Random;
import java.util.Scanner;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int escolhe_jogada() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha pedra(0), papel(1) ou tesoura(2)");
        int escolha_pl = input.nextInt();
        return escolha_pl;
    }

    public int jogada_randomica() {
        Random random = new Random();
        int escolha_pl = random.nextInt(3) + 1;
        System.out.println(escolha_pl);
        return escolha_pl;
    }
    
}
