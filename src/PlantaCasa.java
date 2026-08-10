public class PlantaCasa {

    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String cor;
    String material;

    public void construir() {
        System.out.println("Metragem " + metragem);
        System.out.println("Numero de quartos " + numeroQuartos);
        System.out.println("Numero de banheiros " + numeroBanheiros);
        System.out.println("Material " + material);
    }

    public void pintar() {
        System.out.println("Cor " + cor);
    }

    public void mudarCorParede(String novaCor) {
        cor = novaCor;
        pintar();
    }

    public int somarMetragem(){
        return metragem * numeroBanheiros + numeroQuartos;
    }

    public void alterarCaracteristicas(int metros, int quartos, int banheiro, String mat){
        metragem = metros;
        numeroQuartos = quartos;
        numeroBanheiros = banheiro;
        material = mat;
        construir();
    }

    public static void main(String[] args) {
        PlantaCasa casa = new PlantaCasa();

        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Cinza";

        casa.construir();

        casa.pintar();

        casa.mudarCorParede("Branco");

        casa.alterarCaracteristicas(100, 2, 2, "Madeira");

        int resultado = casa.somarMetragem();
        System.out.println("Resultado da soma da metragem: " + resultado);

        PlantaCasa casaVizinho = new PlantaCasa();
        casaVizinho.metragem = 200;
        casaVizinho.material = "Alvenaria";
        casaVizinho.numeroBanheiros = 1;
        casaVizinho.numeroQuartos = 1;
        casaVizinho.cor = "Amarela";

        casaVizinho.construir();
        casaVizinho.pintar();
    }

}
