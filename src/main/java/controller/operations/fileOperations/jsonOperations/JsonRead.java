package controller.operations.fileOperations.jsonOperations;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import controller.data.Data;
import model.Collection;
import model.outfitFields.Outfit;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JsonRead {
    public static void readJsonOutfit(String fileName){
        try {
            // create Gson instance
            Gson gson = new Gson();
            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get(fileName));
            // convert JSON string to User object
            Data.outfits = gson.fromJson(reader, new TypeToken<List<Outfit>>() {}.getType());

            // close reader
            reader.close();

        } catch (Exception ex) {

        }
    }
    public static void readJsonCollection(String fileName){
        try {
            // create Gson instance
            Gson gson = new Gson();
            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get(fileName));
            // convert JSON string to User object
            Data.collections = gson.fromJson(reader, new TypeToken<List<Collection>>() {}.getType());

            // close reader
            reader.close();
        } catch (Exception ex) {

        }
    }
}
