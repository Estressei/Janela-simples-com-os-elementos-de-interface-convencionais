import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    private JLabel statusBar;

    public Main() {
        setTitle("Trabalho 1");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon("Janela-simples-com-os-elementos-de-interface-convencionais/ft.png");
        setIconImage(icon.getImage());

        JMenuBar menuBar = new JMenuBar();
        JMenu menuMenus = new JMenu("Menus");
        JMenuItem itemOpcoesM = new JMenuItem("Opçoes dentro do menu");

        menuMenus.add(itemOpcoesM);
        menuBar.add(menuMenus);

        JMenuItem menuSair = new JMenuItem("Sair");
        menuSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Fecha a aplicação
            }
        });

        menuBar.add(menuSair);

        setJMenuBar(menuBar);

        statusBar = new JLabel("Status da pagina: ");
        statusBar.setBorder(BorderFactory.createEtchedBorder());
        add(statusBar, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}