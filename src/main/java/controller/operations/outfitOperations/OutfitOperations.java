package controller.operations.outfitOperations;

import controller.operations.fileOperations.FileUpdate;
import model.Comment;
import model.User;
import model.outfitFields.Outfit;

public class OutfitOperations {
    public  boolean likeOperation(Outfit outfit, User user){ //Like
        if (checkIfDislikedBefore(outfit, user)) {// if user disliked the outfit before
            outfit.getDislikedUsers().remove(user.getUserName());

        }
        return addLike(outfit, user);
    }

    public boolean dislikeOperation(Outfit outfit,User user){ //Dislike
        if (checkIfLikedBefore(outfit, user)){
            outfit.getLikedUsers().remove(user.getUserName());
        }
        return addDislike(outfit, user);
    }

    private boolean addLike(Outfit outfit,User user){
        if (!checkIfLikedBefore(outfit, user)){ // if not liked the outfit before
            outfit.getLikedUsers().add(user.getUserName());
            FileUpdate.updateFile();
            return true;
        }else{
            System.out.println("Already liked this outfit");
            return false;
        }
    }

    private boolean addDislike(Outfit outfit,User user){
        if (!checkIfDislikedBefore(outfit, user)){ //if not disliked the outfit before
            outfit.getDislikedUsers().add(user.getUserName());
            FileUpdate.updateFile();
            return true;
        }else {
            System.out.println("Already disliked this outfit");
            return false;
        }
    }

    private boolean checkIfDislikedBefore(Outfit outfit,User user){
        return outfit.getDislikedUsers().contains(user.getUserName());
    }

    private boolean checkIfLikedBefore(Outfit outfit,User user){
        return outfit.getLikedUsers().contains(user.getUserName());
    }

    public void commentOperation(Outfit outfit,User user,String commentText){
        Comment comment = new Comment(user.getUserName(),commentText);
        outfit.getComments().add(comment);
        FileUpdate.updateFile();
    }



}