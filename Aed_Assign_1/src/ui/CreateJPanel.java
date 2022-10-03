/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.io.File;
import javax.swing.JOptionPane;
import model.EmpOperations;
import model.Employee;
import java.util.regex.*;
import javax.swing.JFileChooser;


/**
 *
 * @author Himanshu
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    EmpOperations empCrudOpertions;
    String fileLocation = "";
    public CreateJPanel(EmpOperations empCrudOpertions) {
        initComponents();
        this.empCrudOpertions = empCrudOpertions; 
    }

     /**  CreateJPanel(Employee emp) {
      *   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    *

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        lblCreate = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEmpId = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblStrtDate = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblPosTitle = new javax.swing.JLabel();
        lblCellNum = new javax.swing.JLabel();
        lblEmlAdd = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmpId = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtStrtDate = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtPosTitle = new javax.swing.JTextField();
        txtCellNum = new javax.swing.JTextField();
        txtEmlAdd = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTmInfo = new javax.swing.JTextField();
        nLab = new javax.swing.JLabel();
        ageLab = new javax.swing.JLabel();
        idlab = new javax.swing.JLabel();
        emailLab = new javax.swing.JLabel();
        cellLab = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        btnUplaodPic = new javax.swing.JButton();
        lblPic = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        lblCreate.setBackground(new java.awt.Color(51, 0, 51));
        lblCreate.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblCreate.setForeground(new java.awt.Color(153, 0, 0));
        lblCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreate.setText("Create Employee Profile");

        lblName.setText("Name");
        lblName.setPreferredSize(new java.awt.Dimension(85, 20));

        lblEmpId.setText("Employee ID :");
        lblEmpId.setPreferredSize(new java.awt.Dimension(85, 20));

        lblGender.setText("Gender :");

        lblAge.setText("Age :");

        lblStrtDate.setText("Start Date :");

        lblLevel.setText("Level :");

        lblPosTitle.setText("Position Title :");

        lblCellNum.setText("Cell Phone Number :");

        lblEmlAdd.setText("Email Address :");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtEmpId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmpIdKeyReleased(evt);
            }
        });

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        txtPosTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosTitleActionPerformed(evt);
            }
        });

        txtCellNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCellNumKeyReleased(evt);
            }
        });

        txtEmlAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmlAddActionPerformed(evt);
            }
        });
        txtEmlAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmlAddKeyReleased(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(null);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setText("Team Info :");

        txtTmInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTmInfoActionPerformed(evt);
            }
        });

        emailLab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailLabKeyReleased(evt);
            }
        });

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male", "Other", " " }));

        btnUplaodPic.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnUplaodPic.setText("Upload Photo");
        btnUplaodPic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUplaodPicActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setText("Contact Information :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUplaodPic)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(lblEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblGender)
                                .addComponent(lblAge)
                                .addComponent(lblStrtDate)
                                .addComponent(lblLevel)
                                .addComponent(lblPosTitle))
                            .addGap(104, 104, 104)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTmInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nLab, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idlab, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ageLab, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                                .addComponent(txtStrtDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCellNum)
                                .addComponent(lblEmlAdd))
                            .addGap(104, 104, 104)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtCellNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cellLab, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtEmlAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(emailLab, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(288, 288, 288))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ageLab, emailLab, idlab, nLab});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbGender, jLabel1, lblAge, lblCellNum, lblEmlAdd, lblEmpId, lblGender, lblLevel, lblName, lblPosTitle, lblStrtDate, txtAge, txtCellNum, txtEmlAdd, txtEmpId, txtLevel, txtName, txtPosTitle, txtStrtDate, txtTmInfo});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSave, btnUplaodPic});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAge)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblGender)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStrtDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLevel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPosTitle))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nLab, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idlab))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ageLab)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStrtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTmInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCellNum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmlAdd))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtCellNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmlAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailLab)))
                        .addComponent(cellLab, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUplaodPic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ageLab, emailLab, idlab, nLab});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbGender, jLabel1, lblAge, lblCellNum, lblEmlAdd, lblEmpId, lblGender, lblLevel, lblName, lblPosTitle, lblStrtDate, txtAge, txtCellNum, txtEmlAdd, txtEmpId, txtLevel, txtName, txtPosTitle, txtStrtDate, txtTmInfo});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSave, btnUplaodPic});

    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmlAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmlAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmlAddActionPerformed

    private void txtPosTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosTitleActionPerformed


    private void txtTmInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTmInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTmInfoActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
       /* String PATTERN = "^[A-Za-z\\s]+$";
        //"^[a-zA-Z0-9]{0,10}$";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(txtName.getText());
        if(!match.matches() || txtName.getText().equals(""))
        {
            nLab.setText("Naming is incorrect");              
        }
        else
        {
            nLab.setText("");  
        }
*/
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtEmlAddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmlAddKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                //"^[a-zA-Z0-9]{0,30)}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(txtEmlAdd.getText());
        if(!match.matches() || txtEmlAdd.getText().equals(""))
            emailLab.setText("Email Format is incorrect");    
        else if(match.matches())
            emailLab.setText("");
        else
            emailLab.setText("Email Format is ");  
    }//GEN-LAST:event_txtEmlAddKeyReleased

    private void txtCellNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCellNumKeyReleased
        // TODO add your handling code here:
        String cellNo = txtCellNum.getText();

        int length = cellNo.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' )
        {
	if(length < 10)
	{
		txtCellNum.setEditable(true);
	}
	else
	{
                cellLab.setText("Number Format is incorrect"); 
                cellLab.setText("");
		txtCellNum.setEditable(false);
	}
	}
    }//GEN-LAST:event_txtCellNumKeyReleased

    private void txtEmpIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpIdKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9]{0,10}$";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(txtEmpId.getText());
        if(!match.matches())
        {
            idlab.setText("ID is incorrect");              
        }
        else
        {
            idlab.setText("");  
        }
    }//GEN-LAST:event_txtEmpIdKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        String age = txtAge.getText();
        int ageEmp = Integer.parseInt(age);
                
        if ( !( ageEmp > 22 && ageEmp < 60 ))
        {
                ageLab.setText("Age Range is incorrect"); 
                ageLab.setText("");				
	}	
    }//GEN-LAST:event_txtAgeKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
     boolean validation = validationForFields();
     if(validation)
     {
        Employee emp = empCrudOpertions.addNewRecord();

        String name =  txtName.getText();
            emp.setName(name);


        String empId  = txtEmpId.getText();
        int age                =  Integer.parseInt(txtAge.getText());
        String gender          =  cmbGender.getSelectedItem().toString();
        String startDate       = txtStrtDate.getText();
        String level           = txtLevel.getText();
        String teamInfo        = txtTmInfo.getText();
        String positionTitle   = txtPosTitle.getText();
        String cellNum         = txtCellNum.getText();
        String emailAdd        = txtEmlAdd.getText();

        emp.setEmpId(empId);
        emp.setAge(age);
        emp.setGender(gender);
        emp.setStartDate(startDate);
        emp.setLevel(level);
        emp.setTeamInfo(teamInfo);
        emp.setPosTitle(positionTitle);
        emp.setCellNum(cellNum);
        emp.setEmailAdd(emailAdd);
        emp.setPhoto(fileLocation);
        

        JOptionPane.showMessageDialog(this, "Employee Data Saved Successfully");

        txtName.setText("");
        txtEmpId.setText("");
        txtAge.setText("");
        cmbGender.setSelectedIndex(-1);
        txtStrtDate.setText("");
        txtLevel.setText("");
        txtTmInfo.setText("");
        txtPosTitle.setText("");
        txtCellNum.setText("");
        txtEmlAdd.setText("");
     }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void emailLabKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailLabKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_emailLabKeyReleased

    private void btnUplaodPicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUplaodPicActionPerformed
        // TODO add your handling code here:
        JFileChooser filePic = new JFileChooser();
        filePic.showOpenDialog(null);
        File file = filePic.getSelectedFile();
        fileLocation = file.getAbsolutePath();        
    }//GEN-LAST:event_btnUplaodPicActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLab;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUplaodPic;
    private javax.swing.JLabel cellLab;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JLabel emailLab;
    private javax.swing.JLabel idlab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellNum;
    private javax.swing.JLabel lblCreate;
    private javax.swing.JLabel lblEmlAdd;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblPosTitle;
    private javax.swing.JLabel lblStrtDate;
    private javax.swing.JLabel nLab;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellNum;
    private javax.swing.JTextField txtEmlAdd;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPosTitle;
    private javax.swing.JTextField txtStrtDate;
    private javax.swing.JTextField txtTmInfo;
    // End of variables declaration//GEN-END:variables

private boolean validationForFields()
{
        if(!txtName.getText().matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
        {
            JOptionPane.showMessageDialog(this," Invalid name. ");
            txtName.requestFocus();
            txtName.setText("");
            return false;
        }
        else if(txtName.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this," Name Cannot be blank, Please Enter Employee Name");
            txtName.requestFocus();
            txtName.setText("");
            return false;
        }
        else if(!txtEmpId.getText().matches("^[0-9]{0,6}$"))
        {
            JOptionPane.showMessageDialog(this," Invalid Employee ");
            txtEmpId.requestFocus();
            return false;
        }
        else if(txtEmpId.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this," Employee ID Can't be blank, please enter Employee ");
            txtEmpId.requestFocus();
            txtEmpId.setText("");
            return false;
        }
        else if(txtAge.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this," Age can't be blank ");
            txtEmpId.requestFocus();
            txtEmpId.setText("");
            return false;
        }
        else if(!txtAge.getText().matches("^0?(1[89]|[2-9]\\d)$"))
        {
            JOptionPane.showMessageDialog(this," Employee should be between 22 to 75 years old. ");
            txtAge.requestFocus();
            txtAge.setText("");
            return false;
        }
        else if(cmbGender.getSelectedItem().toString().isEmpty())
        {
            JOptionPane.showMessageDialog(this," Please Select a Gender For Employee ");
            cmbGender.requestFocus();
            cmbGender.setSelectedItem(-1);
            return false;
        }        
        else if(txtStrtDate.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this," Date cannot be Blank !! ");
            txtStrtDate.requestFocus();
            txtStrtDate.setText("");
            return false;
        }     
        else if(!txtStrtDate.getText().matches("^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$"))
        {
            JOptionPane.showMessageDialog(this," Invalid Date format MM/DD/YYYY !! ");
            txtStrtDate.requestFocus();
            txtStrtDate.setText("");
            return false;
        }
        else if(txtCellNum.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this,"Please enter the Cell Number !!");
            txtCellNum.requestFocus();
            txtCellNum.setText("");
            return false;
        }   
        else if(txtLevel.getText().length()==0)
            {
            JOptionPane.showMessageDialog(this," Level cannot be blank ");
            txtLevel.requestFocus();
            txtLevel.setText("");
            return false;
        }
        else if(txtTmInfo.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this," Team Information cannot be blank please enter employee's team details. ");
            txtTmInfo.requestFocus();
            txtTmInfo.setText("");
            return false;
        }
        else if(txtEmlAdd.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this," Please enter the Email Id ");
            txtEmlAdd.requestFocus();
            txtEmlAdd.setText("");
            return false;
        }
        else
            if(!txtEmlAdd.getText().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
            {
            JOptionPane.showMessageDialog(this," Invalid email address ");
            txtEmlAdd.requestFocus();
            txtEmlAdd.setText("");
            return false;
        }
            return true;
    }
}
    
