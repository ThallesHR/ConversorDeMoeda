import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Conversor conversor = new Conversor();
        boolean continuar = true;

        while(continuar) {
            System.out.println("Escolha sua conversão:");
            System.out.println("1) Dólar ->> Peso Argentino");
            System.out.println("2) Peso Argentino ->> Dólar");
            System.out.println("3) Dólar ->> Real Brasileiro");
            System.out.println("4) Real Brasileiro ->> Dólar");
            System.out.println("5) Dólar ->> Peso Colombiano");
            System.out.println("6) Peso Colombiano ->> Dólar");
            System.out.println("Escolha um valor válido:");
            switch (leitura.nextLine()) {
                case "1":
                    System.out.println("escolha um valor valido");
                    String valor = leitura.nextLine();
                    Moeda resultado = conversor.ConverteMoeda("USD", "ARS", valor);
                    System.out.println("Resultados da sua conversão são de:");
                    System.out.println(resultado.conversion_result());
                    break;
                case "2":
                    System.out.println("escolha um valor valido");
                    String valor = leitura.nextLine();
                    Moeda resultado = conversor.ConverteMoeda("ARS", "USD", valor);
                    System.out.println("Resultados da sua conversão são de:");
                    System.out.println(resultado.conversion_result());
                    break;
                case "3":
                    System.out.println("escolha um valor valido");
                    String valor = leitura.nextLine();
                    Moeda resultado = conversor.ConverteMoeda("USD", "BRL", valor);
                    System.out.println("Resultados da sua conversão são de:");
                    System.out.println(resultado.conversion_result());
                    break;
                case "4":
                    System.out.println("escolha um valor valido");
                    String valor = leitura.nextLine();
                    Moeda resultado = conversor.ConverteMoeda("BRL", "USD", valor);
                    System.out.println("Resultados da sua conversão são de:");
                    System.out.println(resultado.conversion_result());
                    break;
                case "5":
                    System.out.println("escolha um valor valido");
                    String valor = leitura.nextLine();
                    Moeda resultado = conversor.ConverteMoeda("USD", "COP", valor);
                    System.out.println("Resultados da sua conversão são de:");
                    System.out.println(resultado.conversion_result());
                    break;
                case "6":
                    System.out.println("escolha um valor valido");
                    String valor = leitura.nextLine();
                    Moeda resultado = conversor.ConverteMoeda("COP", "USD", valor);
                    System.out.println("Resultados da sua conversão são de:");
                    System.out.println(resultado.conversion_result());
            }
        }

    }
}