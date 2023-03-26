package controller.operations.userOperations;

import java.util.ArrayList;

import controller.data.Data;
import controller.operations.ObjectFinder;
import controller.operations.fileOperations.FileUpdate;
import model.Collection;
import model.User;
import model.outfitFields.Outfit;

public class CollectionOperations {
   public boolean createCollection(User user, String collectionName){
        Collection collection =new Collection(collectionName);
        ArrayList<String> collections=user.getCollectionContent();
        int size=collections.size();
        for(int i=0;i<size;i++){
            Collection tmpCollection = ObjectFinder.getCollectionFromCollectionId(collections.get(i));
            if (tmpCollection.getCollectionName().equals(collectionName)) {
                System.out.println("This collection name is exist your collection name must be different");
                return false;
            }
        }
        user.getCollectionContent().add(collection.getCollectinId());
        Data.collections.add(collection);
        Data.users.getUsers();
        FileUpdate.updateFile();
        return true;
    }

    public boolean addOutfitToCollection(Collection collection, Outfit outfit){
        if (!checkIfOutfitExistInCollection(collection, outfit)){
            collection.getCollectionOutfits().add(outfit.getProductId());
            FileUpdate.updateFile();
            return true;
        }else{
            System.out.println("You can not add outfit more than once");
            return false;
        }
    }

    public boolean removeOutfitFromCollection(Collection collection,Outfit outfit){
        if (checkIfOutfitExistInCollection(collection, outfit)){
            collection.getCollectionOutfits().remove(outfit.getProductId());
            FileUpdate.updateFile();
            return true;
        }else {
            
            System.out.println("Outfit is not in collection");
            return false;
        }
    }
    
    private boolean checkIfOutfitExistInCollection(Collection collection,Outfit outfit){
        return collection.getCollectionOutfits().contains(outfit.getProductId());
    }
}