package exercicios;

public class Exercicio4 {
    public static void main(String[] args) {
        int num = 10;

        for (int i = 1; i <= num; i++) {
            String imprimir = "";
            for (int j = 1; j <= i; j++) {
                imprimir += i;
            }
            System.out.println(imprimir);
        }
    }
}
