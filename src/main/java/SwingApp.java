import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Random;

public class SwingApp extends JFrame{
    private JComboBox productList;
    private JComboBox stateList;
    private JTextField price;
    private JButton jButton;
    private JLabel label;

    public SwingApp() throws HeadlessException {
        setSize(600, 400);
        setTitle("Moja aplikacja Swing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
    }

    public void generateUi(){
        String[] products = {"Ziemniaki", "Cebula", "Buraki", "Ketonal", "Ibuprom"};

        productList = new JComboBox(products);
        productList.setSelectedIndex(1);
        add(productList);

        String[] states = {"Alaska", "Alabama", "Kentucky"};

        stateList = new JComboBox(states);
        stateList.setSelectedIndex(1);
        add(stateList);

        JLabel priceBruttoLabel = new JLabel("Cena brutto:");
        price = new JTextField();
        add(priceBruttoLabel);
        add(price);


        jButton = new JButton("Przelicz");
        add(jButton);

        label = new JLabel("Cena netto:");
        add(label);


        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String productSelect = productList.getSelectedItem().toString();

                String stateSelect = stateList.getSelectedItem().toString();

                try {
                    double priceBrutto = Double.parseDouble(price.getText());
                    if (priceBrutto <= 0){
                        throw new IllegalArgumentException();
                    }
                    BigDecimal nettoPrice = calculateNettoPrice(productSelect, stateSelect, priceBrutto);
                    label.setText(NumberFormat.getCurrencyInstance().format(nettoPrice));
                }
                catch (Exception exp){
                    label.setText("Niepoprawna cena");
                }

            }
        });


        setVisible(true);

        }

    private BigDecimal calculateNettoPrice(String productSelect, String stateSelect, double price) {

        double tax = 0;
        String productType = "";
        switch (productSelect) {
            case "Ziemniaki":
            case "Cebula":
            case "Buraki":
                productType = "Groceries";
                break;
            case "Ketanol":
            case "Ibuprom":
                productType = "Drug";


        }
        switch (stateSelect) {
            case "Alaska":
                tax = 0;
                break;
            case "Alabama":
                switch (productType){
                    case "Drug":
                        tax = 0;
                        break;
                    case "Groceries":
                        tax = 0.04;
                        break;
                }
            case "Kentucky":
                switch (productType){
                    case "Drug":
                        tax = 0;
                        break;
                    case "Groceries":
                        tax = 0;
                        break;
                }
        }

        BigDecimal netto = BigDecimal.valueOf(calculate(price, tax));

        return netto;

    }

    public static double calculate(double price, double tax) {
        return price/(1+tax);
    }

    public static int multiple(int firstSlc, int secondSlc) {
        return firstSlc * secondSlc;
    }

}
