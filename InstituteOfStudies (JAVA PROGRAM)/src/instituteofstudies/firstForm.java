
package instituteofstudies;


import classpackage.classB;
import classpackage.classA;
import classpackage.message;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class firstForm extends javax.swing.JFrame {

    File myFile = new File("E:\\WORK\\SEM 02\\OOP\\Files\\adminUsername&password.txt");
    File HRFile = new File("E:\\WORK\\SEM 02\\OOP\\Files\\HRemployeeRecords.txt");
    public firstForm() {
        initComponents();
        
        classB obj = new classB();
        obj.adminfile();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        backBTN = new javax.swing.JButton();
        backBTN1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LoginBTN = new javax.swing.JButton();
        cancelBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        roleCB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colombo Institute of Studies 1.0");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(153, 0, 153));
        jPanel3.setForeground(new java.awt.Color(204, 0, 204));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instituteofstudies/images/institute.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Fira Code", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("C I S");

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Colombo Institue of Studies");

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tel. 077-8121761");

        jLabel9.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Thank You");

        backBTN.setBackground(new java.awt.Color(255, 255, 255));
        backBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instituteofstudies/images/arrow (1).png"))); // NOI18N
        backBTN.setBorder(null);
        backBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        backBTN1.setBackground(new java.awt.Color(255, 255, 255));
        backBTN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instituteofstudies/images/verify.png"))); // NOI18N
        backBTN1.setBorder(null);
        backBTN1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBTN1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(backBTN)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(backBTN)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.setToolTipText("");

        LoginBTN.setBackground(new java.awt.Color(153, 0, 153));
        LoginBTN.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        LoginBTN.setForeground(new java.awt.Color(255, 255, 255));
        LoginBTN.setText("Login");
        LoginBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginBTNMouseClicked(evt);
            }
        });
        LoginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBTNActionPerformed(evt);
            }
        });

        cancelBTN.setBackground(new java.awt.Color(153, 0, 153));
        cancelBTN.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        cancelBTN.setForeground(new java.awt.Color(255, 255, 255));
        cancelBTN.setText("Clear");
        cancelBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBTNMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setText("Colombo Institute of Studies");

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel3.setText("Password");

        roleCB.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        roleCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "HR Manager", "HR Asisstant" }));
        roleCB.setMinimumSize(new java.awt.Dimension(5, 19));

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel4.setText("Select The Role");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instituteofstudies/images/employee (2).png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instituteofstudies/images/user (1).png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instituteofstudies/images/key.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(roleCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(210, 210, 210))
                                        .addComponent(username, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(password)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(LoginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(cancelBTN)))
                .addGap(0, 50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(roleCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginBTN)
                    .addComponent(cancelBTN))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void LoginBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBTNMouseClicked
        String role = roleCB.getSelectedItem().toString();
        try {
            if (role == "Admin"){
                if (username.getText().isEmpty() || password.getText().isEmpty()) {
                    classA obj = new classA();
                    obj.emptymessage();

                }

                else {
                    FileReader f = new FileReader(myFile);
                    try (BufferedReader br = new BufferedReader(f)) {
                        String line;
                        boolean loginSuccessful = false;

                        while ((line = br.readLine()) != null) {
                            String[] parts = line.split(" ");

                        // Make sure the line has at least two parts
                            if (parts.length >= 2) {
                                String storedUsername = parts[0].trim();
                                String storedPassword = parts[1].trim();

                               if (username.getText().equals(storedUsername) && password.getText().equals(storedPassword)) {
                                    loginSuccessful = true;
                                    break;
                                }
                            } 

                        }

                        if (loginSuccessful) {
                            new adminworkspace().setVisible(true);
                            this.dispose();
                        } 

                        else {
                            classA obj = new classA();
                            obj.wrongloginmess();
                        }
                    }
                }
            }
            
            else if (role == "HR Manager") {
                if (username.getText().isEmpty() || password.getText().isEmpty()) {
                    classA obj = new classA();
                    obj.emptymessage();

                }
                
                else {
                    
                    try{
                        classB obj5 = new classB();  // abstraction - interface
                        obj5.hrfile();
                        
                        if (username.getText().isEmpty() || password.getText().isEmpty()) {
                            classA obj = new classA();
                            obj.emptymessage();
                        }

                        else {
                            FileReader f = new FileReader(HRFile);
                            try (BufferedReader br = new BufferedReader(f)) {
                                String line;
                                boolean loginSuccessful = false;
                                boolean lc = true;

                                String storedDes = null;

                                while ((line = br.readLine()) != null) {
                                    String[] parts = line.split(",");

                                    // Make sure the line has at least two parts
                                    if (parts.length >= 5) {
                                        String storedUsername = parts[1].trim();
                                        String storedPassword = parts[0].trim();
                                        storedDes = parts[5].trim();

                                        if (username.getText().equals(storedUsername) && password.getText().equals(storedPassword)) {
                                            loginSuccessful = true;

                                            System.out.println(storedDes);
                                            
                                            message obj = new message(); // encapsulation
                                            
                                            obj.setUsername(storedUsername);
                                            System.out.println(obj.getUsername());
                                            
                                            if (storedDes.equalsIgnoreCase("HR_Assistant")) {
                                            loginSuccessful = false;
                                            lc = false;
                                            break;
                                            }
                                            
                                            break;
                                        }
                                    }

                                }

                                if (loginSuccessful) {
                                    new employeeworkspace().setVisible(true);
                                    this.dispose();
                                }

                                else if (lc) {
                                    classA obj0 = new classA();
                                    obj0.wrongloginmess();
                                    
                                }

                                else if (storedDes.equalsIgnoreCase("HR_Assistant")) {
                                    classA obj1 = new classA();
                                    obj1.assistantcant();

                                }
                            }

                            catch (IOException e) {
                                System.out.println(e);
                            }
                        }
                        
                    }
                    
                    catch(Exception e) {
                        System.out.println(e);
                    }
                }
            }
            
            else if (role == "HR Asisstant") {
                try {

                    if (username.getText().isEmpty() || password.getText().isEmpty()) {
                        classA obj = new classA();
                        obj.emptymessage();
                    }

                    else {
                        FileReader f = new FileReader(HRFile);
                        try (BufferedReader br = new BufferedReader(f)) {
                            String line;
                            boolean loginSuccessful = false;

                            while ((line = br.readLine()) != null) {
                                String[] parts = line.split(",");

                                // Make sure the line has at least two parts
                                if (parts.length >= 2) {
                                    String storedUsername = parts[1].trim();
                                    String storedPassword = parts[0].trim();

                                    if (username.getText().equals(storedUsername) && password.getText().equals(storedPassword)) {
                                        loginSuccessful = true;
                                        break;
                                    }
                                }

                            }

                            if (loginSuccessful) {
                                new asisstantworkspace().setVisible(true);
                                this.dispose();
                            }

                            else {
                                classA obj = new classA();
                                obj.wrongloginmess();
                            }
                        }

                        catch (IOException e) {
                            System.out.println(e);
                        }
                    }

                }

                catch(Exception e) {
                    System.out.println(e);
                }
                                          
            }
            
        }
        
        catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_LoginBTNMouseClicked

    private void LoginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBTNActionPerformed
        
    }//GEN-LAST:event_LoginBTNActionPerformed

    private void cancelBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBTNMouseClicked
        username.setText("");
        password.setText("");
    }//GEN-LAST:event_cancelBTNMouseClicked

    private void backBTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBTN1MouseClicked
        new RegisterForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBTN1MouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new firstForm().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBTN;
    private javax.swing.JButton backBTN;
    private javax.swing.JButton backBTN1;
    private javax.swing.JButton cancelBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> roleCB;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
