/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package instituteofstudies;
import classpackage.classA;
import classpackage.employees;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class asisstantworkspace extends javax.swing.JFrame {
    File myFile;
    File employeesearchfile;
    
    public asisstantworkspace() {
        initComponents();
        
        employeedetails();
    }
    
    void employeedetails() {
        try {
            myFile = new File("E:\\WORK\\SEM 02\\OOP\\Files\\employeeRecords.txt");
            BufferedReader brl = new BufferedReader(new FileReader(myFile));
            
            DefaultTableModel model = (DefaultTableModel)employeedetailstbl.getModel();
            
            Object[] tableLines = brl.lines().toArray();
            
            // extratct data from lines
            // set data to jtable model
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
    
    void findemployee() {
        try {
            BufferedReader brl = new BufferedReader(new FileReader(employeesearchfile));
            
            DefaultTableModel model = (DefaultTableModel)employeedetailstbl.getModel();
           
            Object[] tableLines = brl.lines().toArray();
            
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }
            
            
        }
         
        catch (Exception e) {
            System.out.print(e);
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
        empname = new javax.swing.JTextField();
        empid = new javax.swing.JTextField();
        empdepartment = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        empEPFnum = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeedetailstbl = new javax.swing.JTable();
        empsalary = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        empDesignation = new javax.swing.JTextField();
        searchBTN = new javax.swing.JButton();
        scname = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        scdes = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        scdep = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        scepf = new javax.swing.JTextField();
        refereshBTN = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Homebtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colombo Institute of Studies 1.0");
        setResizable(false);

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("      You can add multiple employees in this system. This section will manage those employees details.");

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setText("MANAGE EMPLOYEES");

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel2.setText("Employee ID");

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel3.setText("Name");

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel6.setText("Department");

        jLabel11.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel11.setText("Salary");

        jLabel12.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel12.setText("EPF Number");

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

        employeedetailstbl.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        employeedetailstbl.setForeground(new java.awt.Color(0, 0, 0));
        employeedetailstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EMPLOYEE ID", "NAME", "DEPARTMENT", "SALARY", "EPF NUMBER", "DESIGNATION"
            }
        ));
        employeedetailstbl.setIntercellSpacing(new java.awt.Dimension(0, 0));
        employeedetailstbl.setRowHeight(25);
        employeedetailstbl.setSelectionBackground(new java.awt.Color(255, 0, 255));
        employeedetailstbl.setSelectionForeground(new java.awt.Color(0, 0, 0));
        employeedetailstbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeedetailstblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(employeedetailstbl);

        jLabel13.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jLabel13.setText("EMPLOYEE DETAILS");

        jLabel15.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel15.setText("Designation");

        searchBTN.setBackground(new java.awt.Color(255, 255, 255));
        searchBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instituteofstudies/images/loupe.png"))); // NOI18N
        searchBTN.setBorder(null);
        searchBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBTNMouseClicked(evt);
            }
        });
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel17.setText("Name");

        jLabel18.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel18.setText("Destination");

        jLabel19.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel19.setText("Department");

        jLabel20.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel20.setText("EPF No.");

        refereshBTN.setBackground(new java.awt.Color(153, 0, 153));
        refereshBTN.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        refereshBTN.setForeground(new java.awt.Color(255, 255, 255));
        refereshBTN.setText("REFRESH");
        refereshBTN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        refereshBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refereshBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refereshBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel13)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(5, 5, 5)
                                .addComponent(scname, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addGap(3, 3, 3)
                                .addComponent(scdes, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel19)
                                .addGap(3, 3, 3)
                                .addComponent(scdep, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20)
                                .addGap(3, 3, 3)
                                .addComponent(scepf, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(empid)
                            .addComponent(empname)
                            .addComponent(empdepartment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empEPFnum, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refereshBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(empsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabel2)
                                .addComponent(empid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3)
                            .addComponent(empname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(empEPFnum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel6)
                            .addComponent(empdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(empDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel17)
                    .addComponent(scname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(scdes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(scdep, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(scepf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refereshBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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

        Homebtn.setBackground(new java.awt.Color(255, 255, 255));
        Homebtn.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        Homebtn.setForeground(new java.awt.Color(204, 0, 204));
        Homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instituteofstudies/images/home-page.png"))); // NOI18N
        Homebtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        Homebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Homebtn.setPreferredSize(new Dimension (150,50));
        Homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomebtnMouseClicked(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel14)
                .addGap(131, 131, 131)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(131, 131, 131))
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

            if (empid.getText().isEmpty() || empname.getText().isEmpty() || empsalary.getText().isEmpty()
                || empEPFnum.getText().isEmpty() || empdepartment.getText().isEmpty() || empDesignation.getText().isEmpty()) {
                classA obj = new classA();
                obj.employeeempmes();
                valid = false;

            }

            if (valid) {

                String id = empid.getText();
                String name = empname.getText();
                String empsal = empsalary.getText();
                String empEPF = empEPFnum.getText();
                String empdep = empdepartment.getText();
                String empdes = empDesignation.getText();
                
                employees addemp = new employees (id, name, empdep, empsal, empEPF, empdes);
                
                if (!isUserIdUnique(id)) {
                    classA obj = new classA();
                    obj.uniquemes();
                    return; 
                }
                
                if(addemp.addEmployee()) {
                    classA obj = new classA();
                    obj.successmessage("success");

                    DefaultTableModel model = (DefaultTableModel) employeedetailstbl.getModel();
                    model.setRowCount(0);
                }
                
                else {
                    
                }
                employeedetails();
            }
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_addBtnMouseClicked

    private boolean isUserIdUnique(String userId) throws IOException {
    try (BufferedReader br = new BufferedReader(new FileReader(myFile))) {
        String line;
        while ((line = br.readLine()) != null) {
            String storedId = line.split(",")[0].trim();
            if (userId.equals(storedId)) {
                return false;  // User ID already exists
            }
        }
    }
    return true;  // User ID is unique
        
    }
    
    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        empid.setText("");
        empname.setText("");
        empdepartment.setText("");
        empsalary.setText("");
        empEPFnum.setText("");
        empDesignation.setText("");
    }//GEN-LAST:event_clearBtnMouseClicked

    private void employeedetailstblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeedetailstblMouseClicked
        DefaultTableModel model = (DefaultTableModel)employeedetailstbl.getModel();
        int Myindex = employeedetailstbl.getSelectedRow();
        
        empid.setText(model.getValueAt(Myindex, 0).toString());
        empname.setText(model.getValueAt(Myindex, 1).toString());
        empdepartment.setText(model.getValueAt(Myindex, 2).toString());
        empsalary.setText(model.getValueAt(Myindex, 3).toString());
        empEPFnum.setText(model.getValueAt(Myindex, 4).toString());
        empDesignation.setText(model.getValueAt(Myindex, 5).toString());
    }//GEN-LAST:event_employeedetailstblMouseClicked

    private void searchBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBTNMouseClicked
    boolean find = false;
    boolean refretButtonMessageShown = false; // Flag to track if the message has been shown

    try {
        FileReader f = new FileReader(myFile);
        BufferedReader br = new BufferedReader(f);
        String line1;

        while ((line1 = br.readLine()) != null) {
            boolean flag = false;
            String[] parts = line1.split(",");

            if (parts.length >= 6) {
                String storedid = parts[0].trim();
                String storedname = parts[1].trim();
                String storeddep = parts[2].trim();
                String storedsalary = parts[3].trim();
                String storedepf = parts[4].trim();
                String storeddes = parts[5].trim();

                if (scname.getText().equals(storedname) || scdes.getText().equals(storeddes)
                        || scdep.getText().equals(storeddep) || scepf.getText().equals(storedepf)) {
                    find = true;

                    employeesearchfile = new File("E:\\WORK\\SEM 02\\OOP\\Files\\employeesearchfile.txt");
                    if(employeesearchfile.createNewFile()) {
                        System.out.println("File created: " + employeesearchfile.getName());
                    }
                    
                    else {
                        System.out.println("File already exists.");
                    }

                    FileReader f1 = new FileReader(employeesearchfile);
                    BufferedReader br2 = new BufferedReader(f1);

                    String line2;
                    boolean exists = false;

                    while ((line2 = br2.readLine()) != null) {
                        if (line1.equals(line2)) {
                            exists = true;
                            if (!refretButtonMessageShown) {
                                classA obj = new classA();
                                obj.refreshbutton();
                                refretButtonMessageShown = true; // Set the flag to true once the message is shown
                                
                            }
                            
                        }
                        
                       

                    
                    }

                    br2.close();
                    f1.close();

                    if (!exists) {
                        String record = storedid + "," + storedname + "," + storeddep + "," + storedsalary + ","
                                + storedepf + "," + storeddes;

                        FileWriter fileWriter = new FileWriter(employeesearchfile, true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                        bufferedWriter.write(record);
                        bufferedWriter.newLine();
                        bufferedWriter.close();
                        fileWriter.close();

                        DefaultTableModel model = (DefaultTableModel) employeedetailstbl.getModel();
                        model.setRowCount(0);
                        findemployee();
                    }
                }
            }
        }

        if (!find) {
            classA obj = new classA();
            obj.nousers();
        }

        br.close();
        f.close();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(manageEmployees.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(manageEmployees.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_searchBTNMouseClicked

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBTNActionPerformed

    private void refereshBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refereshBTNMouseClicked
        DefaultTableModel model = (DefaultTableModel) employeedetailstbl.getModel();
        model.setRowCount(0);
        
        
        try {
           FileWriter fileWriter = new FileWriter(employeesearchfile, false);
           BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
           
           bufferedWriter.write("");
           bufferedWriter.close();
           
           classA obj = new classA();
           obj.refreshedmes();
           
        } catch (IOException ex) {
            Logger.getLogger(manageEmployees.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (NullPointerException e) {
            System.out.println("Data is deleted!!");
            classA obj = new classA();
            obj.refreshedmes();
        }
       

        
        
        scname.setText(""); scdes.setText(""); scdep.setText(""); scepf.setText("");
        
        
        employeedetails();

    }//GEN-LAST:event_refereshBTNMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        new adminworkspace().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void HomebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomebtnMouseClicked
        new firstForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomebtnMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(asisstantworkspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(asisstantworkspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(asisstantworkspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(asisstantworkspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new asisstantworkspace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Homebtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField empDesignation;
    private javax.swing.JTextField empEPFnum;
    private javax.swing.JTextField empdepartment;
    private javax.swing.JTextField empid;
    private javax.swing.JTable employeedetailstbl;
    private javax.swing.JTextField empname;
    private javax.swing.JTextField empsalary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JButton refereshBTN;
    private javax.swing.JTextField scdep;
    private javax.swing.JTextField scdes;
    private javax.swing.JTextField scepf;
    private javax.swing.JTextField scname;
    private javax.swing.JButton searchBTN;
    // End of variables declaration//GEN-END:variables

    
}
