package gui.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ExemploJanelaSwing extends JFrame {

	private JPanel contentPane;
	private JTextField txtTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploJanelaSwing frame = new ExemploJanelaSwing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ExemploJanelaSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblRtulo = new JLabel("Exemplo de rótulo aqui.");
		contentPane.add(lblRtulo);
		
		txtTextField = new JTextField();
		txtTextField.setText("Texto padrão");
		contentPane.add(txtTextField);
		txtTextField.setColumns(10);
		
		// instanciei o botão
		JButton meuBotaoOk = new JButton("Ok!");
		
		// instanciei o tratador e fiz o procedimento 
		// de registro do tratador de eventos do botão "Ok!"
		TratadorEventosBotao tratador = new TratadorEventosBotao();
		meuBotaoOk.addActionListener(tratador);
		tratador.setCaixaTexto(txtTextField);
		
		contentPane.add(meuBotaoOk);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
	}

}
