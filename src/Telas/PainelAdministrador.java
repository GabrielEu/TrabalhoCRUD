package Telas;

import javax.swing.JFrame;

import Acoes.DadosEMetodos;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class PainelAdministrador {

	public PainelAdministrador(){
		
		JFrame administrador = new JFrame();
		administrador.getContentPane().setBackground(Color.DARK_GRAY);
		administrador.setUndecorated(true);
		administrador.setSize(467, 185);
		administrador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		administrador.setLocationRelativeTo(null);
		administrador.getContentPane().setLayout(null);
		
		// Bot?para ter acesso a todos os computadores da lan house, ver se est?endo usado e etc
		JButton computadores = new JButton("Computadores");
		computadores.setFont(new Font("Arial Narrow", Font.PLAIN, 14));
		computadores.setBackground(Color.LIGHT_GRAY);
		computadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		computadores.setBounds(10, 11, 129, 53);
		administrador.getContentPane().add(computadores);
		
		// A? do bot?
		computadores.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ListaComputadores c = new ListaComputadores();
				
				// Fechar painel do administrador
				administrador.dispose();
			}
		});
		
		// Bot?para administrar o estoque de jogos e produtos a venda
		JButton estoque = new JButton("Estoque de produtos");
		estoque.setFont(new Font("Arial Narrow", Font.PLAIN, 14));
		estoque.setBackground(Color.LIGHT_GRAY);
		estoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastrarProdutos c = new CadastrarProdutos();
				administrador.dispose();
				DadosEMetodos d = new DadosEMetodos();
				
			}
		});
		estoque.setBounds(166, 11, 135, 53);
		administrador.getContentPane().add(estoque);
		
		// Bot?para administrar contas registradas
		JButton gerenciarContas = new JButton("Gerenciar contas");
		gerenciarContas.setFont(new Font("Arial Narrow", Font.PLAIN, 14));
		gerenciarContas.setBackground(Color.LIGHT_GRAY);
		gerenciarContas.setBounds(380, 11, 129, 53);
		administrador.getContentPane().add(gerenciarContas);
		
		gerenciarContas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				GerenciarContas g = new GerenciarContas();
				administrador.dispose();
				
			}
		});
		

		
		JButton sairDaConta = new JButton("Sair da conta");
		sairDaConta.setBackground(Color.LIGHT_GRAY);
		sairDaConta.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		sairDaConta.setBounds(10, 160, 103, 23);
		administrador.getContentPane().add(sairDaConta);
		
		sairDaConta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaLogin login = new TelaLogin();
				administrador.dispose(); 
			}
		});
		
		administrador.setVisible(true);
		
		
		
	}
}