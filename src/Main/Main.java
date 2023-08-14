package Main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o cep para buscar:");
        BuscaCep buscaCep = new BuscaCep(scanner.nextLine());
        CepOmdb meuCepOmdb = buscaCep.getAddress();

        new GeraArquivo(meuCepOmdb);
    }
}