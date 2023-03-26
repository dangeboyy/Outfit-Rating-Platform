package controller.data;

import lombok.Data;
import model.Collection;
import model.User;

import java.util.ArrayList;
@Data
public class UsersData {//We need to give Class parameter writing method to write xml file thus we create UsersData class
   private ArrayList<User> users = new ArrayList<>();

}
