package exercicios;

public class Exercicio2 {
    public static void main(String[] args) {
        int x = 20;
        int n1 = 0;
        int n2 = 1;

        for (int qtd = x; qtd > 0; qtd--) {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
