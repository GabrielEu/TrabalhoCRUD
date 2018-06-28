package Telas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Acoes.Cadastros;
import Acoes.DadosEMetodos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class AlterarProduto {
	private JTextField campoNome;
	private JTextField campoValor;
	private JTextField campoQuantidade;

	public AlterarProduto(String nomeProduto, double precoProduto, int quantidadeProduto, int linha) {
		
		JFrame alterar = new JFrame(nomeProduto);
		alterar.getContentPane().setBackground(Color.BLACK);
		alterar.setResizable(false);
		alterar.setUndecorated(true);
		alterar.getContentPane().setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		alterar.setSize(325, 150);
		alterar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		alterar.setLocationRelativeTo(null);
		alterar.getContentPane().setLayout(null);
		
		JLabel lblNomeDoProduto = new JLabel("Nome do produto:");
		lblNomeDoProduto.setForeground(Color.WHITE);
		lblNomeDoProduto.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblNomeDoProduto.setBounds(10, 11, 114, 14);
		alterar.getContentPane().add(lblNomeDoProduto);
		
		JLabel lblValorDoProduto = new JLabel("Valor  do produto:");
		lblValorDoProduto.setForeground(Color.WHITE);
		lblValorDoProduto.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblValorDoProduto.setBounds(10, 34, 114, 20);
		alterar.getContentPane().add(lblValorDoProduto);
		
		JLabel lblQuantidadeDoProduto = new JLabel("Quantidade do produto:");
		lblQuantidadeDoProduto.setForeground(Color.WHITE);
		lblQuantidadeDoProduto.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblQuantidadeDoProduto.setBounds(10, 58, 150, 20);
		alterar.getContentPane().add(lblQuantidadeDoProduto);
		
		campoNome = new JTextField(nomeProduto);
		campoNome.setBounds(124, 10, 86, 20);
		alterar.getContentPane().add(campoNome);
		campoNome.setColumns(10);
		
		campoValor = new JTextField(String.valueOf(precoProduto));
		campoValor.setColumns(10);
		campoValor.setBounds(124, 36, 86, 20);
		alterar.getContentPane().add(campoValor);
		
		campoQuantidade = new JTextField(String.valueOf(quantidadeProduto));
		campoQuantidade.setColumns(10);
		campoQuantidade.setBounds(159, 60, 86, 20);
		alterar.getContentPane().add(campoQuantidade);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		cancelar.setBackground(Color.LIGHT_GRAY);
		cancelar.setBounds(10, 99, 94, 40);
		alterar.getContentPane().add(cancelar);
		
		// Acao do botao cancelar
		cancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastrarProdutos c = new CadastrarProdutos();
				alterar.dispose();
			}
		});
		
		JButton excluir = new JButton("Excluir");
		excluir.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		excluir.setBackground(Color.LIGHT_GRAY);
		excluir.setBounds(116, 99, 94, 40);
		alterar.getContentPane().add(excluir);
		
		// Acao do botao excluir
		excluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				DadosEMetodos.produtos.remove(linha);
				
				JOptionPane.showMessageDialog(null, "Excluido com sucesso", "",	-1);
				
				CadastrarProdutos c = new CadastrarProdutos();
				alterar.dispose();
			}
		});
		
		
		JButton botaoAlterar = new JButton("Alterar");
		botaoAlterar.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		botaoAlterar.setBackground(Color.LIGHT_GRAY);
		botaoAlterar.setBounds(220, 99, 94, 40);
		alterar.getContentPane().add(botaoAlterar);
		
		// Acao do botao alterar
		botaoAlterar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Obter informacoes
				String nomeProduto = campoNome.getText();
				double valorProduto = Double.parseDouble(campoValor.getText());
				int quantidadeProduto = Integer.parseInt(campoQuantidade.getText());
				
				Cadastros c = new Cadastros();
				c.alterarProduto(nomeProduto, valorProduto, quantidadeProduto, linha);
				
				JOptionPane.showMessageDialog(null, "Alterado com sucesso", "",	-1);
				CadastrarProdutos d = new CadastrarProdutos();
				
				alterar.dispose();
				
			}
		});
	
		
		
		alterar.setVisible(true);
	}
	
}