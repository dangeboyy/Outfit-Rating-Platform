package model.outfitFields;


import model.outfitFields.ClothingType;
import lombok.Data;

import java.util.ArrayList;
import model.Comment;

@Data
public class Outfit {
    private String productId;
    private String brandName;
    private Color color;
    private ClothingType clothingType;
    private Size size;
    private Gender gender;
    private ArrayList<String> likedUsers;
    private ArrayList<String> dislikedUsers;
    private ArrayList<Comment> comments;
    

   public Outfit(String brandName, Color color, ClothingType clothingType,Size size,Gender gender) {
        this.productId= String.valueOf(controller.data.Data.outfits.size()+1);
        this.brandName = brandName;
        this.color = color;
        this.clothingType = clothingType;
        this.gender = gender;
        this.size=size;
        this.likedUsers=new ArrayList<>();
        this.dislikedUsers=new ArrayList<>();
        this.comments=new ArrayList<>();
    }
    
}