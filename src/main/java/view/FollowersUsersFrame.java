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
public class FollowersUsersFrame extends javax.swing.JFrame {
    User user;

    /**
     * Creates new form FollowersUsersFrame
     */
    public FollowersUsersFrame(User user) {
        this.user=user;
        initComponents();
        showMessage.setText("");
        showMessage.setForeground(Color.MAGENTA);
        fillFollowersTable();
    }
    private void fillFollowersTable(){
        DefaultTableModel model=(DefaultTableModel) followersTable.getModel();

        if(user.getFollowers()!=null){
            for(String user:user.getFollowers()){
                User follower=ObjectFinder.getUserFromName(user);
                Object[] infoFollower={user,follower.getFollowers().size(),follower.getFollowing().size(),follower.getCollectionContent().size()};
                model.addRow(infoFollower);
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
        followersTable = new javax.swing.JTable();
        followButton = new javax.swing.JButton();
        viewProfileButton = new javax.swing.JButton();
        showMessage = new javax.swing.JLabel();
        backToUserFrame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        followersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Number of Followers", "Number of Following", "Number of Collection"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(followersTable);

        followButton.setText("Follow");
        followButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                followButtonActionPerformed(evt);
            }
        });

        viewProfileButton.setText("View Profile");
        viewProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileButtonActionPerformed(evt);
            }
        });

        showMessage.setText("message");

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
                .addContainerGap()
                .addComponent(backToUserFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(showMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(followButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backToUserFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewProfileButton)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(followButton)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void followButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_followButtonActionPerformed
         showMessage.setForeground(Color.GREEN);
        DefaultTableModel model=(DefaultTableModel) followersTable.getModel();
        int selectedRow=followersTable.getSelectedRow();

        if(selectedRow==-1){
            showMessage.setForeground(Color.red);
            if(followersTable.getRowCount()==0){
                showMessage.setText("User table is empty");

            }else{
                showMessage.setText("No user selected!");
            }
        }
        else{
            String username=(String) model.getValueAt(selectedRow,0);
            User selectedUser=ObjectFinder.getUserFromName(username);

            UserOperations userOperations=new UserOperations();
            if(userOperations.follow(user, username)){
                showMessage.setText("You followed "+username);
                model.setValueAt(selectedUser.getFollowers().size(),selectedRow, 1);
            }else{
                showMessage.setForeground(Color.red);
                showMessage.setText("You already followed "+username);
            }



        }
    }//GEN-LAST:event_followButtonActionPerformed

    private void backToUserFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToUserFrameActionPerformed
        this.setVisible(false);
        UserFrame userFrame=new UserFrame(user);
        userFrame.setVisible(true);
    }//GEN-LAST:event_backToUserFrameActionPerformed

    private void viewProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileButtonActionPerformed
              int selectedRow=followersTable.getSelectedRow();

        if(selectedRow==-1){
            if(followersTable.getRowCount()==0){
                showMessage.setText("User table is empty");

            }else{
                showMessage.setText("No user selected to view profile!");
            }
    }                                                 
        else{
            String selectedUserName=(String) followersTable.getValueAt(selectedRow,0);
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
    private javax.swing.JButton followButton;
    private javax.swing.JTable followersTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel showMessage;
    private javax.swing.JButton viewProfileButton;
    // End of variables declaration//GEN-END:variables
}
