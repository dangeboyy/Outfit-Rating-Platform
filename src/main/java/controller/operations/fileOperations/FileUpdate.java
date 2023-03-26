package controller.operations.fileOperations;

import controller.operations.fileOperations.jsonOperations.JsonRead;
import controller.operations.fileOperations.jsonOperations.JsonWrite;
import controller.operations.fileOperations.xmlOperations.XmlRead;
import controller.operations.fileOperations.xmlOperations.XmlWrite;

public class FileUpdate {
    public static void updateFile(){
        XmlRead xmlRead = new XmlRead();
        XmlWrite.xmlWrite("user.xml");
        JsonWrite.jsonWriteOutfit("outfit.json");
        JsonWrite.jsonWriteCollection("collection.json");
        xmlRead.XmlRead("user.xml");
        JsonRead.readJsonOutfit("outfit.json");
        JsonRead.readJsonCollection("collection.json");
    }
}
