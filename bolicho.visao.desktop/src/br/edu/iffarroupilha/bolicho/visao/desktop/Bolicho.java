package br.edu.iffarroupilha.bolicho.visao.desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * <p>
 * Classe principal do projeto, contempla tela inicial
 * </p>
 *
 */

public class Bolicho extends JFrame {

	public Bolicho() {
		setTitle(":: Bolicho ::");
		setSize(640, 480);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		desenhaComponentes();
		// muda a aparencia da aplicação JAVA
		try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setVisible(true);
	}

	private void desenhaComponentes() {
		// cria a barra de menus
		JMenuBar menu = new JMenuBar();
		// cria menu cadastros
		JMenu cadastro = new JMenu("Cadastros");
		menu.add(cadastro);
		// cria os sub itens
		JMenuItem cliente = new JMenuItem("Clientes");
		JMenuItem produto = new JMenuItem("Produtos");
		JMenuItem venda = new JMenuItem("Vendas");
		// vincula ao menu cadastros
		cadastro.add(cliente);
		cadastro.add(produto);
		cadastro.add(venda);
		// vincula as ações aos itens
		cliente.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new FrmCliente(Bolicho.this);
			}
		});

		produto.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new FrmProduto( Bolicho.this  );
			}
		});
		
		venda.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Bolicho.this, "Voce clicou!!! ");
			}
		});

		// adiciona o menu em tela
		setJMenuBar(menu);

	}

	public static void main(String[] args) {
		new Bolicho();
	}

}
