

import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class VentanaPrincipal extends javax.swing.JFrame {

    
    private ArrayList<String> palabrasEncriptadas = new ArrayList<String>();
    private ArrayList<String> palabrasDiccionario = new ArrayList<String>();
    private String clave;
    private int numLetras;
    private int numPalabras = 0;
    private ArrayList<JTextField> array = new ArrayList<JTextField>();
    DefaultListModel Pdiccionario = new DefaultListModel();
    DefaultListModel Pencriptadas = new DefaultListModel();
    private int numPalabrasDiccionario = 0;
 
    public VentanaPrincipal() {
        initComponents();
        
        PalabrasDiccionario.setModel(Pdiccionario);
        PalabrasEncriptadas.setModel(Pencriptadas);
        jPanel1.setVisible(false);
        Deshacer.setVisible(false);
        Rehacer.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NumeroLetras = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextClave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        PalabrasEncriptadas = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        PalabrasDiccionario = new javax.swing.JList();
        BorrarDiccionario = new javax.swing.JButton();
        BorrarEncriptadas = new javax.swing.JButton();
        editarEncriptadas = new javax.swing.JTextField();
        EditarPalabraEncriptadas = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        EditarPalabraDiccionario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        Nuevo = new javax.swing.JMenuItem();
        Cargar = new javax.swing.JMenuItem();
        Salvar = new javax.swing.JMenuItem();
        SalvarComo = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        Editar = new javax.swing.JMenu();
        AñadirPalabra = new javax.swing.JMenuItem();
        Deshacer = new javax.swing.JMenuItem();
        Rehacer = new javax.swing.JMenuItem();
        AnadirPalabraDiccionario = new javax.swing.JMenuItem();
        Resolver = new javax.swing.JMenu();
        ResolverManualmente = new javax.swing.JMenuItem();
        ResolverAutomaticamente = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();
        Guia = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Numero de letras a codificar");

        NumeroLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroLetrasActionPerformed(evt);
            }
        });

        jLabel2.setText("CLAVE");

        TextClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextClaveActionPerformed(evt);
            }
        });

        jLabel3.setText("Diccionario");

        jLabel4.setText("Palabras Encriptadas");

        jScrollPane3.setViewportView(PalabrasEncriptadas);

        jScrollPane1.setViewportView(PalabrasDiccionario);

        BorrarDiccionario.setText("Borrar");
        BorrarDiccionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarDiccionarioActionPerformed(evt);
            }
        });

        BorrarEncriptadas.setText("Borrar ");
        BorrarEncriptadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarEncriptadasActionPerformed(evt);
            }
        });

        EditarPalabraEncriptadas.setText("Editar");
        EditarPalabraEncriptadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarPalabraEncriptadasActionPerformed(evt);
            }
        });

        EditarPalabraDiccionario.setText("Editar");
        EditarPalabraDiccionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarPalabraDiccionarioActionPerformed(evt);
            }
        });

        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Seleccionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumeroLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(TextClave, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BorrarEncriptadas)
                                .addGap(38, 38, 38)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BorrarDiccionario)
                                .addGap(97, 97, 97))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(156, 156, 156)
                                .addComponent(jLabel3)
                                .addGap(116, 116, 116))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(editarEncriptadas, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EditarPalabraEncriptadas)
                                .addGap(64, 64, 64)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EditarPalabraDiccionario)
                                .addGap(45, 45, 45))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(147, 147, 147)
                .addComponent(jButton2)
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NumeroLetras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BorrarEncriptadas)
                    .addComponent(BorrarDiccionario))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarPalabraDiccionario)
                    .addComponent(EditarPalabraEncriptadas)
                    .addComponent(editarEncriptadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Archivo.setText("Archivo");

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        Archivo.add(Nuevo);

        Cargar.setText("Cargar");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });
        Archivo.add(Cargar);

        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });
        Archivo.add(Salvar);

        SalvarComo.setText("Salvar como");
        SalvarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarComoActionPerformed(evt);
            }
        });
        Archivo.add(SalvarComo);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Archivo.add(Salir);

        jMenuBar1.add(Archivo);

        Editar.setText("Editar");

        AñadirPalabra.setText("Añadir palabra encriptada");
        AñadirPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirPalabraActionPerformed(evt);
            }
        });
        Editar.add(AñadirPalabra);

        Deshacer.setText("Deshacer");
        Editar.add(Deshacer);

        Rehacer.setText("Rehacer");
        Editar.add(Rehacer);

        AnadirPalabraDiccionario.setText("Anadir Palabra Diccionario");
        AnadirPalabraDiccionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnadirPalabraDiccionarioActionPerformed(evt);
            }
        });
        Editar.add(AnadirPalabraDiccionario);

        jMenuBar1.add(Editar);

        Resolver.setText("Resolver");

        ResolverManualmente.setText("Resolver");
        ResolverManualmente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResolverManualmenteActionPerformed(evt);
            }
        });
        Resolver.add(ResolverManualmente);

        ResolverAutomaticamente.setText("Resolver Automáticamente");
        ResolverAutomaticamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResolverAutomaticamenteActionPerformed(evt);
            }
        });
        Resolver.add(ResolverAutomaticamente);

        jMenuBar1.add(Resolver);

        Ayuda.setText("Ayuda");

        Guia.setText("Guia");
        Guia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuiaActionPerformed(evt);
            }
        });
        Ayuda.add(Guia);

        jMenuBar1.add(Ayuda);

        setJMenuBar(jMenuBar1);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getClave(){
        return clave;
    }
    
    public ArrayList<String> getPalabrasEncriptadas() {
        return palabrasEncriptadas;
    }
    
    public ArrayList<String> getPalabrasDiccionario() {
        return palabrasDiccionario;
    }
    
    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        // TODO add your handling code here:
        
        DialogoNuevo n = new DialogoNuevo(this,true);
        n.setVisible(true);
        limpiar();
        setTitle("");
        jPanel1.setVisible(true);
        
        Salvar.setEnabled(true);
        SalvarComo.setEnabled(true);
        AñadirPalabra.setEnabled(true);
        ResolverAutomaticamente.setEnabled(true);
        ResolverManualmente.setEnabled(true);
        
        TextClave.setText(clave = n.getClave());
        NumeroLetras.setText((numLetras=n.getNumeroPalabras()) + "");
        
       
    }//GEN-LAST:event_NuevoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        if(!jPanel1.isVisible()) {
            System.exit(0);
        } 
        comprobarGuardado();
    }//GEN-LAST:event_SalirActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        // TODO add your handling code here:
        guardarArchivo();
    }//GEN-LAST:event_SalvarActionPerformed

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
        // TODO add your handling code here:
       limpiar();
       abrirArchivo();
                                  
    }//GEN-LAST:event_CargarActionPerformed

    private void AñadirPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirPalabraActionPerformed
        // TODO add your handling code here:
        DialogoPalabra a = new DialogoPalabra(this,true);
        a.setVisible(true);
        String palabra = a.getPalabra();
        anadirPalabraAEncriptadas(palabra);
        
    }//GEN-LAST:event_AñadirPalabraActionPerformed

    private void ResolverManualmenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResolverManualmenteActionPerformed
        // TODO add your handling code here:  
        resolverManualmente();
    }//GEN-LAST:event_ResolverManualmenteActionPerformed

    private void ResolverAutomaticamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResolverAutomaticamenteActionPerformed
        // TODO add your handling code here:	
        resolverAuto();
    }//GEN-LAST:event_ResolverAutomaticamenteActionPerformed

    private void GuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuiaActionPerformed
        // TODO add your handling code here:
        Guia dialogo = new Guia(this, true);
        dialogo.setVisible(true);
    }//GEN-LAST:event_GuiaActionPerformed

    private void SalvarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarComoActionPerformed
        // TODO add your handling code here:
       guardarArchivoComo();
    }//GEN-LAST:event_SalvarComoActionPerformed

    private void TextClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextClaveActionPerformed

    private void NumeroLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroLetrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroLetrasActionPerformed

    private void AnadirPalabraDiccionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnadirPalabraDiccionarioActionPerformed
        // TODO add your handling code here:
        NuevaPalabraDiccionario p = new NuevaPalabraDiccionario(this, true);
        p.setVisible(true);
        anadirPalabrasAlDiccionario(p.getPalabra());
        
    }//GEN-LAST:event_AnadirPalabraDiccionarioActionPerformed

    private void BorrarEncriptadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarEncriptadasActionPerformed
        // TODO add your handling code here:
        
        List <Object> seleccionados = PalabrasEncriptadas.getSelectedValuesList();
        
        int lim = seleccionados.size();
        String completo="";

        if(lim!=0){ // 3.1
            for (int i=0; i<lim;i++){  //3.2
                Banda banda = (Banda) seleccionados.get(i); //3.3
                int id= banda.getId(); //3.4
                Pencriptadas.removeElement(seleccionados.get(i));
                numPalabras--;
            }
        }
    }//GEN-LAST:event_BorrarEncriptadasActionPerformed

    private void BorrarDiccionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarDiccionarioActionPerformed
        // TODO add your handling code here:
         List <Object>seleccionados = PalabrasDiccionario.getSelectedValuesList();
        
        int lim = seleccionados.size();
        String completo="";

        if(lim!=0){ // 3.1
            for (int i=0; i<lim;i++){  //3.2
                Banda banda = (Banda) seleccionados.get(i); //3.3
                int id= banda.getId(); //3.4
                Pdiccionario.removeElement(seleccionados.get(i));
                numPalabrasDiccionario--;
        
            }
        }
    }//GEN-LAST:event_BorrarDiccionarioActionPerformed

    private void EditarPalabraEncriptadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarPalabraEncriptadasActionPerformed
        // TODO add your handling code here:
     
        List <Object>seleccionados1 = PalabrasEncriptadas.getSelectedValuesList();
         int lim = seleccionados1.size();
         if(lim!=0){ // 3.1
            for (int i=0; i<lim;i++){  //3.2
                Banda banda = (Banda) seleccionados1.get(i); //3.3
                banda.setNombre(editarEncriptadas.getText());
                Pencriptadas.setElementAt(banda, banda.getId());
        
            }
        }
           
        editarEncriptadas.setText("");
        EditarPalabraEncriptadas.setEnabled(false);
        
    }//GEN-LAST:event_EditarPalabraEncriptadasActionPerformed

    private void EditarPalabraDiccionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarPalabraDiccionarioActionPerformed
        // TODO add your handling code here:
        
        List <Object>seleccionados2 = PalabrasDiccionario.getSelectedValuesList();
        
        int lim2 = seleccionados2.size();

        if(lim2!=0){ // 3.1
            for (int i=0; i<lim2;i++){  //3.2
                Banda banda = (Banda) seleccionados2.get(i); //3.3
                banda.setNombre(jTextField2.getText());
                Pdiccionario.setElementAt(banda, banda.getId());
            }
        }
        jTextField2.setText("");
        EditarPalabraDiccionario.setEnabled(false);
    }//GEN-LAST:event_EditarPalabraDiccionarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         List <Object>seleccionados1 = PalabrasEncriptadas.getSelectedValuesList();
         int lim = seleccionados1.size();
         if(lim!=0){ // 3.1
            for (int i=0; i<lim;i++){  //3.2
                Banda banda = (Banda) seleccionados1.get(i); //3.3
                editarEncriptadas.setText(seleccionados1.get(i).toString());
 
            }
        }
        EditarPalabraEncriptadas.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        List <Object>seleccionados2 = PalabrasDiccionario.getSelectedValuesList();
        
        int lim2 = seleccionados2.size();

        if(lim2!=0){ // 3.1
            for (int i=0; i<lim2;i++){  //3.2
                Banda banda = (Banda) seleccionados2.get(i); //3.3
                jTextField2.setText(seleccionados2.get(i).toString());
        
            }
        }
        EditarPalabraDiccionario.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed
        
    public void anadirPalabrasAlDiccionario(String p) {
        Pdiccionario.addElement(new Banda(p, numPalabrasDiccionario));
        numPalabrasDiccionario++;
    }
        
    public void anadirPalabraAEncriptadas(String p) {
        Pencriptadas.addElement(new Banda(p,numPalabras));
        numPalabras++;
    }
    
    public void resolverAuto() {
        palabrasDiccionario.clear();
        palabrasEncriptadas.clear();
  
        for(int i=0;i<numPalabras;i++){
            String texto = Pencriptadas.getElementAt(i).toString();
            palabrasEncriptadas.add(texto);
        }

        for(int i=0;i<numPalabrasDiccionario;i++){
            String texto2 = Pdiccionario.getElementAt(i).toString();
            palabrasDiccionario.add(texto2);
        }
        clave = TextClave.getText();
        
        Resolver n = new Resolver(this, true,palabrasEncriptadas,palabrasDiccionario,numLetras,clave);
        n.setVisible(true);
        
        n.limpiar();
    }
    
    public void resolverManualmente() {
        palabrasDiccionario.clear();
        palabrasEncriptadas.clear();
        for(int i=0;i<numPalabras;i++){
            String texto = Pencriptadas.getElementAt(i).toString();
            palabrasEncriptadas.add(texto);
        }
        
        for(int i=0;i<numPalabrasDiccionario;i++){
            String texto2 = Pdiccionario.getElementAt(i).toString();
            palabrasDiccionario.add(texto2);
        }
        clave = TextClave.getText();
      
        Resolver n = new Resolver(this, true,palabrasEncriptadas,numLetras,clave,palabrasDiccionario);
        n.setVisible(true);
        n.limpiar();
    }
    
    public void limpiar() {
        palabrasDiccionario.clear();
        palabrasEncriptadas.clear();
        clave = "";
        numPalabras = 0;
        Pdiccionario.clear();
        Pencriptadas.clear();
    }
    
    private void abrirArchivo() {
        String aux="";   
        String texto="";
        limpiar();
        try {
           
            /**llamamos el metodo que permite cargar la ventana*/
           JFileChooser file=new JFileChooser();
           file.showOpenDialog(this);
           /**abrimos el archivo seleccionado*/
           File abre=file.getSelectedFile();

           /**recorremos el archivo, lo leemos para plasmarlo
           *en el area de texto*/
           if(abre!=null) {     
               setTitle(abre + "");
                FileReader archivos=new FileReader(abre);
                BufferedReader lee=new BufferedReader(archivos);
                
                numLetras = Integer.parseInt(lee.readLine());
                NumeroLetras.setText(numLetras + "");
                
                numPalabras = Integer.parseInt(lee.readLine());
                for(int i=0; i<numPalabras; i++) {

                    Pencriptadas.addElement(new Banda(lee.readLine(),i));
                    
                }
                
                TextClave.setText(clave = lee.readLine());
                
                String linea = "";
                
		do{
			linea = lee.readLine();
			if(!linea.equals("*")) {
                            Pdiccionario.addElement((new Banda(linea,numPalabrasDiccionario)));
                            numPalabrasDiccionario++;
			}

		}while(!linea.equals("*"));
            }    
           jPanel1.setVisible(true);
        } catch(IOException ex) {
            JOptionPane.showMessageDialog(null,ex+"" + "\nNo se ha encontrado el archivo", "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
        }
        
    }
   
    
   private void guardarArchivoComo() {
         try {
            String nombre="";
            JFileChooser file=new JFileChooser();
            file.showSaveDialog(this);
            File guarda =file.getSelectedFile();
 
            if(guarda !=null) {
                /*guardamos el archivo y le damos el formato directamente,
                 * si queremos que se guarde en formato doc lo definimos como .doc*/
                setTitle(guarda + ".txt");
                 FileWriter  save=new FileWriter(guarda + ".txt");
                 String encriptadas = null;
                 for(int i=0;i<Pencriptadas.size();i++){
                    String texto = Pencriptadas.getElementAt(i).toString();
                    if(i==0){
                        encriptadas = texto;
                    }else{
                        encriptadas = encriptadas + "\n" + texto;
                    }
                    
                 }
                 String diccionario = null;
                 for(int i=0;i<Pdiccionario.size();i++){
                    String texto2 = Pdiccionario.getElementAt(i).toString();
                    if(i==0){
                        diccionario = texto2;
                    }else{
                        diccionario = diccionario +"\n"+ texto2;
                    }
                    
                 }
                 save.write(NumeroLetras.getText() + "\n" + numPalabras + "\n" + encriptadas + "\n" + TextClave.getText() + "\n" + diccionario + "\n" + "*" + "\n");
                 save.close();
                 JOptionPane.showMessageDialog(null,
                      "El archivo se a guardado Exitosamente",
                          "Información",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(IOException ex) {
            JOptionPane.showMessageDialog(null,
                 "Su archivo no se ha guardado",
                    "Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }
   
    private void guardarArchivo() {
         try {
            String guarda = getTitle();
            String encriptadas = null;
                 for(int i=0;i<Pencriptadas.size();i++){
                    String texto = Pencriptadas.getElementAt(i).toString();
                    if(i==0){
                        encriptadas = texto;
                    }else{
                        encriptadas = encriptadas + "\n"+ texto;
                    }
                    
                 }
                 String diccionario = null;
                 for(int i=0;i<Pdiccionario.size();i++){
                    String texto2 = Pdiccionario.getElementAt(i).toString();
                    if(i==0){
                        diccionario = texto2;
                    }else{
                        diccionario = diccionario + "\n" + texto2;
                    }
                    
                 }
            if(guarda !=null) {
                /*guardamos el archivo y le damos el formato directamente,
                 * si queremos que se guarde en formato doc lo definimos como .doc*/
                 FileWriter  save=new FileWriter(guarda);
                 
                 save.write(NumeroLetras.getText() + "\n" + numPalabras + "\n" + encriptadas + "\n" + TextClave.getText() + "\n" + diccionario + "\n" + "*" + "\n");
                 save.close();
                 JOptionPane.showMessageDialog(null,
                      "El archivo se a guardado Exitosamente",
                          "Información",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(IOException ex) {
            
            guardarArchivoComo();
        }
    }
    
    private void comprobarGuardado() {
           
        String texto3="";
        String encriptadas = null;
                 for(int i=0;i<Pencriptadas.size();i++){
                    String texto = Pencriptadas.getElementAt(i).toString();
                    if(i==0){
                        encriptadas = texto;
                    }else{
                        encriptadas = encriptadas+ "\n"+ texto;
                    }
                    
                 }
                 String diccionario = null;
                 for(int i=0;i<Pdiccionario.size();i++){
                    String texto2 = Pdiccionario.getElementAt(i).toString();
                    if(i==0){
                        diccionario = texto2;
                    }else{
                        diccionario = diccionario +"\n" + texto2;
                    }
                    
                 }
        String textoGuardar = NumeroLetras.getText() + "\n" + numPalabras + "\n" + encriptadas + "\n" + TextClave.getText() + "\n" + diccionario + "\n" + "*" + "\n";
        try {
            
                FileReader archivos=new FileReader(getTitle());
                BufferedReader lee=new BufferedReader(archivos); 
                String aux="";
                while((aux=lee.readLine())!=null) {
                   
                     texto3+= aux+ "\n";
                
                
            }    lee.close();
                if(texto3.equals(textoGuardar)) {
                  
               
                    System.exit(0);
                }else {
                    throw new IOException();
                }
        } catch(IOException ex) {
            int confirmado = JOptionPane.showConfirmDialog(Salir,"Quieres guardar antes de salir");

                if (JOptionPane.OK_OPTION == confirmado){
                    guardarArchivo();
                    System.exit(0);
                }else if(JOptionPane.CANCEL_OPTION == confirmado) {
                    
                }else {
                    System.exit(0);
                }
        }
       
    }

    public static void main(String args[]) {
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AnadirPalabraDiccionario;
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenu Ayuda;
    private javax.swing.JMenuItem AñadirPalabra;
    private javax.swing.JButton BorrarDiccionario;
    private javax.swing.JButton BorrarEncriptadas;
    private javax.swing.JMenuItem Cargar;
    private javax.swing.JMenuItem Deshacer;
    private javax.swing.JMenu Editar;
    private javax.swing.JButton EditarPalabraDiccionario;
    private javax.swing.JButton EditarPalabraEncriptadas;
    private javax.swing.JMenuItem Guia;
    private javax.swing.JMenuItem Nuevo;
    private javax.swing.JTextField NumeroLetras;
    private javax.swing.JList PalabrasDiccionario;
    private javax.swing.JList PalabrasEncriptadas;
    private javax.swing.JMenuItem Rehacer;
    private javax.swing.JMenu Resolver;
    private javax.swing.JMenuItem ResolverAutomaticamente;
    private javax.swing.JMenuItem ResolverManualmente;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem Salvar;
    private javax.swing.JMenuItem SalvarComo;
    private javax.swing.JTextField TextClave;
    private javax.swing.JTextField editarEncriptadas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    
}

class Banda{
    private int id; //1
    private String nombre;
 
    public Banda(String nombre, int id){ //2
        this.id=id;
        this.nombre=nombre;
    }
 
    public int getId(){ //3
        return id;
    }
 
    @Override
    public String toString(){ //4
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

class Guia extends javax.swing.JDialog {


    public Guia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Guia");
        jEditorPane1.setContentType("text/rtf");
        jEditorPane1.setEditable(false);
        // Un texto en RTF
        jEditorPane1.setText(
           "{\\rtf1" + 
           "{\\colortbl ;\\red255\\green0\\blue0;}" +
           "- Para crear un nuevo criptojuego hay que ir al menu \\b Archivo->Nuevo\\b0  y aparecera un dialogo"
           + " para introducir el numero de letras y la palabras clave. Se le da aceptar y se creara el criptojuego.\\par\\par "
           + "- Para añadir palabras desencriptadas hay que ir al menu  \\b Editar -> anadir Palabra Encriptada\\b0  y apareceera "
           + "un dialogo para introducir la palabra encriptada, y esta debe terminar en cero.\\par\\par "
           + "- Para introducir una palabra al diccionario hay que ir al menu  \\b Editar -> anadir Palabra Diccionario\\b0  "
           + "y aparecera un dialogo para anadir la palabra al diccionario, se introduce y se le da al boton \\b anadir\\b0  .\\par\\par "
           + "- Para cargar un criptojuego basta con ir al menu \\b Archivo -> Cargar\\b0  y elegir el archivo correspondiente.\\par\\par " 
           + "- Para borrar una palabra tanto del diccionario como de la palabras encriptadas hay que hacer clic sobre la palabra y darle al boton \\b Seleccionar\\b0" 
           + "  situado debajo de la lista, bien sea del diccionario o de las palbras encriptadas y luego darle al boton \\b Borrar\\b0  .\\par\\par "
           + "- Para editar una palabra, repetimos los pasos anteriores pero en vez de darle al boton de Borrar, saldra en el cuadro de texto situado al lado del boton editar la palabra selecionada."
           + " Modificamos la palabra y le damos al boton \\b Editar\\b0  y la palabra ya quedara editada.\\par\\par "        
           + "- Para resolver el criptojuego hay dos formas de hacerlo:\\par\\par "
           +   "  1.Resolver manualmente el criptojuego. Para ello hay que ir al menu \\b Resolver -> Resolver\\b0  y aparecera un dialogo en el que se debe introducir "
           + "la letra al lado del de su correspondiente numero en el area de texto llamado Corresponcencias y darle al boton anadir corresponcencia y se iran cmabiando "
           + "en la columna de palabra desencriptadas los numero por sus correspondientes letras. Si se le da al boron Salir, se volvera al ventana de edicion.\\par\\par "
           +"  2.Resolver automaticamente el criptojuego. Para ello hay que ir al menu \\b Resolver -> Resolver Automaticamente\\b0  y aparecera un dialogo con el criptojuego ya resuleto,"
           +" se le da al Boton Salir y volvera a la venta de editar.\\par\\par "
           + "- Para guardar se puede dar al menu \\b Archivo -> Salvar\\b0  o \\b Archivo -> Salvar como\\b0  , si se le da a \\b Archivo -> Salvar\\b0 , si el archivo no "
           + "habia sido guardado previamente sera como si le pulsaramos Salvar Como.\\par\\par "
   
           + "- Para cerrar el programa se va el menu \\b Archivo -> Salir\\b0  y se cerrara la aplicacion."
           + "}");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.dispose();
    }                                        

    public static void main(String args[]) {
       
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Guia dialog = new Guia(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
