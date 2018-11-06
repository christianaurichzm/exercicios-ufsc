package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaPrincipal extends JFrame {
     private JLabel lbTexto;
    private JButton btOK;
    private JButton btCancel;
    private JTextField tfNome;
    
    private GerenciadorBotoes btManager; 
       
    public TelaPrincipal() {
        super("Meu primeiro JFrame do semestre - Tela Principal");
        btManager = new GerenciadorBotoes();
        configuraTela();
    }

    private void configuraTela() {
        Container container = getContentPane();
        container.setLayout(new GridBagLayout());
        
        GridBagConstraints cons = new GridBagConstraints();
        
        //Configuracao dos componentes
        //Configura label lbTexto
        lbTexto = new JLabel("Nome: ");
        cons.gridx = 0;
        cons.gridy = 0;
        container.add(lbTexto, cons);
        
        //Configura JTextField tfNome
        tfNome = new JTextField("Digite seu nome");
        cons.gridx = 1;
        cons.gridy = 0;
        container.add(tfNome, cons);
        
        //Configura Botao btOK
        btOK = new JButton("OK");
        cons.gridx = 0;
        cons.gridy = 1;
        btOK.addActionListener(btManager);
        
        container.add(btOK, cons);
        
        //Configura Botao btCancel
        btCancel = new JButton("Cancel");
        cons.gridx = 1;
        cons.gridy = 1;
        btCancel.addActionListener(btManager);        
        container.add(btCancel, cons);
        
        //Configura Frame
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private class GerenciadorBotoes implements ActionListener {            
        @Override
        public void actionPerformed(ActionEvent e) {
           if (e.getSource().equals(btOK)) {
               ControladorPrincipal.getInstancia().addNome(tfNome.getText());
           }  else if (e.getSource().equals(btCancel)) {
               JOptionPane.showConfirmDialog(null, "Cancelou!!", "Titulo", 2);
           }            
           
        }         
    }
    
}