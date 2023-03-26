package controller.operations;

import controller.data.Data;
import model.outfitFields.Outfit;
import model.User;

public class Statistics {
    public static User findMostFollowedUser(){
        User popular = Data.users.getUsers().get(0);
        for (User user: Data.users.getUsers()) {
            if (user.getFollowers().size()>popular.getFollowers().size()){
                popular=user;
            }
        }
        return popular;
   }

   public static Outfit findMostLiked(){
        Outfit liked =Data.outfits.get(0);
        for (Outfit outfit:Data.outfits){
            if (outfit.getLikedUsers().size()>liked.getLikedUsers().size()){
                liked=outfit;
            }
        }
        return liked;
   }


   public static Outfit findMostDisliked(){
        Outfit disliked=Data.outfits.get(0);
       for (Outfit outfit:Data.outfits){
           if (outfit.getDislikedUsers().size()>disliked.getDislikedUsers().size()){
               disliked=outfit;
           }
       }
       return disliked;
   }
}