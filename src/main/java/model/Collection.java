package model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import model.outfitFields.Outfit;
import controller.data.Data;

import java.util.ArrayList;

@lombok.Data
public class Collection {
    @JacksonXmlProperty(isAttribute = true)
    private String collectionName;
    private String collectinId;
    private ArrayList<String> collectionOutfits; //productId

    public Collection(String collectionName) {
        this.collectinId=String.valueOf(Data.collections.size()+1);
        this.collectionName = collectionName;
        collectionOutfits=new ArrayList<>();

        
        
    }
}
