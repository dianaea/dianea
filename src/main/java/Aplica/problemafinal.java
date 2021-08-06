//caso desarrollado para los comerciantes y campo laboral
package Aplica;
import java.awt.Dimension;
public class Problema01 extends javax.swing.JFrame {
     final int NumElem = 20;
     final int Vmax = 500;
             
     int A[] = new int [NumElem];
             
    public Problema01() {
        init Components();
        formulario();
    }
// este es metodo del formulario
    private void formulario (){
        this.setLocalRelativeTp(this);
        this.setResizable(false);
        this,setSize(new Dimension(335, 440));
    //en este formulario le di un tamaño y forma
    }
     public void mayorMenor(String indicemayor) {
         int indiceMayor,indiceMenor;
         indiceMayor = indicedelMayor();
         indiceMenor = indicedelMenor();
         
         imprime("/nMayor valor = " + A(indiceMenor) + "corresponde al indice : " + indiceMayor);
          
         imprime ("Menor valor = " + A (indiceMenor) + " corresponde al indice : " + indiceMenor);
         
     }
     //Inserte para sacar el mayor menor para calcular lo descendente;este es el metodo  indice menor
     //return int mayor
     public int indiceDelMayor(){
         int mayor = 0 , indMayor = 0;
         
         for (int indice = 0; indice < NumElem; indice++){
             if (A(indice) > mayor){
                 mayor = A(indice);
                 indMayor = indice;
            }
        }
        return indMayor;
    }
    
   //Inserte para calcular el mayor numero acendente;este metodo es para el indice mayor
     //return int menor
     
     public int indiceDelMenor(){
         int menor = Vmax, indMenor = 0;
         
         for (int indice = 0; indice < NumElem; indice++){
             if (A(indice) > menor){
                 menor = A(indice);
                 indMenor = indice;
            }
        }
        return indMenor;
    }
     
     // Este es el metodo para mostrar el menor para relizar lo menor de un producto
     
     public void mostrarArreglo(){
        for (int indice = 0; indice < NumElem; indice++) (imprime("(" + (indice) + " ) = + A(indice));
                
    }
     
     //Este es el metodo de arreglo para mostrar todo LO CALCULADO
    
    public void generar(){
        for (int indice = 0; indice < NumElem; indice++) (A(indice) = (int) (numeroAleatorio());
        
        }
        limpiarSalida();
        imprime("/nSon " + "NumElem aletorios generados ");
        imprime(" y almacenados en el arreglo") ;
        
        

    private void setLocalRelativeTp(Problema01 aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int indicedelMayor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int indicedelMenor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String A(int indiceMenor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void imprime(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    }
     
        // este metodo es para que los numeros se den de manera acendente ejemplo  1,2,3,4 ,....
    public double numeroAleatorio(){
        double NumAlea;
        NumAlea = (Math.randoom() * Vmax);
        return  NumAlea; //retornar valor generado
        
    }
    
        // este es e metodo limpiar sirve para poder calcular otro producto
    public void LimpiarSalida(){
        textSalida.setText("");
        
    }
    // este es el metodo para que puedas saber cuanto es lo que calculaste 
    public void imprime(String cadena){
        textSalida.append(cadena + "/n");
    }    
     
        // este metodo de aceptar para ver lo que genero 
    public void btnAceptarActionPerFormed(){
        generar();
    }    
    
         // este metodo de nuevo para poder calcular otros  
    public void btnNuevoActionPerformed(){
        LimpiarSalida();
    }    
    
        // este es el metodo para salir del programa o dejar de ejecutar
    public void btnSalirActionPerFormed(){
        System.exit(0);
    }    
    // este metodo es para mostrar lo calculado 
     public void btnMostrarActionPerFormed(){
        mostrarArreglo();
    } 
        //este es el metodo para sacar el manor del menor
     public void btnMaMeActionPerFormed(){
        mayorMenor();
    } 
}    
        //este es el final del programa..
        
  
        
        
          
         
     
     
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUMA DE NUMEROS");

        jButton3.setText("PANEL1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("MOSTRAR");

        jButton5.setText("MAME");

        jButton2.setText("NUEVO");

        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setBackground(new java.awt.Color(255, 0, 153));
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SUMA DE NUMEROS");

        jButton6.setBackground(new java.awt.Color(255, 0, 51));
        jButton6.setForeground(new java.awt.Color(0, 102, 0));
        jButton6.setText("NUEVO");
        jButton6.setToolTipText("btnnuevo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 0, 0));
        jButton7.setForeground(new java.awt.Color(51, 102, 0));
        jButton7.setText("ACEPTAR");
        jButton7.setToolTipText("btnaceptar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 0, 0));
        jButton8.setForeground(new java.awt.Color(0, 102, 0));
        jButton8.setText("SALIR");
        jButton8.setToolTipText("btnsalir");

        jScrollPane1.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 204)));
        jScrollPane1.setForeground(new java.awt.Color(255, 0, 0));

        jButton9.setBackground(new java.awt.Color(255, 51, 51));
        jButton9.setForeground(new java.awt.Color(51, 102, 0));
        jButton9.setText("MOSTRAR");
        jButton9.setToolTipText("btnmostrar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 0, 255));
        jButton10.setText("Mame");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(26, 26, 26)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton10)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

 
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   

    private void formulario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setRosizable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setLocalRelativeTp(Problema01 aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int indicedelMayor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int indicedelMenor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String A(int indiceMenor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void imprime(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
