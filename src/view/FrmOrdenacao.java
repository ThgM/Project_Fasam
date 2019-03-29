/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class FrmOrdenacao extends javax.swing.JFrame {
    
    public FrmOrdenacao() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEscolhaArquivo = new javax.swing.JButton();
        txtNomeArquivo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSelectionSort = new javax.swing.JButton();
        btnBubbleSort = new javax.swing.JButton();
        btnInsertionSort = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnMargeSort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 410));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 410));

        jPanel1.setBackground(new java.awt.Color(27, 187, 125));

        jLabel1.setFont(new java.awt.Font("DokChampa", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ordenador de Dicionários");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnEscolhaArquivo.setBackground(new java.awt.Color(56, 65, 84));
        btnEscolhaArquivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEscolhaArquivo.setForeground(new java.awt.Color(255, 255, 255));
        btnEscolhaArquivo.setText("Carregar Arquivo");
        btnEscolhaArquivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEscolhaArquivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEscolhaArquivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEscolhaArquivoMouseExited(evt);
            }
        });
        btnEscolhaArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscolhaArquivoActionPerformed(evt);
            }
        });

        txtNomeArquivo.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(91, 95, 99));
        jLabel3.setText("Ordenações");

        btnSelectionSort.setBackground(new java.awt.Color(56, 65, 84));
        btnSelectionSort.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSelectionSort.setForeground(new java.awt.Color(255, 255, 255));
        btnSelectionSort.setText("SelectionSort");
        btnSelectionSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelectionSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSelectionSortMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSelectionSortMouseExited(evt);
            }
        });
        btnSelectionSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectionSortActionPerformed(evt);
            }
        });

        btnBubbleSort.setBackground(new java.awt.Color(56, 65, 84));
        btnBubbleSort.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBubbleSort.setForeground(new java.awt.Color(255, 255, 255));
        btnBubbleSort.setText("BubbleSort");
        btnBubbleSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBubbleSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBubbleSortMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBubbleSortMouseExited(evt);
            }
        });
        btnBubbleSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBubbleSortActionPerformed(evt);
            }
        });

        btnInsertionSort.setBackground(new java.awt.Color(56, 65, 84));
        btnInsertionSort.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInsertionSort.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertionSort.setText("InsertionSort");
        btnInsertionSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertionSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInsertionSortMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInsertionSortMouseExited(evt);
            }
        });
        btnInsertionSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertionSortActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(56, 65, 84));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSairMouseExited(evt);
            }
        });
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(91, 95, 99));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Carregue um Arquivo TXT");

        btnMargeSort.setBackground(new java.awt.Color(56, 65, 84));
        btnMargeSort.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMargeSort.setForeground(new java.awt.Color(255, 255, 255));
        btnMargeSort.setText("MergeSort");
        btnMargeSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMargeSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMargeSortMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMargeSortMouseExited(evt);
            }
        });
        btnMargeSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMargeSortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(txtNomeArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMargeSort, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertionSort, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBubbleSort, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectionSort, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnEscolhaArquivo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(66, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(63, 63, 63)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(txtNomeArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEscolhaArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelectionSort, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBubbleSort, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInsertionSort, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMargeSort, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(348, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEscolhaArquivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEscolhaArquivoMouseEntered
        btnEscolhaArquivo.setBackground(new Color(235,235,235));
        btnEscolhaArquivo.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_btnEscolhaArquivoMouseEntered

    private void btnEscolhaArquivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEscolhaArquivoMouseExited
        btnEscolhaArquivo.setBackground(new Color(58,65,84));
        btnEscolhaArquivo.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnEscolhaArquivoMouseExited

    private void btnSelectionSortMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectionSortMouseEntered
        btnSelectionSort.setBackground(new Color(235,235,235));
        btnSelectionSort.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_btnSelectionSortMouseEntered

    private void btnSelectionSortMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectionSortMouseExited
        btnSelectionSort.setBackground(new Color(58,65,84));
        btnSelectionSort.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnSelectionSortMouseExited

    private void btnBubbleSortMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBubbleSortMouseEntered
        btnBubbleSort.setBackground(new Color(235,235,235));
        btnBubbleSort.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_btnBubbleSortMouseEntered

    private void btnBubbleSortMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBubbleSortMouseExited
        btnBubbleSort.setBackground(new Color(58,65,84));
        btnBubbleSort.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnBubbleSortMouseExited

    private void btnInsertionSortMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertionSortMouseEntered
        btnInsertionSort.setBackground(new Color(235,235,235));
        btnInsertionSort.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_btnInsertionSortMouseEntered

    private void btnInsertionSortMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertionSortMouseExited
        btnInsertionSort.setBackground(new Color(58,65,84));
        btnInsertionSort.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnInsertionSortMouseExited

    
    
    
    
    
    
    
    
    //Action do botão SelectionSort
    private void btnSelectionSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectionSortActionPerformed
        //A linha abaixo carrega o arquivo txt e coloca no vetor
        String[] vetor = Arquivo.lerArquivo(txtNomeArquivo.getText());
        
        long tempoInicial = System.currentTimeMillis();
        //Chama o método de ordenação do vetor de String;
        String[] vetorOrdenado = Ordenacao.selectionSort(vetor);
        long tempoFinal = System.currentTimeMillis();
        tempoFinal = tempoFinal - tempoInicial;
        
        //Gera um arquivo ordenado
        String caminhoNovoArquivo = Arquivo.geraArquivo(vetorOrdenado);
        txtNomeArquivo.setText(caminhoNovoArquivo);
        
        //Exibe painel com tempo gasto para ordenação 
        JOptionPane.showMessageDialog(null, "A Ordenação através do SelectionSort teve a duração de " + tempoFinal + " ms");
    }//GEN-LAST:event_btnSelectionSortActionPerformed
    
    
    
    
    
    //Action do botão de escolha de arquivo
    private void btnEscolhaArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscolhaArquivoActionPerformed
        JFileChooser fc = new JFileChooser();
        File arquivo = null;
        int value = fc.showOpenDialog(null);
        if ( value == JFileChooser.APPROVE_OPTION ){
            arquivo = fc.getSelectedFile();
            txtNomeArquivo.setText(arquivo.toString());
        }
    }//GEN-LAST:event_btnEscolhaArquivoActionPerformed
    
    
    
    
    
    //Action do botão BubbleSort
    private void btnBubbleSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBubbleSortActionPerformed
        //A linha abaixo carrega o arquivo txt e coloca no vetor
        String[] vetor = Arquivo.lerArquivo(txtNomeArquivo.getText());
        
        long tempoInicial = System.currentTimeMillis();
        //Chama o método de ordenação do vetor de String;
        String[] vetorOrdenado = Ordenacao.bubbleSort(vetor);
        long tempoFinal = System.currentTimeMillis();
        tempoFinal = tempoFinal - tempoInicial;
        
        //Gera um arquivo ordenado
        String caminhoNovoArquivo = Arquivo.geraArquivo(vetor);
        txtNomeArquivo.setText(caminhoNovoArquivo);
        
        //Exibe painel com tempo gasto para ordenação 
        JOptionPane.showMessageDialog(null, "A Ordenação através do BubbleSort teve a duração de " + tempoFinal + " ms"); 
    }//GEN-LAST:event_btnBubbleSortActionPerformed
    
    
    
    
    //Action do botão InsertionSort
    private void btnInsertionSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertionSortActionPerformed
        //A linha abaixo carrega o arquivo txt e coloca no vetor
        String[] vetor = Arquivo.lerArquivo(txtNomeArquivo.getText());
        
        long tempoInicial = System.currentTimeMillis();
        //Chama o método de ordenação do vetor de String;
        String[] vetorOrdenado = Ordenacao.insertionSort(vetor);
        long tempoFinal = System.currentTimeMillis();
        tempoFinal = tempoFinal - tempoInicial;
        
        //Gera um arquivo ordenado
        String caminhoNovoArquivo = Arquivo.geraArquivo(vetorOrdenado);
        txtNomeArquivo.setText(caminhoNovoArquivo);
        
        //Exibe painel com tempo gasto para ordenação 
        JOptionPane.showMessageDialog(null, "A Ordenação através do InsertionSort teve a duração de " + tempoFinal + " ms");            
    }//GEN-LAST:event_btnInsertionSortActionPerformed

    
    
    
    
    
    
    
    
    
    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        btnSair.setBackground(new Color(167, 19, 20, 255));
        btnSair.setForeground(Color.WHITE);        
    }//GEN-LAST:event_btnSairMouseEntered
    
    private void btnSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseExited
        btnSair.setBackground(new Color(58,65,84));
        btnSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnSairMouseExited
    
    
    //Action do botão Sair
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnMargeSortMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMargeSortMouseEntered
        btnMargeSort.setBackground(new Color(235,235,235));
        btnMargeSort.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_btnMargeSortMouseEntered

    private void btnMargeSortMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMargeSortMouseExited
        btnMargeSort.setBackground(new Color(58,65,84));
        btnMargeSort.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnMargeSortMouseExited

    private void btnMargeSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMargeSortActionPerformed
        //A linha abaixo carrega o arquivo txt e coloca no vetor
        String[] vetor = Arquivo.lerArquivo(txtNomeArquivo.getText());
        
        long tempoInicial = System.currentTimeMillis();
        //Chama o método de ordenação do vetor de String;
        String[] vetorOrdenado = Ordenacao.mergeSort(vetor, 0 ,vetor.length - 1);
        long tempoFinal = System.currentTimeMillis();
        tempoFinal = tempoFinal - tempoInicial;
        
        //Gera um arquivo ordenado
        String caminhoNovoArquivo = Arquivo.geraArquivo(vetor);
        txtNomeArquivo.setText(caminhoNovoArquivo);
        
        //Exibe painel com tempo gasto para ordenação 
        JOptionPane.showMessageDialog(null, "A Ordenação através do MargeSort teve a duração de " + tempoFinal + " ms");
    }//GEN-LAST:event_btnMargeSortActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmOrdenacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOrdenacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOrdenacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOrdenacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOrdenacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBubbleSort;
    private javax.swing.JButton btnEscolhaArquivo;
    private javax.swing.JButton btnInsertionSort;
    private javax.swing.JButton btnMargeSort;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSelectionSort;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtNomeArquivo;
    // End of variables declaration//GEN-END:variables
}
