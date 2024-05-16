import java.util.Random;
import java.util.Scanner;

public class Player {
    private String name;
    private int jogada;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getJogada() {
        return this.jogada;
    }

    public void escolhe_jogada() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha pedra(0), papel(1) ou tesoura(2)");
        this.jogada = input.nextInt();
    }

    public void jogada_randomica() {
        Random random = new Random();
        this.jogada = random.nextInt(3) + 1;
        System.out.println(jogada);
    }
    
}
