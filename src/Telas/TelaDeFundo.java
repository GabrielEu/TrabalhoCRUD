package Telas;

import java.net.URL;
import java.security.Principal;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javax.swing.JLabel;

import java.net.URL;
import java.security.Principal;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javax.swing.JLabel;

import Acoes.DadosEMetodos;

public class TelaDeFundo {

	public TelaDeFundo() {

		// Dar status LIVRE aos computadores
		DadosEMetodos d = new DadosEMetodos();
		d.atribuirBoolean();
		
		// Obtendo a imagem
		URL urlImagem = Principal.class.getResource("/Imagens/wallpaper.jpg");
		ImageIcon imagem = new ImageIcon(urlImagem);

		// Tela para inserir a imagem
		JFrame construtor = new JFrame();
		construtor.setUndecorated(true);
		construtor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		construtor.setLocationRelativeTo(null);
		construtor.getContentPane().setLayout(null);
		construtor.setResizable(false);
		construtor.setExtendedState(JFrame.MAXIMIZED_BOTH);

		// Inserindo imagem
		JLabel exibirImagem = new JLabel(imagem);
		exibirImagem.setBounds(0, 0, 1600, 800);
		
		// Adicionar componentes
		construtor.add(exibirImagem);

		// Tornar visível
		construtor.setVisible(true);
	}
}
