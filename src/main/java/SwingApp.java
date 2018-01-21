import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SwingApp extends JFrame{
    private JComboBox staticList;
    private JComboBox secondList;
    private JButton jButton;
    private JLabel label;

    public SwingApp() throws HeadlessException {
        setSize(600, 400);
        setTitle("Moja aplikacja Swing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
    }

    public void generateUi(){
        Integer[] data = {1, 2, 3, 4, 5};

        staticList = new JComboBox(data);
        staticList.setSelectedIndex(1);
        add(staticList);

        Integer[] randomData = new Integer[20];

        Random generator = new Random();
        int low = 0;
        int high = 100;

        for (int i = 0; i < 20; i++){
            randomData[i] = generator.nextInt(high - low);
        }

        secondList = new JComboBox(randomData);
        staticList.setSelectedIndex(1);
        add(secondList);

        jButton = new JButton("OK");
        add(jButton);

        label = new JLabel("0");
        add(label);

        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstSelect = staticList.getSelectedItem().toString();
                int firstSlc = Integer.parseInt(firstSelect);

                String secondSelect = secondList.getSelectedItem().toString();
                int secondSlc = Integer.parseInt(secondSelect);
                int result = multiple(firstSlc,  secondSlc);
                label.setText(new Integer(result).toString());
            }
        });


        setVisible(true);

        }

    private int multiple(int firstSlc, int secondSlc) {
        return firstSlc * secondSlc;
    }

}
