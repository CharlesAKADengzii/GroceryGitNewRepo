/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grocerypos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainPage extends javax.swing.JFrame {

    private JButton button;
    private int desiredWidth;
    private int desiredHeight;

    public MainPage() {
        initComponents();
        setResizable(false);
    }

    MainPage(String accountID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        POSButton = new javax.swing.JButton();
        IMSButton = new javax.swing.JButton();
        ADMButton = new javax.swing.JButton();
        SETButton = new javax.swing.JButton();
        MenuPanels = new javax.swing.JLayeredPane();
        POS = new javax.swing.JPanel();
        jSnacks = new javax.swing.JButton();
        jDrink = new javax.swing.JButton();
        jHouseUtensils = new javax.swing.JButton();
        jBabyNeeds = new javax.swing.JButton();
        ProductPanels = new javax.swing.JLayeredPane();
        SnacksScroll = new javax.swing.JScrollPane();
        SnacksPage = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        DrinksScroll = new javax.swing.JScrollPane();
        DrinksPage = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        HouseUtensilsScroll = new javax.swing.JScrollPane();
        HouseUtensilsPage = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        BabyNeedsScroll = new javax.swing.JScrollPane();
        BabyNeedsPage = new javax.swing.JPanel();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        PaymentPane = new javax.swing.JLayeredPane();
        ItemSummary = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton38 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton39 = new javax.swing.JButton();
        PaymentMethod = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton40 = new javax.swing.JButton();
        Method = new javax.swing.JLayeredPane();
        Cash = new javax.swing.JPanel();
        jButton42 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Payment = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton41 = new javax.swing.JButton();
        DiscountPage = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton59 = new javax.swing.JButton();
        Receipt = new javax.swing.JPanel();
        IMS = new javax.swing.JPanel();
        ADM = new javax.swing.JPanel();
        SET = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo_sym (4).png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 153, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BIG BITE STORE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(348, 348, 348)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        POSButton.setBackground(new java.awt.Color(204, 204, 204));
        POSButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/psde1.png"))); // NOI18N
        POSButton.setBorder(null);
        POSButton.setBorderPainted(false);
        POSButton.setContentAreaFilled(false);
        POSButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        POSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                POSButtonActionPerformed(evt);
            }
        });

        IMSButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/imsd.png"))); // NOI18N
        IMSButton.setBorder(null);
        IMSButton.setBorderPainted(false);
        IMSButton.setContentAreaFilled(false);
        IMSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMSButtonActionPerformed(evt);
            }
        });

        ADMButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/admd.png"))); // NOI18N
        ADMButton.setBorder(null);
        ADMButton.setBorderPainted(false);
        ADMButton.setContentAreaFilled(false);
        ADMButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMButtonActionPerformed(evt);
            }
        });

        SETButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/setd.png"))); // NOI18N
        SETButton.setBorder(null);
        SETButton.setBorderPainted(false);
        SETButton.setContentAreaFilled(false);
        SETButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SETButtonActionPerformed(evt);
            }
        });

        MenuPanels.setLayout(new java.awt.CardLayout());

        POS.setBackground(new java.awt.Color(204, 204, 255));
        POS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSnacks.setBackground(new java.awt.Color(0, 153, 102));
        jSnacks.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jSnacks.setForeground(new java.awt.Color(255, 255, 255));
        jSnacks.setText("Snacks");
        jSnacks.setMaximumSize(new java.awt.Dimension(112, 36));
        jSnacks.setMinimumSize(new java.awt.Dimension(112, 36));
        jSnacks.setPreferredSize(new java.awt.Dimension(112, 36));
        jSnacks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSnacksActionPerformed(evt);
            }
        });

        jDrink.setBackground(new java.awt.Color(255, 102, 0));
        jDrink.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jDrink.setText("Drinks");
        jDrink.setMaximumSize(new java.awt.Dimension(112, 36));
        jDrink.setMinimumSize(new java.awt.Dimension(112, 36));
        jDrink.setPreferredSize(new java.awt.Dimension(112, 36));
        jDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDrinkActionPerformed(evt);
            }
        });

        jHouseUtensils.setBackground(new java.awt.Color(255, 102, 0));
        jHouseUtensils.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jHouseUtensils.setText("House Utensils");
        jHouseUtensils.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHouseUtensilsActionPerformed(evt);
            }
        });

        jBabyNeeds.setBackground(new java.awt.Color(255, 102, 0));
        jBabyNeeds.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jBabyNeeds.setText("Baby Needs");
        jBabyNeeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBabyNeedsActionPerformed(evt);
            }
        });

        ProductPanels.setLayout(new java.awt.CardLayout());

        SnacksScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        SnacksScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        SnacksPage.setBackground(new java.awt.Color(204, 204, 204));

        jButton9.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nova.png"))); // NOI18N
        jButton9.setText("NOVA");
        jButton9.setBorder(null);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vcut.png"))); // NOI18N
        jButton10.setText("V-CUT");
        jButton10.setBorder(null);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton10.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton10.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/piattos.png"))); // NOI18N
        jButton2.setText("PIATTOS");
        jButton2.setBorder(null);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pillows.png"))); // NOI18N
        jButton3.setText("PILLOWS");
        jButton3.setBorder(null);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton3.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton3.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lays.png"))); // NOI18N
        jButton4.setText("LAYS");
        jButton4.setBorder(null);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton4.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton4.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cheetos.png"))); // NOI18N
        jButton5.setText("CHEETOS");
        jButton5.setBorder(null);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton5.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton5.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sweetcorn.png"))); // NOI18N
        jButton6.setText("SWEET CORN");
        jButton6.setBorder(null);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton6.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tomi.png"))); // NOI18N
        jButton7.setText("TOMI");
        jButton7.setBorder(null);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton7.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton7.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nagaraya.png"))); // NOI18N
        jButton8.setText("NAGARAYA");
        jButton8.setBorder(null);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton8.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton8.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dingdong.png"))); // NOI18N
        jButton11.setText("DING DONG");
        jButton11.setBorder(null);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton11.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton11.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/boybawang.png"))); // NOI18N
        jButton12.setText("BOY BAWANG");
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton12.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton12.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cracklings.png"))); // NOI18N
        jButton13.setText("CRACKLINGS");
        jButton13.setBorder(null);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton13.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton13.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SnacksPageLayout = new javax.swing.GroupLayout(SnacksPage);
        SnacksPage.setLayout(SnacksPageLayout);
        SnacksPageLayout.setHorizontalGroup(
            SnacksPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SnacksPageLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(SnacksPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SnacksPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SnacksPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SnacksPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SnacksPageLayout.setVerticalGroup(
            SnacksPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SnacksPageLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(SnacksPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SnacksPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SnacksPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SnacksPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SnacksScroll.setViewportView(SnacksPage);

        ProductPanels.add(SnacksScroll, "card2");

        DrinksScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        DrinksScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        DrinksPage.setBackground(new java.awt.Color(204, 204, 204));

        jButton14.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/monster.png"))); // NOI18N
        jButton14.setText("MONSTER");
        jButton14.setBorder(null);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton14.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton14.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bang.png"))); // NOI18N
        jButton15.setText("BANG");
        jButton15.setBorder(null);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton15.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton15.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pocarisweat.png"))); // NOI18N
        jButton16.setText("POCARI SWEAT");
        jButton16.setBorder(null);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton16.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton16.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/royal.png"))); // NOI18N
        jButton17.setText("ROYAL");
        jButton17.setBorder(null);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton17.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton17.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sprite.png"))); // NOI18N
        jButton18.setText("SPRITE");
        jButton18.setBorder(null);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton18.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton18.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton18.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tropicana.png"))); // NOI18N
        jButton19.setText("TROPICANA");
        jButton19.setBorder(null);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton19.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton19.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton19.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/smartc.png"))); // NOI18N
        jButton20.setText("SMART - C");
        jButton20.setBorder(null);
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton20.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton20.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton20.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minutemaid.png"))); // NOI18N
        jButton21.setText("MINUTE MAID");
        jButton21.setBorder(null);
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton21.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton21.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton21.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DrinksPageLayout = new javax.swing.GroupLayout(DrinksPage);
        DrinksPage.setLayout(DrinksPageLayout);
        DrinksPageLayout.setHorizontalGroup(
            DrinksPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrinksPageLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(DrinksPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DrinksPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DrinksPageLayout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DrinksPageLayout.createSequentialGroup()
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DrinksPageLayout.setVerticalGroup(
            DrinksPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrinksPageLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(DrinksPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DrinksPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DrinksScroll.setViewportView(DrinksPage);

        ProductPanels.add(DrinksScroll, "card3");

        HouseUtensilsScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        HouseUtensilsScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        HouseUtensilsPage.setBackground(new java.awt.Color(204, 204, 204));

        jButton22.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/airpurifier.png"))); // NOI18N
        jButton22.setText("AIR PURIFIER");
        jButton22.setBorder(null);
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton22.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton22.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton22.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton22.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mop.png"))); // NOI18N
        jButton23.setText("MOP");
        jButton23.setBorder(null);
        jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton23.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton23.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton23.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton23.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casserole.png"))); // NOI18N
        jButton24.setText("CASSEROLE");
        jButton24.setBorder(null);
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton24.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton24.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton24.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton24.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/potbundle.png"))); // NOI18N
        jButton25.setText("POT BUNDLE");
        jButton25.setBorder(null);
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton25.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton25.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton25.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton25.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dishwashingliquid.png"))); // NOI18N
        jButton26.setText("DISHWASHING LIQUID");
        jButton26.setBorder(null);
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton26.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton26.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton26.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton26.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cuttingboard.png"))); // NOI18N
        jButton27.setText("CUTTING BOARD");
        jButton27.setBorder(null);
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton27.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton27.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton27.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton27.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/scrub.png"))); // NOI18N
        jButton28.setText("SCRUB");
        jButton28.setBorder(null);
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton28.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton28.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton28.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton28.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/carpet.png"))); // NOI18N
        jButton29.setText("CARPET");
        jButton29.setBorder(null);
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton29.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton29.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton29.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton29.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/containers.png"))); // NOI18N
        jButton30.setText("CONTAINERS");
        jButton30.setBorder(null);
        jButton30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton30.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton30.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton30.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton30.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tissue.png"))); // NOI18N
        jButton31.setText("TISSUE");
        jButton31.setBorder(null);
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton31.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton31.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton31.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton31.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hanger.png"))); // NOI18N
        jButton32.setText("HANGER");
        jButton32.setBorder(null);
        jButton32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton32.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton32.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton32.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton32.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/knives.png"))); // NOI18N
        jButton33.setText("KNIVES");
        jButton33.setBorder(null);
        jButton33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton33.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton33.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton33.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton33.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HouseUtensilsPageLayout = new javax.swing.GroupLayout(HouseUtensilsPage);
        HouseUtensilsPage.setLayout(HouseUtensilsPageLayout);
        HouseUtensilsPageLayout.setHorizontalGroup(
            HouseUtensilsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HouseUtensilsPageLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(HouseUtensilsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HouseUtensilsPageLayout.createSequentialGroup()
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HouseUtensilsPageLayout.createSequentialGroup()
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HouseUtensilsPageLayout.createSequentialGroup()
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HouseUtensilsPageLayout.setVerticalGroup(
            HouseUtensilsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HouseUtensilsPageLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(HouseUtensilsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(HouseUtensilsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(HouseUtensilsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HouseUtensilsScroll.setViewportView(HouseUtensilsPage);

        ProductPanels.add(HouseUtensilsScroll, "card4");

        BabyNeedsScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        BabyNeedsScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        BabyNeedsPage.setBackground(new java.awt.Color(204, 204, 204));

        jButton34.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/babysocks.png"))); // NOI18N
        jButton34.setText("BABY SOCKS");
        jButton34.setBorder(null);
        jButton34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton34.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton34.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton34.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton34.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/babyshoes.png"))); // NOI18N
        jButton35.setText("BABY SHOES");
        jButton35.setBorder(null);
        jButton35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton35.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton35.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton35.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton35.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton46.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/babystroller.png"))); // NOI18N
        jButton46.setText("BABY STROLLER");
        jButton46.setBorder(null);
        jButton46.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton46.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton46.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton46.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton46.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/babycrib.png"))); // NOI18N
        jButton47.setText("BABY CRIB");
        jButton47.setBorder(null);
        jButton47.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton47.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton47.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton47.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton47.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/babysoap.png"))); // NOI18N
        jButton48.setText("BABY SOAP");
        jButton48.setAutoscrolls(true);
        jButton48.setBorder(null);
        jButton48.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton48.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton48.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton48.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton48.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton49.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/babyclothes.png"))); // NOI18N
        jButton49.setText("BABY CLOTHES");
        jButton49.setAutoscrolls(true);
        jButton49.setBorder(null);
        jButton49.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton49.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton49.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton49.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton49.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton50.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/babybottles.png"))); // NOI18N
        jButton50.setText("BABY BOTTLE");
        jButton50.setAutoscrolls(true);
        jButton50.setBorder(null);
        jButton50.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton50.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton50.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton50.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton50.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        jButton51.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/babyteether.png"))); // NOI18N
        jButton51.setText("BABY TEETHER");
        jButton51.setAutoscrolls(true);
        jButton51.setBorder(null);
        jButton51.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton51.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton51.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton51.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton51.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        jButton52.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/babydiapers.png"))); // NOI18N
        jButton52.setText("BABY DIAPERS");
        jButton52.setAutoscrolls(true);
        jButton52.setBorder(null);
        jButton52.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton52.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton52.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton52.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton52.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jButton53.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/babyspoon.png"))); // NOI18N
        jButton53.setText("BABY SPOON");
        jButton53.setAutoscrolls(true);
        jButton53.setBorder(null);
        jButton53.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton53.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton53.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton53.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton53.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        jButton55.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/babymilk.png"))); // NOI18N
        jButton55.setText("BABY MILK");
        jButton55.setAutoscrolls(true);
        jButton55.setBorder(null);
        jButton55.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton55.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton55.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton55.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton55.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        jButton56.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/babytoy.png"))); // NOI18N
        jButton56.setText("BABY TOY");
        jButton56.setAutoscrolls(true);
        jButton56.setBorder(null);
        jButton56.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton56.setMaximumSize(new java.awt.Dimension(180, 186));
        jButton56.setMinimumSize(new java.awt.Dimension(180, 186));
        jButton56.setPreferredSize(new java.awt.Dimension(180, 186));
        jButton56.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BabyNeedsPageLayout = new javax.swing.GroupLayout(BabyNeedsPage);
        BabyNeedsPage.setLayout(BabyNeedsPageLayout);
        BabyNeedsPageLayout.setHorizontalGroup(
            BabyNeedsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BabyNeedsPageLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(BabyNeedsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BabyNeedsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BabyNeedsPageLayout.createSequentialGroup()
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BabyNeedsPageLayout.createSequentialGroup()
                        .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BabyNeedsPageLayout.createSequentialGroup()
                        .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BabyNeedsPageLayout.setVerticalGroup(
            BabyNeedsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BabyNeedsPageLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(BabyNeedsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BabyNeedsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BabyNeedsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BabyNeedsScroll.setViewportView(BabyNeedsPage);

        ProductPanels.add(BabyNeedsScroll, "card5");

        PaymentPane.setLayout(new java.awt.CardLayout());

        ItemSummary.setBackground(new java.awt.Color(204, 204, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/discount.png"))); // NOI18N
        jButton36.setBorder(null);
        jButton36.setBorderPainted(false);
        jButton36.setContentAreaFilled(false);
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/up.png"))); // NOI18N
        jButton37.setBorder(null);
        jButton37.setBorderPainted(false);
        jButton37.setContentAreaFilled(false);
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/down.png"))); // NOI18N
        jButton38.setBorder(null);
        jButton38.setBorderPainted(false);
        jButton38.setContentAreaFilled(false);
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton38)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton37)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton38)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setPreferredSize(new java.awt.Dimension(600, 336));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(3);
        jTextArea1.setTabSize(7);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setMargin(getInsets());
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 204, 153));

        jTextArea2.setBackground(new java.awt.Color(255, 204, 153));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setAlignmentX(1.0F);
        jTextArea2.setAlignmentY(1.0F);
        jTextArea2.setBorder(null);
        jTextArea2.setCaretColor(new java.awt.Color(255, 204, 153));
        jTextArea2.setCaretPosition(getExtendedState());
        jTextArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea2.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton39.setBackground(new java.awt.Color(0, 153, 102));
        jButton39.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton39.setForeground(new java.awt.Color(255, 255, 255));
        jButton39.setText("Proceed Payment");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ItemSummaryLayout = new javax.swing.GroupLayout(ItemSummary);
        ItemSummary.setLayout(ItemSummaryLayout);
        ItemSummaryLayout.setHorizontalGroup(
            ItemSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ItemSummaryLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ItemSummaryLayout.setVerticalGroup(
            ItemSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemSummaryLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PaymentPane.add(ItemSummary, "card2");

        PaymentMethod.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jButton40.setBackground(new java.awt.Color(255, 102, 51));
        jButton40.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton40.setForeground(new java.awt.Color(255, 255, 255));
        jButton40.setText("Discount");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Method.setLayout(new java.awt.CardLayout());

        Cash.setBackground(new java.awt.Color(204, 204, 204));
        Cash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cashbutton (1) (1).png"))); // NOI18N
        jButton42.setBorder(null);
        jButton42.setBorderPainted(false);
        jButton42.setContentAreaFilled(false);
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel4.setText("PAYMENT");

        javax.swing.GroupLayout CashLayout = new javax.swing.GroupLayout(Cash);
        Cash.setLayout(CashLayout);
        CashLayout.setHorizontalGroup(
            CashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CashLayout.createSequentialGroup()
                .addGroup(CashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CashLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CashLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CashLayout.setVerticalGroup(
            CashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CashLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton42)
                .addGap(33, 33, 33))
        );

        Method.add(Cash, "card2");

        Payment.setBackground(new java.awt.Color(204, 204, 204));
        Payment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel5.setText("CASH PAYMENT");

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel6.setText("Total Amount Tendered");

        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/100cash.png"))); // NOI18N
        jButton43.setBorder(null);
        jButton43.setBorderPainted(false);
        jButton43.setContentAreaFilled(false);
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/200cash.png"))); // NOI18N
        jButton44.setBorder(null);
        jButton44.setBorderPainted(false);
        jButton44.setContentAreaFilled(false);
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/500cash.png"))); // NOI18N
        jButton45.setBorder(null);
        jButton45.setBorderPainted(false);
        jButton45.setContentAreaFilled(false);
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1000cash.png"))); // NOI18N
        jButton54.setBorder(null);
        jButton54.setBorderPainted(false);
        jButton54.setContentAreaFilled(false);
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/₱ (1).png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/keyboard (1).png"))); // NOI18N

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(13, 13, 13))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton57.setBackground(new java.awt.Color(0, 153, 102));
        jButton57.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton57.setForeground(new java.awt.Color(255, 255, 255));
        jButton57.setText("Confirm Amount");
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        jButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Type=Line.png"))); // NOI18N
        jButton58.setBorder(null);
        jButton58.setBorderPainted(false);
        jButton58.setContentAreaFilled(false);
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaymentLayout = new javax.swing.GroupLayout(Payment);
        Payment.setLayout(PaymentLayout);
        PaymentLayout.setHorizontalGroup(
            PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaymentLayout.createSequentialGroup()
                        .addComponent(jButton58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaymentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(121, 121, 121))))
            .addGroup(PaymentLayout.createSequentialGroup()
                .addGroup(PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaymentLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PaymentLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PaymentLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PaymentLayout.setVerticalGroup(
            PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jButton58))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Method.add(Payment, "card3");

        jPanel8.setBackground(new java.awt.Color(255, 204, 153));

        jTextArea4.setBackground(new java.awt.Color(255, 204, 153));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setBorder(null);
        jScrollPane4.setViewportView(jTextArea4);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
        );

        jButton41.setBackground(new java.awt.Color(255, 0, 0));
        jButton41.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton41.setForeground(new java.awt.Color(255, 255, 255));
        jButton41.setText("Cancel Payment");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaymentMethodLayout = new javax.swing.GroupLayout(PaymentMethod);
        PaymentMethod.setLayout(PaymentMethodLayout);
        PaymentMethodLayout.setHorizontalGroup(
            PaymentMethodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentMethodLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Method)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaymentMethodLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PaymentMethodLayout.setVerticalGroup(
            PaymentMethodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentMethodLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Method, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PaymentPane.add(PaymentMethod, "card3");

        DiscountPage.setBackground(new java.awt.Color(204, 204, 204));
        DiscountPage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel10.setBackground(new java.awt.Color(51, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel9.setText("Discounts:");

        jButton59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Type=Line.png"))); // NOI18N
        jButton59.setBorder(null);
        jButton59.setBorderPainted(false);
        jButton59.setContentAreaFilled(false);
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton59)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton59)
                    .addComponent(jLabel9))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DiscountPageLayout = new javax.swing.GroupLayout(DiscountPage);
        DiscountPage.setLayout(DiscountPageLayout);
        DiscountPageLayout.setHorizontalGroup(
            DiscountPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DiscountPageLayout.setVerticalGroup(
            DiscountPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiscountPageLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PaymentPane.add(DiscountPage, "card4");

        javax.swing.GroupLayout ReceiptLayout = new javax.swing.GroupLayout(Receipt);
        Receipt.setLayout(ReceiptLayout);
        ReceiptLayout.setHorizontalGroup(
            ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ReceiptLayout.setVerticalGroup(
            ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PaymentPane.add(Receipt, "card5");

        javax.swing.GroupLayout POSLayout = new javax.swing.GroupLayout(POS);
        POS.setLayout(POSLayout);
        POSLayout.setHorizontalGroup(
            POSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POSLayout.createSequentialGroup()
                .addGroup(POSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(POSLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jSnacks, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jHouseUtensils, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBabyNeeds, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(POSLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(ProductPanels, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PaymentPane)
                .addGap(279, 279, 279))
        );
        POSLayout.setVerticalGroup(
            POSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POSLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(POSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PaymentPane)
                    .addGroup(POSLayout.createSequentialGroup()
                        .addGroup(POSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSnacks, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jHouseUtensils, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBabyNeeds, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ProductPanels, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        MenuPanels.add(POS, "card2");

        IMS.setBackground(new java.awt.Color(204, 204, 255));
        IMS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout IMSLayout = new javax.swing.GroupLayout(IMS);
        IMS.setLayout(IMSLayout);
        IMSLayout.setHorizontalGroup(
            IMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        IMSLayout.setVerticalGroup(
            IMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MenuPanels.add(IMS, "card3");

        ADM.setBackground(new java.awt.Color(204, 204, 255));
        ADM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout ADMLayout = new javax.swing.GroupLayout(ADM);
        ADM.setLayout(ADMLayout);
        ADMLayout.setHorizontalGroup(
            ADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ADMLayout.setVerticalGroup(
            ADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MenuPanels.add(ADM, "card4");

        SET.setBackground(new java.awt.Color(204, 204, 255));
        SET.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout SETLayout = new javax.swing.GroupLayout(SET);
        SET.setLayout(SETLayout);
        SETLayout.setHorizontalGroup(
            SETLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        SETLayout.setVerticalGroup(
            SETLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MenuPanels.add(SET, "card5");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IMSButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SETButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(POSButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ADMButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, 0)
                .addComponent(MenuPanels, javax.swing.GroupLayout.PREFERRED_SIZE, 1215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(POSButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IMSButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ADMButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SETButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addComponent(MenuPanels, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void POSButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_POSButtonActionPerformed
        POS.setVisible(true);
        IMS.setVisible(false);
        ADM.setVisible(false);
        SET.setVisible(false);
        
        ImageIcon icon = new ImageIcon("C:\\Users\\Charles Andrei\\Documents\\NetBeansProjects\\try\\src\\icons\\psde1.png");
        POSButton.setIcon(icon);
        ImageIcon icon1 = new ImageIcon("C:\\Users\\Charles Andrei\\Documents\\NetBeansProjects\\try\\src\\icons\\imsd.png");
        IMSButton.setIcon(icon1);
        ImageIcon icon2 = new ImageIcon("C:\\Users\\Charles Andrei\\Documents\\NetBeansProjects\\try\\src\\icons\\admd.png");
        ADMButton.setIcon(icon2);
        ImageIcon icon3 = new ImageIcon("C:\\Users\\Charles Andrei\\Documents\\NetBeansProjects\\try\\src\\icons\\setd.png");
        SETButton.setIcon(icon3);
        
    }//GEN-LAST:event_POSButtonActionPerformed

    private void jBabyNeedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBabyNeedsActionPerformed
        
        SnacksScroll.setVisible(false);
        DrinksScroll.setVisible(false);
        HouseUtensilsScroll.setVisible(false);
        BabyNeedsScroll.setVisible(true);
        jBabyNeeds.setBackground(new java.awt.Color(0, 153, 102));
        jDrink.setBackground(new java.awt.Color(255, 102, 0));
        jSnacks.setBackground(new java.awt.Color(255, 102, 0));
        jHouseUtensils.setBackground(new java.awt.Color(255, 102, 0));
        
        jBabyNeeds.setForeground(Color.WHITE);
        jDrink.setForeground(Color.BLACK);
        jSnacks.setForeground(Color.BLACK);
        jHouseUtensils.setForeground(Color.BLACK);
    }//GEN-LAST:event_jBabyNeedsActionPerformed

    private void jDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDrinkActionPerformed
        SnacksScroll.setVisible(false);
        DrinksScroll.setVisible(true);
        HouseUtensilsScroll.setVisible(false);
        BabyNeedsScroll.setVisible(false);
        jBabyNeeds.setBackground(new java.awt.Color(255, 102, 0));
        jDrink.setBackground(new java.awt.Color(0, 153, 102));
        jSnacks.setBackground(new java.awt.Color(255, 102, 0));
        jHouseUtensils.setBackground(new java.awt.Color(255, 102, 0));
        
        jBabyNeeds.setForeground(Color.BLACK);
        jDrink.setForeground(Color.WHITE);
        jSnacks.setForeground(Color.BLACK);
        jHouseUtensils.setForeground(Color.BLACK);
    }//GEN-LAST:event_jDrinkActionPerformed

    private void jSnacksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSnacksActionPerformed
        SnacksScroll.setVisible(true);
        DrinksScroll.setVisible(false);
        HouseUtensilsScroll.setVisible(false);
        BabyNeedsScroll.setVisible(false);
        jBabyNeeds.setBackground(new java.awt.Color(255, 102, 0));
        jDrink.setBackground(new java.awt.Color(255, 102, 0));
        jSnacks.setBackground(new java.awt.Color(0, 153, 102));
        jHouseUtensils.setBackground(new java.awt.Color(255, 102, 0));
        
        jBabyNeeds.setForeground(Color.BLACK);
        jDrink.setForeground(Color.BLACK);
        jSnacks.setForeground(Color.WHITE);
        jHouseUtensils.setForeground(Color.BLACK);
    }//GEN-LAST:event_jSnacksActionPerformed

    private void jHouseUtensilsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHouseUtensilsActionPerformed
        SnacksScroll.setVisible(false);
        DrinksScroll.setVisible(false);
        HouseUtensilsScroll.setVisible(true);
        BabyNeedsScroll.setVisible(false);
        jBabyNeeds.setBackground(new java.awt.Color(255, 102, 0));
        jDrink.setBackground(new java.awt.Color(255, 102, 0));
        jSnacks.setBackground(new java.awt.Color(255, 102, 0));
        jHouseUtensils.setBackground(new java.awt.Color(0, 153, 102));
        
        jBabyNeeds.setForeground(Color.BLACK);
        jDrink.setForeground(Color.BLACK);
        jSnacks.setForeground(Color.BLACK);
        jHouseUtensils.setForeground(Color.WHITE);
    }//GEN-LAST:event_jHouseUtensilsActionPerformed

    private void IMSButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMSButtonActionPerformed
        POS.setVisible(false);
        IMS.setVisible(true);
        ADM.setVisible(false);
        SET.setVisible(false);
        
        ImageIcon icon = new ImageIcon("C:\\Users\\Charles Andrei\\Documents\\NetBeansProjects\\try\\src\\icons\\posd.png");
        POSButton.setIcon(icon);
        ImageIcon icon1 = new ImageIcon("C:\\Users\\Charles Andrei\\Documents\\NetBeansProjects\\try\\src\\icons\\imse.png");
        IMSButton.setIcon(icon1);
        ImageIcon icon2 = new ImageIcon("C:\\Users\\Charles Andrei\\Documents\\NetBeansProjects\\try\\src\\icons\\admd.png");
        ADMButton.setIcon(icon2);
        ImageIcon icon3 = new ImageIcon("C:\\Users\\Charles Andrei\\Documents\\NetBeansProjects\\try\\src\\icons\\setd.png");
        SETButton.setIcon(icon3);
    }//GEN-LAST:event_IMSButtonActionPerformed

    private void ADMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMButtonActionPerformed
        POS.setVisible(false);
        IMS.setVisible(false);
        ADM.setVisible(true);
        SET.setVisible(false);
        
        ImageIcon icon = new ImageIcon("C:\\Users\\Charles Andrei\\Documents\\NetBeansProjects\\try\\src\\icons\\posd.png");
        POSButton.setIcon(icon);
        ImageIcon icon1 = new ImageIcon("C:\\Users\\Charles Andrei\\Documents\\NetBeansProjects\\try\\src\\icons\\imsd.png");
        IMSButton.setIcon(icon1);
        ImageIcon icon2 = new ImageIcon("C:\\Users\\Charles Andrei\\Documents\\NetBeansProjects\\try\\src\\icons\\amde.png");
        ADMButton.setIcon(icon2);
        ImageIcon icon3 = new ImageIcon("C:\\Users\\Charles Andrei\\Documents\\NetBeansProjects\\try\\src\\icons\\setd.png");
        SETButton.setIcon(icon3);
        
        new AdminPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ADMButtonActionPerformed

    private void SETButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SETButtonActionPerformed
        POS.setVisible(false);
        IMS.setVisible(false);
        ADM.setVisible(false);
        SET.setVisible(true);
        
        ImageIcon icon = new ImageIcon("C:\\Users\\Charles Andrei\\Documents\\NetBeansProjects\\try\\src\\icons\\posd.png");
        POSButton.setIcon(icon);
        ImageIcon icon1 = new ImageIcon("C:\\Users\\Charles Andrei\\Documents\\NetBeansProjects\\try\\src\\icons\\imsd.png");
        IMSButton.setIcon(icon1);
        ImageIcon icon2 = new ImageIcon("C:\\Users\\Charles Andrei\\Documents\\NetBeansProjects\\try\\src\\icons\\admd.png");
        ADMButton.setIcon(icon2);
        ImageIcon icon3 = new ImageIcon("C:\\Users\\Charles Andrei\\Documents\\NetBeansProjects\\try\\src\\icons\\sete.png");
        SETButton.setIcon(icon3);
    }//GEN-LAST:event_SETButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String itemName = "PILLOWS";
        int itemQty = 1;
        double itemPrice = 10.50;

        updateItem(itemName, itemQty, itemPrice,jButton3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        ItemSummary.setVisible(false);
        DiscountPage.setVisible(true);
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        if (jTextArea2.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please choose an item.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        ItemSummary.setVisible(false);
        PaymentMethod.setVisible(true);
    }
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        PaymentMethod.setVisible(false);
        DiscountPage.setVisible(true);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        ItemSummary.setVisible(true);
        PaymentMethod.setVisible(false);
    }//GEN-LAST:event_jButton41ActionPerformed
    
    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        Cash.setVisible(false);
        Payment.setVisible(true);
        
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        DiscountPage.setVisible(false);
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        Cash.setVisible(true);
        Payment.setVisible(false);
    }//GEN-LAST:event_jButton58ActionPerformed

    private JTextArea findJTextArea2(JPanel jPanel6) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private JTextField findJTextField2(JPanel jPanel6) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class PaymentMethod {

        public PaymentMethod() {
        }

        private void setJTextArea3Text(String text) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class jTextArea5 {

        private static void setText(String text) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public jTextArea5() {
        }
    }
    class Item {
    String itemName;
    int itemQty;
    double itemPrice;

    public Item(String itemName, int itemQty, double itemPrice) {
        this.itemName = itemName;
        this.itemQty = itemQty;
        this.itemPrice = itemPrice;
    }
}

    private List <Item> itemList = new ArrayList<>();
    private int jButton2QtyCounter = 1;
    private int jButton9QtyCounter = 1;
    private int jButton10QtyCounter = 1;
    
    private void updateTextFieldWithItemInfo() {
    StringBuilder entry = new StringBuilder();
    double subTotal = 0.0;
    
    for (Item item : itemList) {
        entry.append("Item Name: ").append(item.itemName)
                .append("\nItem Qty.: ").append(item.itemQty)
                .append("\nPrice: P ").append(item.itemPrice)
                .append("\n\n"); 
        subTotal += item.itemPrice;
    }
    
    double vatRate = 0.12;
    double vat = subTotal * vatRate;
    double total = subTotal + vat;
    double change;
    
    jTextArea1.setText(""); 
    jTextArea1.append(entry.toString());
    
    String formattedVatRate = String.format("%.0f%%", vatRate * 100);
    
    jTextArea2.setText("                     Sub-Total: P " + String.format("%.2f",subTotal)
        + "         \n                     VAT " + formattedVatRate + ": P " + String.format("%.2f",vat)
        +   "       \n                             "
        + "         \n                     Total: P " + String.format("%.2f",(subTotal - vat)));
    
    jTextArea4.setText(jTextArea2.getText());
}   
    private void updateItem(String itemName, int itemQty, double itemPrice ,JButton button) {
      
    for (Item item : itemList) {
        if (item.itemName.equals(itemName)) {
            item.itemQty += itemQty;
            item.itemPrice += (itemPrice + itemQty);
            updateTextFieldWithItemInfo();
            return;
        }
    }
        itemList.add(new Item(itemName, itemQty, itemPrice + itemQty));
        updateTextFieldWithItemInfo();   
}
    private void clearItems(){
        itemList.clear();
        updateTextFieldWithItemInfo();
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String itemName = "PIATTOS";
        int itemQty = 1;
        double itemPrice = 34.55;

    updateItem(itemName, itemQty, itemPrice, jButton2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String itemName = "NOVA";
    int itemQty = 1;
    double itemPrice = 35.50;

    updateItem(itemName, itemQty, itemPrice,jButton9);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String itemName = "VCUT";
        int itemQty = 1;
        double itemPrice = 32.00;

        updateItem(itemName, itemQty, itemPrice,jButton10);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String itemName = "LAYS";
        int itemQty = 1;
        double itemPrice = 162.00;

        updateItem(itemName, itemQty, itemPrice,jButton4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String itemName = "CHEETOS";
        int itemQty = 1;
        double itemPrice = 144.00;

        updateItem(itemName, itemQty, itemPrice,jButton5);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String itemName = "SWEET CORN";
        int itemQty = 1;
        double itemPrice = 130.00;

        updateItem(itemName, itemQty, itemPrice,jButton6);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String itemName = "TOMI";
        int itemQty = 1;
        double itemPrice = 27.75;

        updateItem(itemName, itemQty, itemPrice,jButton7);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String itemName = "NAGARAYA";
        int itemQty = 1;
        double itemPrice = 25.00;

        updateItem(itemName, itemQty, itemPrice,jButton8);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String itemName = "DINGDONG";
        int itemQty = 1;
        double itemPrice = 64.00;

        updateItem(itemName, itemQty, itemPrice,jButton11);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String itemName = "BOY BAWANG";
        int itemQty = 1;
        double itemPrice = 41.50;

        updateItem(itemName, itemQty, itemPrice,jButton12);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        String itemName = "CRACKLING";
        int itemQty = 1;
        double itemPrice = 58.50;

        updateItem(itemName, itemQty, itemPrice,jButton13);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String itemName = "MONSTER";
        int itemQty = 1;
        double itemPrice = 58.50;

        updateItem(itemName, itemQty, itemPrice,jButton14);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        String itemName = "BANG Power Drink";
        int itemQty = 1;
        double itemPrice = 78.50;

        updateItem(itemName, itemQty, itemPrice,jButton15);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        String itemName = "POCARI SWEAT";
        int itemQty = 1;
        double itemPrice = 57.25;

        updateItem(itemName, itemQty, itemPrice,jButton16);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        String itemName = "ROYAL";
        int itemQty = 1;
        double itemPrice = 20.00;

        updateItem(itemName, itemQty, itemPrice,jButton17);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        String itemName = "SPRITE";
        int itemQty = 1;
        double itemPrice = 82.00;

        updateItem(itemName, itemQty, itemPrice,jButton18);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        String itemName = "TROPICANA";
        int itemQty = 1;
        double itemPrice = 28.50;

        updateItem(itemName, itemQty, itemPrice,jButton19);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        String itemName = "SMART - C";
        int itemQty = 1;
        double itemPrice = 30.00;

        updateItem(itemName, itemQty, itemPrice,jButton20);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        String itemName = "MINUTE MAID";
        int itemQty = 1;
        double itemPrice = 16.20;

        updateItem(itemName, itemQty, itemPrice,jButton21);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        String itemName = "AIR PURIFIER";
        int itemQty = 1;
        double itemPrice = 999.00;

        updateItem(itemName, itemQty, itemPrice,jButton22);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        String itemName = "MOP";
        int itemQty = 1;
        double itemPrice = 899.00;

        updateItem(itemName, itemQty, itemPrice,jButton23);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        String itemName = "CASSEROLE";
        int itemQty = 1;
        double itemPrice = 999.00;

        updateItem(itemName, itemQty, itemPrice,jButton24);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        String itemName = "POT BUNDLE";
        int itemQty = 1;
        double itemPrice = 799.00;

        updateItem(itemName, itemQty, itemPrice,jButton25);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        String itemName = "DISH WASHING LIQUID";
        int itemQty = 1;
        double itemPrice = 322.00;

        updateItem(itemName, itemQty, itemPrice,jButton26);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        String itemName = "CUTTING BOARD";
        int itemQty = 1;
        double itemPrice = 250.50;

        updateItem(itemName, itemQty, itemPrice,jButton27);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        String itemName = "SCRUB";
        int itemQty = 1;
        double itemPrice = 12.50;

        updateItem(itemName, itemQty, itemPrice,jButton28);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        String itemName = "CARPET";
        int itemQty = 1;
        double itemPrice = 999.75;

        updateItem(itemName, itemQty, itemPrice,jButton29);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        String itemName = "PLASTIC CONTAINERS";
        int itemQty = 1;
        double itemPrice = 130;

        updateItem(itemName, itemQty, itemPrice,jButton30);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        String itemName = "KLEENEX TISSUE PAPER";
        int itemQty = 1;
        double itemPrice = 99.50;

        updateItem(itemName, itemQty, itemPrice,jButton31);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        String itemName = "HANGER";
        int itemQty = 1;
        double itemPrice = 120.00;

        updateItem(itemName, itemQty, itemPrice,jButton32);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        String itemName = "KNIVES";
        int itemQty = 1;
        double itemPrice = 629.00;

        updateItem(itemName, itemQty, itemPrice,jButton33);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        String itemName = "BABY SOCKS";
        int itemQty = 1;
        double itemPrice = 24.25;

        updateItem(itemName, itemQty, itemPrice,jButton34);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        String itemName = "BABY SHOES";
        int itemQty = 1;
        double itemPrice = 108.50;

        updateItem(itemName, itemQty, itemPrice,jButton35);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        String itemName = "BABY STROLLER";
        int itemQty = 1;
        double itemPrice = 995.00;

        updateItem(itemName, itemQty, itemPrice,jButton46);
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        String itemName = "BABY CRIB";
        int itemQty = 1;
        double itemPrice = 995.00;

        updateItem(itemName, itemQty, itemPrice,jButton47);
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        String itemName = "BABY SOAP";
        int itemQty = 1;
        double itemPrice = 127.75;

        updateItem(itemName, itemQty, itemPrice,jButton48);
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        String itemName = "BABY CLOTHES";
        int itemQty = 1;
        double itemPrice = 170.50;

        updateItem(itemName, itemQty, itemPrice,jButton49);
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        String itemName = "BABY BOTTLES";
        int itemQty = 1;
        double itemPrice = 238.00;

        updateItem(itemName, itemQty, itemPrice,jButton50);
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        String itemName = "BABY TEETHER";
        int itemQty = 1;
        double itemPrice = 148.00;

        updateItem(itemName, itemQty, itemPrice,jButton51);
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        String itemName = "HUGGIES BABY DIAPER";
        int itemQty = 1;
        double itemPrice = 429.00;

        updateItem(itemName, itemQty, itemPrice,jButton52);
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        String itemName = "BABY SPOON";
        int itemQty = 1;
        double itemPrice = 60.75;

        updateItem(itemName, itemQty, itemPrice,jButton53);
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        String itemName = "BABY MILK";
        int itemQty = 1;
        double itemPrice = 650.00;

        updateItem(itemName, itemQty, itemPrice,jButton55);
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        String itemName = "BABY TOYS";
        int itemQty = 1;
        double itemPrice = 225.00;

        updateItem(itemName, itemQty, itemPrice,jButton56);
    }//GEN-LAST:event_jButton56ActionPerformed
    private double totalPrice = 0.00;
    private double change = 0.00;
    
    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        double price = 100.00;
        totalPrice += price;
        updateTotalAndChange();
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        double price = 200.00;
        totalPrice += price;
        updateTotalAndChange();
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        double price = 500.00;
        totalPrice += price;
        updateTotalAndChange();
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        double price = 1000.00;
        totalPrice += price;
        updateTotalAndChange();
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        try {
        double userInput = Double.parseDouble(jTextField1.getText().trim());
        totalPrice = userInput;
        updateTotalAndChange();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        jTextField1.setText("");
    }
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Logout().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        new Confirm().setVisible(true);
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        if (itemList.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No items selected.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Item mostRecentItem = itemList.get(itemList.size() - 1);
    mostRecentItem.itemQty++;
    updateTextFieldWithItemInfo();

    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        if (itemList.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No items selected.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Item mostRecentItem = itemList.get(itemList.size() - 1);

    mostRecentItem.itemQty--;

    updateTextFieldWithItemInfo();
                              
    }//GEN-LAST:event_jButton38ActionPerformed
   
    private void updateTotalAndChange() {
        double changeValue = calculateChange();
    jTextField1.setText(String.format("Total: %.2f%nChange: %.2f", totalPrice, calculateChange()));
}

private double calculateChange() {
    double total = extractTotalFromTextArea2();
    double vatRate = 0.12;
    double vat = total * vatRate;
    double subTotal = total - vat;
    return subTotal - totalPrice;
}

private double extractTotalFromTextArea2() {
    try {
        String text = jTextArea2.getText();
        int totalIndex = text.indexOf("Total: P ") + "Total: P ".length();
        int endIndex = text.indexOf("\n", totalIndex);
        String totalString = text.substring(totalIndex, endIndex).trim();
        return Double.parseDouble(totalString);
    } catch (NumberFormatException | IndexOutOfBoundsException e) {
        e.printStackTrace();
        return 0.0;
    }
}
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ADM;
    private javax.swing.JButton ADMButton;
    private javax.swing.JPanel BabyNeedsPage;
    private javax.swing.JScrollPane BabyNeedsScroll;
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Cash;
    private javax.swing.JPanel DiscountPage;
    private javax.swing.JPanel DrinksPage;
    private javax.swing.JScrollPane DrinksScroll;
    private javax.swing.JPanel HouseUtensilsPage;
    private javax.swing.JScrollPane HouseUtensilsScroll;
    private javax.swing.JPanel IMS;
    private javax.swing.JButton IMSButton;
    private javax.swing.JPanel ItemSummary;
    private javax.swing.JLayeredPane MenuPanels;
    private javax.swing.JLayeredPane Method;
    private javax.swing.JPanel POS;
    private javax.swing.JButton POSButton;
    private javax.swing.JPanel Payment;
    private javax.swing.JPanel PaymentMethod;
    private javax.swing.JLayeredPane PaymentPane;
    private javax.swing.JLayeredPane ProductPanels;
    private javax.swing.JPanel Receipt;
    private javax.swing.JPanel SET;
    private javax.swing.JButton SETButton;
    private javax.swing.JPanel SnacksPage;
    private javax.swing.JScrollPane SnacksScroll;
    private javax.swing.JButton jBabyNeeds;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jDrink;
    private javax.swing.JButton jHouseUtensils;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jSnacks;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
