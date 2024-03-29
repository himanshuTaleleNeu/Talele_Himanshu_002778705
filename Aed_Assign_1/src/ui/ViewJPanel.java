/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.EmpOperations;
import model.Employee;

/**
 *
 * @author Himanshu
 */
public class ViewJPanel extends javax.swing.JPanel {
    String fileLocation = "";
    /**
     * Creates new form CreateJPanel
     */
    EmpOperations empCrudOpertions;
    
    public ViewJPanel(EmpOperations empCrudOpertions) {
        initComponents();
        this.empCrudOpertions = empCrudOpertions;
        poplulateEmployeeData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStrtDate = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblPosTitle = new javax.swing.JLabel();
        lblCellNum = new javax.swing.JLabel();
        lblEmlAdd = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmpId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTmInfo = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtStrtDate = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtPosTitle = new javax.swing.JTextField();
        txtCellNum = new javax.swing.JTextField();
        lblCreate = new javax.swing.JLabel();
        txtEmlAdd = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblEmpId = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblPict = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        empDataTable = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cmbGender = new javax.swing.JComboBox<>();
        lblPhoto = new javax.swing.JLabel();
        btnUpdatePic = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStrtDate.setText("Start Date :");
        add(lblStrtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 519, 268, 30));

        lblLevel.setText("Level :");
        add(lblLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 555, 268, 30));

        lblPosTitle.setText("Position Title :");
        add(lblPosTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 618, 268, 30));

        lblCellNum.setText("Cell Phone Number :");
        add(lblCellNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 709, 268, 30));

        lblEmlAdd.setText("Email Address :");
        add(lblEmlAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 745, 268, 30));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 375, 240, -1));
        add(txtEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 408, 240, -1));

        jLabel1.setText("Team Info :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 591, 268, -1));

        txtTmInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTmInfoActionPerformed(evt);
            }
        });
        add(txtTmInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 585, 240, -1));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 441, 240, -1));
        add(txtStrtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 519, 240, -1));
        add(txtLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 552, 240, -1));

        txtPosTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosTitleActionPerformed(evt);
            }
        });
        add(txtPosTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 618, 240, -1));
        add(txtCellNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 714, 240, -1));

        lblCreate.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        lblCreate.setForeground(new java.awt.Color(102, 0, 0));
        lblCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreate.setText("View Employee Profile");
        add(lblCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 19, 1236, 31));

        txtEmlAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmlAddActionPerformed(evt);
            }
        });
        add(txtEmlAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 747, 240, -1));

        lblName.setText("Name");
        lblName.setPreferredSize(new java.awt.Dimension(85, 20));
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 375, 268, 30));

        lblEmpId.setText("Employee ID :");
        lblEmpId.setPreferredSize(new java.awt.Dimension(85, 20));
        add(lblEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 411, 268, 30));

        lblGender.setText("Gender :");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 483, 268, 30));

        lblAge.setText("Age :");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 447, 268, 30));

        lblPict.setText("Photo :");
        add(lblPict, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 335, 268, -1));

        empDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employeee ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Cell phone Number", "Email Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(empDataTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 1334, 255));

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(1074, 329, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1152, 329, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1237, 329, -1, -1));

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male", "Other" }));
        add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 484, 240, -1));
        add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 375, 243, 208));

        btnUpdatePic.setText("Uplaod Photo");
        btnUpdatePic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePicActionPerformed(evt);
            }
        });
        add(btnUpdatePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 620, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setText("Contact Information :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 660, 293, 37));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtTmInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTmInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTmInfoActionPerformed

    private void txtPosTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosTitleActionPerformed

    private void txtEmlAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmlAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmlAddActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
               int selectedRowIndex = empDataTable.getSelectedRow();
        
        if(selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Please Select a Row To Delete the Data");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) empDataTable.getModel(); 
        Employee selectedEmp = (Employee) model.getValueAt(selectedRowIndex, 0);
        
         txtName.setText(String.valueOf(selectedEmp.getName()));
         txtEmpId.setText(String.valueOf(selectedEmp.getEmpId()));
         txtAge.setText(String.valueOf(selectedEmp.getAge()));
      
        int i = 0;
        if (selectedEmp.getGender().equalsIgnoreCase("Female")) {
            i = 1;
        } else if (selectedEmp.getGender().equalsIgnoreCase("Male")) {
            i = 2;
        } else if (selectedEmp.getGender().equalsIgnoreCase("Other")) {
            i = 3;
        }
        cmbGender.setSelectedItem(i);
         txtStrtDate.setText(String.valueOf(selectedEmp.getStartDate()));
         txtLevel.setText(String.valueOf(selectedEmp.getLevel()));
         txtTmInfo.setText(String.valueOf(selectedEmp.getTeamInfo()));
         txtPosTitle.setText(String.valueOf(selectedEmp.getPosTitle()));
         txtCellNum.setText(String.valueOf(selectedEmp.getCellNum()));
         txtEmlAdd.setText(String.valueOf(selectedEmp.getEmailAdd()));
        Image img = Toolkit.getDefaultToolkit().createImage(selectedEmp.getPhoto());
        img = img.getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img);
        lblPhoto.setIcon(icon);
         
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = empDataTable.getSelectedRow();
        
        if(selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Please Select a Row To Delete the Data");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) empDataTable.getModel(); 
        Employee selectedEmp = (Employee) model.getValueAt(selectedRowIndex, 0);
        
        empCrudOpertions.deleteEmpData(selectedEmp);
        
        JOptionPane.showMessageDialog(this, "Selected Row Deleted Successfully");
        poplulateEmployeeData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
   int selectedRowIndex = empDataTable.getSelectedRow();
       if (selectedRowIndex <0){
           
           JOptionPane.showMessageDialog(this,"Please Select A Particular Row to Update the Data");
           return;
       }
      DefaultTableModel model = (DefaultTableModel) empDataTable.getModel();
      Employee selectEmp = (Employee) model.getValueAt(selectedRowIndex, 0);
      boolean validation = validationForFields();
      if(validation)
      {
          selectEmp.setName(String.valueOf(txtName.getText()));
          selectEmp.setEmpId(String.valueOf(txtEmpId.getText()));
          selectEmp.setAge(Integer.parseInt(txtAge.getText()));
          String gender = cmbGender.getSelectedItem().toString();
          selectEmp.setGender(gender);
          selectEmp.setStartDate(String.valueOf(txtStrtDate.getText()));
          selectEmp.setLevel(String.valueOf(txtLevel.getText()));
          selectEmp.setTeamInfo(String.valueOf(txtTmInfo.getText()));
          selectEmp.setPosTitle(String.valueOf(txtPosTitle.getText()));
          selectEmp.setCellNum(String.valueOf(txtCellNum.getText()));
          selectEmp.setEmailAdd(String.valueOf(txtEmlAdd.getText()));
          selectEmp.setPhoto(fileLocation);
          poplulateEmployeeData();
      }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnUpdatePicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePicActionPerformed
        // TODO add your handling code here:
        JFileChooser filePic = new JFileChooser();
        filePic.showOpenDialog(null);
        File file = filePic.getSelectedFile();
        fileLocation = file.getAbsolutePath(); 
    }//GEN-LAST:event_btnUpdatePicActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdatePic;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JTable empDataTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellNum;
    private javax.swing.JLabel lblCreate;
    private javax.swing.JLabel lblEmlAdd;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPict;
    private javax.swing.JLabel lblPosTitle;
    private javax.swing.JLabel lblStrtDate;
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

    private void poplulateEmployeeData() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    DefaultTableModel model = (DefaultTableModel) empDataTable.getModel(); 
    model.setRowCount(0);
    
        for (Employee emp : empCrudOpertions.getEmpCrudOpertions())
        {
            Object[] row = new Object[10];
            row[0] = emp;
            row[1] = emp.getEmpId();
            row[2] = emp.getAge();
            row[3] = emp.getGender();
            row[4] = emp.getStartDate();
            row[5] = emp.getLevel();
            row[6] = emp.getTeamInfo();
            row[7] = emp.getPosTitle();
            row[8] = emp.getCellNum();
            row[9] = emp.getEmailAdd();
            model.addRow(row);
        }      
    }
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
