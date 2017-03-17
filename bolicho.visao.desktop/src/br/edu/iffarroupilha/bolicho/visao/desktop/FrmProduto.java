package br.edu.iffarroupilha.bolicho.visao.desktop;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * <p>
 * classe que representa a interface para produto.
 * </p>
 * @author fernando
 *
 */
public class FrmProduto  extends JFrame {

	public FrmProduto(Bolicho principal) {
		setTitle("Bolicho -> Produto");
		setSize(320,240);
		setLocationRelativeTo(principal);
		desenhaComponentes();
		setVisible(true);
	}

	private void desenhaComponentes() {
		// cria os componentes para a tela
		JLabel jblDescricao = new JLabel("Descricao:");
		JLabel jblPreco = new JLabel("Preço:");
		JTextField jtfDescricao = new JTextField(30);
		JTextField jtfPreco = new JTextField(30);
		JButton btnGravar = new JButton("Gravar");
		
		setLayout(new FlowLayout());
		
		// adiciona em tela
		add(jblDescricao);
		add(jtfDescricao);
		add(jblPreco);
		add(jtfPreco);
		add(btnGravar);
		
	}
}
