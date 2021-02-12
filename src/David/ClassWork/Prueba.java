/*
 * Created by JFormDesigner on Thu Feb 11 19:25:51 CST 2021
 */

package David.ClassWork;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class Prueba extends JFrame {
    public Prueba() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        Logo = new JLabel();
        Medicos = new JButton();
        Clinicas = new JButton();
        Padecimientos = new JButton();
        Pacientes = new JButton();
        Citas = new JButton();
        Busqueda = new JTextField();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder (
            0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder
            . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .
            red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java .
            beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new MigLayout(
                    "insets dialog,hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));

                //---- Logo ----
                Logo.setIcon(new ImageIcon("/Applications/University/University/Cuatrimestre 2/Progra 2/ProyectoProgramado/Untitled-1.png"));
                contentPanel.add(Logo, "cell 0 0");

                //---- Medicos ----
                Medicos.setText("Registro de Medicos");
                contentPanel.add(Medicos, "cell 0 1 2 1");

                //---- Clinicas ----
                Clinicas.setText("Registro de Clinicas");
                contentPanel.add(Clinicas, "cell 0 2 2 1");

                //---- Padecimientos ----
                Padecimientos.setText("Registro de Padecimientos");
                contentPanel.add(Padecimientos, "cell 0 3 2 1");

                //---- Pacientes ----
                Pacientes.setText("Registro de Pacientes");
                contentPanel.add(Pacientes, "cell 0 4 2 1");

                //---- Citas ----
                Citas.setText("Registro de Cita");
                contentPanel.add(Citas, "cell 0 5 2 1");

                //---- Busqueda ----
                Busqueda.setText("Busqueda");
                Busqueda.setHorizontalAlignment(SwingConstants.CENTER);
                Busqueda.setForeground(Color.lightGray);
                contentPanel.add(Busqueda, "cell 0 6 3 1,align center center,grow 0 0,width 170:170:170");
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setLayout(new MigLayout(
                    "insets dialog,alignx right",
                    // columns
                    "[button,fill]" +
                    "[button,fill]",
                    // rows
                    null));

                //---- okButton ----
                okButton.setText("OK");
                buttonBar.add(okButton, "cell 0 0");

                //---- cancelButton ----
                cancelButton.setText("Cancel");
                buttonBar.add(cancelButton, "cell 1 0");
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel Logo;
    private JButton Medicos;
    private JButton Clinicas;
    private JButton Padecimientos;
    private JButton Pacientes;
    private JButton Citas;
    private JTextField Busqueda;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
