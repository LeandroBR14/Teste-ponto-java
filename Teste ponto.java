import java.util.Scanner;
import java.time.LocalTime;
import java.time.Duration;
class Main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horaentrada;
        int minutoentrada;

        int entradahoraalmoço;
        int minutoentradaalmoco;

        int saidahoraalmoco;
        int saidaminutoalmoco;

        int saidahoraservico;
        int saidaminutoservico;

        System.out.println("Qual é a hora de entrada?");
        horaentrada = teclado.nextInt();
        System.out.println("Qual é o minuto de entrada?");
        minutoentrada = teclado.nextInt();
        LocalTime hora1 = LocalTime.of(horaentrada, minutoentrada);
        System.out.println("Você entrou pro serviço: " +hora1);
        System.out.println("Qual é a hora de entrada do almoço?");
        entradahoraalmoço = teclado.nextInt();
        System.out.println("Qual é o minuto de entrada do almoço?");
        minutoentradaalmoco = teclado.nextInt();
        LocalTime almocoentrada = LocalTime.of(entradahoraalmoço, minutoentradaalmoco);
        System.out.println("Qual é a hora de saída do almoço?");  
        saidahoraalmoco = teclado.nextInt();
        System.out.println("Qual é o minuto de saída do almoço?");
        saidaminutoalmoco = teclado.nextInt();
        LocalTime almocosaida = LocalTime.of(saidahoraalmoco, saidaminutoalmoco);
        Duration duracao2 = Duration.between(almocosaida, almocoentrada);
        long minutosalmoco = duracao2.toMinutes();
        long minutosalmocoo = minutosalmoco / 60;
        long minutosRestantes2 = minutosalmoco % 60;
        System.out.print("Seu tempo de almoço foi: " +-minutosalmocoo);
        System.out.println(":" +-minutosRestantes2);
        System.out.println("Qual é a hora de saída do serviço?");
        saidahoraservico = teclado.nextInt();
        System.out.println("Qual é o minuto de saída do serviço?");
        saidaminutoservico = teclado.nextInt();
        LocalTime saidaservico = LocalTime.of(saidahoraservico, saidaminutoservico);
        System.out.println("Você saiu do serviço às: " +saidaservico);

        Duration duracao = Duration.between(hora1, saidaservico);
        long minutosservico = duracao.toMinutes();

        long minutostrabalhados = minutosservico + minutosalmoco;

        long horastrabalhadas = minutostrabalhados / 60;
        long minutosRestantes = minutostrabalhados % 60;

        System.out.print("Você trabalhou: " +horastrabalhadas);
        System.out.print(":" +minutosRestantes);
        System.out.println(" horas hoje.");
    }
}





