package controller.operations.fileOperations.jsonOperations;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import controller.data.Data;

import java.io.FileWriter;
import java.io.IOException;

public class JsonWrite {
    public static void jsonWriteOutfit(String filename){
        try  {
            FileWriter fileWriter = new FileWriter(filename);
            Gson gson=new GsonBuilder().setPrettyPrinting().create();
            fileWriter.write(gson.toJson(Data.outfits));
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void jsonWriteCollection(String filename){
        try  {
            FileWriter fileWriter = new FileWriter(filename);
            Gson gson=new GsonBuilder().setPrettyPrinting().create();
            fileWriter.write(gson.toJson(Data.collections));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }







}
