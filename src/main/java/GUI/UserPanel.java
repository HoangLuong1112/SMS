/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.RoleBUS;
import BUS.TeacherBUS;
import BUS.UserBUS;
import DTO.Teacher;
import DTO.User;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author M S I
 */
public class UserPanel extends javax.swing.JPanel {

    TeacherBUS teacherBUS = new TeacherBUS();
    RoleBUS roleBUS = new RoleBUS();
    UserBUS userBUS = new UserBUS();

    /**
     * Creates new form UserPanel
     */
    public UserPanel() {
        initComponents();
        loadComboboxUser();
        loadComboboxRole();
        loadDataTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserDialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboboxUser = new JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboboxRole = new JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        addUserBtn = new javax.swing.JButton();
        editUserBtn = new javax.swing.JButton();
        btnEsc = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        userPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userList = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnShowUserDialog = new javax.swing.JButton();
        btnEditUserDialog = new javax.swing.JButton();
        deleteUserBtn = new javax.swing.JButton();

        UserDialog.setMinimumSize(new java.awt.Dimension(385, 408));
        UserDialog.setModal(true);
        UserDialog.setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Quản lý tài khoản"));

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel2.setText("Tên người dùng");

        comboboxUser.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboboxUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxUserActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel3.setText("Mật khẩu");

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel4.setText("Tên tài khoản");

        jLabel5.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel5.setText("Vai trò");

        comboboxRole.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel11.setForeground(new java.awt.Color(255, 255, 255));

        addUserBtn.setBackground(new java.awt.Color(204, 0, 204));
        addUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        addUserBtn.setText("Thêm");
        addUserBtn.setPreferredSize(new java.awt.Dimension(100, 35));
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });
        jPanel11.add(addUserBtn);

        editUserBtn.setBackground(new java.awt.Color(255, 153, 51));
        editUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        editUserBtn.setText("Sửa");
        editUserBtn.setPreferredSize(new java.awt.Dimension(100, 35));
        editUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserBtnActionPerformed(evt);
            }
        });
        jPanel11.add(editUserBtn);

        btnEsc.setBackground(new java.awt.Color(255, 0, 0));
        btnEsc.setForeground(new java.awt.Color(255, 255, 255));
        btnEsc.setText("Thoát");
        btnEsc.setPreferredSize(new java.awt.Dimension(100, 35));
        btnEsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscActionPerformed(evt);
            }
        });
        jPanel11.add(btnEsc);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(comboboxUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboboxRole, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboboxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboboxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout UserDialogLayout = new javax.swing.GroupLayout(UserDialog.getContentPane());
        UserDialog.getContentPane().setLayout(UserDialogLayout);
        UserDialogLayout.setHorizontalGroup(
            UserDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
            .addGroup(UserDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserDialogLayout.createSequentialGroup()
                    .addContainerGap(15, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );
        UserDialogLayout.setVerticalGroup(
            UserDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
            .addGroup(UserDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(UserDialogLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1050, 600));

        userPanel.setPreferredSize(new java.awt.Dimension(1050, 600));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách người dùng"));

        userList.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã tài khoản", "Tên tài khoản", "Mật khẩu", "Vai trò"
            }
        ));
        userList.setRowHeight(30);
        userList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userList);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Thao tác"));

        btnShowUserDialog.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnShowUserDialog.setForeground(new java.awt.Color(255, 255, 255));
        btnShowUserDialog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Add.png"))); // NOI18N
        btnShowUserDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowUserDialogActionPerformed(evt);
            }
        });

        btnEditUserDialog.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditUserDialog.setForeground(new java.awt.Color(255, 255, 255));
        btnEditUserDialog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Edit.png"))); // NOI18N
        btnEditUserDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditUserDialogActionPerformed(evt);
            }
        });

        deleteUserBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Remove.png"))); // NOI18N
        deleteUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnShowUserDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditUserDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnShowUserDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditUserDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tài khoản", userPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void loadDataTable() {
        DefaultTableModel model = (DefaultTableModel) userList.getModel();
        model.setRowCount(0); // xóa table 
        for (User user : userBUS.getAllUser()) {

            Object dataRow[] = new Object[4];
            dataRow[0] = user.getUserID();
            dataRow[1] = user.getUsername();
            dataRow[2] = user.getPassword();
            dataRow[3] = roleBUS.getRoleByID(user.getRoleID()).getRoleName();
            model.addRow(dataRow);
            System.out.println(user.toString());
        }
    }

    public void loadComboboxUser() {
        DefaultComboBoxModel comboUser = new DefaultComboBoxModel();
        comboUser.addElement("");
        for (String teacherName : teacherBUS.getAllTeacherName()) {
            comboUser.addElement(teacherName);
        }
        comboboxUser.setModel(comboUser);
    }

    public void loadComboboxRole() {
        DefaultComboBoxModel comboRole = new DefaultComboBoxModel();
        comboRole.addElement("");
        for (String x : roleBUS.getOnlyRoleName()) {
            comboRole.addElement(x);
        }
        comboboxRole.setModel(comboRole);
    }

    public void setModel(User user, Teacher teacher) {
        comboboxUser.setSelectedItem(teacher.getTeacherName());
        txtUsername.setText(user.getUsername());
        txtPassword.setText(user.getPassword());
        comboboxRole.setSelectedItem(roleBUS.getRoleByID(user.getRoleID()).getRoleName());

    }

    public User getModel() {
        User user = new User();
        String teacherName = comboboxUser.getSelectedItem().toString();
        String userID = teacherBUS.getTeacherByName(teacherName).getTeacherID();
        user.setUserID(userID);
        String username = txtUsername.getText();
        user.setUsername(username);
        String password = txtPassword.getText();
        user.setPassword(password);
        String roleName = comboboxRole.getSelectedItem().toString();
        String roleID = roleBUS.getRoleByName(roleName).getRoleID();
        user.setRoleID(roleID);
        return user;
    }


    private void userListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userListMouseClicked
// TODO add your handling code here:
        int row = userList.rowAtPoint(evt.getPoint());
        String userID = userList.getValueAt(row, 0).toString();
        User user = userBUS.getUserByID(userID);
        Teacher teacher = teacherBUS.getTeacherByID(userID);
        setModel(user, teacher);

    }//GEN-LAST:event_userListMouseClicked

    public boolean validateUserForm() {
        if(txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    private void btnShowUserDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowUserDialogActionPerformed
        UserDialog.setLocationRelativeTo(null);
        addUserBtn.setVisible(true);
        editUserBtn.setVisible(false);
        UserDialog.setVisible(true);
    }//GEN-LAST:event_btnShowUserDialogActionPerformed

    private void btnEditUserDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditUserDialogActionPerformed
        if(validateUserForm()) {
            UserDialog.setLocationRelativeTo(null);
            addUserBtn.setVisible(false);
            editUserBtn.setVisible(true);
            UserDialog.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn tài khoản cần sửa");
        }
        
    }//GEN-LAST:event_btnEditUserDialogActionPerformed

    private void deleteUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserBtnActionPerformed
        if(validateUserForm()) {
            User user = getModel();
            if(userBUS.deleteUser(user.getUserID())) {
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                loadDataTable();
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn tài khoản cần xóa");
                    
        }
    }//GEN-LAST:event_deleteUserBtnActionPerformed


    private void comboboxUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxUserActionPerformed

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        User user = getModel();
        if (userBUS.addUser(user)) {
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            loadDataTable();
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại");
        }

    }//GEN-LAST:event_addUserBtnActionPerformed

    private void editUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserBtnActionPerformed
        User user = getModel();
        if (userBUS.editUser(user)) {
            JOptionPane.showMessageDialog(this, "Sửa thành công");
            loadDataTable();
        } else {
            JOptionPane.showMessageDialog(this, "Sửa thất bại");
        }
    }//GEN-LAST:event_editUserBtnActionPerformed

    private void btnEscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscActionPerformed
        // TODO add your handling code here:
        UserDialog.setVisible(false);
    }//GEN-LAST:event_btnEscActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog UserDialog;
    private javax.swing.JButton addUserBtn;
    private javax.swing.JButton btnEditUserDialog;
    private javax.swing.JButton btnEsc;
    private javax.swing.JButton btnShowUserDialog;
    private JComboBox<String> comboboxRole;
    private JComboBox<String> comboboxUser;
    private javax.swing.JButton deleteUserBtn;
    private javax.swing.JButton editUserBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTable userList;
    private javax.swing.JPanel userPanel;
    // End of variables declaration//GEN-END:variables
}
