import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SwingApp extends JFrame{
    private JComboBox productList;
    private JComboBox stateList;
    private JButton jButton;
    private JLabel label;

    public SwingApp() throws HeadlessException {
        setSize(600, 400);
        setTitle("Moja aplikacja Swing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
    }

    public void generateUi(){
        String[] products = {"Ziemniaki", "Cebula", "Buraki"};

        productList = new JComboBox(products);
        productList.setSelectedIndex(1);
        add(productList);

        String[] states = {"Alaska", "Alabama", "Kentucky"};

        stateList = new JComboBox(states);
        stateList.setSelectedIndex(1);
        add(stateList);

        jButton = new JButton("OK");
        add(jButton);

        label = new JLabel("0");
        add(label);

//        jButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                String firstSelect = staticList.getSelectedItem().toString();
//                int firstSlc = Integer.parseInt(firstSelect);
//
//                String secondSelect = secondList.getSelectedItem().toString();
//                int secondSlc = Integer.parseInt(secondSelect);
//                int result = multiple(firstSlc,  secondSlc);
//                label.setText(new Integer(result).toString());
//            }
//        });


        setVisible(true);

        }

    public static int multiple(int firstSlc, int secondSlc) {
        return firstSlc * secondSlc;
    }

}
