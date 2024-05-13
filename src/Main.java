import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] escolha = {0,1,2};
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int escolha_cpu = escolha[random.nextInt(escolha.length)];

        System.out.println("Escolha pedra(0), papel(1) ou tesoura(2)");
        String escolha_user = input.nextLine();

        Player p1 = new Player(Integer.parseInt(escolha_user));
        Player CPU = new Player(escolha_cpu);
        String resultado = p1.verifica_jogada(CPU.get_jogada());

        System.out.println(resultado);

    }

}