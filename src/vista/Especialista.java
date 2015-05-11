/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Oraclep;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.sql.CallableStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eparrales
 */
public class Especialista extends javax.swing.JFrame {
    
    DefaultTableModel modta;
    Oraclep ora;
    /**
     * Creates new form Especialista
     */
    public Especialista() {
        initComponents();
        modta = new DefaultTableModel();
        ora = new Oraclep();
        modJtxt();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        cargoLabel = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        numTarjetaprofesionalLabel = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        nombresField = new javax.swing.JTextField();
        apellidosField = new javax.swing.JTextField();
        dniLabel = new javax.swing.JLabel();
        telFijoField = new javax.swing.JTextField();
        nombresLabel = new javax.swing.JLabel();
        telCelularField = new javax.swing.JTextField();
        apellidosLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        telFijoLabel = new javax.swing.JLabel();
        cargoField = new javax.swing.JTextField();
        telCelularLabel = new javax.swing.JLabel();
        numTarjetaprofesionalField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEspec = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnNuevoRegistro = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtbusdni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbcod = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Especialistas Soluciones E&S");

        jLabel9.setText("REGISTRAR DATOS NEUVO ESPECIALISTA ");

        saveButton.setText("Guardar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cargoLabel.setText("Cargo:");

        btnActualizar.setText("Refresh");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        numTarjetaprofesionalLabel.setText("Num Tarjetaprofesional:");

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        dniLabel.setText("Dni:");

        nombresLabel.setText("Nombres:");

        apellidosLabel.setText("Apellidos:");

        telFijoLabel.setText("Tel Fijo:");

        telCelularLabel.setText("Tel Celular:");

        emailLabel.setText("Email:");

        tablaEspec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaEspec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEspecMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEspec);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnNuevoRegistro.setText("Nuevo");
        btnNuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoRegistroActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Dni:");

        jLabel2.setText("Codigo:");

        lbcod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevoRegistro)
                        .addGap(34, 34, 34)
                        .addComponent(saveButton)
                        .addGap(17, 17, 17)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar)
                        .addGap(26, 26, 26))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(txtbusdni, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dniLabel)
                    .addComponent(nombresLabel)
                    .addComponent(apellidosLabel)
                    .addComponent(telFijoLabel)
                    .addComponent(telCelularLabel)
                    .addComponent(emailLabel)
                    .addComponent(cargoLabel)
                    .addComponent(numTarjetaprofesionalLabel)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cargoField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telCelularField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telFijoField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellidosField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdni, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombresField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numTarjetaprofesionalField, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(lbcod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel1)
                    .addComponent(txtbusdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbcod, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniLabel)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombresLabel)
                    .addComponent(nombresField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidosLabel)
                    .addComponent(apellidosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telFijoLabel)
                    .addComponent(telFijoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telCelularLabel)
                    .addComponent(telCelularField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargoLabel)
                    .addComponent(cargoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numTarjetaprofesionalLabel)
                    .addComponent(numTarjetaprofesionalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoRegistro)
                    .addComponent(btneliminar)
                    .addComponent(saveButton)
                    .addComponent(btnModificar)
                    .addComponent(btnActualizar))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaEspecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEspecMouseClicked
        // TODO add your handling code here:
        
        int fila = tablaEspec.getSelectedRow();
        lbcod.setText(tablaEspec.getModel().getValueAt(fila, 0).toString());
        txtdni.setText(tablaEspec.getModel().getValueAt(fila, 1).toString());
         nombresField.setText(tablaEspec.getModel().getValueAt(fila, 2).toString());
       apellidosField.setText(tablaEspec.getModel().getValueAt(fila, 3).toString());
      telFijoField.setText(tablaEspec.getModel().getValueAt(fila, 4).toString());
       telCelularField.setText(tablaEspec.getModel().getValueAt(fila, 5).toString());
       emailField.setText(tablaEspec.getModel().getValueAt(fila, 6).toString());
       cargoField.setText(tablaEspec.getModel().getValueAt(fila, 7).toString());
       numTarjetaprofesionalField.setText(tablaEspec.getModel().getValueAt(fila, 8).toString());
        
        
        
    }//GEN-LAST:event_tablaEspecMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
          refresh();
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // Metodo para actualizar los datos de la tabla especialista
        int cod =Integer.parseInt(lbcod.getText());
       String dni,nom,apell,telfijo,telcel,email,cargo,numTar;
       dni=txtdni.getText();
       nom=nombresField.getText();
       apell=apellidosField.getText();
       telfijo=telFijoField.getText();
       telcel=telCelularField.getText();
       email=emailField.getText();
       cargo=cargoField.getText();
       numTar=numTarjetaprofesionalField.getText();
          try {
            
            CallableStatement cs = ora.getCon().getConexion().prepareCall("call p_modEsp(?,?,?,?,?,?,?,?,?)");
            cs.setInt(1,cod);
            cs.setString(2,dni);
            cs.setString(3,nom);
            cs.setString(4,apell);
            cs.setString(5,telfijo);
            cs.setString(6,telcel);
            cs.setString(7,email);
            cs.setString(8,cargo);
            cs.setString(9,numTar);
             cs.execute();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // Metodo para insertar los datos en la tabla especialistas
        String dni,nom,apell,telfijo,telcel,email,cargo,numTar,sql;
       dni=txtdni.getText();
       nom=nombresField.getText();
       apell=apellidosField.getText();
       telfijo=telFijoField.getText();
       telcel=telCelularField.getText();
       email=emailField.getText();
       cargo=cargoField.getText();
       numTar=numTarjetaprofesionalField.getText();
        sql="insert into especialistas values(null,'"+dni+"','"+nom+"','"+apell+"','"+telfijo+"','"+telcel+"','"+email+"','"+cargo+"','"+numTar+"')";
        ora.regisData(sql);
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void btnNuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoRegistroActionPerformed
        // Limpiar los campos para ingresar un registro nuevo
        
        limpCampos();
        
        
    }//GEN-LAST:event_btnNuevoRegistroActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // Realizar busqueda de registros en la tabla especialisatas
        
            String dni= txtbusdni.getText();
            modta = new DefaultTableModel();
     
        ora.consultar("select * from especialistas  where dni="+dni);

        try {
            int numCol = ora.getRstmdata().getColumnCount();
            for (int i = 0; i < numCol; i++) {
                modta.addColumn(ora.getRstmdata().getColumnLabel(i + 1));

            }

            while (ora.getRst().next()) {
                Object[] fila = new Object[numCol];
                for (int i = 0; i < numCol; i++) {
                    fila[i] = ora.getRst().getObject(i + 1);
                }

                modta.addRow(fila);
                tablaEspec.setModel(modta);
            }
           
        } catch (Exception e) {
        }finally {

            if (modta.getRowCount()==0) {
                JOptionPane.showMessageDialog(null," No se encontraron registros "+dni);
            }
        
        }
        
        
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed
//Metodo para eliminar registros de la tabla especialistas 
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        String dnie=txtdni.getText();
        int respuesta = JOptionPane.showConfirmDialog(null,  " ¿Esta seguro que desea elminiar el registro? "+dnie,"Eliminar Registro", JOptionPane.YES_NO_CANCEL_OPTION);
        switch (respuesta) {
            case JOptionPane.YES_OPTION:

                break;
            case JOptionPane.NO_OPTION:

                break;
            case JOptionPane.CANCEL_OPTION:

                break;
        }
  
        
        
        
        
        
        
        if (respuesta == 0) {

        try {
            
            CallableStatement cs = ora.getCon().getConexion().prepareCall("call p_elimespc(?)");
             cs.setString(1,dnie);
             cs.execute();

        } catch (Exception e) {
        }
        
        }
        
    }//GEN-LAST:event_btneliminarActionPerformed

    
    // Metodo para cargar los registros de la base de datos a la tabla
    
    public void refresh(){
        modta=new DefaultTableModel();
      
       ora.consultar("select * from especialistas");
       
        try {
             int numCol = ora.getRstmdata().getColumnCount();
              for (int i = 0; i<numCol; i++) {
                modta.addColumn(ora.getRstmdata().getColumnLabel(i+1));
               
            }
             
             
             while (ora.getRst().next()) {
                Object[] fila = new Object[numCol];
                for (int i = 0; i < numCol; i++) {
                    fila[i]=ora.getRst().getObject(i+1);
                }
           
                modta.addRow(fila);
                tablaEspec.setModel(modta);
            }
           
            
        } catch (Exception e) {
        }
    }
   
    public void limpCampos() {
        txtbusdni.setText("");
        txtdni.setText("");
        nombresField.setText("");
        apellidosField.setText("");
        telFijoField.setText("");
        telCelularField.setText("");
        emailField.setText("");
        cargoField.setText("");
        numTarjetaprofesionalField.setText("");
        lbcod.setText(null);

    }
    
    public void soloNum(JTextField tx) {
        tx.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }
    public void soloCaract(JTextField tx) {
        tx.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });

    }
    
    public void modJtxt(){
        soloNum(txtbusdni);
        soloNum(txtdni);
        soloCaract(nombresField);
        soloCaract(apellidosField);
        soloCaract(cargoField);
        
        
    }
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Especialista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Especialista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Especialista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Especialista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Especialista().setVisible(true);
            }
        });
    }
    
 
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidosField;
    private javax.swing.JLabel apellidosLabel;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevoRegistro;
    private javax.swing.JButton btneliminar;
    private javax.swing.JTextField cargoField;
    private javax.swing.JLabel cargoLabel;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbcod;
    private javax.swing.JTextField nombresField;
    private javax.swing.JLabel nombresLabel;
    private javax.swing.JTextField numTarjetaprofesionalField;
    private javax.swing.JLabel numTarjetaprofesionalLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTable tablaEspec;
    private javax.swing.JTextField telCelularField;
    private javax.swing.JLabel telCelularLabel;
    private javax.swing.JTextField telFijoField;
    private javax.swing.JLabel telFijoLabel;
    private javax.swing.JTextField txtbusdni;
    private javax.swing.JTextField txtdni;
    // End of variables declaration//GEN-END:variables
}
