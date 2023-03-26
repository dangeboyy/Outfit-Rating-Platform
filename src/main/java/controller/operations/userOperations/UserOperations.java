package controller.operations.userOperations;

import controller.operations.ObjectFinder;
import controller.operations.fileOperations.FileUpdate;
import model.User;

public class UserOperations {
    public boolean follow(User user1,String userName){
        User userToBeFollowed = ObjectFinder.getUserFromName(userName);
        User user = ObjectFinder.getUserFromName(user1.getUserName());
        if (!checkIfFollowing(user,userName)){
            addFollowing(user, userName);
            if (!checkIfFollowedBy(userToBeFollowed,user.getUserName())){
                addFollower(userToBeFollowed,user.getUserName());
            }

            FileUpdate.updateFile();
            return true;

        }else{
            return false;

        }
    }

    public boolean unFollow(User user1,String userName){
        User userToBeUnFollowed= ObjectFinder.getUserFromName(userName);
        User user = ObjectFinder.getUserFromName(user1.getUserName());
        if (checkIfFollowing(user, userName)){
            removeFollowing(user,userName);
            if (checkIfFollowedBy(userToBeUnFollowed,user.getUserName())){
                removeFollower(userToBeUnFollowed,user.getUserName());
            }
            FileUpdate.updateFile();
            return true;
        }else{
            return false;
        }

    }

    private void removeFollowing(User user, String userName) {
        user.getFollowing().remove(userName);
    }

    private void removeFollower(User user, String userName){
        user.getFollowers().remove(userName);
    }


    private void addFollowing(User user,String userName){
        user.getFollowing().add(userName);
    }

    private void addFollower(User user,String userName){
        user.getFollowers().add(userName);
    }


    private boolean checkIfFollowing(User user, String userName){
        return user.getFollowing().contains(userName);
    }

    private boolean checkIfFollowedBy(User user,String userName){
        return user.getFollowers().contains(userName);
    }


}