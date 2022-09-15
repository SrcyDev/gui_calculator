/**
 * @version 1.0.0
 * @author Srcydev
 * It is currently in development. Stay tuned as it may receive more feature updates in the near future.
 * Warning: Do not edit things unless you know what you are doing as it may break the UI.
 */

import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.lang.reflect.Array;

public class main extends javax.swing.JFrame implements java.awt.event.ActionListener {
        // Default Constructor
        
        public main()
        {

        }
        // Frame

        private static void createFrame(){
                JFrame app = new JFrame();
                app.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                app.setTitle("GUI_Calculator");
                app.getContentPane().setBackground(Color.black);
                app.setForeground(new java.awt.Color(18,18,18));
                app.setResizable(false);
                showUI(app);
        }

        // UI

        private static void showUI(JFrame frame){
                JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
                JTextField resultArea = new javax.swing.JTextField();
                JButton undo = new javax.swing.JButton();
                JButton num7 = new javax.swing.JButton();
                JButton divide = new javax.swing.JButton();
                JButton num9 = new javax.swing.JButton();
                JButton power = new javax.swing.JButton();
                JButton clear = new javax.swing.JButton();
                JButton multiply = new javax.swing.JButton();
                JButton num4 = new javax.swing.JButton();
                JButton num5 = new javax.swing.JButton();
                JButton num8 = new javax.swing.JButton();
                JButton num1 = new javax.swing.JButton();
                JButton add = new javax.swing.JButton();
                JButton num2 = new javax.swing.JButton();
                JButton num3 = new javax.swing.JButton();
                JButton subtract = new javax.swing.JButton();
                JButton num6 = new javax.swing.JButton();
                JButton num0 = new javax.swing.JButton();
                JButton num00 = new javax.swing.JButton();
                JButton result = new javax.swing.JButton();
                JButton dot = new javax.swing.JButton();

                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Metal".equals(info.getName())) {
                                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                break;
                        }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }

                resultArea.setBackground(new java.awt.Color(28, 28, 39));
                resultArea.setColumns(20);
                resultArea.setForeground(new java.awt.Color(255, 255, 255));
                resultArea.setText("0");
                resultArea.setBorder(BorderFactory.createCompoundBorder(resultArea.getBorder(), BorderFactory.createEmptyBorder(0, 0, 0, 0)));
                //resultArea.setRows(5);
                jScrollPane1.setViewportView(resultArea);
        
                undo.setBackground(new java.awt.Color(28, 28, 39));
                undo.setFont(new java.awt.Font("Segoe UI", 0, 18));
                undo.setForeground(new java.awt.Color(255, 255, 255));
                undo.setText("X");

                num7.setBackground(new java.awt.Color(28, 28, 39));
                num7.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num7.setForeground(new java.awt.Color(255, 255, 255));
                num7.setText("7");

        
                divide.setBackground(new java.awt.Color(28, 28, 39));
                divide.setFont(new java.awt.Font("Segoe UI", 0, 18));
                divide.setForeground(new java.awt.Color(255, 255, 255));
                divide.setText("/");

        
                num9.setBackground(new java.awt.Color(28, 28, 39));
                num9.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num9.setForeground(new java.awt.Color(255, 255, 255));
                num9.setText("9");


                power.setBackground(new java.awt.Color(28, 28, 39));
                power.setFont(new java.awt.Font("Segoe UI", 0, 18));
                power.setForeground(new java.awt.Color(255, 255, 255));
                power.setText("^");

        
                clear.setBackground(new java.awt.Color(28, 28, 39));
                clear.setFont(new java.awt.Font("Segoe UI", 0, 18));
                clear.setForeground(new java.awt.Color(255, 255, 255));
                clear.setText("C");

        
                multiply.setBackground(new java.awt.Color(28, 28, 39));
                multiply.setFont(new java.awt.Font("Segoe UI", 0, 18));
                multiply.setForeground(new java.awt.Color(255, 255, 255));
                multiply.setText("*");

        
                num4.setBackground(new java.awt.Color(28, 28, 39));
                num4.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num4.setForeground(new java.awt.Color(255, 255, 255));
                num4.setText("4");

        
                num5.setBackground(new java.awt.Color(28, 28, 39));
                num5.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num5.setForeground(new java.awt.Color(255, 255, 255));
                num5.setText("5");

        
                num8.setBackground(new java.awt.Color(28, 28, 39));
                num8.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num8.setForeground(new java.awt.Color(255, 255, 255));
                num8.setText("8");

        
                num1.setBackground(new java.awt.Color(28, 28, 39));
                num1.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num1.setForeground(new java.awt.Color(255, 255, 255));
                num1.setText("1");
        
        
                add.setBackground(new java.awt.Color(28, 28, 39));
                add.setFont(new java.awt.Font("Segoe UI", 0, 18));
                add.setForeground(new java.awt.Color(255, 255, 255));
                add.setText("+");

        
                num2.setBackground(new java.awt.Color(28, 28, 39));
                num2.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num2.setForeground(new java.awt.Color(255, 255, 255));
                num2.setText("2");
        
        
                num3.setBackground(new java.awt.Color(28, 28, 39));
                num3.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num3.setForeground(new java.awt.Color(255, 255, 255));
                num3.setText("3");
        
        
                subtract.setBackground(new java.awt.Color(28, 28, 39));
                subtract.setFont(new java.awt.Font("Segoe UI", 0, 18));
                subtract.setForeground(new java.awt.Color(255, 255, 255));
                subtract.setText("-");
        
        
                num6.setBackground(new java.awt.Color(28, 28, 39));
                num6.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num6.setForeground(new java.awt.Color(255, 255, 255));
                num6.setText("6");
        
        
                num0.setBackground(new java.awt.Color(28, 28, 39));
                num0.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num0.setForeground(new java.awt.Color(255, 255, 255));
                num0.setText("0");
                
        
                num00.setBackground(new java.awt.Color(28, 28, 39));
                num00.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num00.setForeground(new java.awt.Color(255, 255, 255));
                num00.setText("00");
                
        
                result.setBackground(new java.awt.Color(28, 28, 39));
                result.setFont(new java.awt.Font("Segoe UI", 0, 18));
                result.setForeground(new java.awt.Color(255, 255, 255));
                result.setText("=");
                
        
                dot.setBackground(new java.awt.Color(28, 28, 39));
                dot.setFont(new java.awt.Font("Segoe UI", 0, 18));
                dot.setForeground(new java.awt.Color(255, 255, 255));
                dot.setText(".");
                
                //dot.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

                // Set location of components
                // Horizontal Axis (Y)
                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(app.getContentPane());
                app.getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(24, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(5, 5, 5)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                        .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(18, 18, 18)
                                                                                                        .addComponent(num00, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(18, 18, 18)
                                                                                                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                        .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                        .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(18, 18, 18)
                                                                                                        .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(6, 6, 6)
                                                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(undo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(power, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(22, 22, 22))
                );
                // Vertical Axis (X)
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(32, 32, 32)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(undo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(power, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(num6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(num00, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(22, Short.MAX_VALUE))
                );


                /* 
                // Add action command

                num0.setActionCommand("0");
                num1.setActionCommand("1");
                num2.setActionCommand("2");
                num3.setActionCommand("3");
                num4.setActionCommand("4");
                num5.setActionCommand("5");
                num6.setActionCommand("6");
                num7.setActionCommand("7");
                num8.setActionCommand("8");
                num9.setActionCommand("9");
                num00.setActionCommand("00");
                add.setActionCommand("+");
                subtract.setActionCommand("-");
                multiply.setActionCommand("*");
                divide.setActionCommand("/");
                power.setActionCommand("^");
                clear.setActionCommand("C");
                undo.setActionCommand("X");
                dot.setActionCommand(".");
                result.setActionCommand("=");

                */
                
                // Add key event
                /*
                num0.setMnemonic(KeyEvent.VK_0);
                num1.setMnemonic(KeyEvent.VK_1);
                num2.setMnemonic(KeyEvent.VK_2);
                num3.setMnemonic(KeyEvent.VK_3);
                num4.setMnemonic(KeyEvent.VK_4);
                num5.setMnemonic(KeyEvent.VK_5);
                num6.setMnemonic(KeyEvent.VK_6);
                num7.setMnemonic(KeyEvent.VK_7);
                num8.setMnemonic(KeyEvent.VK_8);
                num9.setMnemonic(KeyEvent.VK_9);
                num00.setMnemonic(KeyEvent.VK_0 + KeyEvent.VK_0);
                add.setMnemonic(KeyEvent.VK_PLUS);
                subtract.setMnemonic(KeyEvent.VK_SUBTRACT);
                multiply.setMnemonic(KeyEvent.VK_MULTIPLY);
                divide.setMnemonic(KeyEvent.VK_DIVIDE);
                clear.setMnemonic(KeyEvent.VK_C);
                undo.setMnemonic(KeyEvent.VK_X);
                */

        }

        public static void main  (String[] args) {
                // Set Nimbus look and feel (Optional) */
                

                JFrame app = new JFrame();
                
        
               
        
                
                // Pack the components and display it
                
        }

        double s0 = 0;

        public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.charAt(0) == 'C') {                      
                resultArea.setText("");
             }else if (command.charAt(0) == '=') {                    
                resultArea.setText(evaluate(resultArea.getText()));
             }else {                                
                resultArea.setText(resultArea.getText() + command);
             }
          }
        public static String evaluate(String expression) {
                char[] arr = expression.toCharArray();
                String operand1 = "";String operand2 = "";String operator = "";
                double result = 0;
          
                for (int i = 0; i < arr.length; i++) {
                   if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
                      if(operator.isEmpty()){
                         operand1 += arr[i];
                      }else{
                         operand2 += arr[i];
                      }
                   }  
          
                   if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
                      operator += arr[i];
                   }
                }
          
                if (operator.equals("+"))
                   result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
                else if (operator.equals("-"))
                   result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
                else if (operator.equals("/"))
                   result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
                else
                   result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));          
                return operand1 + operator + operand2 + "=" +result;
             }

        //throw new UnsupportedOperationException("Not supported yet.");
    

        
    private javax.swing.JTextArea resultArea;
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private javax.swing.JButton divide;
    private javax.swing.JButton dot;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton multiply;
    private javax.swing.JButton num0;
    private javax.swing.JButton num00;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JButton power;
    private javax.swing.JButton result;
    private javax.swing.JButton subtract;
    private javax.swing.JButton undo;

}