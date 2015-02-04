
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macmini
 */
public class Resolver extends javax.swing.JDialog {
    private static ArrayList <ArrayList <String>> palabrasDecodificadas = new ArrayList <ArrayList <String>>();
    private static ArrayList <String> palabras = new ArrayList <String>();
    private static ArrayList <String> diccionario = new ArrayList <String>();
    private static ArrayList <String> palabrasSinModificar = new ArrayList <String>();
    private static int numLetras = 0;
    private static int letras = 0;
    private static HashMap <String, Integer> correspondencias = new HashMap < String,Integer>();
    
    /**
     * Creates new form ResolverAuto
     */
    public Resolver(java.awt.Frame parent, boolean modal,ArrayList<String> e,int letras,String clave,ArrayList<String> diccionario) {
        
        super(parent, modal);
       
        initComponents();
        setLocationRelativeTo(null);
        this.diccionario = diccionario;
        palabras = e;
        decodificarPalabras(e);
        if(!e.isEmpty()) {
           MostrarDiccionario(); 
           MostrarDesencriptadas();
        }
        numLetras = letras;
        mostarNumeros();
        TextoClave.setText(clave);
        TextoClave.setEditable(false);
        
        listaDesencriptadas.setEditable(false);
        jTextArea1.setEditable(false);
        Diccionario.setEditable(false);
    }
    
    public Resolver(java.awt.Frame parent, boolean modal,ArrayList<String> e,ArrayList<String> diccionario,int letras,String clave) {
        
        super(parent, modal);
       
        initComponents();
        setLocationRelativeTo(null);
       
        this.palabras = e;
       
        Criptojuego juego = new Criptojuego(e, diccionario, clave,letras);
        
        juego.pedirTest();
        juego.decodificarPalabras();
        juego.resolverCorrespondencias();
        MostrarCorrespondencias(juego.imprimirCorrespondencias());
        this.letras = letras;
        this.palabrasSinModificar=e;
        
        this.diccionario = diccionario;
        palabrasDecodificadas.clear();
        decodificarPalabras(palabras);
        
        mirarCorrespondencias();
        if(!e.isEmpty()) {
            
           MostrarDiccionario(); 
           MostrarDesencriptadas();
        }
        TextoClave.setText(clave);
        jButton1.setVisible(false);
        solucion.setText(juego.imprimirCorrespondencias());
        listaCorresponodencias.setEditable(false);
        listaDesencriptadas.setEditable(false);
        jTextArea1.setEditable(false);
        Diccionario.setEditable(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaCorresponodencias = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Diccionario = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaDesencriptadas = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        solucion = new javax.swing.JTextField();
        TextoClave = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        listaCorresponodencias.setColumns(20);
        listaCorresponodencias.setRows(5);
        jScrollPane2.setViewportView(listaCorresponodencias);

        Diccionario.setColumns(20);
        Diccionario.setRows(5);
        jScrollPane3.setViewportView(Diccionario);

        jLabel2.setText("Diccionario");

        jLabel3.setText("Correspondencias");

        jButton1.setText("Añadir correspondencias");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        listaDesencriptadas.setColumns(20);
        listaDesencriptadas.setRows(5);
        jScrollPane4.setViewportView(listaDesencriptadas);

        jLabel1.setText("Palabras Desencriptadas");

        jLabel4.setText("PALABRA SOLUCION");

        solucion.setEditable(false);
        solucion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TextoClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoClaveActionPerformed(evt);
            }
        });

        jLabel5.setText("CLAVE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel3)
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salir)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(TextoClave)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(solucion, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(73, 73, 73)))
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(solucion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(salir))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mirarCorrespondencias();
        MostrarDesencriptadas();
        if(comprobar()) {
            solucion.setText(MostrarPalabraSolucion());
            jButton1.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void TextoClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoClaveActionPerformed

        Resolver m;
        m = new Resolver(new VentanaPrincipal(), true, palabrasSinModificar, diccionario, letras, TextoClave.getText());
        m.setVisible(true); 
        this.dispose();
        
    }//GEN-LAST:event_TextoClaveActionPerformed
    
    
    public void limpiar() {
        palabrasDecodificadas.clear();
        correspondencias.clear();
        palabras.clear();
        numLetras = 0;
        Diccionario.setText("");
        listaDesencriptadas.setText("");
        solucion.setText("");
        listaCorresponodencias.setText("");
    }
    
    public static boolean comprobar() {
        int contador = 0;
        Iterator it = correspondencias.keySet().iterator();

        while(it.hasNext()){
            String key = (String) it.next();

            if(correspondencias.get(key)!=0) {
                contador++;
            }
        }

        return contador == numLetras;
    }
    
    public void mirarCorrespondencias() {
        
        for(String s : listaCorresponodencias.getText().split("\n")) {
          
            String [] array = new String[2];
            array = s.split("=");
            
            if(!array[1].equals(" ")) {
                anyadirCorrespondencias(array[0], array[1].trim());
            }
            
        }
    }
    
    public void anyadirCorrespondencias(String numero, String letra) {
        for(ArrayList <String> enteros1 : palabrasDecodificadas ) {
            
            for(int i=0;i<enteros1.size(); i++) {
                if(enteros1.get(i).equals(numero)) {
                    enteros1.remove(numero);
                    enteros1.add(i,letra);
                    correspondencias.put(letra,Integer.parseInt(numero));
                }
            }
            
        }
    }
    
    public void mostarNumeros() {
        for(int i=1; i<=numLetras; i++) {
            if(i !=numLetras) {
              listaCorresponodencias.append(i + "= " + "\n");  
            } else {
                listaCorresponodencias.append(i + "= " );
            }
            
            
        }
        
    }
    public void MostrarDiccionario() {
        
        for(String s : diccionario) {
            
                if(!Diccionario.getText().equals("")) {
                    Diccionario.append("\n");
   
                }
     
                Diccionario.append(s);
        }
    }
    
    public String MostrarPalabraSolucion() {
        String result = "";
        ArrayList<String> a = new ArrayList<String>();

        Iterator it = correspondencias.keySet().iterator();

        for(int i=0; i<correspondencias.size(); i++){
                a.add(i,"%");
        }
        while(it.hasNext()){
            String key = (String) it.next();

            if(correspondencias.get(key)!=0) {
                a.remove((int)correspondencias.get(key)-1);
                a.add((int)correspondencias.get(key)-1,key);
            }
        }

        for(int j=0; j<a.size(); j++){
            if(!a.get(j).equals("%")){
                    result+=a.get(j);
            }
        }

        return result;
    }
    public void MostrarDesencriptadas() {
        listaDesencriptadas.setText("");
        for(ArrayList <String> enteros1 : palabrasDecodificadas ) {
            for(int i=0;i<enteros1.size(); i++) {
                if(i != enteros1.size()-1) {
                    listaDesencriptadas.append(enteros1.get(i) + "");
                }else {
                    listaDesencriptadas.append(enteros1.get(i) + "\n");
                }
   
            }
            
        }
    }
    
    public void MostrarCorrespondencias(String s) {
        for(int i=0; i<s.length(); i++) {
            if(!listaCorresponodencias.getText().equals("")){
                listaCorresponodencias.append("\n");
            }
            listaCorresponodencias.append(i+1 + "= " + s.charAt(i));
        }
    }
    
    public static void decodificarPalabras(ArrayList<String> palabras) {
        for (int i=0; i<palabras.size(); i++) {
            ArrayList <String> a = new ArrayList <String>();
            for(String s : palabras.get(i).split(" ")) {
                    if(!s.equals("0")) {
                            a.add(s);
                    }
            }
            palabrasDecodificadas.add(a);

        }

	}
    
    public static void main(String args[]) {
       

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Resolver dialog = new Resolver(new javax.swing.JFrame(), true,null,0,null,null);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Diccionario;
    private javax.swing.JTextField TextoClave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea listaCorresponodencias;
    private javax.swing.JTextArea listaDesencriptadas;
    private javax.swing.JButton salir;
    private javax.swing.JTextField solucion;
    // End of variables declaration//GEN-END:variables
}
