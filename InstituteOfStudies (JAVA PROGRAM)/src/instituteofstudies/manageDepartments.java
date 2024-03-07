package instituteofstudies;


import classpackage.classA;
import classpackage.departments;
import java.awt.Dimension;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.*;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class manageDepartments extends javax.swing.JFrame {

    File myFile;
    
    public manageDepartments() {
        initComponents();
        departmentdetails();
        
    }

    void departmentdetails() {
         try {
            myFile = new File("E:\\WORK\\SEM 02\\OOP\\Files\\departmentRecords.txt");
            BufferedReader brl = new BufferedReader(new FileReader(myFile));
            DefaultTableModel model = (DefaultTableModel)departmentdetailstbl.getModel();
            Object[] tableLines = brl.lines().toArray();
            
            
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }
            
            
        }
         
        catch (Exception e) {
            //System.out.print(e);
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        depname = new javax.swing.JTextField();
        depid = new javax.swing.JTextField();
        depno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        numofcom = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        departmentdetailstbl = new javax.swing.JTable();
        numofemp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        backBTN = new javax.swing.JButton();
        Homebtn = new javax.swing.JButton();
        manageemployeeBTN = new javax.swing.JButton();
        managedestinationBTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colombo Institute of Studies 1.0");
        setResizable(false);

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("      You can add multiple departments in this system. This section will manage those departments details.");

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setText("MANAGE DEPARTMENTS");

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel2.setText("DEP ID");

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel3.setText("Name");

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel6.setText("Phone No");

        jLabel11.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel11.setText("No. of Employees");

        jLabel12.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel12.setText("Nom of Computers");

        addBtn.setBackground(new java.awt.Color(153, 0, 153));
        addBtn.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("ADD");
        addBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(153, 0, 153));
        clearBtn.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("CLEAR");
        clearBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        clearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBtnMouseClicked(evt);
            }
        });

        departmentdetailstbl.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        departmentdetailstbl.setForeground(new java.awt.Color(0, 0, 0));
        departmentdetailstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DEPARTMENT ID", "NAME", "NUM OF EMPLOYEES", "NUM OF COMPUTERS", "PHONE NO"
            }
        ));
        departmentdetailstbl.setIntercellSpacing(new java.awt.Dimension(0, 0));
        departmentdetailstbl.setRowHeight(25);
        departmentdetailstbl.setSelectionBackground(new java.awt.Color(255, 0, 255));
        departmentdetailstbl.setSelectionForeground(new java.awt.Color(0, 0, 0));
        departmentdetailstbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departmentdetailstblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(departmentdetailstbl);

        jLabel13.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jLabel13.setText("DEPARTMENT DETAILS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jScrollPane2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6))
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(depid)
                                            .addComponent(depname)
                                            .addComponent(depno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(numofcom, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(numofemp, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel13))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(depid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(depname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(numofcom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(numofemp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addComponent(depno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setForeground(new java.awt.Color(204, 0, 204));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instituteofstudies/images/institute.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tel. 077-8121761");

        jLabel9.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Thank You");

        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        backBTN.setBackground(new java.awt.Color(255, 255, 255));
        backBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instituteofstudies/images/arrow (1).png"))); // NOI18N
        backBTN.setBorder(null);
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        Homebtn.setBackground(new java.awt.Color(255, 255, 255));
        Homebtn.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        Homebtn.setForeground(new java.awt.Color(204, 0, 204));
        Homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instituteofstudies/images/home-page.png"))); // NOI18N
        Homebtn.setText("HOME");
        Homebtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        Homebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Homebtn.setPreferredSize(new Dimension (150,50));
        Homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomebtnMouseClicked(evt);
            }
        });

        manageemployeeBTN.setBackground(new java.awt.Color(255, 255, 255));
        manageemployeeBTN.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        manageemployeeBTN.setForeground(new java.awt.Color(204, 0, 204));
        manageemployeeBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instituteofstudies/images/user.png"))); // NOI18N
        manageemployeeBTN.setText("MANAGE EMPLOYEE");
        manageemployeeBTN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        manageemployeeBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Homebtn.setPreferredSize(new Dimension (150,50));
        manageemployeeBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageemployeeBTNMouseClicked(evt);
            }
        });

        managedestinationBTN.setBackground(new java.awt.Color(255, 255, 255));
        managedestinationBTN.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        managedestinationBTN.setForeground(new java.awt.Color(204, 0, 204));
        managedestinationBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instituteofstudies/images/user-avatar-with-check-mark.png"))); // NOI18N
        managedestinationBTN.setText("MANAGE DESIGNATION");
        managedestinationBTN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        managedestinationBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Homebtn.setPreferredSize(new Dimension (150,50));
        managedestinationBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managedestinationBTNMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Fira Code", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("C I S");

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Colombo Institue of Studies");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabel9)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Homebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageemployeeBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(managedestinationBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(Homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageemployeeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(managedestinationBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        try {
            boolean valid = true;

            if (depid.getText().isEmpty() || depname.getText().isEmpty() || numofemp.getText().isEmpty()
                || numofcom.getText().isEmpty() || depno.getText().isEmpty()) {
                classA obj = new classA();
                obj.empmesdep();
                valid = false;

            }

            if (valid) {
             

                String id = depid.getText();
                String name = depname.getText();
                String emp = numofemp.getText();
                String com = numofcom.getText();
                String number = depno.getText();
                
                departments adddep = new departments(id, name, emp, com, number); 
                
                if (!isDepIdUnique(id)) {
                classA obj = new classA();
                obj.uniquemesdep();
                return;  
                }
                
                if (adddep.addDepartment()) {
                    Icon icon = new javax.swing.ImageIcon(getClass().getResource("/instituteofstudies/check.png"));
                    JOptionPane.showMessageDialog(rootPane, "Successfully added " + name + " department", "Department Adding Form", HEIGHT, icon);
                    DefaultTableModel model = (DefaultTableModel) departmentdetailstbl.getModel();
                    model.setRowCount(0);
                }
                
                else {
                    classA obj = new classA();
                    obj.errmesstordep();
                }
                departmentdetails();
            }
        }

        catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_addBtnMouseClicked

    private boolean isDepIdUnique(String userId) throws IOException {
    try (BufferedReader br = new BufferedReader(new FileReader(myFile))) {
        String line;
        while ((line = br.readLine()) != null) {
            String storedId = line.split(",")[0].trim();
            if (userId.equals(storedId)) {
                return false;  
            }
        }
    }
    return true; 
        
    }
    
    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        depid.setText("");
        depname.setText("");
        numofemp.setText("");
        numofcom.setText("");
        depno.setText("");
    }//GEN-LAST:event_clearBtnMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        new adminworkspace().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void departmentdetailstblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentdetailstblMouseClicked
        DefaultTableModel model = (DefaultTableModel)departmentdetailstbl.getModel();
        int Myindex = departmentdetailstbl.getSelectedRow();
        
        depid.setText(model.getValueAt(Myindex, 0).toString());
        depname.setText(model.getValueAt(Myindex, 1).toString());
        numofemp.setText(model.getValueAt(Myindex, 2).toString());
        numofcom.setText(model.getValueAt(Myindex, 3).toString());
        depno.setText(model.getValueAt(Myindex, 4).toString());
    }//GEN-LAST:event_departmentdetailstblMouseClicked

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        new employeeworkspace().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBTNActionPerformed

    private void HomebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomebtnMouseClicked
        new firstForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomebtnMouseClicked

    private void manageemployeeBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageemployeeBTNMouseClicked
        new manageEmployees().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageemployeeBTNMouseClicked

    private void managedestinationBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managedestinationBTNMouseClicked
        new manageDesignations().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_managedestinationBTNMouseClicked


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(manageDepartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageDepartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageDepartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageDepartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageDepartments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Homebtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBTN;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTable departmentdetailstbl;
    private javax.swing.JTextField depid;
    private javax.swing.JTextField depname;
    private javax.swing.JTextField depno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton managedestinationBTN;
    private javax.swing.JButton manageemployeeBTN;
    private javax.swing.JTextField numofcom;
    private javax.swing.JTextField numofemp;
    // End of variables declaration//GEN-END:variables
}
