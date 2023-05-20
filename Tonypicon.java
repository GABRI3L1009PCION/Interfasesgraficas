import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tonypicon extends JFrame {
    private JLabel label;
    private JTextField textField;
    private JButton button;
    private JComboBox<String> comboBox;
    private JCheckBox checkBox;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JProgressBar progressBar;

    public Tonypicon() {
        setTitle("Ejemplo de GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new FlowLayout());

        label = new JLabel("Etiqueta:");
        add(label);

        textField = new JTextField(15);
        add(textField);

        button = new JButton("Botón");
        add(button);

        comboBox = new JComboBox<>(new String[]{"Opción 1", "Opción 2", "Opción 3"});
        add(comboBox);

        checkBox = new JCheckBox("Casilla de selección");
        add(checkBox);

        radioButton1 = new JRadioButton("Radio 1");
        radioButton2 = new JRadioButton("Radio 2");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        add(radioButton1);
        add(radioButton2);

        progressBar = new JProgressBar(0, 100);
        add(progressBar);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                JOptionPane.showMessageDialog(Tonypicon.this, "Texto ingresado: " + inputText);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Tonypicon gui = new Tonypicon();
                gui.setVisible(true);
            }
        });
    }
}


