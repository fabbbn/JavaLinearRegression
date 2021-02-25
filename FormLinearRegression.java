/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearregression;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author nabilaf
 */
public class FormLinearRegression extends javax.swing.JFrame {

    /**
     * Creates new form FormLinearRegression
     */
    public FormLinearRegression() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jFileChooser1 = new javax.swing.JFileChooser();
        warning = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        warning_label = new javax.swing.JLabel();
        ok_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        error_msg = new javax.swing.JTextArea();
        input_panel = new javax.swing.JPanel();
        path_label = new javax.swing.JLabel();
        path_field = new javax.swing.JTextField();
        submit_path_btn = new javax.swing.JButton();
        file_btn = new javax.swing.JButton();
        path_displayer = new javax.swing.JLabel();
        lr_label = new javax.swing.JLabel();
        lr_field = new javax.swing.JTextField();
        epoch_label = new javax.swing.JLabel();
        epoch_field = new javax.swing.JTextField();
        generate_train_btn = new javax.swing.JButton();
        train_output_panel = new javax.swing.JPanel();
        train_label = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        train_output = new java.awt.TextArea();
        test_output_panel = new javax.swing.JPanel();
        test_label = new javax.swing.JLabel();
        generate_test_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        test_output = new java.awt.TextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        open_file = new javax.swing.JMenuItem();
        exit_btn = new javax.swing.JMenuItem();

        warning.setLocationByPlatform(true);
        warning.setMinimumSize(new java.awt.Dimension(300, 300));

        jPanel1.setMinimumSize(new java.awt.Dimension(300, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 300));

        warning_label.setText("Warning");

        ok_btn.setText("OK");
        ok_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_btnActionPerformed(evt);
            }
        });

        error_msg.setEditable(false);
        error_msg.setBackground(getBackground());
        error_msg.setColumns(20);
        error_msg.setRows(5);
        jScrollPane1.setViewportView(error_msg);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(warning_label)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ok_btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(warning_label)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ok_btn)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout warningLayout = new javax.swing.GroupLayout(warning.getContentPane());
        warning.getContentPane().setLayout(warningLayout);
        warningLayout.setHorizontalGroup(
            warningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        warningLayout.setVerticalGroup(
            warningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("09021281823071_Regresi-Logistik Generator");
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(640, 480));
        setPreferredSize(new java.awt.Dimension(720, 540));

        path_label.setText("Path file");

        submit_path_btn.setText("OK");
        submit_path_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_path_btnActionPerformed(evt);
            }
        });

        file_btn.setText("Choose file...");
        file_btn.setActionCommand("Choose file");
        file_btn.setMargin(new java.awt.Insets(2, 10, 2, 10));
        file_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_btnActionPerformed(evt);
            }
        });

        lr_label.setText("Learning Rate");

        epoch_label.setText("Epoch");

        generate_train_btn.setText("Train");
        generate_train_btn.setMargin(new java.awt.Insets(2, 5, 2, 5));
        generate_train_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_train_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout input_panelLayout = new javax.swing.GroupLayout(input_panel);
        input_panel.setLayout(input_panelLayout);
        input_panelLayout.setHorizontalGroup(
            input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(input_panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(path_label)
                    .addComponent(lr_label)
                    .addComponent(epoch_label))
                .addGap(27, 27, 27)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lr_field, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(input_panelLayout.createSequentialGroup()
                        .addComponent(path_field, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submit_path_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(file_btn))
                    .addComponent(epoch_field, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(input_panelLayout.createSequentialGroup()
                        .addComponent(path_displayer)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(generate_train_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        input_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {file_btn, submit_path_btn});

        input_panelLayout.setVerticalGroup(
            input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(input_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(file_btn)
                    .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(path_label)
                        .addComponent(path_field)
                        .addComponent(submit_path_btn)
                        .addComponent(path_displayer)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lr_label)
                    .addComponent(lr_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(epoch_label)
                    .addComponent(epoch_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, input_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(generate_train_btn))
        );

        input_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {file_btn, submit_path_btn});

        train_label.setText("Training");

        train_output.setBackground(getBackground());
        train_output.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        train_output.setEditable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, train_output_panel, org.jdesktop.beansbinding.ObjectProperty.create(), train_output, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(train_output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(train_output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout train_output_panelLayout = new javax.swing.GroupLayout(train_output_panel);
        train_output_panel.setLayout(train_output_panelLayout);
        train_output_panelLayout.setHorizontalGroup(
            train_output_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(train_output_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(train_output_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(train_output_panelLayout.createSequentialGroup()
                        .addComponent(train_label)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        train_output_panelLayout.setVerticalGroup(
            train_output_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(train_output_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(train_label)
                .addGap(4, 4, 4)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        test_label.setText("Testing");

        generate_test_btn.setText("Test");
        generate_test_btn.setMargin(new java.awt.Insets(2, 5, 2, 5));
        generate_test_btn.setMaximumSize(new java.awt.Dimension(155, 25));
        generate_test_btn.setMinimumSize(new java.awt.Dimension(155, 25));
        generate_test_btn.setPreferredSize(new java.awt.Dimension(155, 25));
        generate_test_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_test_btnActionPerformed(evt);
            }
        });

        test_output.setBackground(getBackground());
        test_output.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        test_output.setEditable(false);
        test_output.setMinimumSize(new java.awt.Dimension(100, 50));
        test_output.setName(""); // NOI18N
        test_output.setPreferredSize(new java.awt.Dimension(100, 75));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(test_output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(test_output, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout test_output_panelLayout = new javax.swing.GroupLayout(test_output_panel);
        test_output_panel.setLayout(test_output_panelLayout);
        test_output_panelLayout.setHorizontalGroup(
            test_output_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(test_output_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(test_output_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(test_output_panelLayout.createSequentialGroup()
                        .addComponent(test_label, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, test_output_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(generate_test_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        test_output_panelLayout.setVerticalGroup(
            test_output_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, test_output_panelLayout.createSequentialGroup()
                .addComponent(test_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generate_test_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        open_file.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open_file.setText("Buka file..");
        jMenu1.add(open_file);

        exit_btn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exit_btn.setText("Exit");
        jMenu1.add(exit_btn);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(train_output_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(test_output_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(input_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(input_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(train_output_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(test_output_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void file_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_btnActionPerformed
        int returnVal = jFileChooser1.showOpenDialog((Component)evt.getSource());
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser1.getSelectedFile();
            try {
                path = file.getAbsolutePath();
                path_displayer.setText(path);
            } catch (Exception e) {
                String msg = "Problem accessing file\n"+path+"\n"+e;
                error_msg.setText(msg);
                warning.setVisible(true);
            }
        }
        else {
            String msg = "File access cancelled by user.";
            error_msg.setText(msg);
            warning.setVisible(true);
        }
    }//GEN-LAST:event_file_btnActionPerformed

    private void submit_path_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_path_btnActionPerformed
        try {
            File file = new File(path_field.getText());
            if(file.exists()) {
                path = path_field.getText();
                path_displayer.setText(path);
            }
            else { 
                String msg = "File not exist: "+path_field.getText();
                error_msg.setText(msg);
                warning.setVisible(true);
            }
        } catch (Exception e) {
            String msg = "Problem accessing file\n"+e;
            error_msg.setText(msg);
            warning.setVisible(true);
        }
    }//GEN-LAST:event_submit_path_btnActionPerformed

    private void ok_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_btnActionPerformed
        warning.setVisible(false);
    }//GEN-LAST:event_ok_btnActionPerformed

    private void generate_train_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_train_btnActionPerformed
        try {
            train_line="";
            generateData(path);
            lr = Double.valueOf(lr_field.getText());
            epoch = Integer.valueOf(epoch_field.getText());
            p = 0;
            pembobotanBaru(x, y, b, p, lr, 0);
            train_line+="\nFinal Weight\n";
            for(int i = 0; i < b.length; i++) {
                train_line+="b"+i+" = "+" "+b[i]+"\t";
            }
            train_line+="\n";
            train_output.setText(train_line);
            
        } catch (Exception e) {
            String msg = "Problem generating data from file\n"+e;
            error_msg.setText(msg);
            warning.setVisible(true);
        }
    }//GEN-LAST:event_generate_train_btnActionPerformed

    private void generate_test_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_test_btnActionPerformed
        try {
            test_line="";
            test_line+="Generate testing...\nFinal weigth:";
            for(int i = 0; i< b.length; i++) {
                test_line+="\tb"+i+" = "+b[i];
            }
            test_line+="\n";
            hitungAkurasi(x, y, b);
            test_output.setText(test_line);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_generate_test_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static String path;
    public static double x[][];
    public static double y[];
    public static double b[];
    public static double p;
    public static double lr;
    public static int epoch;
    public static String test_line = "";
    public static String train_line = "";
    
    public static double fungsiLogistik(double[][]x, double[]b, int row) {
        // -y = -1 * (b0 + b1x1 + b2x2 + .. + bnxn)
        double temp = b[0];
        for(int j = 1; j < b.length; j++) {
            temp+=(b[j] * x[row][j-1]);
        }
        temp *= (-1);
        return (1 / (1 + Math.exp(temp)));
    }
    
    public static void pembobotanBaru(double[][]x, double[]y, double[] b, double p, double lr, int itr) {
        if(itr<epoch) {
            train_line+="Epoch "+(itr+1)+" started..\n";
            for(int i = 0; i < x.length; i++) {
                p = fungsiLogistik(x, b, i);
                train_line+="f(p) data-"+(i+1)+" = "+p+"\n";
                for(int j = 0; j < b.length; j++) {
                    if(j == 0) {
                        //x bias, x=1
                        b[j] = b[j] + (lr * (y[i] - p) * p * (1 - p) * 1);
                    }
                    else {
                        b[j] = b[j] + (lr * (y[i] - p) * p * (1 - p) * x[i][j-1]);
                    }
                }
                for(int j = 0; j < b.length; j++) {
                    train_line+="b"+j+" = "+b[j]+"\t";
                }
                train_line+="\n\n";
            }
            itr++;
            pembobotanBaru(x, y, b, p, lr, itr);
        }
    }
    
    public static void hitungAkurasi(double[][]x, double[]y, double[]b) {
        double akurasi;
        int valid=0;
        for(int i = 0; i < x.length; i++) {
            test_line+="Test data-"+(i+1)+"\n";
            double temp = fungsiLogistik(x, b, i);
            int data = (int)Math.round(temp);
            test_line+="f(p) data-"+(i+1)+" = "+temp+", rounded to "+data;
            if(data == y[i]) {
                valid++;
            }
            test_line+="\n";
        }
        akurasi = (double)valid/x.length;
        akurasi*=100;
        test_line+="\nAccuracy = "+(akurasi)+"%";
    }
    public static void generateData(String path) throws FileNotFoundException, IOException {
        BufferedReader input = new BufferedReader(new FileReader(path));
        int col = input.readLine().split(",").length;
        int row = 1; //head of the csv
        while((input.readLine()) != null) {
            row++;
        }
        //declare array for data, row of array -1 (without head)
        x = new double[row-1][col-1];
        y = new double[row-1];
        
        File file = new File(path);
        //restart the buffered reader
        input = new BufferedReader(new FileReader(file));

        for(int i = 0; i < row; i++) {
            if(i == 0) {
                String[] temp = input.readLine().split(",");
            }
            else {
                String[] temp = input.readLine().split(",");
                //slicing x and y
                for(int j = 0; j < x[0].length; j++) {
                    x[i-1][j] = Double.valueOf(temp[j]);
                }
                y[i-1] = Double.valueOf(temp[temp.length-1]);
            }
        }
        b = new double[col];
        train_line += "Data Generated from file\n";
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
            java.util.logging.Logger.getLogger(FormLinearRegression.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLinearRegression.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLinearRegression.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLinearRegression.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLinearRegression().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField epoch_field;
    private javax.swing.JLabel epoch_label;
    private javax.swing.JTextArea error_msg;
    private javax.swing.JMenuItem exit_btn;
    private javax.swing.JButton file_btn;
    private javax.swing.JButton generate_test_btn;
    private javax.swing.JButton generate_train_btn;
    private javax.swing.JPanel input_panel;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lr_field;
    private javax.swing.JLabel lr_label;
    private javax.swing.JButton ok_btn;
    private javax.swing.JMenuItem open_file;
    private javax.swing.JLabel path_displayer;
    private javax.swing.JTextField path_field;
    private javax.swing.JLabel path_label;
    private javax.swing.JButton submit_path_btn;
    private javax.swing.JLabel test_label;
    private java.awt.TextArea test_output;
    private javax.swing.JPanel test_output_panel;
    private javax.swing.JLabel train_label;
    private java.awt.TextArea train_output;
    private javax.swing.JPanel train_output_panel;
    private javax.swing.JDialog warning;
    private javax.swing.JLabel warning_label;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
