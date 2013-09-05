package br.ufu.facom.persim.view;

import br.ufu.facom.persim.control.CalendarRenderer;
import com.javaswingcomponents.calendar.JSCCalendar;
import com.javaswingcomponents.calendar.plaf.darksteel.DarkSteelCalendarUI;
import com.javaswingcomponents.calendar.plaf.darksteel.DarkSteelCellPanel;
import com.javaswingcomponents.calendar.plaf.darksteel.DarkSteelCellPanelBackgroundPainter;
import com.javaswingcomponents.calendar.plaf.darksteel.DarkSteelMonthAndYearPanel;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;
import java.util.TimeZone;
import javax.swing.JOptionPane;

public final class MainWindowFrame extends javax.swing.JFrame {
    
    public MainWindowFrame() {
        this.setMainWindowConfigurations();
        this.createCalendar();
        this.visibilityConfigurations();
    }
    
    private void setMainWindowConfigurations () {
        this.initComponents();
        this.setTitle("PERSIM - Personal Student Info. Manager");
        Container c = getContentPane();  
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();  
        setSize(tela.width, tela.height); 
        this.setVisible(true);
    }
    
    private void createCalendar(){
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = Locale.getDefault();
        
        this.cal = new JSCCalendar(timeZone, locale);
        this.cal.setUI(new DarkSteelCalendarUI());
        this.cal.setBounds(0, 0, 400, 250);
        
        DarkSteelCalendarUI calendarUI = (DarkSteelCalendarUI) this.cal.getUI();
        DarkSteelMonthAndYearPanel monthAndYearPanel = (DarkSteelMonthAndYearPanel) calendarUI.getMonthAndYearPanel();
        DarkSteelCellPanel cellPanel = (DarkSteelCellPanel) calendarUI.getCellPanel();
        DarkSteelCellPanelBackgroundPainter cellPanelBackgroundPainter =
                (DarkSteelCellPanelBackgroundPainter) cellPanel.getBackgroundPainter();
        cellPanelBackgroundPainter.setHeadingBackgroundStartGradientColor(new Color(0xB0, 0xE0, 0xE6));
        cellPanelBackgroundPainter.setHeadingBackgroundEndGradientColor(new Color(0x46, 0x82, 0xB4));
        
        this.cal.setCalendarCellRenderer(new CalendarRenderer());
        
        this.calendarioInternalFrame.add(this.cal);
    }
    
    private void visibilityConfigurations() {
        this.cal.setEnabled(false);
        this.periodosAnterioresMenu.setEnabled(false);
        this.periodosVigentesMenu.setEnabled(false);
        this.calendarioInternalFrame.setIconifiable(true);
        JOptionPane.showConfirmDialog(this, "Não há períodos cadastrados! Antes de começar "
                + "você deve cadastrar um novo período", 
                "Cadastre um novo período", JOptionPane.INFORMATION_MESSAGE , 
                JOptionPane.OK_CANCEL_OPTION);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        calendarioInternalFrame = new javax.swing.JInternalFrame();
        menuBar = new javax.swing.JMenuBar();
        periodoMenu = new javax.swing.JMenu();
        novoPeriodoMenuItem = new javax.swing.JMenuItem();
        periodosAnterioresMenu = new javax.swing.JMenu();
        periodosVigentesMenu = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calendarioInternalFrame.setTitle("Calendario");
        calendarioInternalFrame.setPreferredSize(new java.awt.Dimension(400, 250));
        calendarioInternalFrame.setVisible(true);

        javax.swing.GroupLayout calendarioInternalFrameLayout = new javax.swing.GroupLayout(calendarioInternalFrame.getContentPane());
        calendarioInternalFrame.getContentPane().setLayout(calendarioInternalFrameLayout);
        calendarioInternalFrameLayout.setHorizontalGroup(
            calendarioInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );
        calendarioInternalFrameLayout.setVerticalGroup(
            calendarioInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
        );

        calendarioInternalFrame.setBounds(20, 20, 410, 250);
        desktopPane.add(calendarioInternalFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);

        periodoMenu.setText("Periodo");

        novoPeriodoMenuItem.setText("Novo Periodo");
        periodoMenu.add(novoPeriodoMenuItem);

        periodosAnterioresMenu.setText("Periodos Anteriores");
        periodoMenu.add(periodosAnterioresMenu);

        periodosVigentesMenu.setText("Periodos Vigentes");
        periodoMenu.add(periodosVigentesMenu);

        menuBar.add(periodoMenu);

        helpMenu.setText("Janelas");
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainWindowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindowFrame().setVisible(true);
            }
        });
    }
    //Atributos declarados
    private JSCCalendar cal;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame calendarioInternalFrame;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem novoPeriodoMenuItem;
    private javax.swing.JMenu periodoMenu;
    private javax.swing.JMenu periodosAnterioresMenu;
    private javax.swing.JMenu periodosVigentesMenu;
    // End of variables declaration//GEN-END:variables
}
