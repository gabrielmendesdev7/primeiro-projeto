package associacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Carro fusca = new Carro(20);
        fusca.mostrarCilindradas();

        Funcionario joao = new Funcionario("João");
        Funcionario maria = new Funcionario("Maria");
        Funcionario mateus = new Funcionario("Mateus");

        List<Funcionario> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(joao);
        listaDeFuncionarios.add(maria);
        listaDeFuncionarios.add(mateus);

        Departamento ti = new Departamento("TI", listaDeFuncionarios);
        ti.mostrarFuncionarios();

        Departamento marketing = new Departamento("Marketing", Collections.emptyList());
        marketing.mostrarFuncionarios();
    }

}
