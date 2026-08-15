package logicasequencial;

public class Casting {

    public static void main(String[] args) {
        Integer cpf = 01234;

        String cpfString = Util.conversorString(cpf);
        System.out.println("CPF em String: " + cpfString);
    }

}
