import java.util.ArrayList;
import java.util.Scanner;

public class exercicio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<mes> mes = new ArrayList<mes>();

        double mediaTemp = 0;

        System.out.println("BEM VINDO AO SISTEMA DE MÉDIAS DE TEMPERATURAS MENSAIS!!");

        for (int i = 0; i <= 5; i++) {
            System.out.print("Digite o nome do mês: ");
            String nome = leitor.next();
            mes.add(new mes(nome));
            System.out.print("Digite agora a temperatura média do mes de " + mes.get(i).getNome() + ": ");
            double temperatura = leitor.nextDouble();
            mes.get(i).setTemperatura(temperatura);
            mediaTemp += mes.get(i).getTemperatura();
        }

        System.out.println("\nA média semestral de temperaturas dos meses foi de " + mediaTemp / 6 + " °");
        System.out.println("\nSegue abaixo lista dos meses com temperaturas acima da média semestral: ");

        for (int i = 0; i <= 5; i++) {
            if (mes.get(i).getTemperatura() > (mediaTemp / 6)) {
                System.out.print("\nMês: " + mes.get(i).getNome() + "\nTemperatura: " + mes.get(i).getTemperatura());
            }
        }

        System.out.println("\nFim do programa, obrigado pela preferência!");
    }
}