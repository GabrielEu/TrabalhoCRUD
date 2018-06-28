package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.xml.crypto.dsig.CanonicalizationMethod;

import Acoes.Cadastros;
import Acoes.DadosEMetodos;
import Acoes.MetodoTabelas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Window.Type;

public class CadastrarProdutos {
	private JTextField campoProduto;
	private JTextField campoPreco;
	private JTextField campoQuantidade;
	private JTable table;
	private JTable table_1;

	public CadastrarProdutos() {

		JFrame cadastrar = new JFrame();
		cadastrar.setResizable(false);
		cadastrar.setType(Type.UTILITY);
		cadastrar.getContentPane().setBackground(Color.BLACK);
		cadastrar.getContentPane().setFont(new Font("Arial Narrow", Font.PLAIN, 17));
		cadastrar.setSize(300, 300);
		cadastrar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		cadastrar.setLocationRelativeTo(null);
		cadastrar.getContentPane().setLayout(null);

		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setForeground(Color.WHITE);
		lblProduto.setBackground(Color.WHITE);
		lblProduto.setFont(new Font("Arial Narrow", Font.PLAIN, 17));
		lblProduto.setBounds(10, 11, 60, 14);
		cadastrar.getContentPane().add(lblProduto);

		JLabel preco = new JLabel("Pre\u00E7o:");
		preco.setForeground(Color.WHITE);
		preco.setBackground(Color.WHITE);
		preco.setFont(new Font("Arial Narrow", Font.PLAIN, 17));
		preco.setBounds(10, 36, 46, 14);
		cadastrar.getContentPane().add(preco);

		JLabel quantidade = new JLabel("Quantidade:");
		quantidade.setForeground(Color.WHITE);
		quantidade.setBackground(Color.WHITE);
		quantidade.setFont(new Font("Arial Narrow", Font.PLAIN, 17));
		quantidade.setBounds(10, 61, 77, 14);
		cadastrar.getContentPane().add(quantidade);

		campoProduto = new JTextField();
		campoProduto.setBounds(70, 10, 113, 20);
		cadastrar.getContentPane().add(campoProduto);
		campoProduto.setColumns(10);

		campoPreco = new JTextField();
		campoPreco.setColumns(10);
		campoPreco.setBounds(58, 35, 43, 20);
		cadastrar.getContentPane().add(campoPreco);

		campoQuantidade = new JTextField();
		campoQuantidade.setColumns(10);
		campoQuantidade.setBounds(94, 60, 43, 20);
		cadastrar.getContentPane().add(campoQuantidade);

		MetodoTabelas m = new MetodoTabelas();

		// Tabela
		JTable tabela = new JTable(m.listarProdutos());

		// Atualizar tabela
		tabela.setModel(m.listarProdutos());

		// Barra de rolagem
		JScrollPane barra = new JScrollPane(tabela);
		barra.setBounds(10, 86, 272, 140);
		cadastrar.getContentPane().add(barra);

		// Botao voltar
		JButton voltar = new JButton("< Voltar");
		voltar.setBackground(Color.LIGHT_GRAY);
		voltar.setFont(new Font("Arial Narrow", Font.PLAIN, 17));
		voltar.setBounds(10, 239, 91, 23);
		cadastrar.getContentPane().add(voltar);

		voltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(Cadastros.admin == false) {
					PainelFuncionario p = new PainelFuncionario();
				} else {
					PainelAdministrador voltar = new PainelAdministrador();
				}
				
				cadastrar.dispose();
			}
		});

		// Botao para cadastrar
		JButton botaoCadastrar = new JButton("Cadastrar");
		botaoCadastrar.setBackground(Color.LIGHT_GRAY);
		botaoCadastrar.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		botaoCadastrar.setBounds(191, 239, 91, 23);
		cadastrar.getContentPane().add(botaoCadastrar);

		botaoCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				double compararPreco = Double.parseDouble(campoPreco.getText());
				int compararQuantidade = Integer.parseInt(campoQuantidade.getText());

				// Validar campos vazios
				if (campoProduto.getText().equals("") || (compararPreco == 0.0) || (compararQuantidade == 0)) {
					
					JOptionPane.showMessageDialog(null, "Não deixe NENHUM campo vazio", "Erro", 0);
					
				} else {
					String nomeProduto = campoProduto.getText();
					double valorProduto = Double.parseDouble(campoPreco.getText());
					int quantidadeProduto = Integer.parseInt(campoQuantidade.getText());

					Cadastros c = new Cadastros();
					c.cadastrarProduto(nomeProduto, valorProduto, quantidadeProduto);

					// Atualizar tabela
					tabela.setModel(m.listarProdutos());

					// Limpar campos
					campoProduto.setText("");
					campoPreco.setText("");
					campoQuantidade.setText("");

					campoProduto.requestFocus();

				}
			}
		});
		
		// Acao na tabela
		tabela.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				// Obter linha
				int linha = tabela.getSelectedRow();
				
				// Obter dados
				String nomeProduto = tabela.getValueAt(linha, 0).toString();
				double precoProduto = Double.parseDouble(tabela.getValueAt(linha, 1).toString());
				int quantidadeProduto = Integer.parseInt(tabela.getValueAt(linha, 2).toString());
				
				AlterarProduto a = new AlterarProduto(nomeProduto, precoProduto, quantidadeProduto, linha);
				cadastrar.dispose();	
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		cadastrar.setVisible(true);
	}
}
