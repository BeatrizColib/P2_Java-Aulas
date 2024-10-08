package aula03;

public class Calculadora {
    int numero1, numero2, operacao;
    double total;

    public void calcular() {
        switch (operacao) {
            case 1:
                somar();
                break;
            case 2:
                subtrair();
                break;
            case 3:
                multiplicar();
                break;
            case 4:
                dividir();
                break;
            case 5:
                resto_divisao();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public void somar() {
        total = numero1 + numero2;
    }

    public void subtrair() {
        total = numero1 - numero2;
    }

    public void multiplicar() {
        total = numero1 * numero2;
    }

    public void dividir() {
        if (numero2 != 0) {
            total = (double) numero1 / numero2; // transforma temporariamente o numero1 em double, para que a divisão aconteça corretamente, mostrando o resultado como numero flutuante caso seja.
        }
        else {
            System.out.println("Não é possível dividir por 0 (zero)!");
            total = 0;
        }
    }
    public void resto_divisao () {
        if (numero2 != 0) {
            total = numero1 % numero2;
        }
        else {
            System.out.println("Não é possível divisão por 0 (zero)");
            total = 0;
        }
    }
}



