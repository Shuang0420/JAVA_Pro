package javapro;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author lingyanjiang
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        bgPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        dashButton = new javax.swing.JButton();
        statReportButton = new javax.swing.JButton();
        otherReportButton = new javax.swing.JButton();
        customizeButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        welcomePane = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        graphPanel = new javax.swing.JPanel();
        selectYearPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox();
        yearButton = new javax.swing.JButton();
        jchartScrollPane = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        graphPanelByYear = new javax.swing.JPanel();
        updatePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pathLabel = new javax.swing.JLabel();
        dashScrollPane = new javax.swing.JScrollPane(dashPane);
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dashPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1030, 700));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        bgPanel.setBackground(new java.awt.Color(235, 236, 238));
        bgPanel.setPreferredSize(new java.awt.Dimension(1000, 700));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topPanel.setBackground(new java.awt.Color(49, 209, 235));
        topPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Dashboard");
        topPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/top.jpg"))); // NOI18N
        topPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bgPanel.add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 80));

        leftPanel.setBackground(new java.awt.Color(38, 42, 51));
        leftPanel.setPreferredSize(new java.awt.Dimension(177, 800));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button_1.png")));
        dashButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button_1p.png")));
        dashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashButtonActionPerformed(evt);
            }
        });
        leftPanel.add(dashButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 60));

        statReportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button_2.png")));
        statReportButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button_2p.png")));
        statReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statReportButtonActionPerformed(evt);
            }
        });
        leftPanel.add(statReportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 150, 60));

        otherReportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button_3.png")));
        otherReportButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button_3p.png")));
        leftPanel.add(otherReportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 150, 60));

        customizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button_4.png")));
        customizeButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button_4p.png")));
        customizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customizeButtonActionPerformed(evt);
            }
        });
        leftPanel.add(customizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 150, 60));

        bgPanel.add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        mainPanel.setBackground(new java.awt.Color(235, 236, 238));
        mainPanel.setLayout(new java.awt.CardLayout());
        CardLayout c = (CardLayout)mainPanel.getLayout();

        welcomePane.setBackground(new java.awt.Color(235, 236, 238));
        welcomePane.setPreferredSize(new java.awt.Dimension(851, 260));
        welcomePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 177, 252));
        jLabel5.setText("Click left buttons to view reports.");
        welcomePane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Dashboard: View total report for data from 2010-2014.");
        welcomePane.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Statistics Report: View report by year.");
        welcomePane.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Other Report: In-depth analytical report.");
        welcomePane.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Customize Report: Add your data to exist data.");
        welcomePane.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/triangle.png"))); // NOI18N
        welcomePane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 750, 520));

        jLabel12.setFont(new java.awt.Font("Avenir Next", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 166, 220));
        jLabel12.setText("Welcome!");
        welcomePane.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        mainPanel.add(welcomePane, "welcome");

        graphPanel.setBackground(new java.awt.Color(235, 236, 238));

        selectYearPanel.setBackground(new java.awt.Color(235, 236, 238));

        jLabel2.setText("Select year: ");

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Click here to choose", "2011", "2012", "2013", "2014" }));
        yearComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                yearComboBoxItemStateChanged(evt);
            }
        });
        yearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboBoxActionPerformed(evt);
            }
        });

        yearButton.setText("See result");
        yearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectYearPanelLayout = new javax.swing.GroupLayout(selectYearPanel);
        selectYearPanel.setLayout(selectYearPanelLayout);
        selectYearPanelLayout.setHorizontalGroup(
            selectYearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectYearPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(yearButton)
                .addContainerGap())
        );
        selectYearPanelLayout.setVerticalGroup(
            selectYearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectYearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(yearButton))
        );

        jchartScrollPane.setBackground(new java.awt.Color(235, 236, 238));
        jchartScrollPane.setBorder(null);
        //jchartScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(235, 236, 238));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(851, 1244));

        graphPanelByYear.setBackground(new java.awt.Color(235, 236, 238));
        graphPanelByYear.setPreferredSize(new java.awt.Dimension(851, 1244));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 851, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(graphPanelByYear, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 944, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(graphPanelByYear, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)))
        );

        jchartScrollPane.setViewportView(jPanel1);

        javax.swing.GroupLayout graphPanelLayout = new javax.swing.GroupLayout(graphPanel);
        graphPanel.setLayout(graphPanelLayout);
        graphPanelLayout.setHorizontalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graphPanelLayout.createSequentialGroup()
                .addComponent(selectYearPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
            .addGroup(graphPanelLayout.createSequentialGroup()
                .addComponent(jchartScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        graphPanelLayout.setVerticalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graphPanelLayout.createSequentialGroup()
                .addComponent(selectYearPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jchartScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
        );

        mainPanel.add(graphPanel, "graphPanel");

        updatePanel.setBackground(new java.awt.Color(235, 236, 238));

        jLabel3.setText("Choose file:");

        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Upload");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pathLabel.setText("Path:");

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pathLabel)
                .addContainerGap(539, Short.MAX_VALUE))
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1)
                    .addComponent(pathLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(476, Short.MAX_VALUE))
        );

        mainPanel.add(updatePanel, "update");

        dashScrollPane.setBackground(new java.awt.Color(235, 236, 238));
        dashScrollPane.setBorder(null);
        dashScrollPane.setPreferredSize(new java.awt.Dimension(851, 620));
        dashScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel3.setPreferredSize(new java.awt.Dimension(851, 848));
        jPanel3.setSize(new java.awt.Dimension(851, 848));

        jPanel2.setBackground(new java.awt.Color(235, 236, 238));
        jPanel2.setPreferredSize(new java.awt.Dimension(851, 115));

        jLabel10.setFont(new java.awt.Font("Shree Devanagari 714", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 191, 218));
        jLabel10.setText("Total Records");

        jLabel11.setFont(new java.awt.Font("Shree Devanagari 714", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText(String.valueOf(Handler.getTotalRecord()));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        dashPane.setBackground(new java.awt.Color(235, 236, 238));
        dashPane.setMinimumSize(new java.awt.Dimension(851, 848));
        dashPane.setPreferredSize(new java.awt.Dimension(851, 848));
        dashPane.setSize(new java.awt.Dimension(851, 848));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashPane, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 140, Short.MAX_VALUE)
                .addComponent(dashPane, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 706, Short.MAX_VALUE)))
        );

        dashScrollPane.setViewportView(jPanel3);

        mainPanel.add(dashScrollPane, "maincard");

        bgPanel.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 850, 620));

        getContentPane().add(bgPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashButtonActionPerformed
        CardLayout c = (CardLayout)mainPanel.getLayout(); 
        jLabel11.setText(String.valueOf(Handler.getTotalRecord()));
        c.show(mainPanel, "maincard");
        dashPane.removeAll();
        generalReport();
    }//GEN-LAST:event_dashButtonActionPerformed

public void generalReport()
{
        CardLayout c = (CardLayout)mainPanel.getLayout(); 
        c.show(mainPanel, "card5");
        ChartPanel p1 = null;
        ChartPanel p2 = null;
        ChartPanel p3 = null;
        ChartPanel p4 = null;
        try {
            p1 = Handler.getChart("Number of students by gender","categoryy", "SELECT Gender,count(1) as 'Number of Student' FROM studentinfor.student2 group by Gender;");
            p2 = Handler.getChart("Number of students by gender","pie", "SELECT Gender,count(1) FROM studentinfor.student2 group by Gender;");
            p3 = Handler.getChart("Average GPA by year","line", "SELECT Year,AVG(GPA) as 'GPA' FROM studentinfor.student2 group by Year;");
            p4 = Handler.getChart("Number of students by education field","pie", "SELECT educationfield,count(1) FROM studentinfor.student2 group by educationfield;");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        addChart(p1,dashPane);
        addChart(p2,dashPane);
        addChart(p3,dashPane);  
        addChart(p4,dashPane); 
}
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser jf = new JFileChooser(); 
        jf.showDialog(null,null); 
        File fi = jf.getSelectedFile(); 
        String file = fi.getAbsolutePath(); 
        pathLabel.setText(file);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void customizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customizeButtonActionPerformed
        CardLayout c = (CardLayout)mainPanel.getLayout();
        c.show(mainPanel, "update");
    }//GEN-LAST:event_customizeButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Dbconnection.connectDatabase(pathLabel.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void statReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statReportButtonActionPerformed
        
        CardLayout c = (CardLayout)mainPanel.getLayout();
        c.show(mainPanel, "graphPanel");
    }//GEN-LAST:event_statReportButtonActionPerformed

    private void yearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearComboBoxActionPerformed

    private void yearComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_yearComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_yearComboBoxItemStateChanged

    private void yearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearButtonActionPerformed
        int index = yearComboBox.getSelectedIndex();
        switch(index) {
            case 1:
                graphPanelByYear.removeAll();
                addChart(DbImplement.genderByYear("2011"),graphPanelByYear);
                addChart(DbImplement.citizenshipByYear("2011"),graphPanelByYear);
                addChart(DbImplement.GREByYear("2011"), graphPanelByYear);
                addChart(DbImplement.GMATByYear("2011"), graphPanelByYear);
                addChart(DbImplement.SATByYear("2011"), graphPanelByYear);
                addChart(DbImplement.SalaryByYear("2011"), graphPanelByYear);
                addChart(DbImplement.courseByYear("2011"), graphPanelByYear);
                break;
            case 2:
                graphPanelByYear.removeAll();
                addChart(DbImplement.genderByYear("2012"),graphPanelByYear);
                addChart(DbImplement.citizenshipByYear("2012"),graphPanelByYear);
                addChart(DbImplement.GREByYear("2012"), graphPanelByYear);
                addChart(DbImplement.GMATByYear("2012"), graphPanelByYear);
                addChart(DbImplement.SATByYear("2012"), graphPanelByYear);
                addChart(DbImplement.SalaryByYear("2012"), graphPanelByYear);
                addChart(DbImplement.courseByYear("2012"), graphPanelByYear);
                break;
            case 3:
                graphPanelByYear.removeAll();
                addChart(DbImplement.genderByYear("2013"),graphPanelByYear);
                addChart(DbImplement.citizenshipByYear("2013"),graphPanelByYear);
                addChart(DbImplement.GREByYear("2013"), graphPanelByYear);
                addChart(DbImplement.GMATByYear("2013"), graphPanelByYear);
                addChart(DbImplement.SATByYear("2013"), graphPanelByYear);
                addChart(DbImplement.SalaryByYear("2013"), graphPanelByYear);
                addChart(DbImplement.courseByYear("2013"), graphPanelByYear);
                break;
            case 4:
                graphPanelByYear.removeAll();
                addChart(DbImplement.genderByYear("2014"),graphPanelByYear);
                addChart(DbImplement.citizenshipByYear("2014"),graphPanelByYear);
                addChart(DbImplement.GREByYear("2014"), graphPanelByYear);
                addChart(DbImplement.GMATByYear("2014"), graphPanelByYear);
                addChart(DbImplement.SATByYear("2014"), graphPanelByYear);
                addChart(DbImplement.courseByYear("2014"), graphPanelByYear);
                break;
        }
    }//GEN-LAST:event_yearButtonActionPerformed

    /**
     * This method add chart to the main panel
     * @param chart 
     */
    public void addChart(ChartPanel chart,JPanel panel) {
        panel.add(chart);
        panel.validate();
    }
    
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton customizeButton;
    private javax.swing.JButton dashButton;
    private javax.swing.JPanel dashPane;
    private javax.swing.JScrollPane dashScrollPane;
    private javax.swing.JPanel graphPanel;
    private javax.swing.JPanel graphPanelByYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jchartScrollPane;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton otherReportButton;
    private javax.swing.JLabel pathLabel;
    private javax.swing.JPanel selectYearPanel;
    private javax.swing.JButton statReportButton;
    private javax.swing.JPanel topPanel;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JPanel welcomePane;
    private javax.swing.JButton yearButton;
    private javax.swing.JComboBox yearComboBox;
    // End of variables declaration//GEN-END:variables
}
