package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Acoes.DadosEMetodos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AlterarConta {

	public AlterarConta(String nomeUsuario, int numeroUsuario, int linha) {

		JFrame alterar = new JFrame("Alterar conta");
		alterar.getContentPane().setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		alterar.getContentPane().setBackground(Color.BLACK);
		alterar.setSize(290, 210);
		alterar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		alterar.setLocationRelativeTo(null);
		alterar.getContentPane().setLayout(null);
		
		JLabel campoUsuario = new JLabel(nomeUsuario);
		campoUsuario.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		campoUsuario.setForeground(Color.WHITE);
		campoUsuario.setBounds(93, 40, 178, 19);
		alterar.getContentPane().add(campoUsuario);
		
		JLabel campoNumero = new JLabel(String.valueOf(numeroUsuario));
		campoNumero.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		campoNumero.setForeground(Color.WHITE);
		campoNumero.setBounds(103, 70, 162, 14);
		alterar.getContentPane().add(campoNumero);
		
		JLabel textoNumero = new JLabel("Numero:");
		textoNumero.setForeground(Color.WHITE);
		textoNumero.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		textoNumero.setBounds(29, 70, 162, 14);
		alterar.getContentPane().add(textoNumero);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio:");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		lblUsuario.setBounds(29, 40, 81, 19);
		alterar.getContentPane().add(lblUsuario);
		
		JButton botaoVoltar = new JButton("< Voltar");
		botaoVoltar.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		botaoVoltar.setBounds(10, 123, 122, 50);
		alterar.getContentPane().add(botaoVoltar);
		
		JButton btnExcluirConta = new JButton("Excluir conta");
		btnExcluirConta.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		btnExcluirConta.setBounds(149, 123, 122, 50);
		alterar.getContentPane().add(btnExcluirConta);
		
		btnExcluirConta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				DadosEMetodos.usuarios.remove(linha);
				
				JOptionPane.showMessageDialog(null, "Excluido com sucesso", "",	-1);
				
				GerenciarContas g = new GerenciarContas();
				alterar.dispose();
				
			}
		});
	
	alterar.setVisible(true);
	
	}
}
