package academy.devdojo.javacore.ZTestes;


import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Cria um mapa que associa String a Integer
        Map<String, Integer> idadePessoas = new HashMap<>();

        // Adiciona elementos (chave -> valor)
        idadePessoas.put("Ana", 25);
        idadePessoas.put("Bruno", 30);
        idadePessoas.put("Carlos", 28);

        // Acessa um valor pela chave
        System.out.println("Idade da Ana: " + idadePessoas.get("Ana"));

        // Verifica se uma chave existe
        if (idadePessoas.containsKey("Bruno")) {
            System.out.println("Bruno está no mapa.");
        }

        // Itera sobre o mapa
        for (Map.Entry<String, Integer> entry : idadePessoas.entrySet()) {
            System.out.println(entry.getKey() + " tem " + entry.getValue() + " anos.");
        }

        // Remove um item
        idadePessoas.remove("Carlos");
    }
}

