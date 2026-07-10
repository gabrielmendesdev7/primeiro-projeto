public class Array {

    public static void main(String[] args) {
        int[] numeros = {10, 20, 40, 50, 60};
        String[] frutas;
        frutas = new String[]{"Maça", "Morango", "Abacaxi"};

        double[] salarios = new double[5];
        salarios[3] = 500.00;
        salarios[1] = 700.00;
        salarios[0] = 250.00;
        salarios[2] = 25.00;
        salarios[4] = 100.00;

      /*  for(int posicao = 0; posicao < salarios.length; posicao++) {
            System.out.println(salarios[posicao]);
        }*/

        for(double salario : salarios) {
            System.out.println(salario);
        }

        salarios[2] = 250.00;
        System.out.println(salarios[2]);
    }

}
