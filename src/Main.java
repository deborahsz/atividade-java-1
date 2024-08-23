import modelo.Pessoa;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] alturas = {1.52, 1.63, 1.75, 1.67, 1.89, 1.54, 1.78, 1.60, 1.82, 1.59, 1.70, 1.88, 1.73, 1.61, 1.85};
        Pessoa[] pessoas = new Pessoa[15];
        for (int i = 0; i < pessoas.length; i++) {
            Pessoa pessoa = new Pessoa();
            pessoa.altura = alturas[i];
            pessoa.genero = gerarGenero();
            pessoas[i] = pessoa;

        }
        System.out.println("maior altura encontrada: " + maiorAltura(pessoas));
        System.out.println("menor altura encontrada: " + menorAltura(pessoas));
        System.out.println("media de altura do genero masculino: " + String.format("%.2f", alturaMedia("masculino", pessoas)));
        System.out.println("numero de pessoas do genero feminino: " + numeroPorGenero("feminino", pessoas));

    }

    public static String gerarGenero() {
        Random random = new Random();
        int a = random.nextInt(2);
        if (a == 1) {
            return "masculino";
        }
        return "feminino";

    }

    public static double maiorAltura(Pessoa[] pessoas) {
        int tamanho = pessoas.length;
        double maior = 0;
        for (int i = 0; i < tamanho; i++) {
            if (pessoas[i].altura > maior) {
                maior = pessoas[i].altura;
            }
        }
        return maior;
    }

    public static double menorAltura(Pessoa[] pessoas) {
        int tamanho = pessoas.length;
        double menor = 10;
        for (int i = 0; i < tamanho; i++) {
            if (pessoas[i].altura < menor) {
                menor = pessoas[i].altura;
            }
        }
        return menor;
    }

    public static double alturaMedia(String genero, Pessoa[] pessoas) {
        double media = 0;
        int contador = 0;
        int tamanho = pessoas.length;
        for (int i = 0; i < tamanho; i++) {
            if (pessoas[i].genero.equals(genero)) {
                media = media + pessoas[i].altura;
                contador++;
            }
        }
        return (media / contador);
    }

    public static int numeroPorGenero(String genero, Pessoa[] pessoas) {
        int tamanho = pessoas.length;
        int quantidade = 0;
        for (int i = 0; i < tamanho; i++) {
            if (pessoas[i].genero.equals(genero)) {
                quantidade++;
            }
        }
        return quantidade;
    }


}