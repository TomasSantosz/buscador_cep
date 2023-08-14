package Main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeraArquivo {
    public GeraArquivo(CepOmdb meuCepOmdb) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        FileWriter write = new FileWriter("endereco.json");
        write.write(gson.toJson(meuCepOmdb));
        write.close();
    }
}
