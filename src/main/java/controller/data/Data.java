package controller.data;

import model.Collection;
import model.outfitFields.Outfit;
import model.User;

import java.util.ArrayList;
import model.outfitFields.ClothingType;
import model.outfitFields.Color;
import model.outfitFields.Gender;
import model.outfitFields.Size;

@lombok.Data
public class Data {
    public static UsersData users = new UsersData();
    public static ArrayList<Outfit> outfits = new ArrayList<>();
    public static ArrayList<Collection> collections = new ArrayList<>();
    
    public static void loadUserData(){
        User tugkan = new User("tugkan","tuglular");
        User dilek = new User("dilek","ozturk");
        User serhat = new User("serhat","caner");
        User ege = new User("ege","perim");
        User mert = new User("mert","inan");
        users.getUsers().add(tugkan);
        users.getUsers().add(dilek);
        users.getUsers().add(serhat);
        users.getUsers().add(ege);
        users.getUsers().add(mert);
    }
    public static void loadOutfitData(){
               
        Outfit shoeMen = new Outfit("NIKE", Color.BLACK, ClothingType.SPORTY, Size.FORTYTWO, Gender.MALE);
        outfits.add(shoeMen);
        Outfit skirt = new Outfit("ZARA", Color.RED, ClothingType.CASUAL, Size.MEDIUM, Gender.FEMALE);
        outfits.add(skirt);
        Outfit maviTshirtMen = new Outfit("MAVI", Color.PURPLE, ClothingType.CASUAL, Size.XLARGE, Gender.MALE);
        outfits.add(maviTshirtMen);
        Outfit maviTshirtWomen = new Outfit("MAVI", Color.GREEN, ClothingType.CASUAL, Size.MEDIUM, Gender.FEMALE);
        outfits.add(maviTshirtWomen);
        Outfit coat = new Outfit("BERSHKA", Color.YELLOW, ClothingType.CASUAL, Size.LARGE, Gender.MALE);
        outfits.add(coat);
        Outfit dress = new Outfit("KOTON", Color.PINK, ClothingType.ELEGANT, Size.SMALL, Gender.FEMALE);
        outfits.add(dress);
        Outfit maviJean = new Outfit("MAVI",Color.BLACK, ClothingType.PARTY, Size.XXLARGE, Gender.MALE);
        outfits.add(maviJean);
        Outfit stiletto = new Outfit("BOYNER", Color.RED, ClothingType.SPORTY, Size.THIRTY_SEVEN, Gender.FEMALE);
        outfits.add(stiletto);
        Outfit colinsJean = new Outfit("COLINS", Color.BLUE, ClothingType.CASUAL, Size.LARGE, Gender.FEMALE);
        outfits.add(colinsJean);
        Outfit sweater = new Outfit("LACOSTE", Color.GREY, ClothingType.PARTY, Size.MEDIUM, Gender.FEMALE);
        outfits.add(sweater);
        Outfit sneaker = new Outfit("PUMA", Color.BLACK, ClothingType.SPORTY, Size.THIRTY_EIGHT, Gender.FEMALE);
        outfits.add(sneaker);
        Outfit shirt = new Outfit("KOTON", Color.WHITE, ClothingType.ELEGANT, Size.LARGE, Gender.MALE);
        outfits.add(shirt);
        Outfit bot = new Outfit("CATTERPILLER", Color.BROWN, ClothingType.CASUAL, Size.LARGE, Gender.MALE);
        outfits.add(bot);
        Outfit weddingDress = new Outfit("OLEG CASSINI", Color.WHITE, ClothingType.ELEGANT, Size.MEDIUM, Gender.FEMALE);
        outfits.add(weddingDress);
        Outfit gloveNike = new Outfit("NIKE", Color.BLACK, ClothingType.CASUAL, Size.SMALL, Gender.MALE);
        outfits.add(gloveNike);
        Outfit gloveAdidas = new Outfit("ADIDAS", Color.WHITE, ClothingType.SPORTY, Size.MEDIUM, Gender.MALE);
        outfits.add(gloveAdidas);
        Outfit shoeWomen = new Outfit("NIKE", Color.WHITE, ClothingType.SPORTY, Size.THIRTY_SIX, Gender.FEMALE);
        outfits.add(shoeWomen);
    }
}


