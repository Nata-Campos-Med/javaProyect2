
package MVC;

import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DataBase extends javax.swing.JFrame {

    DefaultTableModel model;

    
    public DataBase() throws SQLException {
        initComponents();

        this.completeTable();
        this.showStudents();
        this.clean();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstudiantes = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtCorreoInstitucional = new javax.swing.JTextField();
        txtCorreoPersonal = new javax.swing.JTextField();
        txtNumeroCelular = new javax.swing.JTextField();
        txtNumeroFijo = new javax.swing.JTextField();
        txtProgramaAcademico = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEstudiantesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEstudiantes);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnConsultas.setText("Consultas");
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombres");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Apellidos");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtApellidoMouseClicked(evt);
            }
        });
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha de Nacimiento");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("Correo Institucional");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("Correo personal");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("Número Celular");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setText("Número Fijo");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setText("Programa Académico");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaMouseClicked(evt);
            }
        });

        txtCorreoInstitucional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCorreoInstitucionalMouseClicked(evt);
            }
        });

        txtNumeroCelular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNumeroCelularMouseClicked(evt);
            }
        });

        txtProgramaAcademico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtProgramaAcademicoMouseClicked(evt);
            }
        });

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jLabel9.setText("INSTITUTO LA FLORESTA");
        jLabel9.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel9.setMaximumSize(new java.awt.Dimension(127, 40));
        jLabel9.setMinimumSize(new java.awt.Dimension(127, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreoInstitucional, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtProgramaAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(txtNumeroFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(txtNumeroCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 17, Short.MAX_VALUE)))
                        .addGap(22, 22, 22)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtCorreoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))))
            .addGroup(layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoInstitucional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProgramaAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnConsultas)
                            .addComponent(btnModificar)
                            .addComponent(btnEliminar)
                            .addComponent(btnAtras)
                            .addComponent(btnSalir))
                        .addGap(153, 153, 153))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
       
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        StudentDTO estudiante = this.recuperateStudent();
        try {
            StudentDAO estudianteDAO = new StudentDAO();
            estudianteDAO.updateStudent(estudiante);
            this.showStudents();
            this.cleaner();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            StudentDAO estudianteDAO = new StudentDAO();
            StudentDTO estudiante = recuperateStudent();
            estudianteDAO.addStudent(estudiante);
            this.showStudents();
            this.clean();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstudiantesMouseClicked
        if (evt.getClickCount() == 1) {
            JTable receptor = (JTable) evt.getSource();
            txtNombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtApellido.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            txtFecha.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            txtCorreoInstitucional.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            txtCorreoPersonal.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
            txtNumeroCelular.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 5).toString());
            txtNumeroFijo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 6).toString());
            txtProgramaAcademico.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 7).toString());

            btnAgregar.setEnabled(false);
            btnConsultas.setEnabled(false);
            btnEliminar.setEnabled(true);
            btnModificar.setEnabled(true);

        }
    }//GEN-LAST:event_tblEstudiantesMouseClicked

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        if (!txtCorreoInstitucional.getText().isEmpty() && txtApellido.getText().isEmpty() && txtNumeroCelular.getText().isEmpty() && txtProgramaAcademico.getText().isEmpty() && txtFecha.getText().isEmpty()) {
            try {
                searchStudentMail();
                this.clean();
            } catch (SQLException ex) {
                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (!txtApellido.getText().isEmpty() && txtCorreoInstitucional.getText().isEmpty() && txtNumeroCelular.getText().isEmpty() && txtProgramaAcademico.getText().isEmpty() && txtFecha.getText().isEmpty()) {
            try {
                searchStudentLastName();
                this.clean();
            } catch (SQLException ex) {
                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (txtApellido.getText().isEmpty() && txtCorreoInstitucional.getText().isEmpty() && txtNumeroCelular.getText().isEmpty() && txtProgramaAcademico.getText().isEmpty() && !txtFecha.getText().isEmpty()) {
            try {
                searchStudentDateB();
                this.clean();
            } catch (SQLException ex) {
                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (txtApellido.getText().isEmpty() && txtCorreoInstitucional.getText().isEmpty() && txtNumeroCelular.getText().isEmpty() && !txtProgramaAcademico.getText().isEmpty() && txtFecha.getText().isEmpty()) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Bucar por programa \n2. Buscar cantidad de estudiantes por programa"));
            switch (opcion) {
                case 1:
                                    try {
                    searchStudentProgram();
                    this.clean();
                } catch (SQLException ex) {
                    Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;
                case 2:                
                    try {
                    countStudentProgram();
                    this.clean();
                } catch (SQLException ex) {
                    Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
        } else if (txtApellido.getText().isEmpty() && txtCorreoInstitucional.getText().isEmpty() && !txtNumeroCelular.getText().isEmpty() && txtProgramaAcademico.getText().isEmpty() && txtFecha.getText().isEmpty()) {
            try {
                searchStudentCpNumber();
                this.clean();
            } catch (SQLException ex) {
                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.clean();
        }


    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        try {
             this.completeTable();
            this.showStudents();
            this.clean();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        StudentDTO estudiante = this.recuperateStudent();
        try {
            StudentDAO estudianteDAO = new StudentDAO();
            estudianteDAO.deleteStudent(estudiante.getInst_mail());
            this.showStudents();
            this.clean();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class
                    .getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCorreoInstitucionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoInstitucionalMouseClicked
        if (txtCorreoInstitucional.getText().isEmpty() && txtApellido.getText().isEmpty() && txtNumeroCelular.getText().isEmpty() && txtProgramaAcademico.getText().isEmpty() && txtFecha.getText().isEmpty()) {

            this.cleaner();
        }
    }//GEN-LAST:event_txtCorreoInstitucionalMouseClicked

    private void txtNumeroCelularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroCelularMouseClicked
        if (txtCorreoInstitucional.getText().isEmpty() && txtApellido.getText().isEmpty() && txtNumeroCelular.getText().isEmpty() && txtProgramaAcademico.getText().isEmpty() && txtFecha.getText().isEmpty()) {

            this.cleaner();
            String[] titulos = {"Apellido", "Nombre", "Programa Academico"};
            model = new DefaultTableModel(null, titulos);
            tblEstudiantes.setModel(model);
        }
     }//GEN-LAST:event_txtNumeroCelularMouseClicked

    private void txtProgramaAcademicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProgramaAcademicoMouseClicked
        if (txtCorreoInstitucional.getText().isEmpty() && txtApellido.getText().isEmpty() && txtNumeroCelular.getText().isEmpty() && txtProgramaAcademico.getText().isEmpty() && txtFecha.getText().isEmpty()) {

            this.cleaner();
            String[] titulos = {"Apellido", "Nombre"};
            model = new DefaultTableModel(null, titulos);
            tblEstudiantes.setModel(model);
        }
    }//GEN-LAST:event_txtProgramaAcademicoMouseClicked

    private void txtApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMouseClicked
        if (txtNombre.getText().isEmpty() && txtCorreoInstitucional.getText().isEmpty() && txtApellido.getText().isEmpty() && txtNumeroCelular.getText().isEmpty() && txtProgramaAcademico.getText().isEmpty() && txtFecha.getText().isEmpty()) {

            this.cleaner();
        }
    }//GEN-LAST:event_txtApellidoMouseClicked

    private void txtFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMouseClicked
        if (txtCorreoInstitucional.getText().isEmpty() && txtApellido.getText().isEmpty() && txtNumeroCelular.getText().isEmpty() && txtProgramaAcademico.getText().isEmpty() && txtFecha.getText().isEmpty()) {

            this.cleaner();
        }
    }//GEN-LAST:event_txtFechaMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnSalirActionPerformed
    public StudentDTO recuperateStudent() {
        StudentDTO estudianteDTO = new StudentDTO();

        String celular = txtNumeroCelular.getText();
        String fijo = txtNumeroFijo.getText();
        estudianteDTO.setNames(txtNombre.getText());
        estudianteDTO.setLast_names(txtApellido.getText());
        estudianteDTO.setDate_b(txtFecha.getText());
        estudianteDTO.setInst_mail(txtCorreoInstitucional.getText());
        estudianteDTO.setPersonal_mail(txtCorreoPersonal.getText());
        if (StudentDAO.becomeStringLong(celular) != null) {
            estudianteDTO.setCp_number(StudentDAO.becomeStringLong(celular));

        }
        if (StudentDAO.becomeStringLong(fijo) != null) {
            estudianteDTO.setHouse_number(StudentDAO.becomeStringLong(fijo));

        }
        estudianteDTO.setProgram(txtProgramaAcademico.getText());
        return estudianteDTO;

    }

    public void cleaner() {
        btnAgregar.setEnabled(false);
        btnConsultas.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
    }

    public void clean() {

        txtNombre.setText("");
        txtApellido.setText("");
        txtFecha.setText("");
        txtCorreoInstitucional.setText("");
        txtCorreoPersonal.setText("");
        txtNumeroCelular.setText("");
        txtNumeroFijo.setText("");
        txtProgramaAcademico.setText("");

        btnAgregar.setEnabled(true);
        btnConsultas.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
    }

    public void completeTable() {
        String[] titulos = {"Nombre", "Apellido", "Fecha de Nacimiento", "Correo Institucional", "Correo Personal", "Numero Celular", "Numero Fijo", "Programa Academico"};
        model = new DefaultTableModel(null, titulos);
        tblEstudiantes.setModel(model);
    }

    public void showStudents() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        Linkage objConnection = new Linkage();
        try {
            ResultSet resultado = objConnection.consultarRegistros(Continual.LISTAR_ESTUDIANTES);
            while (resultado.next()) {

                Object[] oUsuario = {resultado.getString("nombre"), resultado.getString("apellido"), resultado.getString("fechaNacimiento"), resultado.getString("correoInstitucional"), resultado.getString("correoPersonal"), resultado.getString("numeroCelular"), resultado.getString("numeroFijo"), resultado.getString("programaAcademico")};
                model.addRow(oUsuario);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void searchStudentMail() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        Linkage objConnection = new Linkage();
        try {
            String sentencia = String.format(Continual.BUSCAR_ESTUDIANTE_CORREO, txtCorreoInstitucional.getText());
            ResultSet resultado = objConnection.consultarRegistros(sentencia);
            while (resultado.next()) {
                if (resultado.getString("correoInstitucional").equals(txtCorreoInstitucional.getText())) {
                    Object[] oUsuario = {resultado.getString("nombre"), resultado.getString("apellido"), resultado.getString("fechaNacimiento"), resultado.getString("correoInstitucional"), resultado.getString("correoPersonal"), resultado.getString("numeroCelular"), resultado.getString("numeroFijo"), resultado.getString("programaAcademico")};
                    model.addRow(oUsuario);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void searchStudentDateB() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        Linkage objConnection = new Linkage();
        try {
            String sentencia = String.format(Continual.BUSCAR_ESTUDIANTE_FECHA, txtFecha.getText());
            ResultSet resultado = objConnection.consultarRegistros(sentencia);
            while (resultado.next()) {
                if (resultado.getString("fechaNacimiento").equals(txtFecha.getText())) {
                    Object[] oUsuario = {resultado.getString("nombre"), resultado.getString("apellido"), resultado.getString("fechaNacimiento"), resultado.getString("correoInstitucional"), resultado.getString("correoPersonal"), resultado.getString("numeroCelular"), resultado.getString("numeroFijo"), resultado.getString("programaAcademico")};
                    model.addRow(oUsuario);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void searchStudentLastName() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        Linkage objConnection = new Linkage();
        try {
            String sentencia = String.format(Continual.LISTAR_ESTUDIANTES);
            ResultSet resultado = objConnection.consultarRegistros(sentencia);
            while (resultado.next()) {
                if (resultado.getString("apellido").equals(txtApellido.getText())) {
                    Object[] oUsuario = {resultado.getString("nombre"), resultado.getString("apellido"), resultado.getString("fechaNacimiento"), resultado.getString("correoInstitucional"), resultado.getString("correoPersonal"), resultado.getString("numeroCelular"), resultado.getString("numeroFijo"), resultado.getString("programaAcademico")};
                    model.addRow(oUsuario);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void searchStudentProgram() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        Linkage objConexion = new Linkage();
        try {
            String sentencia = String.format(Continual.LISTAR_ESTUDIANTES);
            ResultSet resultado = objConexion.consultarRegistros(sentencia);
            while (resultado.next()) {
                if (resultado.getString("programaAcademico").equals(txtProgramaAcademico.getText())) {
                    Object[] oUsuario = {resultado.getString("apellido"), resultado.getString("nombre")};
                    model.addRow(oUsuario);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void countStudentProgram() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        Linkage objConexion = new Linkage();
        int c = 0;
        try {
            String sentencia = String.format(Continual.LISTAR_ESTUDIANTES);
            ResultSet resultado = objConexion.consultarRegistros(sentencia);
            while (resultado.next()) {
                if (resultado.getString("programaAcademico").equals(txtProgramaAcademico.getText())) {
                    c += 1;

                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        JOptionPane.showMessageDialog(null, c);

    }

    public void searchStudentCpNumber() throws SQLException {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        Linkage objConexion = new Linkage();
        try {
            String sentencia = String.format(Continual.LISTAR_ESTUDIANTES);
            ResultSet resultado = objConexion.consultarRegistros(sentencia);
            while (resultado.next()) {
                if (resultado.getString("numeroCelular").equals(txtNumeroCelular.getText())) {
                    Object[] oUsuario = {resultado.getString("apellido"), resultado.getString("nombre"), resultado.getString("programaAcademico")};
                    model.addRow(oUsuario);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

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
            java.util.logging.Logger.getLogger(DataBase.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBase.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBase.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBase.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DataBase().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DataBase.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblEstudiantes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreoInstitucional;
    private javax.swing.JTextField txtCorreoPersonal;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroCelular;
    private javax.swing.JTextField txtNumeroFijo;
    private javax.swing.JTextField txtProgramaAcademico;
    // End of variables declaration//GEN-END:variables
}
