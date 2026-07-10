import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {

    public static void main(String[] args) {
        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Mamão");
        listaDeCompras.add("Sabão em Pó");
        listaDeCompras.add("Macarrão");

        listaDeCompras.add(1, "Banana");

        for (String item : listaDeCompras) {
            System.out.println(item);
        }

        String item = listaDeCompras.get(3);
        System.out.println("Na posição 3 eu tenho: " + item);

        listaDeCompras.remove("Sabão em Pó");

        for (String item2 : listaDeCompras) {
            System.out.println(item2);
        }

        boolean eVazia = listaDeCompras.isEmpty();
        System.out.println("A lista está vazia? " + eVazia);

        int tamanho = listaDeCompras.size();
        System.out.println("O tamanho da lista é: " + tamanho);

        boolean contem = listaDeCompras.contains("Arroz");
        System.out.println("A lista contém Arroz? " + contem);

        listaDeCompras.forEach(produto -> System.out.println(produto));

        listaDeCompras.clear();
        System.out.println("A lista esta vazia? " + listaDeCompras.isEmpty());
    }

}
