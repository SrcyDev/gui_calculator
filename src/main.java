/**
 * @version 1.0.0
 * @author Srcydev
 * It is currently in development. Stay tuned as it may receive more feature updates in the near future.
 * Warning: Do not edit things unless you know what you are doing as it may break the UI.
 * Note: This code contains major bugs.
 */

import javax.imageio.ImageIO;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

public class main extends javax.swing.JFrame implements ActionListener {
        static String s0, s1, s2;
        static JTextField resultArea = new javax.swing.JTextField();

        main()
        {
                s0 = s1 = s2 = "";
        }

        public static void main(String args[])
        {
                JFrame app = new JFrame();
                app.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                app.setTitle("GUI_Calculator");
                app.getContentPane().setBackground(new java.awt.Color(18,18,18));
                //app.setForeground(new java.awt.Color(18,18,18));
                app.setResizable(false);

                try {
                    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (ClassNotFoundException ex) {
                    java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }

                try {
                        app.setIconImage(ImageIO.read(new File("./icon.png")));
                }catch(Exception e){
                        System.err.println(e);
                }


                JScrollPane jScrollPane1 = new javax.swing.JScrollPane();

                JButton undo = new javax.swing.JButton("X");
                JButton num7 = new javax.swing.JButton("7");
                JButton divide = new javax.swing.JButton("/");
                JButton num9 = new javax.swing.JButton("9");
                JButton power = new javax.swing.JButton("^");
                JButton clear = new javax.swing.JButton("C");
                JButton multiply = new javax.swing.JButton("*");
                JButton num4 = new javax.swing.JButton("4");
                JButton num5 = new javax.swing.JButton("5");
                JButton num8 = new javax.swing.JButton("8");
                JButton num1 = new javax.swing.JButton("1");
                JButton add = new javax.swing.JButton("+");
                JButton num2 = new javax.swing.JButton("2");
                JButton num3 = new javax.swing.JButton("3");
                JButton subtract = new javax.swing.JButton("-");
                JButton num6 = new javax.swing.JButton("6");
                JButton num0 = new javax.swing.JButton("0");
                JButton num00 = new javax.swing.JButton("00");
                JButton result = new javax.swing.JButton("=");
                JButton dot = new javax.swing.JButton(".");

                resultArea.setBackground(new java.awt.Color(28, 28, 39));
                resultArea.setColumns(20);
                resultArea.setForeground(new java.awt.Color(255, 255, 255));
                resultArea.setText("0");
                resultArea.setHorizontalAlignment(SwingConstants.RIGHT);
                //resultArea.setRows(5);
                jScrollPane1.setViewportView(resultArea);

                result.setBackground(new java.awt.Color(28, 28, 39));
                result.setFont(new java.awt.Font("Segoe UI", 0, 18));
                result.setForeground(new java.awt.Color(255, 255, 255));
                result.setMnemonic(KeyEvent.VK_EQUALS);
                result.setFont(new java.awt.Font("Segoe UI", 0, 18));

                add.setBackground(new java.awt.Color(28, 28, 39));
                add.setFont(new java.awt.Font("Segoe UI", 0, 18));
                add.setForeground(new java.awt.Color(255, 255, 255));
                add.setMnemonic(KeyEvent.VK_PLUS);

                subtract.setBackground(new java.awt.Color(28, 28, 39));
                subtract.setFont(new java.awt.Font("Segoe UI", 0, 18));
                subtract.setForeground(new java.awt.Color(255, 255, 255));
                subtract.setMnemonic(KeyEvent.VK_MINUS);


                multiply.setBackground(new java.awt.Color(28, 28, 39));
                multiply.setFont(new java.awt.Font("Segoe UI", 0, 18));
                multiply.setForeground(new java.awt.Color(255, 255, 255));
                multiply.setMnemonic(KeyEvent.VK_ASTERISK);

                divide.setBackground(new java.awt.Color(28, 28, 39));
                divide.setFont(new java.awt.Font("Segoe UI", 0, 18));
                divide.setForeground(new java.awt.Color(255, 255, 255));
                divide.setMnemonic(KeyEvent.VK_DIVIDE);

                power.setBackground(new java.awt.Color(28, 28, 39));
                power.setFont(new java.awt.Font("Segoe UI", 0, 18));
                power.setForeground(new java.awt.Color(255, 255, 255));
                power.setMnemonic(KeyEvent.VK_P);

                clear.setBackground(new java.awt.Color(28, 28, 39));
                clear.setFont(new java.awt.Font("Segoe UI", 0, 18));
                clear.setForeground(new java.awt.Color(255, 255, 255));
                clear.setMnemonic(KeyEvent.VK_C);

                undo.setBackground(new java.awt.Color(28, 28, 39));
                undo.setFont(new java.awt.Font("Segoe UI", 0, 18));
                undo.setForeground(new java.awt.Color(255, 255, 255));
                undo.setMnemonic(KeyEvent.VK_X);

                num0.setBackground(new java.awt.Color(28, 28, 39));
                num0.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num0.setForeground(new java.awt.Color(255, 255, 255));
                num0.setMnemonic(KeyEvent.VK_0);
                num0.setMnemonic(KeyEvent.VK_NUMPAD0);

                num1.setBackground(new java.awt.Color(28, 28, 39));
                num1.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num1.setForeground(new java.awt.Color(255, 255, 255));
                num1.setMnemonic(KeyEvent.VK_1);
                num1.setMnemonic(KeyEvent.VK_NUMPAD1);

                num2.setBackground(new java.awt.Color(28, 28, 39));
                num2.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num2.setForeground(new java.awt.Color(255, 255, 255));
                num2.setMnemonic(KeyEvent.VK_2);
                num2.setMnemonic(KeyEvent.VK_NUMPAD2);

                num3.setBackground(new java.awt.Color(28, 28, 39));
                num3.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num3.setForeground(new java.awt.Color(255, 255, 255));
                num3.setMnemonic(KeyEvent.VK_3);
                num3.setMnemonic(KeyEvent.VK_NUMPAD3);

                num4.setBackground(new java.awt.Color(28, 28, 39));
                num4.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num4.setForeground(new java.awt.Color(255, 255, 255));
                num4.setMnemonic(KeyEvent.VK_4);
                num4.setMnemonic(KeyEvent.VK_NUMPAD4);

                num5.setBackground(new java.awt.Color(28, 28, 39));
                num5.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num5.setForeground(new java.awt.Color(255, 255, 255));
                num5.setMnemonic(KeyEvent.VK_5);
                num5.setMnemonic(KeyEvent.VK_NUMPAD5);

                num6.setBackground(new java.awt.Color(28, 28, 39));
                num6.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num6.setForeground(new java.awt.Color(255, 255, 255));
                num6.setMnemonic(KeyEvent.VK_6);
                num6.setMnemonic(KeyEvent.VK_NUMPAD6);

                num7.setBackground(new java.awt.Color(28, 28, 39));
                num7.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num7.setForeground(new java.awt.Color(255, 255, 255));
                num7.setMnemonic(KeyEvent.VK_7);
                num7.setMnemonic(KeyEvent.VK_NUMPAD0);

                num8.setBackground(new java.awt.Color(28, 28, 39));
                num8.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num8.setForeground(new java.awt.Color(255, 255, 255));
                num8.setMnemonic(KeyEvent.VK_8);
                num8.setMnemonic(KeyEvent.VK_NUMPAD8);

                num9.setBackground(new java.awt.Color(28, 28, 39));
                num9.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num9.setForeground(new java.awt.Color(255, 255, 255));
                num9.setMnemonic(KeyEvent.VK_9);
                num9.setMnemonic(KeyEvent.VK_NUMPAD9);

                num00.setBackground(new java.awt.Color(28, 28, 39));
                num00.setFont(new java.awt.Font("Segoe UI", 0, 18));
                num00.setForeground(new java.awt.Color(255, 255, 255));
                num00.setMnemonic(KeyEvent.VK_0 + KeyEvent.VK_0);
                num00.setMnemonic(KeyEvent.VK_NUMPAD0 + KeyEvent.VK_NUMPAD0);

                dot.setBackground(new java.awt.Color(28, 28, 39));
                dot.setFont(new java.awt.Font("Segoe UI", 0, 18));
                dot.setForeground(new java.awt.Color(255, 255, 255));
                dot.setMnemonic(KeyEvent.VK_DECIMAL);

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

                main c = new main();

                JPanel p = new JPanel();

                resultArea.setEditable(false);

                resultArea.addActionListener(c);
                num1.addActionListener(c);
                num2.addActionListener(c);
                num3.addActionListener(c);
                num4.addActionListener(c);
                num5.addActionListener(c);
                num6.addActionListener(c);
                num7.addActionListener(c);
                num8.addActionListener(c);
                num9.addActionListener(c);
                num0.addActionListener(c);
                num00.addActionListener(c);
                add.addActionListener(c);
                subtract.addActionListener(c);
                multiply.addActionListener(c);
                divide.addActionListener(c);
                result.addActionListener(c);
                power.addActionListener(c);
                dot.addActionListener(c);
                clear.addActionListener(c);
                undo.addActionListener(c);
               
                num1.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_1 || e.getKeyCode() ==  KeyEvent.VK_NUMPAD1)
                                {
                                        actionHandler("1");
                                }

                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });
                num2.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_2 || e.getKeyCode() ==  KeyEvent.VK_NUMPAD2)
                                {
                                        actionHandler("2");
                                }

                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });
                num3.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_3 || e.getKeyCode() ==  KeyEvent.VK_NUMPAD3)
                                {
                                        actionHandler("3");
                                }

                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });
                num4.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_4 || e.getKeyCode() ==  KeyEvent.VK_NUMPAD4)
                                {
                                        actionHandler("4");
                                }

                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });
                num5.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_5 || e.getKeyCode() ==  KeyEvent.VK_NUMPAD5)
                                {
                                        actionHandler("5");
                                }

                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });
                num6.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_6 || e.getKeyCode() ==  KeyEvent.VK_NUMPAD6)
                                {
                                        actionHandler("6");
                                }

                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });
                num7.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_7 || e.getKeyCode() ==  KeyEvent.VK_NUMPAD7)
                                {
                                        actionHandler("7");
                                }

                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });
                num8.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_8 || e.getKeyCode() ==  KeyEvent.VK_NUMPAD8)
                                {
                                        actionHandler("8");
                                }

                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });
                num9.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_9 || e.getKeyCode() ==  KeyEvent.VK_NUMPAD9)
                                {
                                        actionHandler("9");
                                }

                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });
                num0.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_0 || e.getKeyCode() ==  KeyEvent.VK_NUMPAD0)
                                {
                                        actionHandler("0");
                                }

                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });
                num00.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_0 + KeyEvent.VK_0 || e.getKeyCode() ==  KeyEvent.VK_NUMPAD0 + KeyEvent.VK_NUMPAD0)
                                {
                                        actionHandler("00");
                                }

                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });
                add.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_PLUS)
                                {
                                        actionHandler("+");
                                }

                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });
                subtract.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {


                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_MINUS)
                                {
                                        actionHandler("-");
                                }


                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });
                multiply.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_ASTERISK)
                                {
                                        actionHandler("*");
                                }


                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });
                divide.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_DIVIDE)
                                {
                                        actionHandler("/");
                                }


                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });
                result.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_EQUALS)
                                {
                                        actionHandler("=");
                                }


                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });
                power.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_P)
                                {
                                        actionHandler("P");
                                }

                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });
                dot.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_DECIMAL)
                                {
                                        actionHandler(".");
                                }

                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });
                clear.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_C)
                                {
                                        actionHandler("C");
                                }

                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });
                undo.addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }

                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() ==  KeyEvent.VK_X)
                                {
                                        actionHandler("X");
                                }

                        }

                        @Override
                        public void keyReleased(KeyEvent e) {

                        }
                });

                p.add(num1);
                p.add(num2);
                p.add(num3);
                p.add(num4);
                p.add(num5);
                p.add(num6);
                p.add(num7);
                p.add(num8);
                p.add(num9);
                p.add(num0);
                p.add(num00);
                p.add(add);
                p.add(subtract);
                p.add(result);
                p.add(multiply);
                p.add(divide);
                p.add(power);
                p.add(dot);
                p.add(clear);
                p.add(undo);
                app.add(p);
                app.pack();
                app.setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
                String s = e.getActionCommand();
                actionHandler(s);
        }

        public static void actionHandler(String s)
        {
                if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
                        if (!s1.equals(""))
                                s2 = s2 + s;
                        else
                                s0 = s0 + s;

                        resultArea.setText(s0 + s1 + s2);
                }
                else if (s.charAt(0) == 'C') {

                        s0 = s1 = s2 = "";

                        resultArea.setText("0");
                }else if (s.charAt(0) == 'X') {

                        char r;
                        String q = "";
                        String temp = resultArea.getText();
                        int len = (int) String.valueOf(temp).length() - 1;
                        for (int i = 0; i < len;i++)
                        {
                                r = temp.charAt(i);
                                q = q + r;
                        }

                        if (!s1.equals(""))
                        {
                                s2 = q;
                        }else{
                                s0 = q;
                        }


                        resultArea.setText(q);
                }else if (s.charAt(0) == '=') {

                        double te;

                        if (s1.equals("+"))
                                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                        else if (s1.equals("-"))
                                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                        else if (s1.equals("/"))
                                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                        else if (s1.equals("*"))
                                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
                        else
                                te = Math.pow(Double.parseDouble(s0) , Double.parseDouble(s2));

                        resultArea.setText(s0 + s1 + s2 + "=" + te);


                        s0 = Double.toString(te);

                        s1 = s2 = "";
                }
                else {

                        if (s1.equals("") || s2.equals(""))
                                s1 = s;

                        else {
                                double te;


                                if (s1.equals("+"))
                                        te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                                else if (s1.equals("-"))
                                        te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                                else if (s1.equals("/"))
                                        te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                                else if (s1.equals("*"))
                                        te = (Double.parseDouble(s0) * Double.parseDouble(s2));
                                else
                                        te = Math.pow(Double.parseDouble(s0) , Double.parseDouble(s2));


                                s0 = Double.toString(te);

                                s1 = s;


                                s2 = "";
                        }

                        resultArea.setText(s0 + s1 + s2);
                }
        }
}
