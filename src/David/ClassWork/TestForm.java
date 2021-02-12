/*
 * Created by JFormDesigner on Thu Feb 11 19:14:59 CST 2021
 */

package David.ClassWork;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class TestForm extends JFrame {
    public TestForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        dialogPane = new JPanel();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();
        label1 = new JLabel();
        button6 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax .
            swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border
            . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog"
            , java .awt . Font. BOLD ,12 ) ,java . awt. Color .red ) ,dialogPane. getBorder
            () ) ); dialogPane. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java
            . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException
            ( ) ;} } );
            dialogPane.setLayout(new BorderLayout());

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

            //---- label1 ----
            label1.setIcon(new ImageIcon("/Users/davidgarcia/Desktop/Untitled-1.png"));
            dialogPane.add(label1, BorderLayout.NORTH);

            //---- button6 ----
            button6.setText("text");
            dialogPane.add(button6, BorderLayout.WEST);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    private JLabel label1;
    private JButton button6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
