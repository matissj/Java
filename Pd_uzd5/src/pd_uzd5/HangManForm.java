/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd_uzd5;

import java.util.Random;


/**
 *
 * @author Matiss-Study
 */
public class HangManForm extends javax.swing.JFrame {
    Random rand = new Random();
    //String vardi[] = {"lapa", "galds", "tanks", "arkls", "zemene", "liepa", "ozols", "seja", "viela", "riepa"};
    String[] vardi = new String[] {"lapa", "galds" }; //"tanks", "arkls", "zemene", "liepa", "ozols", "seja", "viela", "riepa"};
    //char minamaisVards[];
        //char uzminetaisVards[];
    /**
     * Creates new form HangManForm
     */
        int burtuDaudz;// = vardi.length;
        String vards;// = vardi[rand.nextInt(burtuDaudz)];
        
        char[] minamaisVards;// = new char[vards.length()];
        char[] uzminetaisVards;// = new char[vards.length()];
        
        int meginajumi;
        char minejums;
        int letterCount;// = vards.length();
      
        
    public HangManForm() {
        initComponents();
        
        information.setVisible(true);
        meginajumi = 0;
        burtuDaudz = vardi.length;
        vards = vardi[rand.nextInt(burtuDaudz)];
        
        minamaisVards = new char[vards.length()];
        uzminetaisVards = new char[vards.length()];
        
        int i = 0;
        for(char b : minamaisVards){ //aizpilda masivu ar burtiem
            minamaisVards[i] = b;
            word.setText(String.valueOf(uzminetaisVards)); // jauns masivs tikai ar zvaigznitem
            i++; // 
        }
        
        i=0;
        for(char b : minamaisVards){ //aizpild amasivu ar zvaigznitem
            uzminetaisVards[i] = ('*');
            i++;       
        }
        
        word.setText(String.valueOf(uzminetaisVards)); // jauns masivs tikai ar zvaigznitem
        information.setText(String.valueOf(minamaisVards)); // jauns masivs tikai ar zvaigznitem

        
        
        }
       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        guess = new javax.swing.JTextField();
        word = new javax.swing.JLabel();
        guessLeft = new javax.swing.JLabel();
        information = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        newGame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GUESS THE WORD");

        jLabel2.setText("Write a letter to guess: ");

        word.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        word.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word.setText("jLabel3");

        guessLeft.setText("Guesses left: ");

        information.setText("jLabel3");

        ok.setText("guess");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        newGame.setText("new game");
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(guessLeft)
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(word, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(guess, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ok))
                            .addComponent(newGame, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(512, 512, 512)
                        .addComponent(information)))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(guess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ok)))
                        .addGap(31, 31, 31)
                        .addComponent(word, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(guessLeft))
                .addGap(50, 50, 50)
                .addComponent(information)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(newGame, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        
        if(meginajumi < 10){
        minejums = guess.getText().charAt(0);
        
        boolean burtsIrAtrasts = false;
        int i=0;
        for(char b : minamaisVards){
            if(b == minejums){
                uzminetaisVards[i] = b;
                
                burtsIrAtrasts = true;
                
                for(char c : uzminetaisVards){
                    word.setText(String.valueOf(uzminetaisVards));
                }
                
            }
            i++;
        }
        if(burtsIrAtrasts = false){
            meginajumi++;
            information.setText("BURTS" + minejums + "nav atrasts");
            information.setVisible(true);
        }
        
        else if(meginajumi >= 10){
            information.setText("You Lose - Jusu dzīvības ir beigušās");
        }
        guess.setText("");
}
    }//GEN-LAST:event_okActionPerformed

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed
        
        
        
    }//GEN-LAST:event_newGameActionPerformed

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
            java.util.logging.Logger.getLogger(HangManForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HangManForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HangManForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HangManForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HangManForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField guess;
    private javax.swing.JLabel guessLeft;
    private javax.swing.JLabel information;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newGame;
    private javax.swing.JButton ok;
    private javax.swing.JLabel word;
    // End of variables declaration//GEN-END:variables
}