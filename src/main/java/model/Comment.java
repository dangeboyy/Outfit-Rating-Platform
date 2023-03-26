package model;

import lombok.Data;

@Data
public class Comment {
    private String userName; //owner of comment
    private String commentText;

    public Comment(String userName, String commentText) {
        this.userName = userName;
        this.commentText = commentText;
    }
    
    

}
