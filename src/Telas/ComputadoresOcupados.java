package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Acoes.DadosEMetodos;

public class ComputadoresOcupados {

	public ComputadoresOcupados() {

		DadosEMetodos c = new DadosEMetodos();

		JFrame construtor = new JFrame(c.getComputador());
		construtor.setResizable(false);
		construtor.getContentPane().setBackground(Color.BLACK);
		construtor.setBackground(Color.BLACK);
		construtor.setType(Type.UTILITY);
		construtor.setLocationByPlatform(true);
		construtor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		construtor.setSize(322, 300);
		construtor.setLocationRelativeTo(null);
		construtor.getContentPane().setLayout(null);

		JLabel statusLivre = new JLabel("Ocupado");
		statusLivre.setForeground(Color.RED);
		statusLivre.setFont(new Font("Arial Narrow", Font.BOLD, 19));
		statusLivre.setBounds(60, 16, 80, 20);
		construtor.getContentPane().add(statusLivre);

		// Status do computador - Livre ou ocupado
		JLabel status = new JLabel("Status:");
		status.setForeground(Color.WHITE);
		status.setFont(new Font("Arial Narrow", Font.PLAIN, 19));
		status.setBounds(10, 11, 89, 32);
		construtor.getContentPane().add(status);

		// Divisória de enfeite
		JButton linha = new JButton("");
		linha.setBackground(new Color(128, 0, 0));
		linha.setBounds(0, 51, 328, 9);
		construtor.getContentPane().add(linha);

		// Botao
		JButton voltar = new JButton("Voltar");
		voltar.setFont(new Font("Arial Narrow", Font.PLAIN, 19));
		voltar.setBackground(Color.LIGHT_GRAY);
		voltar.setBounds(99, 198, 117, 42);
		construtor.getContentPane().add(voltar);

		JLabel usuarioDoComputador = new JLabel("Usuário:");
		usuarioDoComputador.setForeground(Color.WHITE);
		usuarioDoComputador.setFont(new Font("Arial Narrow", Font.PLAIN, 19));
		usuarioDoComputador.setBounds(146, 11, 89, 32);
		construtor.getContentPane().add(usuarioDoComputador);

		DadosEMetodos d = new DadosEMetodos();
																
		JLabel nomeDoUsuario = new JLabel(d.getUsuarioDoComputador());
		nomeDoUsuario.setForeground(Color.WHITE);
		nomeDoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nomeDoUsuario.setBounds(206, 11, 89, 32);
		construtor.getContentPane().add(nomeDoUsuario);

		// Acao do botao
		voltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ListaComputadores voltar = new ListaComputadores();
				construtor.dispose();

			}
		});
	
		
		construtor.setVisible(true);
		
	}

}
