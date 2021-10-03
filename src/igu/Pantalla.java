
package igu;

public class Pantalla extends javax.swing.JFrame {

    //Declaro los arreglos...  Por convenencia seran de tipo string para facilitar la vision "vacia" en el formulario;
    int tamanio = 10;//una variable interezante con solo el cambio de esta variable, esta en 10 por consigna.
    String [] dni = new String[tamanio];
    String [] nombre = new String[tamanio];
    String [] apellido = new String[tamanio];
    String [] direccion = new String[tamanio];
    String [] telefono = new String[tamanio];
    String [] f_nacimiento = new String[tamanio];
    int indice = 0;    
    
    public Pantalla() {
        
        initComponents();
        
        //Inicializo los arreglos para asegurarme que esten vacios y nos nos salga null en los strings
        for (int i = 0; i < tamanio; i++) {
          direccion[i] = "";
          f_nacimiento[i] = "";
          telefono[i] = "";
          apellido[i] = "";
          dni[i] = "";
          nombre[i] = "";
        }
        //Anulo la edicion del textfield del indice        
        indice_Field.setEditable(false);
        
    }
    
    public void muestraPantalla(){ //funcion para consultar y mostrar datos de los arreglos en los textfield se pueden usar las veces que sean necesarias
           field_Direccion.setText(String.valueOf(direccion[indice]));
           field_Apellido.setText(String.valueOf(apellido[indice]));
           field_DNI.setText(String.valueOf(dni[indice] ));
           field_Nacimiento.setText((String.valueOf(f_nacimiento[indice])));
           field_Nombre.setText(String.valueOf(nombre[indice] ));
           field_Telefono.setText(String.valueOf(telefono[indice]));
    }
    
    public void asignacionValor(){//Funcion para asignar valores a los arreglos
          direccion[indice] = field_Direccion.getText();
          f_nacimiento[indice] = field_Nacimiento.getText();
          telefono[indice] = field_Telefono.getText();
          apellido[indice] = field_Apellido.getText();
          dni[indice] = field_DNI.getText();
          nombre[indice] = field_Nombre.getText();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_DNI = new javax.swing.JLabel();
        label_Nombre = new javax.swing.JLabel();
        label_Apellido = new javax.swing.JLabel();
        label_Direccion = new javax.swing.JLabel();
        label_Telefono = new javax.swing.JLabel();
        label_F_nacimiento = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        field_Direccion = new javax.swing.JTextField();
        field_DNI = new javax.swing.JTextField();
        field_Apellido = new javax.swing.JTextField();
        field_Telefono = new javax.swing.JTextField();
        field_Nacimiento = new javax.swing.JTextField();
        field_Nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_Grabar = new javax.swing.JButton();
        btn_Back = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        indice_Label = new javax.swing.JLabel();
        indice_Field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_DNI.setText("DNI: ");

        label_Nombre.setText("Nombre: ");

        label_Apellido.setText("Apellido:");

        label_Direccion.setText("Dirección:");

        label_Telefono.setText("Telefono:");

        label_F_nacimiento.setText("F. Nacimiento : ");

        field_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_DireccionActionPerformed(evt);
            }
        });

        field_DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_DNIActionPerformed(evt);
            }
        });

        field_Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_ApellidoActionPerformed(evt);
            }
        });

        field_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_TelefonoActionPerformed(evt);
            }
        });

        field_Nacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_NacimientoActionPerformed(evt);
            }
        });

        field_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_NombreActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Impact", 2, 36)); // NOI18N
        jLabel1.setText("Agenda Electrónica");

        btn_Grabar.setText("Grabar");
        btn_Grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GrabarActionPerformed(evt);
            }
        });

        btn_Back.setText("<");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });

        btn_next.setText(">");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        indice_Label.setText("Indice:");

        indice_Field.setText("0");
        indice_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indice_FieldActionPerformed(evt);
            }
        });
        indice_Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                indice_FieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(306, 306, 306)
                                .addComponent(indice_Label)
                                .addGap(18, 18, 18)
                                .addComponent(indice_Field)
                                .addGap(65, 65, 65))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(label_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(label_DNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label_Apellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(field_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(field_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(field_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(317, 317, 317)
                                        .addComponent(btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_Grabar)
                                        .addGap(25, 25, 25))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_F_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label_Telefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label_Direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(field_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field_Telefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(field_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Direccion)
                    .addComponent(label_DNI)
                    .addComponent(field_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Nombre)
                    .addComponent(label_Telefono)
                    .addComponent(field_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Apellido)
                    .addComponent(label_F_nacimiento)
                    .addComponent(field_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Grabar)
                    .addComponent(btn_Back)
                    .addComponent(btn_next))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indice_Label)
                    .addComponent(indice_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(223, 223, 223)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(131, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void field_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_NombreActionPerformed
        
    }//GEN-LAST:event_field_NombreActionPerformed

    private void field_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_DireccionActionPerformed
       
    }//GEN-LAST:event_field_DireccionActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        
        // Este boton indicar el cabezal de los arreglos y donde se colocara, con esta condicion (indice > 0 && indice <= 9) no pasara del limite permitido de los arreglos... podria haber colocado lenght... pero esto es mas seguro
        if(indice > 0 && indice < tamanio){
           indice--;//Decrementa el indice
           indice_Field.setText(String.valueOf(indice));// Se lo mostramos al usuario los indices que cambian
           //Aca enviamos los datos almacenados en el arreglos. previamente guardados, si no hay nada solo mostrara " ";
           muestraPantalla();
        }
    }//GEN-LAST:event_btn_BackActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        //lo mismo pero para  que el boton de arriba solo que aqui se incrementa entre otros.  
        if(indice >= 0 && indice < (tamanio - 1)){
           indice++;//Incrementa el indice
           indice_Field.setText(String.valueOf(indice));// Se lo mostramos al usuario los indices que cambian
           //Aca enviamos los datos almacenados en el arreglos. previamente guardados, si no hay nada solo mostrara " ";
           muestraPantalla();
        }
    }//GEN-LAST:event_btn_nextActionPerformed

    private void field_DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_DNIActionPerformed
        
    }//GEN-LAST:event_field_DNIActionPerformed

    private void field_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_ApellidoActionPerformed
        
    }//GEN-LAST:event_field_ApellidoActionPerformed

    private void field_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_TelefonoActionPerformed
       
    }//GEN-LAST:event_field_TelefonoActionPerformed

    private void field_NacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_NacimientoActionPerformed
       
    }//GEN-LAST:event_field_NacimientoActionPerformed

    private void btn_GrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GrabarActionPerformed
          //Este boton es el mas funcional de casi todo el programa, aqui se almacena los datos en los indices indicados previamente
          asignacionValor();
          //Dado que en la consigna no impide sobreescribir y tampoco la restriccion de solo enteros en ciertos campos entonces el programa permite hacerlo
    }//GEN-LAST:event_btn_GrabarActionPerformed

    private void indice_FieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_indice_FieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_indice_FieldKeyPressed

    private void indice_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indice_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indice_FieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_Grabar;
    private javax.swing.JButton btn_next;
    private javax.swing.JTextField field_Apellido;
    private javax.swing.JTextField field_DNI;
    private javax.swing.JTextField field_Direccion;
    private javax.swing.JTextField field_Nacimiento;
    private javax.swing.JTextField field_Nombre;
    private javax.swing.JTextField field_Telefono;
    private javax.swing.JTextField indice_Field;
    private javax.swing.JLabel indice_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_Apellido;
    private javax.swing.JLabel label_DNI;
    private javax.swing.JLabel label_Direccion;
    private javax.swing.JLabel label_F_nacimiento;
    private javax.swing.JLabel label_Nombre;
    private javax.swing.JLabel label_Telefono;
    // End of variables declaration//GEN-END:variables
}
