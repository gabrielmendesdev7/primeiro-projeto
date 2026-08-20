package excecao.naoverificada;

import java.util.Scanner;

public class VerificaCPF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu cpf: ");
        String verificaCPF = verificaCPF(scanner.nextLine());
        System.out.println(verificaCPF);
    }

    public static String verificaCPF(String cpf) {
        try {
            if(cpf.equals("0123")) {
                throw new RuntimeException("CPF já cadastrado " + cpf);
            } else {
                return "CPF válido, usuário cadastrado";
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("CPF já cadastrado " + cpf);
        }
    }

}
