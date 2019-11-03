package projeto_concorrente;

import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author genilton
 */
public class Panel extends javax.swing.JFrame {

    private Numbers numbers;
    Numbers sortNumbers;

    public Panel() {
        initComponents();
        setLocationRelativeTo(null);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        Table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        TableSort.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableSort = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        time2 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        max = new javax.swing.JTextField();
        random = new javax.swing.JButton();
        sortS = new javax.swing.JButton();
        sortT = new javax.swing.JButton();

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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] { },
            new String [] {
                "Numeros"
            }
        ));
        jScrollPane1.setViewportView(Table);

        TableSort.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] { },
            new String [] {
                "Numeros Ordenados"
            }
        ));
        jScrollPane3.setViewportView(TableSort);

        jLabel4.setText("=>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        time2.setText("Tempo Concorrente:");

        time1.setText("Tempo Sequencial:");

        jLabel1.setText("Quantidade:");

        random.setText("Gerar");
        random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomActionPerformed(evt);
            }
        });

        sortS.setText("Ordena Sequencial");
        sortS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortSActionPerformed(evt);
            }
        });

        sortT.setText("Ordena Thread");
        sortT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(max, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(random))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(sortS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(time1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(sortT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(time2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(random))
                .addGap(50, 50, 50)
                .addComponent(sortS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(time1)
                .addGap(38, 38, 38)
                .addComponent(sortT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(time2)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomActionPerformed
        this.numbers = null;
        this.numbers = new Numbers(Convert.converteInt(this.max.getText()));
        this.numbers.random();
        this.refresh();
    }//GEN-LAST:event_randomActionPerformed

    private void sortSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortSActionPerformed
        this.sortNumbers = null;
        this.sortNumbers = new Numbers(this.numbers);
        this.time1.setText("Tempo Sequencial: " + this.sortNumbers.insertionSort() + "ms");
        this.refresh();
    }//GEN-LAST:event_sortSActionPerformed

    private void sortTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortTActionPerformed
        this.sortNumbers = null;
        this.sortNumbers = new Numbers(this.numbers);
        
        int qtdThreads = Convert.converteInt(JOptionPane.showInputDialog("Quantas Threads?"));
        
        Thread[] threads = new Thread[qtdThreads];
        int fist = 0;
        int last = (this.sortNumbers.getMax()-1)/qtdThreads;
                      
        System.out.println("Inicio: " + Arrays.toString(this.sortNumbers.getVector()));
        //Inicio
        double startTime = System.currentTimeMillis();
        for(int i = 0; i < qtdThreads; i++){
            threads[i] = new Thread(new Numbers( fist, last, this.sortNumbers.getVector()));
            threads[i].start();
            fist = last + 1;
            last += (this.sortNumbers.getMax()/qtdThreads);
        }
        for(int i = 0; i < qtdThreads; i++){
            try {
                threads[i].join();
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
        }       
        new Numbers( 0, this.sortNumbers.getMax()-1, this.sortNumbers.getVector()).insertionSortThread();
        double endTime = System.currentTimeMillis();
        //Fim

        System.out.println("Fim: " + Arrays.toString(this.sortNumbers.getVector()));
        this.time2.setText("Tempo Concorrente: " + (endTime-startTime) + "ms");
        this.refresh();
    }//GEN-LAST:event_sortTActionPerformed

    private void refresh() {
        DefaultTableModel table = (DefaultTableModel) this.Table.getModel();
        table.setNumRows(0);
        String[] str = new String[1];
        for (int i : this.numbers.getVector()) {
            str[0] = " " + i + " ";
            table.addRow(str);
        }
        if (this.sortNumbers == null) {
            return;
        }
        table = (DefaultTableModel) this.TableSort.getModel();
        table.setNumRows(0);
        str = new String[1];
        for (int i : this.sortNumbers.getVector()) {
            str[0] = " " + i + " ";
            table.addRow(str);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Panel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JTable TableSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField max;
    private javax.swing.JButton random;
    private javax.swing.JButton sortS;
    private javax.swing.JButton sortT;
    private javax.swing.JLabel time1;
    private javax.swing.JLabel time2;
    // End of variables declaration//GEN-END:variables
}
