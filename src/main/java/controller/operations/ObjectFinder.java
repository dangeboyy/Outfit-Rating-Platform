/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.operations;

import controller.data.Data;
import model.Collection;
import model.outfitFields.Outfit;
import model.User;

public class ObjectFinder {
    
    public static User getUserFromName(String userName){
        User user = null;
        for (User u: Data.users.getUsers()) {
            if (u.getUserName().equals(userName)){
                user = u;
                return user;
            }
        }
        System.out.println("User not found");
        return user;
    }
    public static Collection getCollectionFromCollectionId(String id){
        Collection collection = null;
        for (Collection col: Data.collections) {
            if (col.getCollectinId().equals(id)){
                collection = col;
                return collection;
            }
        }
        System.out.println("Collection Not Found");
        return collection;
    }

    public static Outfit getOutfitFromProductId(String id){
        Outfit outfit=null;
        for (Outfit out: Data.outfits) {
            if (out.getProductId().equals(id)){
                outfit=out;
                return outfit;
            }
        }
        System.out.println("Outfit Not Found");
        return outfit;
    }

    public static Collection getCollectionFromCollectionName(String name){
        Collection collection = null;
        for (Collection col: Data.collections) {
            if (col.getCollectionName().equals(name)){
                collection = col;
                return collection;
            }
        }
        System.out.println("Collection Not Found");
        return collection;
    }

    
}
