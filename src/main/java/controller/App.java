package controller;


import controller.data.Data;
import controller.operations.fileOperations.jsonOperations.JsonRead;
import controller.operations.fileOperations.jsonOperations.JsonWrite;
import controller.operations.fileOperations.xmlOperations.XmlRead;
import controller.operations.fileOperations.xmlOperations.XmlWrite;
import view.LoginFrame;

import java.io.File;

public class App {
    public static void main(String[] args) {
      
        XmlRead xmlRead=new XmlRead();
        File fileOutfit = new File("outfit.xml");
        File fileUser=new File("user.xml");

        if(!fileUser.exists() && !fileOutfit.exists()){
            Data.loadUserData();
            XmlWrite.xmlWrite("user.xml");
            Data.loadOutfitData();
            JsonWrite.jsonWriteOutfit("outfit.json");
        }


        JsonRead.readJsonOutfit("outfit.json");
        xmlRead.XmlRead("user.xml");
        JsonRead.readJsonCollection("collection.json");


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
     
            }
        });



    }
}
