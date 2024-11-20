/*
O parâmetro do método é do tipo Folha, que é uma interface.
Isso significa que qualquer classe que implemente a interface Folha pode ser passada
como argumento para esse método.
Chamada de Método:

O método f.calcSalario() chama o método calcSalario() definido na interface Folha.
O comportamento específico do método calcSalario depende do objeto real passado para o parâmetro f.

Uso de Polimorfismo:
O método polimorfismo_interface não precisa conhecer a implementação exata de calcSalario.
Ele confia que o objeto passado (f) tem uma implementação válida de calcSalario, pois
Folha é uma interface que exige isso.

ex.:
public interface Folha {
    void calcSalario();
}

public class Professor implements Folha {
    @Override
    public void calcSalario() {
        System.out.println("Calculando o salário do professor");
    }
}

public class Funcionario implements Folha {
    @Override
    public void calcSalario() {
        System.out.println("Calculando o salário do funcionário");
    }
}

public class TransformaçãoPolimorfica {
    public void polimorfismo_interface(Folha f) {
        f.calcSalario();
    }
}

public class Main {
    public static void main(String[] args) {
        TransformaçãoPolimorfica t = new TransformaçãoPolimorfica();

        // Polimorfismo com Professor - crio cada um na Main e os passo como parâmetro
        Folha prof = new Professor();
        t.polimorfismo_interface(prof);

        // Polimorfismo com Funcionario
        Folha func = new Funcionario();
        t.polimorfismo_interface(func);
    }
}


 */