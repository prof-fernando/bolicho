package br.edu.iffarroupilha.bolicho.visao.desktop;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.edu.iffarroupilha.bolicho.controle.ClienteControle;
import br.edu.iffarroupilha.bolicho.modelo.Cliente;

/**
 * <p>
 * Classe que representa a view para gerir clientes
 * </p>
 * 
 * @author fernando
 */
public class FrmCliente extends JFrame {

	private Bolicho telaPrincipal;

	public FrmCliente(Bolicho telaPrincipal) {
		this.telaPrincipal = telaPrincipal;
		setTitle("Bolicho -> Clientes");
		setSize(320, 240);
		setLocationRelativeTo(telaPrincipal);
		desenhaComponentes();
		setVisible(true);
	}

	private void desenhaComponentes() {
		JLabel lblCPF = new JLabel("CPF:");
		JLabel lblNome = new JLabel("Nome:");
		final JTextField txtCPF = new JTextField(30);
		final JTextField txtNome = new JTextField(30);
		JButton btnGravar = new JButton("Gravar");

		setLayout(new FlowLayout(FlowLayout.LEFT));

		btnGravar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ClienteControle controle = new ClienteControle();
				// pegar os dados da tela
				Cliente c = new Cliente();
				c.setNome(txtNome.getText());
				// converte para um valor numerico
				int cpf = controle.converteInteiro(txtCPF.getText());

				c.setCpf(cpf);

				// valida os dados
				String erro = controle.validarCliente(c);
				if (erro == null) {
					// nenhum erro criado
					// realiza a gravacao
					controle.gravar(c);
					JOptionPane.showMessageDialog(null, "Gravado!");
				} else {
					JOptionPane.showMessageDialog(null, erro, "Validação",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		// adiciona os componentes em tela
		add(lblCPF);
		add(txtCPF);
		add(lblNome);
		add(txtNome);
		add(btnGravar);

	}

}
