import javax.swing.*;
import java.awt.*;

public class Atividade1GUI extends JFrame {

    public Atividade1GUI() {
        setTitle("Atividade 1 - Interface Gráfica");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Componentes solicitados
        String[] opcoes = {"Opção 1", "Opção 2", "Opção 3"};
        JComboBox<String> comboBox = new JComboBox<>(opcoes);
        JCheckBox checkBox = new JCheckBox("Marque aqui");
        JTextField textField = new JTextField(15);
        JButton btnSalvar = new JButton("Salvar");
        JButton btnSair = new JButton("Sair");

        add(comboBox);
        add(checkBox);
        add(textField);
        add(btnSalvar);
        add(btnSair);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Atividade1GUI janela = new Atividade1GUI();
            janela.setLocationRelativeTo(null);
            janela.setVisible(true);
        });
    }
}
