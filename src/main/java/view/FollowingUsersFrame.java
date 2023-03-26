/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.operations.ObjectFinder;
import controller.operations.userOperations.UserOperations;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import model.User;

/**
 *
 * @author Ege
 */
public class FollowingUsersFrame extends javax.swing.JFrame {
    User user;

    /**
     * Creates new form followingUsersFrame
     */
    public FollowingUsersFrame(User user) {
        this.user=user;
        initComponents();
        showMessage.setText("");
        showMessage.setForeground(Color.MAGENTA);
        fillFollowingTable();
    }
    private void fillFollowingTable(){
        DefaultTableModel model=(DefaultTableModel) followingsTable.getModel();

        if(user.getFollowing()!=null){
            for(String user:user.getFollowing()){
                User following=ObjectFinder.getUserFromName(user);
                Object[] infoFollowing={user,following.getFollowers().size(),following.getFollowing().size(),following.getCollectionContent().size()};
                model.addRow(infoFollowing);

            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        followingsTable = new javax.swing.JTable();
        showMessage = new javax.swing.JLabel();
        unfollowButton = new javax.swing.JButton();
        viewProfileButton = new javax.swing.JButton();
        backToUserFrame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        followingsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Number of Followers", "Number of Followings", "Number of Collections"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(followingsTable);

        showMessage.setText("message");

        unfollowButton.setText("Unfollow");
        unfollowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unfollowButtonActionPerformed(evt);
            }
        });

        viewProfileButton.setText("View Profile");
        viewProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileButtonActionPerformed(evt);
            }
        });

        backToUserFrame.setIcon(new javax.swing.ImageIcon("backButton.jpeg")); // NOI18N
        backToUserFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToUserFrameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backToUserFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(showMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unfollowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(backToUserFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(viewProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(unfollowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unfollowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unfollowButtonActionPerformed
        showMessage.setForeground(Color.GREEN);
        DefaultTableModel model=(DefaultTableModel) followingsTable.getModel();
        int selectedRow=followingsTable.getSelectedRow();

        if(selectedRow==-1){
            showMessage.setForeground(Color.red);
            if(followingsTable.getRowCount()==0){
                
                showMessage.setText("User table is empty");

            }else{
                showMessage.setText("No user selected!");
            }
        }
        else{
            String username=(String) model.getValueAt(selectedRow,0);
            User selectedUser=ObjectFinder.getUserFromName(username);

            UserOperations userOperations=new UserOperations();
            if(userOperations.unFollow(user, username)){
                showMessage.setText("You unfollowed "+username);
                model.removeRow(selectedRow);


            }else{
                showMessage.setForeground(Color.red);
                showMessage.setText("You are not following "+username);
            }



        }
    }//GEN-LAST:event_unfollowButtonActionPerformed

    private void backToUserFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToUserFrameActionPerformed
        this.setVisible(false);
        UserFrame userFrame=new UserFrame(user);
        userFrame.setVisible(true);
    }//GEN-LAST:event_backToUserFrameActionPerformed

    private void viewProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileButtonActionPerformed
               int selectedRow=followingsTable.getSelectedRow();

        if(selectedRow==-1){
            if(followingsTable.getRowCount()==0){
                showMessage.setText("User table is empty");

            }else{
                showMessage.setText("No user selected to view profile!");
            }
    }                                                 
        else{
            String selectedUserName=(String) followingsTable.getValueAt(selectedRow,0);
            User userToVisit=ObjectFinder.getUserFromName(selectedUserName);
            ViewProfile viewProfile=new ViewProfile(user,userToVisit);
            this.setVisible(false);
            viewProfile.setVisible(true);
        }
    }//GEN-LAST:event_viewProfileButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToUserFrame;
    private javax.swing.JTable followingsTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel showMessage;
    private javax.swing.JButton unfollowButton;
    private javax.swing.JButton viewProfileButton;
    // End of variables declaration//GEN-END:variables
}
