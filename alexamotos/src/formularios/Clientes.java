/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AnToine
 */
public class Clientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Clientes
     */
    String buscar;
    public Clientes() {
        initComponents();
        getContentPane().setBackground(Color.white);
        foto();
        foto1();
        foto2();
        foto3();
        foto4();
        mostrardatos("");
        tbclientes.setEnabled(false);
        btnupdate.setEnabled(false);
    }
    public void mostrardatos(String buscar){ //.........---------Mostrar datos metodo tabla-----............
    DefaultTableModel modelo=new DefaultTableModel();
    modelo.addColumn("RFC");
    modelo.addColumn("Empresa");
    modelo.addColumn("Encargo");
    modelo.addColumn("Calle");
    modelo.addColumn("Colonia");
    modelo.addColumn("C.P.");
    modelo.addColumn("Municipio");
    modelo.addColumn("Ciudad");
    modelo.addColumn("Telefono");
    modelo.addColumn("Correo");
    tbclientes.setModel(modelo);
    String sql="";
    if(buscar.equals("")){
        sql="select * from clientes";
    }
    else{
        sql="select * from clientes where concat(rfc,empresa,encargo)like'%" + buscar + "%'";
        
    }
    String db = "alexamotos"; 
        String dir = "jdbc:mysql://localhost/" + db;
        String driver = "org.gjt.mm.mysql.Driver";
        String usuario = "root";
        String pass = "450420";
        String []datos=new String [10];
        Connection conectar = null;
       try {
            Class.forName(driver);
            conectar = (Connection) DriverManager.getConnection(dir, usuario, pass);
com.mysql.jdbc.Statement st = (com.mysql.jdbc.Statement) conectar.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                datos[9]=rs.getString(10);
                               
                modelo.addRow(datos);                
            }
            tbclientes.setModel(modelo);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "No encontro");
    }
}


     public void foto(){
    ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("/images/add.jpg"));
        Image imagen = icono.getImage();
        ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(30,30,Image.SCALE_SMOOTH));
        btnadd.setIcon(iconoEscalado);
                    }
     public void foto1(){
    ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("/images/all.png"));
        Image imagen = icono.getImage();
        ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(30,30,Image.SCALE_SMOOTH));
        btnall.setIcon(iconoEscalado);
                    }
     public void foto2(){
    ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"));
        Image imagen = icono.getImage();
        ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(30,30,Image.SCALE_SMOOTH));
        btnbuscar.setIcon(iconoEscalado);
                    }
     public void foto3(){
    ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"));
        Image imagen = icono.getImage();
        ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(30,30,Image.SCALE_SMOOTH));
        btndelete.setIcon(iconoEscalado);
                    }
     public void foto4(){
    ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("/images/update.png"));
        Image imagen = icono.getImage();
        ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(30,30,Image.SCALE_SMOOTH));
        btnupdate.setIcon(iconoEscalado);
                    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtrfc = new javax.swing.JTextField();
        txtempresa = new javax.swing.JTextField();
        txtencargado = new javax.swing.JTextField();
        txtcalle = new javax.swing.JTextField();
        txtcolonia = new javax.swing.JTextField();
        txtcp = new javax.swing.JTextField();
        txtciudad = new javax.swing.JTextField();
        txtmunicipio = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnall = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbclientes = new javax.swing.JTable();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Formulario Clientes");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Complex", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel1.setText("RFC:");

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel2.setText("Nombre de la Entidad:");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel3.setText("Encargado:");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel4.setText("Calle y numero:");

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel5.setText("Delegacion/Municipio:");

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel6.setText("Colonia:");

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel7.setText("Ciudad/Estado:");

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel8.setText("C.P.:");

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel9.setText("Telefono:");

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel10.setText("Correo:");

        txtrfc.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        txtrfc.setToolTipText("Debe contener un numero RFC valido");

        txtempresa.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        txtempresa.setToolTipText("Entidad Fiscal registrado por hacienda");

        txtencargado.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        txtencargado.setToolTipText("Nombre del encargado o socio");

        txtcalle.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        txtcalle.setToolTipText("Ingrese primero calle y despues con  # el numero");

        txtcolonia.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        txtcolonia.setToolTipText("Ingrese la colonia con su respectiva seccion si es que pertenece");

        txtcp.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        txtcp.setToolTipText("Ingrese un codigo postal valida de mexico");

        txtciudad.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        txtciudad.setToolTipText("Ingrese el edo o ciudad donde pertenece su entidad");

        txtmunicipio.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        txtmunicipio.setToolTipText("Ingrese la delegacion o municipio donde habita la entidad");

        txttel.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        txttel.setToolTipText("Ingrese un numero VALIDO de 10 numeros");

        txtcorreo.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        txtcorreo.setToolTipText("Debe contener alguna @");

        btnadd.setFont(new java.awt.Font("Gungsuh", 1, 18)); // NOI18N
        btnadd.setText("Agregar");
        btnadd.setToolTipText("Agrega a la base de datos la informacion ingresada");
        btnadd.setFocusable(false);
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnbuscar.setFont(new java.awt.Font("Gungsuh", 1, 18)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.setToolTipText("Busca un registro por su RFC");
        btnbuscar.setFocusable(false);
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnall.setFont(new java.awt.Font("Gungsuh", 1, 18)); // NOI18N
        btnall.setText("Mostrar todos");
        btnall.setToolTipText("Muestra todos los registros");
        btnall.setFocusable(false);
        btnall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Gungsuh", 1, 18)); // NOI18N
        btnupdate.setText("Actualizar");
        btnupdate.setToolTipText("Ingrese primero el registro que vaya actualizar para guardar los cambios");
        btnupdate.setFocusable(false);
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Gungsuh", 1, 18)); // NOI18N
        btndelete.setText("Borrar");
        btndelete.setToolTipText("Ingrese el RFC del registro a borrar");
        btndelete.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtmunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtcalle, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)))
                                .addGap(4, 4, 4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtencargado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtcolonia, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtrfc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnall, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnadd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnadd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnall)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndelete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtrfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtencargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(txtcalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcolonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(txtcp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        tbclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbclientes.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tbclientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
buscar = JOptionPane.showInputDialog("Ingrese el RFC a Buscar");
        mostrardatos(buscar);
        tbclientes.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
       buscar=""; //---------------------MEtodo para insertar datos boton-------------------------
        String db = "alexamotos"; 
        String dir = "jdbc:mysql://localhost/" + db;
        String driver = "org.gjt.mm.mysql.Driver";
        String usuario = "root";
        String pass = "450420";
        Connection conectar = null;
        try {
            Class.forName(driver);
            conectar = (Connection) DriverManager.getConnection(dir, usuario, pass);
            String rfc, empresa, encargo, calle, colonia, cp, municipio, ciudad;
            String tel, correo, sql;
            rfc = txtrfc.getText();
            empresa = txtempresa.getText();
            encargo = txtencargado.getText();
            calle = txtcalle.getText();
            colonia = txtcolonia.getText();
            cp = txtcp.getText();
            municipio = txtmunicipio.getText();
            ciudad = txtciudad.getText();
            tel = txttel.getText();
            correo = txtcorreo.getText();
            sql = "insert into clientes (rfc, empresa, encargo, calle, colonia, cp, municipio, ciudad, telefono, correo) values('" + rfc + "','" + empresa + "','" + encargo + "','" + calle + "','" + colonia + "', "
                    +  cp + ",'" + municipio + "','" + ciudad + "', " + tel + ",'" + correo + "')";
            Statement st = (Statement) conectar.createStatement();
            int resultado = st.executeUpdate(sql);
            txtrfc.setText("");
            txtempresa.setText("");
            txtencargado.setText("");
            txtcalle.setText("");
            txtcolonia.setText("");
            txtcp.setText("");
            txtmunicipio.setText("");
            txtciudad.setText("");
            txttel.setText("");
            txtcorreo.setText("");
            mostrardatos("");
            JOptionPane.showMessageDialog(null, "Datos insertados");
        } catch (Exception ioe)//vacia la base de datos
        {
            JOptionPane.showMessageDialog(null, "Error no se insertar los datos" + ioe);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallActionPerformed
buscar="";
mostrardatos(buscar);        // TODO add your handling code here:
    }//GEN-LAST:event_btnallActionPerformed

    private void menu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu
int fila=tbclientes.getSelectedRow();
if(fila>=0){
    txtrfc.setText(tbclientes.getValueAt(fila, 0).toString());
    txtempresa.setText(tbclientes.getValueAt(fila, 1).toString());
    txtencargado.setText(tbclientes.getValueAt(fila, 2).toString());
    txtcalle.setText(tbclientes.getValueAt(fila, 3).toString());
    txtcolonia.setText(tbclientes.getValueAt(fila, 4).toString());
    txtcp.setText(tbclientes.getValueAt(fila, 5).toString());
    txtmunicipio.setText(tbclientes.getValueAt(fila, 6).toString());
    txtciudad.setText(tbclientes.getValueAt(fila, 7).toString());
    txttel.setText(tbclientes.getValueAt(fila, 8).toString());
    txtcorreo.setText(tbclientes.getValueAt(fila, 9).toString());
    txtrfc.setEnabled(false); 
    btnupdate.setEnabled(true);
    tbclientes.setEnabled(false);
}
else{
    JOptionPane.showMessageDialog(null, "no selecciono fila");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_menu

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
String db = "alexamotos"; 
        String dir = "jdbc:mysql://localhost/" + db;
        String driver = "org.gjt.mm.mysql.Driver";
        String usuario = "root";
        String pass = "450420";
         Connection conectar = null;
       
       String sql="update clientes set empresa='"+txtempresa.getText()+"', encargo='"+txtencargado.getText()+"', calle='"+txtcalle.getText()+"', colonia='"+txtcolonia.getText()+"'"
 + ",cp="+txtcp.getText()+", municipio='"+txtmunicipio.getText()+"', ciudad='"+txtciudad.getText()+"', telefono="+ txttel.getText()+", correo='"+txtcorreo.getText()+"' where rfc='"+txtrfc.getText()+"'";
         try {
            Class.forName(driver);
            conectar = (Connection) DriverManager.getConnection(dir, usuario, pass);
           PreparedStatement pst= (PreparedStatement) conectar.prepareStatement(sql);
           pst.executeUpdate();
           
mostrardatos("");
 txtrfc.setText("");
            txtempresa.setText("");
            txtencargado.setText("");
            txtcalle.setText("");
            txtcolonia.setText("");
            txtcp.setText("");
            txtmunicipio.setText("");
            txtciudad.setText("");
            txttel.setText("");
            txtcorreo.setText("");
            txtrfc.requestFocus();
            txtrfc.setEnabled(true);
            btnupdate.setEnabled(false);
            conectar.close();

         }catch(Exception e){
             JOptionPane.showMessageDialog(null, e.getMessage());
         }        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnall;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbclientes;
    private javax.swing.JTextField txtcalle;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtcolonia;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtcp;
    private javax.swing.JTextField txtempresa;
    private javax.swing.JTextField txtencargado;
    private javax.swing.JTextField txtmunicipio;
    private javax.swing.JTextField txtrfc;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}
