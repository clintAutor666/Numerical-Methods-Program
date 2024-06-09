    package nm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.beans.Expression;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import net.objecthunter.exp4j.ExpressionBuilder;
import org.jfree.chart.plot.PlotOrientation;

public class dash extends javax.swing.JFrame {
    public dash() {
        initComponents();
        //graph.setVisible(false);
        incremental.setVisible(false);
        bisection.setVisible(false);
        simplefix.setVisible(false);
        regulafalse.setVisible(false);
        newtonrapson.setVisible(false);
        secant.setVisible(false);
        graph.setVisible(true);
        DefaultTableModel model = (DefaultTableModel) tab1.getModel();
            model.setRowCount(0);
            model.setColumnIdentifiers(new String[]{"Iterations", "xL", "xR", "xU", "f(xl)", "f(xU)", "Error", "f(xl)*f(xU)"});
    }
  
private double valL = Double.NEGATIVE_INFINITY; // Initialize xL and xU as global variables
   private double valU = Double.POSITIVE_INFINITY;
   private int IterationCount = 1; // Initialize total iteration count as global variable
   private List<Double> rootsList = new ArrayList<>();
   
   private double evaluateFunc(String equationStr, double x) {
    try {
        net.objecthunter.exp4j.Expression expression = new ExpressionBuilder(equationStr)
                .variable("x")
                .build()
                .setVariable("x", x);
        return expression.evaluate();
    } catch (Exception e) {
        e.printStackTrace();
        return Double.NaN;
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        background = new javax.swing.JPanel();
        bisection = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tab3 = new javax.swing.JTable();
        graph3 = new javax.swing.JPanel();
        bmRoot = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bmEqt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        xl = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        xu = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        incremental = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        imEqt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        deltaX = new javax.swing.JTextField();
        imRoot = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        graph2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tab1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        graph = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        eqt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        approRoot = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        graph1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        regulafalse = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tab4 = new javax.swing.JTable();
        graph4 = new javax.swing.JPanel();
        regularoot = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        regulaequation = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        regulaxl = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        regulaxu = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        simplefix = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tab5 = new javax.swing.JTable();
        simplefixgraph5 = new javax.swing.JPanel();
        simplefixroot = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        simplefixeq1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        simplefixxl = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        newtonrapson = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tab6 = new javax.swing.JTable();
        graph5 = new javax.swing.JPanel();
        newtonrapsonroot = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        newtonrapsoneq = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        newtonrapsonxl = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        secant = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tab7 = new javax.swing.JTable();
        graph6 = new javax.swing.JPanel();
        secantroot = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        secantequation = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        secantxl = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        secantxu = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(1184, 715));
        jPanel1.setMinimumSize(new java.awt.Dimension(1184, 715));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(74, 120, 125));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select Method:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 10, 160, 40);

        jButton2.setBackground(new java.awt.Color(254, 176, 106));
        jButton2.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Graphing");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(190, 10, 100, 40);

        jButton3.setBackground(new java.awt.Color(254, 176, 106));
        jButton3.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Incremental");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(300, 10, 120, 40);

        jButton7.setBackground(new java.awt.Color(254, 176, 106));
        jButton7.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Bisection");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(430, 10, 100, 40);

        jButton4.setBackground(new java.awt.Color(254, 176, 106));
        jButton4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Regula False");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(540, 10, 120, 40);

        jButton8.setBackground(new java.awt.Color(254, 176, 106));
        jButton8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Simple Fixed Point");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(670, 10, 160, 40);

        jButton9.setBackground(new java.awt.Color(254, 176, 106));
        jButton9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Newton Raphson");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);
        jButton9.setBounds(840, 10, 150, 40);

        jButton10.setBackground(new java.awt.Color(254, 176, 106));
        jButton10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Secant");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10);
        jButton10.setBounds(1000, 10, 130, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 20, 1140, 60);

        background.setBackground(new java.awt.Color(74, 120, 125));
        background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        background.setLayout(null);

        bisection.setBackground(new java.awt.Color(74, 120, 125));
        bisection.setLayout(null);

        tab3.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        tab3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteration", "xL", "xR", "xU", "f(xL)", "f(xR)", "Error"
            }
        ));
        tab3.setEnabled(false);
        tab3.setFocusable(false);
        tab3.getTableHeader().setResizingAllowed(false);
        tab3.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tab3);

        bisection.add(jScrollPane4);
        jScrollPane4.setBounds(420, 140, 690, 400);

        graph3.setBackground(new java.awt.Color(255, 255, 255));
        graph3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        graph3.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout graph3Layout = new javax.swing.GroupLayout(graph3);
        graph3.setLayout(graph3Layout);
        graph3Layout.setHorizontalGroup(
            graph3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        graph3Layout.setVerticalGroup(
            graph3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        bisection.add(graph3);
        graph3.setBounds(10, 140, 400, 400);

        bmRoot.setBackground(new java.awt.Color(74, 120, 125));
        bmRoot.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        bmRoot.setForeground(new java.awt.Color(255, 255, 255));
        bmRoot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        bmRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmRootActionPerformed(evt);
            }
        });
        bisection.add(bmRoot);
        bmRoot.setBounds(500, 80, 310, 40);

        jLabel10.setBackground(new java.awt.Color(74, 120, 125));
        jLabel10.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Approximate Root:");
        bisection.add(jLabel10);
        jLabel10.setBounds(320, 80, 190, 40);

        jLabel11.setBackground(new java.awt.Color(74, 120, 125));
        jLabel11.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Equation:");
        bisection.add(jLabel11);
        jLabel11.setBounds(210, 20, 130, 40);

        bmEqt.setBackground(new java.awt.Color(74, 120, 125));
        bmEqt.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        bmEqt.setForeground(new java.awt.Color(255, 255, 255));
        bmEqt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        bmEqt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmEqtActionPerformed(evt);
            }
        });
        bmEqt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bmEqtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bmEqtKeyTyped(evt);
            }
        });
        bisection.add(bmEqt);
        bmEqt.setBounds(320, 20, 190, 40);

        jLabel12.setBackground(new java.awt.Color(74, 120, 125));
        jLabel12.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("xL");
        bisection.add(jLabel12);
        jLabel12.setBounds(520, 20, 30, 40);

        xl.setBackground(new java.awt.Color(74, 120, 125));
        xl.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        xl.setForeground(new java.awt.Color(255, 255, 255));
        xl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        xl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xlActionPerformed(evt);
            }
        });
        xl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                xlKeyTyped(evt);
            }
        });
        bisection.add(xl);
        xl.setBounds(560, 20, 80, 40);

        jLabel13.setBackground(new java.awt.Color(74, 120, 125));
        jLabel13.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("xU");
        bisection.add(jLabel13);
        jLabel13.setBounds(650, 20, 40, 40);

        xu.setBackground(new java.awt.Color(74, 120, 125));
        xu.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        xu.setForeground(new java.awt.Color(255, 255, 255));
        xu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        xu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xuActionPerformed(evt);
            }
        });
        xu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                xuKeyTyped(evt);
            }
        });
        bisection.add(xu);
        xu.setBounds(700, 20, 90, 40);

        jButton6.setBackground(new java.awt.Color(254, 176, 106));
        jButton6.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Calculate");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        bisection.add(jButton6);
        jButton6.setBounds(820, 20, 140, 40);

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Bison Bold", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("BISECTION");
        bisection.add(jLabel24);
        jLabel24.setBounds(40, 30, 80, 30);

        background.add(bisection);
        bisection.setBounds(10, 10, 1120, 550);

        incremental.setBackground(new java.awt.Color(74, 120, 125));
        incremental.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Equation:");
        incremental.add(jLabel5);
        jLabel5.setBounds(200, 10, 130, 40);

        imEqt.setBackground(new java.awt.Color(74, 120, 125));
        imEqt.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        imEqt.setForeground(new java.awt.Color(255, 255, 255));
        imEqt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        imEqt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imEqtActionPerformed(evt);
            }
        });
        imEqt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                imEqtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                imEqtKeyTyped(evt);
            }
        });
        incremental.add(imEqt);
        imEqt.setBounds(290, 10, 190, 40);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("xL");
        incremental.add(jLabel7);
        jLabel7.setBounds(500, 10, 30, 40);

        lb.setBackground(new java.awt.Color(74, 120, 125));
        lb.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        lb.setForeground(new java.awt.Color(255, 255, 255));
        lb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        lb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbActionPerformed(evt);
            }
        });
        lb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lbKeyTyped(evt);
            }
        });
        incremental.add(lb);
        lb.setBounds(530, 10, 80, 40);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("deltaX");
        incremental.add(jLabel9);
        jLabel9.setBounds(620, 10, 60, 40);

        deltaX.setBackground(new java.awt.Color(74, 120, 125));
        deltaX.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        deltaX.setForeground(new java.awt.Color(255, 255, 255));
        deltaX.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        deltaX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deltaXActionPerformed(evt);
            }
        });
        deltaX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                deltaXKeyTyped(evt);
            }
        });
        incremental.add(deltaX);
        deltaX.setBounds(680, 10, 90, 40);

        imRoot.setEditable(false);
        imRoot.setBackground(new java.awt.Color(74, 120, 125));
        imRoot.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        imRoot.setForeground(new java.awt.Color(255, 255, 255));
        imRoot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        imRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imRootActionPerformed(evt);
            }
        });
        incremental.add(imRoot);
        imRoot.setBounds(510, 70, 310, 40);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Approximate Root:");
        incremental.add(jLabel6);
        jLabel6.setBounds(320, 70, 180, 40);

        graph2.setBackground(new java.awt.Color(255, 255, 255));
        graph2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout graph2Layout = new javax.swing.GroupLayout(graph2);
        graph2.setLayout(graph2Layout);
        graph2Layout.setHorizontalGroup(
            graph2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        graph2Layout.setVerticalGroup(
            graph2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        incremental.add(graph2);
        graph2.setBounds(0, 140, 400, 400);

        tab1.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        tab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteration", "xL", "xR", "xU", "f(xL)", "f(xU)", "Error", "f(xL) * f(xU)"
            }
        ));
        tab1.setEnabled(false);
        tab1.setFocusable(false);
        tab1.getTableHeader().setResizingAllowed(false);
        tab1.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tab1);

        incremental.add(jScrollPane3);
        jScrollPane3.setBounds(410, 140, 710, 400);

        jButton5.setBackground(new java.awt.Color(254, 176, 106));
        jButton5.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Calculate");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        incremental.add(jButton5);
        jButton5.setBounds(780, 10, 140, 40);

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Bison Bold", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("INCREMENTAL");
        incremental.add(jLabel25);
        jLabel25.setBounds(40, 30, 110, 30);

        background.add(incremental);
        incremental.setBounds(10, 10, 1120, 550);

        graph.setBackground(new java.awt.Color(74, 120, 125));
        graph.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Equation:");
        graph.add(jLabel3);
        jLabel3.setBounds(210, 10, 130, 40);

        eqt.setBackground(new java.awt.Color(74, 120, 125));
        eqt.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        eqt.setForeground(new java.awt.Color(255, 255, 255));
        eqt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        eqt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eqtActionPerformed(evt);
            }
        });
        eqt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eqtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eqtKeyTyped(evt);
            }
        });
        graph.add(eqt);
        eqt.setBounds(310, 10, 250, 40);

        jLabel8.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("xL");
        graph.add(jLabel8);
        jLabel8.setBounds(590, 10, 30, 40);

        a.setBackground(new java.awt.Color(74, 120, 125));
        a.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aKeyTyped(evt);
            }
        });
        graph.add(a);
        a.setBounds(630, 10, 100, 40);

        approRoot.setEditable(false);
        approRoot.setBackground(new java.awt.Color(74, 120, 125));
        approRoot.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        approRoot.setForeground(new java.awt.Color(255, 255, 255));
        approRoot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        approRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approRootActionPerformed(evt);
            }
        });
        graph.add(approRoot);
        approRoot.setBounds(510, 70, 190, 40);

        jLabel4.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Approximate Root:");
        graph.add(jLabel4);
        jLabel4.setBounds(330, 70, 170, 40);

        graph1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        graph1.setForeground(new java.awt.Color(255, 255, 255));
        graph1.setLayout(null);
        graph.add(graph1);
        graph1.setBounds(20, 140, 500, 400);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        tab.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 12)); // NOI18N
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "x", "f(x)"
            }
        ));
        tab.setEnabled(false);
        tab.setFocusable(false);
        tab.getTableHeader().setResizingAllowed(false);
        tab.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tab);

        graph.add(jScrollPane2);
        jScrollPane2.setBounds(540, 140, 560, 400);

        jButton1.setBackground(new java.awt.Color(254, 176, 106));
        jButton1.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CALCULATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        graph.add(jButton1);
        jButton1.setBounds(760, 10, 140, 40);

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Bison Bold", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("graphing");
        graph.add(jLabel26);
        jLabel26.setBounds(40, 30, 80, 30);

        background.add(graph);
        graph.setBounds(10, 10, 1120, 550);

        regulafalse.setBackground(new java.awt.Color(74, 120, 125));
        regulafalse.setLayout(null);

        tab4.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        tab4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteration", "xL", "xU", "xR", "f(xL)", "f(xU)", "f(xR)", "Error"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab4.setEnabled(false);
        tab4.setFocusable(false);
        tab4.getTableHeader().setResizingAllowed(false);
        tab4.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tab4);

        regulafalse.add(jScrollPane5);
        jScrollPane5.setBounds(420, 140, 690, 400);

        graph4.setBackground(new java.awt.Color(255, 255, 255));
        graph4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        graph4.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout graph4Layout = new javax.swing.GroupLayout(graph4);
        graph4.setLayout(graph4Layout);
        graph4Layout.setHorizontalGroup(
            graph4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        graph4Layout.setVerticalGroup(
            graph4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        regulafalse.add(graph4);
        graph4.setBounds(10, 140, 400, 400);

        regularoot.setBackground(new java.awt.Color(74, 120, 125));
        regularoot.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        regularoot.setForeground(new java.awt.Color(255, 255, 255));
        regularoot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        regularoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regularootActionPerformed(evt);
            }
        });
        regulafalse.add(regularoot);
        regularoot.setBounds(500, 80, 310, 40);

        jLabel14.setBackground(new java.awt.Color(74, 120, 125));
        jLabel14.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Approximate Root:");
        regulafalse.add(jLabel14);
        jLabel14.setBounds(320, 80, 190, 40);

        jLabel15.setBackground(new java.awt.Color(74, 120, 125));
        jLabel15.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Equation:");
        regulafalse.add(jLabel15);
        jLabel15.setBounds(210, 20, 130, 40);

        regulaequation.setBackground(new java.awt.Color(74, 120, 125));
        regulaequation.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        regulaequation.setForeground(new java.awt.Color(255, 255, 255));
        regulaequation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        regulaequation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regulaequationActionPerformed(evt);
            }
        });
        regulaequation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                regulaequationKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                regulaequationKeyTyped(evt);
            }
        });
        regulafalse.add(regulaequation);
        regulaequation.setBounds(320, 20, 190, 40);

        jLabel16.setBackground(new java.awt.Color(74, 120, 125));
        jLabel16.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("xL");
        regulafalse.add(jLabel16);
        jLabel16.setBounds(520, 20, 30, 40);

        regulaxl.setBackground(new java.awt.Color(74, 120, 125));
        regulaxl.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        regulaxl.setForeground(new java.awt.Color(255, 255, 255));
        regulaxl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        regulaxl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regulaxlActionPerformed(evt);
            }
        });
        regulaxl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                regulaxlKeyTyped(evt);
            }
        });
        regulafalse.add(regulaxl);
        regulaxl.setBounds(560, 20, 80, 40);

        jLabel17.setBackground(new java.awt.Color(74, 120, 125));
        jLabel17.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("xU");
        regulafalse.add(jLabel17);
        jLabel17.setBounds(650, 20, 40, 40);

        regulaxu.setBackground(new java.awt.Color(74, 120, 125));
        regulaxu.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        regulaxu.setForeground(new java.awt.Color(255, 255, 255));
        regulaxu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        regulaxu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regulaxuActionPerformed(evt);
            }
        });
        regulaxu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                regulaxuKeyTyped(evt);
            }
        });
        regulafalse.add(regulaxu);
        regulaxu.setBounds(700, 20, 90, 40);

        jButton11.setBackground(new java.awt.Color(254, 176, 106));
        jButton11.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Calculate");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        regulafalse.add(jButton11);
        jButton11.setBounds(820, 20, 140, 40);

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Bison Bold", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("regula false");
        regulafalse.add(jLabel27);
        jLabel27.setBounds(40, 30, 110, 30);

        background.add(regulafalse);
        regulafalse.setBounds(10, 10, 1120, 550);

        simplefix.setBackground(new java.awt.Color(74, 120, 125));
        simplefix.setLayout(null);

        tab5.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        tab5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteration", "xL", "f(xL)", "error"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab5.setEnabled(false);
        tab5.setFocusable(false);
        tab5.getTableHeader().setResizingAllowed(false);
        tab5.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(tab5);

        simplefix.add(jScrollPane6);
        jScrollPane6.setBounds(420, 140, 690, 400);

        simplefixgraph5.setBackground(new java.awt.Color(255, 255, 255));
        simplefixgraph5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        simplefixgraph5.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout simplefixgraph5Layout = new javax.swing.GroupLayout(simplefixgraph5);
        simplefixgraph5.setLayout(simplefixgraph5Layout);
        simplefixgraph5Layout.setHorizontalGroup(
            simplefixgraph5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        simplefixgraph5Layout.setVerticalGroup(
            simplefixgraph5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        simplefix.add(simplefixgraph5);
        simplefixgraph5.setBounds(10, 140, 400, 400);

        simplefixroot.setBackground(new java.awt.Color(74, 120, 125));
        simplefixroot.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        simplefixroot.setForeground(new java.awt.Color(255, 255, 255));
        simplefixroot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        simplefixroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simplefixrootActionPerformed(evt);
            }
        });
        simplefix.add(simplefixroot);
        simplefixroot.setBounds(500, 80, 310, 40);

        jLabel18.setBackground(new java.awt.Color(74, 120, 125));
        jLabel18.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Approximate Root:");
        simplefix.add(jLabel18);
        jLabel18.setBounds(320, 80, 190, 40);

        jLabel19.setBackground(new java.awt.Color(74, 120, 125));
        jLabel19.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Equation:");
        simplefix.add(jLabel19);
        jLabel19.setBounds(210, 20, 130, 40);

        simplefixeq1.setBackground(new java.awt.Color(74, 120, 125));
        simplefixeq1.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        simplefixeq1.setForeground(new java.awt.Color(255, 255, 255));
        simplefixeq1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        simplefixeq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simplefixeq1ActionPerformed(evt);
            }
        });
        simplefixeq1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                simplefixeq1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                simplefixeq1KeyTyped(evt);
            }
        });
        simplefix.add(simplefixeq1);
        simplefixeq1.setBounds(320, 20, 190, 40);

        jLabel20.setBackground(new java.awt.Color(74, 120, 125));
        jLabel20.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("xL");
        simplefix.add(jLabel20);
        jLabel20.setBounds(520, 20, 30, 40);

        simplefixxl.setBackground(new java.awt.Color(74, 120, 125));
        simplefixxl.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        simplefixxl.setForeground(new java.awt.Color(255, 255, 255));
        simplefixxl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        simplefixxl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simplefixxlActionPerformed(evt);
            }
        });
        simplefixxl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                simplefixxlKeyTyped(evt);
            }
        });
        simplefix.add(simplefixxl);
        simplefixxl.setBounds(560, 20, 80, 40);

        jButton12.setBackground(new java.awt.Color(254, 176, 106));
        jButton12.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Calculate");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        simplefix.add(jButton12);
        jButton12.setBounds(660, 20, 140, 40);

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Bison Bold", 0, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("simple fixed point");
        simplefix.add(jLabel28);
        jLabel28.setBounds(40, 30, 150, 30);

        background.add(simplefix);
        simplefix.setBounds(10, 10, 1120, 550);

        newtonrapson.setBackground(new java.awt.Color(74, 120, 125));
        newtonrapson.setLayout(null);

        tab6.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        tab6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteration", "xL", "xU", "xR", "f(xR)", "Error"
            }
        ));
        tab6.setEnabled(false);
        tab6.setFocusable(false);
        tab6.getTableHeader().setResizingAllowed(false);
        tab6.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(tab6);

        newtonrapson.add(jScrollPane7);
        jScrollPane7.setBounds(420, 140, 690, 400);

        graph5.setBackground(new java.awt.Color(255, 255, 255));
        graph5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        graph5.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout graph5Layout = new javax.swing.GroupLayout(graph5);
        graph5.setLayout(graph5Layout);
        graph5Layout.setHorizontalGroup(
            graph5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        graph5Layout.setVerticalGroup(
            graph5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        newtonrapson.add(graph5);
        graph5.setBounds(10, 140, 400, 400);

        newtonrapsonroot.setBackground(new java.awt.Color(74, 120, 125));
        newtonrapsonroot.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        newtonrapsonroot.setForeground(new java.awt.Color(255, 255, 255));
        newtonrapsonroot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        newtonrapsonroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newtonrapsonrootActionPerformed(evt);
            }
        });
        newtonrapson.add(newtonrapsonroot);
        newtonrapsonroot.setBounds(500, 80, 310, 40);

        jLabel21.setBackground(new java.awt.Color(74, 120, 125));
        jLabel21.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Approximate Root:");
        newtonrapson.add(jLabel21);
        jLabel21.setBounds(320, 80, 190, 40);

        jLabel22.setBackground(new java.awt.Color(74, 120, 125));
        jLabel22.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Equation:");
        newtonrapson.add(jLabel22);
        jLabel22.setBounds(210, 20, 130, 40);

        newtonrapsoneq.setBackground(new java.awt.Color(74, 120, 125));
        newtonrapsoneq.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        newtonrapsoneq.setForeground(new java.awt.Color(255, 255, 255));
        newtonrapsoneq.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        newtonrapsoneq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newtonrapsoneqActionPerformed(evt);
            }
        });
        newtonrapsoneq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newtonrapsoneqKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newtonrapsoneqKeyTyped(evt);
            }
        });
        newtonrapson.add(newtonrapsoneq);
        newtonrapsoneq.setBounds(320, 20, 190, 40);

        jLabel23.setBackground(new java.awt.Color(74, 120, 125));
        jLabel23.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("xL");
        newtonrapson.add(jLabel23);
        jLabel23.setBounds(520, 20, 30, 40);

        newtonrapsonxl.setBackground(new java.awt.Color(74, 120, 125));
        newtonrapsonxl.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        newtonrapsonxl.setForeground(new java.awt.Color(255, 255, 255));
        newtonrapsonxl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        newtonrapsonxl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newtonrapsonxlActionPerformed(evt);
            }
        });
        newtonrapsonxl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newtonrapsonxlKeyTyped(evt);
            }
        });
        newtonrapson.add(newtonrapsonxl);
        newtonrapsonxl.setBounds(560, 20, 80, 40);

        jButton13.setBackground(new java.awt.Color(254, 176, 106));
        jButton13.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Calculate");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        newtonrapson.add(jButton13);
        jButton13.setBounds(650, 20, 140, 40);

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Bison Bold", 0, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("NEWTON RAPHSON");
        newtonrapson.add(jLabel29);
        jLabel29.setBounds(40, 30, 130, 30);

        background.add(newtonrapson);
        newtonrapson.setBounds(10, 10, 1120, 550);

        secant.setBackground(new java.awt.Color(74, 120, 125));
        secant.setLayout(null);

        tab7.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        tab7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteration", "Xi-1", "Xi", "Xi+", "f(Xi-1)", "f(Xi)", "f(Xi+1)", "Error"
            }
        ));
        tab7.setEnabled(false);
        tab7.setFocusable(false);
        tab7.getTableHeader().setResizingAllowed(false);
        tab7.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(tab7);

        secant.add(jScrollPane8);
        jScrollPane8.setBounds(420, 140, 690, 400);

        graph6.setBackground(new java.awt.Color(255, 255, 255));
        graph6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        graph6.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout graph6Layout = new javax.swing.GroupLayout(graph6);
        graph6.setLayout(graph6Layout);
        graph6Layout.setHorizontalGroup(
            graph6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        graph6Layout.setVerticalGroup(
            graph6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        secant.add(graph6);
        graph6.setBounds(10, 140, 400, 400);

        secantroot.setBackground(new java.awt.Color(74, 120, 125));
        secantroot.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        secantroot.setForeground(new java.awt.Color(255, 255, 255));
        secantroot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        secantroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secantrootActionPerformed(evt);
            }
        });
        secant.add(secantroot);
        secantroot.setBounds(500, 80, 310, 40);

        jLabel30.setBackground(new java.awt.Color(74, 120, 125));
        jLabel30.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Approximate Root:");
        secant.add(jLabel30);
        jLabel30.setBounds(320, 80, 190, 40);

        jLabel31.setBackground(new java.awt.Color(74, 120, 125));
        jLabel31.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Equation:");
        secant.add(jLabel31);
        jLabel31.setBounds(210, 20, 130, 40);

        secantequation.setBackground(new java.awt.Color(74, 120, 125));
        secantequation.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        secantequation.setForeground(new java.awt.Color(255, 255, 255));
        secantequation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        secantequation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secantequationActionPerformed(evt);
            }
        });
        secantequation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                secantequationKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                secantequationKeyTyped(evt);
            }
        });
        secant.add(secantequation);
        secantequation.setBounds(320, 20, 190, 40);

        jLabel32.setBackground(new java.awt.Color(74, 120, 125));
        jLabel32.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("x0");
        secant.add(jLabel32);
        jLabel32.setBounds(520, 20, 30, 40);

        secantxl.setBackground(new java.awt.Color(74, 120, 125));
        secantxl.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        secantxl.setForeground(new java.awt.Color(255, 255, 255));
        secantxl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        secantxl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secantxlActionPerformed(evt);
            }
        });
        secantxl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                secantxlKeyTyped(evt);
            }
        });
        secant.add(secantxl);
        secantxl.setBounds(560, 20, 80, 40);

        jLabel33.setBackground(new java.awt.Color(74, 120, 125));
        jLabel33.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("x1");
        secant.add(jLabel33);
        jLabel33.setBounds(650, 20, 40, 40);

        secantxu.setBackground(new java.awt.Color(74, 120, 125));
        secantxu.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        secantxu.setForeground(new java.awt.Color(255, 255, 255));
        secantxu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        secantxu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secantxuActionPerformed(evt);
            }
        });
        secantxu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                secantxuKeyTyped(evt);
            }
        });
        secant.add(secantxu);
        secantxu.setBounds(700, 20, 90, 40);

        jButton14.setBackground(new java.awt.Color(254, 176, 106));
        jButton14.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Calculate");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        secant.add(jButton14);
        jButton14.setBounds(820, 20, 140, 40);

        jLabel34.setBackground(new java.awt.Color(0, 0, 0));
        jLabel34.setFont(new java.awt.Font("Bison Bold", 0, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Secant");
        secant.add(jLabel34);
        jLabel34.setBounds(40, 30, 80, 30);

        background.add(secant);
        secant.setBounds(10, 10, 1120, 550);

        jPanel1.add(background);
        background.setBounds(20, 110, 1140, 570);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eqtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eqtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eqtActionPerformed

    private void eqtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eqtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_eqtKeyPressed

    private void eqtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eqtKeyTyped
      /*  char a = evt.getKeyChar();
        if (!(Character.isDigit(a) || a == 'x' || a == '+' || a == '-' || a == '^' || a == 'e' || a == KeyEvent.VK_BACK_SPACE || a == KeyEvent.VK_DELETE)) {
            evt.consume();
        }*/
    }//GEN-LAST:event_eqtKeyTyped

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_aKeyTyped

    private void approRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approRootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_approRootActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       incremental.setVisible(false);
        bisection.setVisible(false);
        simplefix.setVisible(false);
        regulafalse.setVisible(false);
        graph.setVisible(true);
        newtonrapson.setVisible(false);
        secant.setVisible(false);
        /* graph.setVisible(true);
        incremental.setVisible(false);
        bisection.setVisible(false);
        simplefix.setVisible(false);
        
        //clear the incremental panel
        DefaultTableModel model = (DefaultTableModel) tab1.getModel();
        imEqt.setText("");
        lb.setText("");
        imRoot.setText("");
        model.setRowCount(0);
        graph2.removeAll();
        graph2.revalidate();
        graph2.repaint();
        
        // clear the bisection
        DefaultTableModel model1 = (DefaultTableModel) tab3.getModel();
        bmEqt.setText("");
        xl.setText("");
        xu.setText("");
        bmRoot.setText("");
        model1.setRowCount(0);
        graph3.removeAll();
        graph3.revalidate();
        graph3.repaint();*/
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//graph
        DefaultTableModel model = (DefaultTableModel) tab.getModel();
        model.setRowCount(0);
        String eqStr = eqt.getText().replaceAll("\\s", "");
        double valX = Double.parseDouble(a.getText());
        DecimalFormat format = new DecimalFormat("#.#####");

        ArrayList<Object[]> dataList = new ArrayList<>();

        double prevY = evaluateFunc(eqStr, valX);
        String decX = format.format(valX);
        String decY = format.format(prevY);
        dataList.add(new Object[]{decX, decY});

        double step = 0.2;
        double currX = valX + step;
        double currY = evaluateFunc(eqStr, currX);
        boolean signChange = false;

        double rootVal = Double.NaN;
        
        
    try {

        while (!signChange) {
            decX = format.format(currX);
            decY = format.format(currY);
            dataList.add(new Object[]{decX, decY});
            model.setRowCount(0);

            for (Object[] row : dataList) {
                model.addRow(row);
            }

            if (prevY * currY < 0) {
                // Find the root directly here
                double tolerance = 0.0001;
                double root = 0;
                double lowerBound = currX - step;
                double upperBound = currX;

                do {
                    root = (lowerBound * evaluateFunc(eqStr, upperBound) - upperBound * evaluateFunc(eqStr, lowerBound)) 
                            / (evaluateFunc(eqStr, upperBound) - evaluateFunc(eqStr, lowerBound));

                    double fA = evaluateFunc(eqStr, lowerBound);
                    double fC = evaluateFunc(eqStr, root);

                    if (fC == 0.0) {
                        break;
                    } else if (fA * fC < 0) {
                        upperBound = root;
                    } else {
                        lowerBound = root;
                    }
                } while (Math.abs(upperBound - lowerBound) > tolerance);

                rootVal = root;
                approRoot.setText(format.format(rootVal));
             
                signChange = true; // Set signChange to true to exit the loop
                
                // Graph the function and root here
                XYSeries series = new XYSeries("Function");
                for (Object[] rowData : dataList) {
                    double x = Double.parseDouble((String) rowData[0]);
                    double y = Double.parseDouble((String) rowData[1]);
                    series.add(x, y);
                }

                XYSeriesCollection dataset = new XYSeriesCollection();
                dataset.addSeries(series);

                JFreeChart chart = ChartFactory.createXYLineChart(
                        "GRAPH",
                        "X",
                        "f(X)",
                        dataset
                );
                XYPlot plot = (XYPlot) chart.getPlot();
                plot.getRenderer().setSeriesPaint(0, Color.BLUE);
                plot.setBackgroundPaint(Color.WHITE); 


                plot.setDomainGridlinesVisible(true);
                plot.setRangeGridlinesVisible(true);

                XYSeries rootSeries = new XYSeries("Root");
                rootSeries.add(rootVal, evaluateFunc(eqStr, rootVal));
                XYSeriesCollection rootDataset = new XYSeriesCollection();
                rootDataset.addSeries(rootSeries);
                plot.setDataset(1, rootDataset);
                plot.mapDatasetToDomainAxis(1, 0);
                plot.mapDatasetToRangeAxis(1, 0);
                XYItemRenderer renderer = new XYLineAndShapeRenderer(false, true);
                renderer.setSeriesPaint(0, Color.RED); 
                plot.setRenderer(1, renderer);

                ChartPanel chartPanel = new ChartPanel(chart);
                chartPanel.setPreferredSize(new Dimension(500, 400));

                graph1.setLayout(new BorderLayout());
                graph1.removeAll();
                graph1.add(chartPanel, BorderLayout.CENTER);
                graph1.revalidate();
                graph1.repaint();
            } else {
                prevY = currY;
                currX += step;
                currY = evaluateFunc(eqStr, currX);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        incremental.setVisible(true);
        bisection.setVisible(false);
        simplefix.setVisible(false);
        regulafalse.setVisible(false);
        graph.setVisible(false);
        newtonrapson.setVisible(false);
        secant.setVisible(false);
        /*incremental.setVisible(true);
        graph.setVisible(false);
        bisection.setVisible(false);
        simplefix.setVisible(false);
        
        //clear the graph panel
        DefaultTableModel model = (DefaultTableModel) tab.getModel();
        eqt.setText("");
        a.setText("");
        approRoot.setText("");
        model.setRowCount(0);
        graph1.removeAll();
        graph1.revalidate();
        graph1.repaint();
        
        // clear the bisection
        DefaultTableModel model2 = (DefaultTableModel) tab3.getModel();
        bmEqt.setText("");
        xl.setText("");
        xu.setText("");
        bmRoot.setText("");
        model2.setRowCount(0);
        graph3.removeAll();
        graph3.revalidate();
        graph3.repaint();*/
    }//GEN-LAST:event_jButton3ActionPerformed

    private void imEqtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imEqtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imEqtActionPerformed

    private void imEqtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imEqtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_imEqtKeyPressed

    private void imEqtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imEqtKeyTyped
        char a = evt.getKeyChar();
        if (!(Character.isDigit(a) || a == 'x' || a == '+' || a == '-' || a == '^' || a == 'e' || a == KeyEvent.VK_BACK_SPACE || a == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_imEqtKeyTyped

    private void lbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbActionPerformed

    private void lbKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbKeyTyped
        /*  char a = evt.getKeyChar();
        if(!(Character.isDigit(a) || a=='-' || (a==KeyEvent.VK_BACK_SPACE)||a==KeyEvent.VK_DELETE)){
            evt.consume();
        }*/
    }//GEN-LAST:event_lbKeyTyped

    private void deltaXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deltaXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deltaXActionPerformed

    private void deltaXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deltaXKeyTyped
        /*  char a = evt.getKeyChar();
        if(!(Character.isDigit(a) || a=='-' || (a==KeyEvent.VK_BACK_SPACE)||a==KeyEvent.VK_DELETE)){
            evt.consume();
        }*/
    }//GEN-LAST:event_deltaXKeyTyped

    private void imRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imRootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imRootActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//incremental
try {
            if (imEqt.getText().isEmpty() || lb.getText().isEmpty() || deltaX.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Enter the data needed!");
            } else {
                DecimalFormat format = new DecimalFormat("#.########");
                ArrayList<Object[]> dataList = new ArrayList<>();
                
                double valL = Double.parseDouble(lb.getText());
                double delta = Double.parseDouble(deltaX.getText());
                double root = 0;
                double valU = valL + delta;
                int iterCount = 0;
                double prevU = 0;
                int previousRowIndex = -1;
                int lastRowIndex = -1;

                double error = Math.abs(valU - prevU) / Math.abs(valU) * 100;
                double marginE = 0.001;
                while (Math.abs(error) > marginE) {
    iterCount++;
    double fL = evaluateFunc(imEqt.getText(), valL);
    double fU = evaluateFunc(imEqt.getText(), valU);
    double product = fL * fU;

    String decA = format.format(valL);
    String decC = format.format(delta);
    String decB = format.format(valU);
    String decFA = format.format(fL);
    String decFB = format.format(fU);
    String decError;

    if (iterCount == 1) {
        decError = " ";
    } else {
        double currentError = Math.abs(valU - prevU) / Math.abs(valU) * 100;
        decError = format.format(currentError);
    }

    String sign;
    if (product < 0) {
        sign = "<0";
    } else if (product > 0) {
        sign = ">0";
    } else {
        sign = "0"; // Just in case the product is zero
    }

    Object[] rowData = {iterCount, decA, decC,
                        decB, decFA, decFB, decError, sign};
    dataList.add(rowData);

    // Stop the iteration if the absolute error is less than or equal to 0.001
    if (Math.abs(error) <= 0.001) {
        break;
    }

    if (fL * fU == 0) {
        root = valU;
        break;
    }

    if (fL * fU < 0) {
        valL = valL;
        delta /= 10.0;
        root = valU;
    } else {
        valL = valU;
        delta = delta;
        root = valU;
    }

    prevU = valU;
    valU = valL + delta;
    error = Math.abs(valU - prevU) / Math.abs(valU) * 100;
}



                DefaultTableModel model = (DefaultTableModel) tab1.getModel();
                model.setRowCount(0);

                for (Object[] row : dataList) {
                    model.addRow(row);
                }
                if(previousRowIndex != -1){
                    tab1.addRowSelectionInterval(previousRowIndex, previousRowIndex);
                    //tabl.setSelectionBackground(CYAN);
                }

                // Store the current row index before updating the interval
                previousRowIndex = model.getRowCount() - 1;
                lastRowIndex = previousRowIndex;

                if (lastRowIndex != -1){
                    tab1.addRowSelectionInterval(lastRowIndex, lastRowIndex);
                    // tabl.setSelectionBackground(CYAN);
                }
                if (root != 0) {
                    String decRoot = format.format(root);
                    imRoot.setText(decRoot);
                    plotGraph(imEqt.getText(), Double.parseDouble(lb.getText()), Double.parseDouble(imRoot.getText()));
                } else {
                    JOptionPane.showMessageDialog(this, "No root found within the specified range.");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void bmRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmRootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmRootActionPerformed

    private void bmEqtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmEqtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmEqtActionPerformed

    private void bmEqtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bmEqtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmEqtKeyPressed

    private void bmEqtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bmEqtKeyTyped
       /* char a = evt.getKeyChar();
        if (!(Character.isDigit(a) || a == 'x' || a == '+' || a == '-' || a == '^' || a == 'e' || a == KeyEvent.VK_BACK_SPACE || a == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        rootsList.clear();
        IterationCount = 1;*/
    }//GEN-LAST:event_bmEqtKeyTyped

    private void xlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xlActionPerformed

    private void xlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xlKeyTyped
        /*  char a = evt.getKeyChar();
        if(!(Character.isDigit(a) || a=='-' || (a==KeyEvent.VK_BACK_SPACE)||a==KeyEvent.VK_DELETE)){
            evt.consume();
        }*/
    }//GEN-LAST:event_xlKeyTyped

    private void xuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xuActionPerformed

    private void xuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xuKeyTyped
        /*  char a = evt.getKeyChar();
        if(!(Character.isDigit(a) || a=='-' || (a==KeyEvent.VK_BACK_SPACE)||a==KeyEvent.VK_DELETE)){
            evt.consume();
        }*/
    }//GEN-LAST:event_xuKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //bisection
     try {
                   
                if (bmEqt.getText().isEmpty() || xl.getText().isEmpty() || xu.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Enter the data needed!");
                } else {
                    DecimalFormat format = new DecimalFormat("#.####");
                    ArrayList<Object[]> data = new ArrayList<>();
                    double MarginE = 0.0001;
                    double xL = Double.parseDouble(xl.getText());
                    double xU = Double.parseDouble(xu.getText());
                    double roott = 0;
                    double xR = (xL + xU) / 2.0;
                    int iterations = 0;
                    double prevXR = 0;
                    
                    int previousRowIndex = -1;
                    int lastRowIndex = -1;
                    
                    double Error = Math.abs(xR - prevXR) / Math.abs(xR) * 100;

                    while (Error > MarginE) {
                        iterations++;
                        double fxL = evaluateFunc(bmEqt.getText(), xL);
                        double fxU = evaluateFunc(bmEqt.getText(), xR);
                        double fxR = evaluateFunc(bmEqt.getText(), xU);

                        String decimalnumA = format.format(xL);
                        String decimalnumB = format.format(xU);
                        String decimalnumC = format.format(xR);
                        String decimalnumFA = format.format(fxL);
                        String decimalnumbFC = format.format(fxU);
                        String decimalnumERROR;

                        if (iterations == 1) {
                            decimalnumERROR = "--------";
                        } else {
                            double currentError = Math.abs(xR - prevXR) / Math.abs(xR) * 100;
                            decimalnumERROR = format.format(currentError);
                        }
                        String sign;
                        if (fxL * fxU <=0) { //if f(xL) * f(xU)<=0, then root = xR
                            xU = xR;
                            roott = xR;
                            sign = "<0";
                        } else {
                            xL = xR;
                            roott = xR;
                            sign = ">0";
                        }
                        Object[] rowData = {iterations, decimalnumA, decimalnumC,
                            decimalnumB, decimalnumFA, decimalnumbFC, decimalnumERROR, sign};
                        data.add(rowData);

                        if (Math.abs(fxR) < MarginE) {
                            roott = xR;
                            break;
                        }
                      

                        prevXR = xR;
                        xR = (xL + xU) / 2;
                        Error = Math.abs(xR - prevXR) / Math.abs(xR) * 100;
                    }
                    DefaultTableModel model = (DefaultTableModel) tab3.getModel();
                    model.setRowCount(0);

                    for (Object[] row : data) {
                        model.addRow(row);
                    }
                   if(previousRowIndex != -1){
                       tab3.addRowSelectionInterval(previousRowIndex, previousRowIndex);
                   }
                   // Store the current row index before updating the interval
                   previousRowIndex = model.getRowCount() - 1;
                   lastRowIndex = previousRowIndex;
                   
                    if (lastRowIndex != -1){
                        tab3.addRowSelectionInterval(lastRowIndex, lastRowIndex);
                    }
                    if (roott != 0) { //Closest to zero
                        String decimalRoot = format.format(roott);
                        bmRoot.setText(decimalRoot);
                        plotGraphbisection(bmEqt.getText(), Double.parseDouble(xl.getText()), Double.parseDouble(bmRoot.getText()));
                        
                    } else {
                        JOptionPane.showMessageDialog(this, "No root found within the specified range.");
                    }
        }
                     } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
      
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     incremental.setVisible(false);
        bisection.setVisible(true);
        simplefix.setVisible(false);
        regulafalse.setVisible(false);
        graph.setVisible(false);
        newtonrapson.setVisible(false);
        secant.setVisible(false);
        
        /*bisection.setVisible(true);
     incremental.setVisible(false);
     graph.setVisible(false);
     simplefix.setVisible(false);
        
     //clear the graph panel
     DefaultTableModel model = (DefaultTableModel) tab.getModel();
     eqt.setText("");
     a.setText("");
     approRoot.setText("");
     model.setRowCount(0);
     graph1.removeAll();
     graph1.revalidate();
     graph1.repaint();
     
     // clear the incremental
     DefaultTableModel model1 = (DefaultTableModel) tab1.getModel();
     imEqt.setText("");
     lb.setText("");
     imRoot.setText("");
     model1.setRowCount(0);
     graph2.removeAll();
     graph2.revalidate();
     graph2.repaint();*/
    }//GEN-LAST:event_jButton7ActionPerformed
    private void plotGraph(String equationStr, double lb, double root) {
    XYSeries series = new XYSeries("f(x)");
    XYSeries rootSeries = new XYSeries("Root");

    for ( double x = -5.0; x <= 5.0; x += 0.01) {
        series.add(x, evaluateFunc(equationStr, x));
    }

    rootSeries.add(root, evaluateFunc(equationStr, root));

    XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(series);
    dataset.addSeries(rootSeries);

    JFreeChart chart = ChartFactory.createXYLineChart(
            "Function Plot",
            "X",
            "f(X)",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false
    );

    XYPlot plot = chart.getXYPlot();
    
    // Customizing the renderer for the plot
    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

    // Set series 0 (function line) to be lines only (no shapes)
    renderer.setSeriesLinesVisible(0, true);
    renderer.setSeriesShapesVisible(0, false);

    // Set series 1 (root) to be a red dot
    renderer.setSeriesLinesVisible(1, false);
    renderer.setSeriesShapesVisible(1, true);
    renderer.setSeriesShape(1, new java.awt.geom.Ellipse2D.Double(-3, -3, 6, 6));
    renderer.setSeriesPaint(1, Color.RED);

    plot.setRenderer(renderer);

    // Customizing plot background and gridlines
    plot.setBackgroundPaint(Color.WHITE);
    plot.setRangeGridlinePaint(Color.BLACK);
    plot.setDomainGridlinePaint(Color.BLACK);

    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new Dimension(graph2.getWidth(), graph2.getHeight()));

    graph2.removeAll();
    graph2.setLayout(new BorderLayout());
    graph2.add(chartPanel, BorderLayout.CENTER);
    graph2.validate();
}
    private void plotGraphsecant(String equationStr, double secantxl, double root) {
    XYSeries series = new XYSeries("f(x)");
    XYSeries rootSeries = new XYSeries("Root");

    for ( double x = -5.0; x <= 5.0; x += 0.01) {
        series.add(x, evaluateFunc(equationStr, x));
    }

    rootSeries.add(root, evaluateFunc(equationStr, root));

    XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(series);
    dataset.addSeries(rootSeries);

    JFreeChart chart = ChartFactory.createXYLineChart(
            "Function Plot",
            "X",
            "f(X)",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false
    );

    XYPlot plot = chart.getXYPlot();
    
    // Customizing the renderer for the plot
    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

    // Set series 0 (function line) to be lines only (no shapes)
    renderer.setSeriesLinesVisible(0, true);
    renderer.setSeriesShapesVisible(0, false);

    // Set series 1 (root) to be a red dot
    renderer.setSeriesLinesVisible(1, false);
    renderer.setSeriesShapesVisible(1, true);
    renderer.setSeriesShape(1, new java.awt.geom.Ellipse2D.Double(-3, -3, 6, 6));
    renderer.setSeriesPaint(1, Color.RED);

    plot.setRenderer(renderer);

    // Customizing plot background and gridlines
    plot.setBackgroundPaint(Color.WHITE);
    plot.setRangeGridlinePaint(Color.BLACK);
    plot.setDomainGridlinePaint(Color.BLACK);

    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new Dimension(graph6.getWidth(), graph6.getHeight()));

    graph6.removeAll();
    graph6.setLayout(new BorderLayout());
    graph6.add(chartPanel, BorderLayout.CENTER);
    graph6.validate();
}
    
    private void plotGraphbisection(String equationStr, double xl, double root) {
    XYSeries series = new XYSeries("f(x)");
    XYSeries rootSeries = new XYSeries("Root");

    for ( double x = -10.0; x <= 10.0; x += 0.01) {
        series.add(x, evaluateFunc(equationStr, x));
    }

    rootSeries.add(root, evaluateFunc(equationStr, root));

    XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(series);
    dataset.addSeries(rootSeries);

    JFreeChart chart = ChartFactory.createXYLineChart(
            "Function Plot",
            "X",
            "f(X)",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false
    );

    XYPlot plot = chart.getXYPlot();
    
    // Customizing the renderer for the plot
    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

    // Set series 0 (function line) to be lines only (no shapes)
    renderer.setSeriesLinesVisible(0, true);
    renderer.setSeriesShapesVisible(0, false);

    // Set series 1 (root) to be a red dot
    renderer.setSeriesLinesVisible(1, false);
    renderer.setSeriesShapesVisible(1, true);
    renderer.setSeriesShape(1, new java.awt.geom.Ellipse2D.Double(-3, -3, 6, 6));
    renderer.setSeriesPaint(1, Color.RED);

    plot.setRenderer(renderer);

    // Customizing plot background and gridlines
    plot.setBackgroundPaint(Color.WHITE);
    plot.setRangeGridlinePaint(Color.BLACK);
    plot.setDomainGridlinePaint(Color.BLACK);

    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new Dimension(graph3.getWidth(), graph3.getHeight()));

    graph3.removeAll();
    graph3.setLayout(new BorderLayout());
    graph3.add(chartPanel, BorderLayout.CENTER);
    graph3.validate();
}
    //Regula false
    private void plotGraphregula(String equationStr, double regulaxl, double root) {
    XYSeries series = new XYSeries("f(x)");
    XYSeries rootSeries = new XYSeries("Root");

    for ( double x = -5.0; x <= 5.0; x += 0.01) {
        series.add(x, evaluateFunc(equationStr, x));
    }

    rootSeries.add(root, evaluateFunc(equationStr, root));

    XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(series);
    dataset.addSeries(rootSeries);

    JFreeChart chart = ChartFactory.createXYLineChart(
            "Function Plot",
            "X",
            "f(X)",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false
    );

    XYPlot plot = chart.getXYPlot();
    
    // Customizing the renderer for the plot
    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

    // Set series 0 (function line) to be lines only (no shapes)
    renderer.setSeriesLinesVisible(0, true);
    renderer.setSeriesShapesVisible(0, false);

    // Set series 1 (root) to be a red dot
    renderer.setSeriesLinesVisible(1, false);
    renderer.setSeriesShapesVisible(1, true);
    renderer.setSeriesShape(1, new java.awt.geom.Ellipse2D.Double(-3, -3, 6, 6));
    renderer.setSeriesPaint(1, Color.RED);

    plot.setRenderer(renderer);

    // Customizing plot background and gridlines
    plot.setBackgroundPaint(Color.WHITE);
    plot.setRangeGridlinePaint(Color.BLACK);
    plot.setDomainGridlinePaint(Color.BLACK);

    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new Dimension(graph4.getWidth(), graph4.getHeight()));

    graph4.removeAll();
    graph4.setLayout(new BorderLayout());
    graph4.add(chartPanel, BorderLayout.CENTER);
    graph4.validate();
}
     private void plotGraphsimplefix(String equationStr, double simplefixxl, double root) {
    XYSeries series = new XYSeries("f(x)");
    XYSeries rootSeries = new XYSeries("Root");

    for ( double x = -5.0; x <= 5.0; x += 0.01) {
        series.add(x, evaluateFunc(equationStr, x));
    }

    rootSeries.add(root, evaluateFunc(equationStr, root));

    XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(series);
    dataset.addSeries(rootSeries);

    JFreeChart chart = ChartFactory.createXYLineChart(
            "Function Plot",
            "X",
            "f(X)",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false
    );

    XYPlot plot = chart.getXYPlot();
    
    // Customizing the renderer for the plot
    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

    // Set series 0 (function line) to be lines only (no shapes)
    renderer.setSeriesLinesVisible(0, true);
    renderer.setSeriesShapesVisible(0, false);

    // Set series 1 (root) to be a red dot
    renderer.setSeriesLinesVisible(1, false);
    renderer.setSeriesShapesVisible(1, true);
    renderer.setSeriesShape(1, new java.awt.geom.Ellipse2D.Double(-3, -3, 6, 6));
    renderer.setSeriesPaint(1, Color.RED);

    plot.setRenderer(renderer);

    // Customizing plot background and gridlines
    plot.setBackgroundPaint(Color.WHITE);
    plot.setRangeGridlinePaint(Color.BLACK);
    plot.setDomainGridlinePaint(Color.BLACK);

    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new Dimension(simplefixgraph5.getWidth(), simplefixgraph5.getHeight()));

    simplefixgraph5.removeAll();
    simplefixgraph5.setLayout(new BorderLayout());
    simplefixgraph5.add(chartPanel, BorderLayout.CENTER);
    simplefixgraph5.validate();
}
      private void plotGraphnewtonrapson(String equationStr, double newtonrapsonxl, double root) {
    XYSeries series = new XYSeries("f(x)");
    XYSeries rootSeries = new XYSeries("Root");

    for ( double x = -5.0; x <= 5.0; x += 0.01) {
        series.add(x, evaluateFunc(equationStr, x));
    }

    rootSeries.add(root, evaluateFunc(equationStr, root));

    XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(series);
    dataset.addSeries(rootSeries);

    JFreeChart chart = ChartFactory.createXYLineChart(
            "Function Plot",
            "X",
            "f(X)",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false
    );

    XYPlot plot = chart.getXYPlot();
    
    // Customizing the renderer for the plot
    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

    // Set series 0 (function line) to be lines only (no shapes)
    renderer.setSeriesLinesVisible(0, true);
    renderer.setSeriesShapesVisible(0, false);

    // Set series 1 (root) to be a red dot
    renderer.setSeriesLinesVisible(1, false);
    renderer.setSeriesShapesVisible(1, true);
    renderer.setSeriesShape(1, new java.awt.geom.Ellipse2D.Double(-3, -3, 6, 6));
    renderer.setSeriesPaint(1, Color.RED);

    plot.setRenderer(renderer);

    // Customizing plot background and gridlines
    plot.setBackgroundPaint(Color.WHITE);
    plot.setRangeGridlinePaint(Color.BLACK);
    plot.setDomainGridlinePaint(Color.BLACK);

    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new Dimension(graph5.getWidth(), graph5.getHeight()));

    graph5.removeAll();
    graph5.setLayout(new BorderLayout());
    graph5.add(chartPanel, BorderLayout.CENTER);
    graph5.validate();
}
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    incremental.setVisible(false);
        bisection.setVisible(false);
        simplefix.setVisible(false);
        regulafalse.setVisible(true);
        graph.setVisible(false);
        newtonrapson.setVisible(false);
        secant.setVisible(false);
        
        /*bisection.setVisible(false);
     incremental.setVisible(false);
     graph.setVisible(false);
     simplefix.setVisible(false);
     regulafalse.setVisible(true);
        
     //clear the graph panel
     DefaultTableModel model = (DefaultTableModel) tab.getModel();
     eqt.setText("");
     a.setText("");
     approRoot.setText("");
     model.setRowCount(0);
     graph1.removeAll();
     graph1.revalidate();
     graph1.repaint();
     
     // clear the incremental
     DefaultTableModel model1 = (DefaultTableModel) tab1.getModel();
     imEqt.setText("");
     lb.setText("");
     imRoot.setText("");
     model1.setRowCount(0);
     graph2.removeAll();
     graph2.revalidate();
     graph2.repaint();   */     // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    
    private void regularootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regularootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regularootActionPerformed

    private void regulaequationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regulaequationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regulaequationActionPerformed

    private void regulaequationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regulaequationKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_regulaequationKeyPressed

    private void regulaequationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regulaequationKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_regulaequationKeyTyped

    private void regulaxlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regulaxlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regulaxlActionPerformed

    private void regulaxlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regulaxlKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_regulaxlKeyTyped

    private void regulaxuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regulaxuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regulaxuActionPerformed

    private void regulaxuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regulaxuKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_regulaxuKeyTyped

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
try {
                DecimalFormat decimalFormat = new DecimalFormat("#.#########");
                if (regulaequation.getText().isEmpty() || regulaxu.getText().isEmpty() || regulaxl.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Enter the data needed, Thank you!");
                } else {
                    ArrayList<Object[]> data = new ArrayList<>();
                    double MarginE = 0.001;
                    double xL = Double.parseDouble(regulaxu.getText());
                    double xU = Double.parseDouble(regulaxl.getText());
                    double fxL, fxU, fxR, xR;
                    int iterations = 0;
                    double prevXU = 0;
                    double Error = Double.MAX_VALUE;

                    while (Error > MarginE) {
                        iterations++;
                        fxL = evaluateFunc(regulaequation.getText(), xL);
                        fxU = evaluateFunc(regulaequation.getText(), xU);

                        // Regula Falsi formula for finding next approximation
                        xR = (fxU * xL - fxL * xU) / (fxU - fxL);
                        fxR = evaluateFunc(regulaequation.getText(), xR);

                        String decimalnumA = decimalFormat.format(xL);
                        String decimalnumB = decimalFormat.format(xU);
                        String decimalnumC = decimalFormat.format(xR);
                        String decimalnumFL = decimalFormat.format(fxL);
                        String decimalnumFU = decimalFormat.format(fxU);
                        String decimalnumFC = decimalFormat.format(fxR);
                        String decimalnumERROR;

                        if (iterations == 1) {
                            decimalnumERROR = " ";
                        } else {
                            double currentError = Math.abs(xR - prevXU) / Math.abs(xR) * 100;
                            decimalnumERROR = decimalFormat.format(currentError);
                        }

                        Object[] rowData = {iterations,decimalnumB , decimalnumA,
                                decimalnumC, decimalnumFL, decimalnumFU, decimalnumFC, decimalnumERROR,};
                        data.add(rowData);

                        if (fxL * fxR < 0) {
                            xU = xR;
                        } else if (fxL * fxR > 0) {
                            xL = xR;
                        }

                       prevXU = xR;
                        xR = (fxU * xL - fxL * xU) / (fxU - fxL);
                        Error = Math.abs(xR - prevXU) / Math.abs(xR) * 100; // Error is now based on the value of f(xR)
                        if(Math.abs(Error) <=0.001 || fxL * fxR ==0){
                        break;
                        }
                    }

                    DefaultTableModel model = (DefaultTableModel) tab4.getModel();
                    model.setRowCount(0);

                    for (Object[] row : data) {
                        model.addRow(row);
                    }

                     int lastRowIndex = model.getRowCount() - 1;
                    if (lastRowIndex >= 0) {
                        tab4.addRowSelectionInterval(lastRowIndex, lastRowIndex);
                        //tabl.setSelectionBackground(Color.YELLOW);
                    }

                    // Displaying the root, assuming it's the last computed xR
                    String decimalRoot = decimalFormat.format(prevXU); // Assuming the last computed xR is the root
                    regularoot.setText(decimalRoot);
                    plotGraphregula(regulaequation.getText(), Double.parseDouble(regulaxl.getText()), Double.parseDouble(regularoot.getText()));
                }
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "PLEASE ENTER A VALID NUMBERS FOR BOTH LOWER AND UPPER BOUND LIMITS");
            } catch (Exception ex) {
                ex.printStackTrace();
            }

       
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void simplefixrootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simplefixrootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simplefixrootActionPerformed

    private void simplefixeq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simplefixeq1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simplefixeq1ActionPerformed

    private void simplefixeq1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_simplefixeq1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_simplefixeq1KeyPressed

    private void simplefixeq1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_simplefixeq1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_simplefixeq1KeyTyped

    private void simplefixxlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simplefixxlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simplefixxlActionPerformed

    private void simplefixxlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_simplefixxlKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_simplefixxlKeyTyped

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         try {
                DecimalFormat decimalFormat = new DecimalFormat("#.#########");
                if (simplefixeq1.getText().isEmpty() || simplefixxl.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Enter the data needed");
                } else {
                    ArrayList<Object[]> data = new ArrayList<>();
                    double MarginE = 0.001;
                    double x0 = Double.parseDouble(simplefixxl.getText()); // Initial guess
                    double x1;
                    int iterations = 0;
                    double error = Double.MAX_VALUE;

                    while (error > MarginE) {
                        iterations++;
                        x1 = g(x0); // Fixed-point iteration: x1 = g(x0)

                        String decimalnumX0 = decimalFormat.format(x0);
                        String decimalnumX1 = decimalFormat.format(x1);
                        String decimalnumError;

                        if (iterations == 1) {
                            decimalnumError = " ";
                        } else {
                            double prevX0 = Double.parseDouble(data.get(iterations - 2)[1].toString());
                            error = Math.abs(x1 - prevX0) / Math.abs(x1) * 100;
                            decimalnumError = decimalFormat.format(error);
                        }

                        Object[] rowData = {iterations, decimalnumX0, decimalnumX1, decimalnumError};
                        data.add(rowData);

                        x0 = x1;
                    }

                    DefaultTableModel model = (DefaultTableModel) tab5.getModel();
                    model.setRowCount(0);

                    for (Object[] row : data) {
                        model.addRow(row);
                    }

                    int lastRowIndex = model.getRowCount() - 1;
                    if (lastRowIndex >= 0) {
                        tab5.addRowSelectionInterval(lastRowIndex, lastRowIndex);
                        //Root highlight
                       // tabl.setSelectionBackground(Color.YELLOW);
                    }

                    // Displaying the root, assuming it's the last computed x1
                    String decimalRoot = decimalFormat.format(x0);
                    simplefixroot.setText(decimalRoot);
                    plotGraphsimplefix(simplefixeq1.getText(), Double.parseDouble(simplefixxl.getText()), Double.parseDouble(simplefixroot.getText()));
                }
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "PLEASE ENTER A VALID NUMBERS FOR BOTH LOWER AND UPPER BOUND LIMITS");
            } catch (Exception ex) {
                ex.printStackTrace();
            }// TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        incremental.setVisible(false);
        bisection.setVisible(false);
        simplefix.setVisible(true);
        regulafalse.setVisible(false);
        graph.setVisible(false);
        newtonrapson.setVisible(false);
        secant.setVisible(false);
        
        /*     simplefix.setVisible(true);
     bisection.setVisible(false);
     incremental.setVisible(false);
     graph.setVisible(false);
     regulafalse.setVisible(false);
        
     //clear the graph panel
     DefaultTableModel model = (DefaultTableModel) tab.getModel();
     eqt.setText("");
     a.setText("");
     approRoot.setText("");
     model.setRowCount(0);
     graph1.removeAll();
     graph1.revalidate();
     graph1.repaint();
     
     // clear the incremental
     DefaultTableModel model1 = (DefaultTableModel) tab1.getModel();
     imEqt.setText("");
     lb.setText("");
     imRoot.setText("");
     model1.setRowCount(0);
     graph2.removeAll();
     graph2.revalidate();
     graph2.repaint();  // TODO add your handling code here:*/
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        incremental.setVisible(false);
        bisection.setVisible(false);
        simplefix.setVisible(false);
        regulafalse.setVisible(false);
        graph.setVisible(false);
        newtonrapson.setVisible(true);
        secant.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void newtonrapsonrootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newtonrapsonrootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newtonrapsonrootActionPerformed

    private void newtonrapsoneqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newtonrapsoneqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newtonrapsoneqActionPerformed

    private void newtonrapsoneqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newtonrapsoneqKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_newtonrapsoneqKeyPressed

    private void newtonrapsoneqKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newtonrapsoneqKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_newtonrapsoneqKeyTyped

    private void newtonrapsonxlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newtonrapsonxlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newtonrapsonxlActionPerformed

    private void newtonrapsonxlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newtonrapsonxlKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_newtonrapsonxlKeyTyped

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       try {
                DecimalFormat decimalFormat = new DecimalFormat("#.#########");
                if (newtonrapsoneq.getText().isEmpty() || newtonrapsonxl.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Enter the data needed");
                } else {
                    ArrayList<Object[]> data = new ArrayList<>();
                    double MarginE = 0.001;
                    double x0 = Double.parseDouble(newtonrapsonxl.getText()); // Initial guess
                    double fx0, fDashX0, x1, fx1;
                    int iterations = 0;
                    double error = Double.MAX_VALUE;

                    while (error > MarginE) {
                        iterations++;
                        fx0 = evaluateFunc(newtonrapsoneq.getText(), x0);
                        fDashX0 = differentiateFunction(newtonrapsoneq.getText(), x0);

                        // Newton-Raphson formula for finding next approximation
                        x1 = x0 - (fx0 / fDashX0);
                        fx1 = evaluateFunc(newtonrapsoneq.getText(), x1);

                        String decimalnumX0 = decimalFormat.format(x0);
                        String decimalnumX1 = decimalFormat.format(x1);
                        String decimalnumFX0 = decimalFormat.format(fx0);
                        String decimalnumFX1 = decimalFormat.format(fx1);
                        String decimalnumError;

                        if (iterations == 1) {
                            decimalnumError = " ";
                        } else {
                            double prevX0 = Double.parseDouble(data.get(iterations - 2)[1].toString());
                            error = Math.abs(x1 - prevX0) / Math.abs(x1) * 100;
                            decimalnumError = decimalFormat.format(error);
                        }

                        Object[] rowData = {iterations, decimalnumX0, decimalnumFX0, decimalnumX1, decimalnumFX1, decimalnumError};
                        data.add(rowData);

                        x0 = x1;
                    }

                    DefaultTableModel model = (DefaultTableModel) tab6.getModel();
                    model.setRowCount(0);

                    for (Object[] row : data) {
                        model.addRow(row);
                    }

                    int lastRowIndex = model.getRowCount() - 1;
                    if (lastRowIndex >= 0) {
                        tab6.addRowSelectionInterval(lastRowIndex, lastRowIndex);
                        //tabl.setSelectionBackground(Color.YELLOW);
                    }

                    // Displaying the root, assuming it's the last computed x1
                    String decimalRoot = decimalFormat.format(x0);
                    newtonrapsonroot.setText(decimalRoot);
                    plotGraphnewtonrapson(newtonrapsoneq.getText(), Double.parseDouble(newtonrapsonxl.getText()), Double.parseDouble(newtonrapsonroot.getText()));
                }
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "PLEASE ENTER A VALID NUMBERS FOR BOTH LOWER AND UPPER BOUND LIMITS");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        incremental.setVisible(false);
        bisection.setVisible(false);
        simplefix.setVisible(false);
        regulafalse.setVisible(false);
        graph.setVisible(false);
        newtonrapson.setVisible(false);
        secant.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void secantrootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secantrootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secantrootActionPerformed

    private void secantequationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secantequationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secantequationActionPerformed

    private void secantequationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_secantequationKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_secantequationKeyPressed

    private void secantequationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_secantequationKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_secantequationKeyTyped

    private void secantxlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secantxlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secantxlActionPerformed

    private void secantxlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_secantxlKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_secantxlKeyTyped

    private void secantxuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secantxuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secantxuActionPerformed

    private void secantxuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_secantxuKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_secantxuKeyTyped

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try {
                DecimalFormat decimalFormat = new DecimalFormat("#.#####");
        if (secantequation.getText().isEmpty() || secantxl.getText().isEmpty() || secantxu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the data needed");
        } else {
            ArrayList<Object[]> data = new ArrayList<>();
            double MarginE = 0.001;
            double x0 = Double.parseDouble(secantxl.getText());
            double x1 = Double.parseDouble(secantxu.getText());
            int iterations = 0;
             double roott =  0;
             double error = Math.abs(x1 - x0);

        
         while (error > MarginE) {
                iterations++;   
                double fx0 = evaluateFunc(secantequation.getText(), x0);
                double fx1 = evaluateFunc(secantequation.getText(), x1);
                double numerator = fx1 * (x0 - x1);
                double denominator = fx0 - fx1;
                double x2 = x1 - numerator / denominator;
                double fx2 = evaluateFunc(secantequation.getText(), x2);
                error = Math.abs(x1 - x0);
                //DECIMAL PLACE//
                String decimalnumXO = decimalFormat.format(x0);
                String decimalnumXL = decimalFormat.format(x1);
                String decimalnumX2 = decimalFormat.format(x2);
                String decimalnumFx0 = decimalFormat.format(fx0);
                String decimalnumFx1 = decimalFormat.format(fx1);
                String decimalnumFx2 = decimalFormat.format(fx2);
                String decimalnumE = decimalFormat.format(error);         
                
                
                Object[] rowData = {iterations, decimalnumXO, decimalnumXL, decimalnumX2, decimalnumFx0, decimalnumFx1, decimalnumFx2, decimalnumE};
                data.add(rowData);
               
               
               x0=x1;
               x1=x2;
               roott = x2;      
              }

           DefaultTableModel model = (DefaultTableModel) tab7.getModel();
           model.setRowCount(0);
            
            for (Object[] row : data) {
                model.addRow(row);
            }
            
            int lastRowIndex = model.getRowCount() - 1;
                    if (lastRowIndex >= 0) {
                        tab7.addRowSelectionInterval(lastRowIndex, lastRowIndex);
                        //tabl.setSelectionBackground(Color.YELLOW);
                    }
                    
             String decimalRoot = decimalFormat.format(roott);
             secantroot.setText(decimalRoot);
             plotGraphsecant(secantequation.getText(), Double.parseDouble(secantxl.getText()), Double.parseDouble(secantroot.getText()));
           }
        } catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "CHECK YOUR DATA INPUT!");
}
     
    }//GEN-LAST:event_jButton14ActionPerformed

    
        private double g(double x) {
    // Example: Let's choose g(x) = x - f(x) / f'(x), similar to the Newton-Raphson method
    double fx = evaluateFunc(simplefixeq1.getText(), x);
    double fDashX = differentiateFunction(simplefixeq1.getText(), x);

    // Avoid division by zero
    if (fDashX == 0) {
        throw new ArithmeticException("Derivative is zero. Division by zero error.");
    }

    return x - (fx / fDashX);
}
    private double differentiateFunction(String equationStr, double xValue) {
    double h = 0.000001; // a small value
    return (evaluateFunc(equationStr, xValue + h) - evaluateFunc(equationStr, xValue)) / h;
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JTextField approRoot;
    private javax.swing.JPanel background;
    private javax.swing.JPanel bisection;
    private javax.swing.JTextField bmEqt;
    private javax.swing.JTextField bmRoot;
    private javax.swing.JTextField deltaX;
    private javax.swing.JTextField eqt;
    private javax.swing.JPanel graph;
    private javax.swing.JPanel graph1;
    private javax.swing.JPanel graph2;
    private javax.swing.JPanel graph3;
    private javax.swing.JPanel graph4;
    private javax.swing.JPanel graph5;
    private javax.swing.JPanel graph6;
    private javax.swing.JTextField imEqt;
    private javax.swing.JTextField imRoot;
    private javax.swing.JPanel incremental;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField lb;
    private javax.swing.JPanel newtonrapson;
    private javax.swing.JTextField newtonrapsoneq;
    private javax.swing.JTextField newtonrapsonroot;
    private javax.swing.JTextField newtonrapsonxl;
    private javax.swing.JTextField regulaequation;
    private javax.swing.JPanel regulafalse;
    private javax.swing.JTextField regularoot;
    private javax.swing.JTextField regulaxl;
    private javax.swing.JTextField regulaxu;
    private javax.swing.JPanel secant;
    private javax.swing.JTextField secantequation;
    private javax.swing.JTextField secantroot;
    private javax.swing.JTextField secantxl;
    private javax.swing.JTextField secantxu;
    private javax.swing.JPanel simplefix;
    private javax.swing.JTextField simplefixeq1;
    private javax.swing.JPanel simplefixgraph5;
    private javax.swing.JTextField simplefixroot;
    private javax.swing.JTextField simplefixxl;
    private javax.swing.JTable tab;
    private javax.swing.JTable tab1;
    private javax.swing.JTable tab3;
    private javax.swing.JTable tab4;
    private javax.swing.JTable tab5;
    private javax.swing.JTable tab6;
    private javax.swing.JTable tab7;
    private javax.swing.JTextField xl;
    private javax.swing.JTextField xu;
    // End of variables declaration//GEN-END:variables
}

    /*private static double evaluateFunc(String equationStr, double xValue) {
        double result = 0.0;
        double x = xValue;
       
        try {
            if (equationStr.equals("e^-x")) {
                result = Math.exp(-x);
            } else if (equationStr.equals("e^x")) {
                result = Math.exp(x);   
            } else if (equationStr.equals("e^-x-x")) {
                result = Math.exp(-x) - x;
            } else {
                equationStr = equationStr.replaceAll("\\s", "");
                equationStr = equationStr.replaceAll("e", Double.toString(Math.E));
                String[] terms = equationStr.split("(?=[+-])");

                  for (String term : terms) {
                    if (term.contains("x") || term.contains("X")) {
                        double coefficient = 1.0;
                        String[] parts = term.split("x");

                        try {
                            if (parts[0].equals("-")) {
                                coefficient = -1.0;
                            } else if (!parts[0].equals("+") && !parts[0].equals("")) {
                                coefficient = Double.parseDouble(parts[0]);
                            }
                            double power = 1.0;
                            if (parts.length > 1 && !parts[1].equals("")) {
                                power = Double.parseDouble(parts[1].substring(1));
                            }
                            result += coefficient * Math.pow(x, power);
                        } catch (Exception e) {
                        }
                    } else {
                        try {
                            result += Double.parseDouble(term);
                        } catch (NumberFormatException e) {
                         break;
                        }
                    }
                  }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }
 
}
*/
/*import java.util.regex.*;

    private static double evaluateFunc(String equationStr, double xValue) {
        double result = 0.0;
        double x = xValue;

        try {
            // Replace shorthand for cos and sin based on user input
            equationStr = equationStr.replace(".", "cos");
            equationStr = equationStr.replace(",", "sin");

            if (equationStr.equals("e^-x")) {
                result = Math.exp(-x);
            } else if (equationStr.equals("e^x")) {
                result = Math.exp(x);
            } else if (equationStr.equals("e^-x-x")) {
                result = Math.exp(-x) - x;
            } else {
                equationStr = equationStr.replaceAll("\\s", "");
                equationStr = equationStr.replaceAll("e", Double.toString(Math.E));
                String[] terms = equationStr.split("(?=[+-])");

                for (String term : terms) {
                    if (term.contains("cos") || term.contains("sin")) {
                        Pattern pattern = Pattern.compile("([+-]?\\d*(\\.\\d+)?)(cos|sin)(x)");
                        Matcher matcher = pattern.matcher(term);

                        while (matcher.find()) {
                            double coefficient = 1.0;
                            if (!matcher.group(1).equals("") && !matcher.group(1).equals("+")) {
                                coefficient = Double.parseDouble(matcher.group(1));
                            }

                            if (matcher.group(3).equals("cos")) {
                                result += coefficient * Math.cos(x);
                            } else if (matcher.group(3).equals("sin")) {
                                result += coefficient * Math.sin(x);
                            }
                        }
                    } else if (term.contains("x") || term.contains("X")) {
                        double coefficient = 1.0;
                        String[] parts = term.split("x");

                        try {
                            if (parts[0].equals("-")) {
                                coefficient = -1.0;
                            } else if (!parts[0].equals("+") && !parts[0].equals("")) {
                                coefficient = Double.parseDouble(parts[0]);
                            }
                            double power = 1.0;
                            if (parts.length > 1 && !parts[1].equals("")) {
                                power = Double.parseDouble(parts[1].substring(1));
                            }
                            result += coefficient * Math.pow(x, power);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        try {
                            result += Double.parseDouble(term);
                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }
*/
