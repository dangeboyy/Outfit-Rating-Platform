package controller.operations.fileOperations.xmlOperations;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import controller.data.Data;

import java.io.File;
import java.io.IOException;

public class XmlWrite {

    public static void xmlWrite(String fileName){
        XmlMapper xmlMapper=new XmlMapper();
        try {
            xmlMapper.writeValue(new File(fileName),Data.users);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
