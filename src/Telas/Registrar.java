package Telas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import Acoes.Cadastros;
import Acoes.DadosEMetodos;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class Registrar {
	private JTextField campoUsuario;
	private JTextField campoIdade;
	private JTextField campoNumero;
	private JPasswordField campoSenha;

	public Registrar() {

		JFrame registrar = new JFrame();
		registrar.getContentPane().setBackground(Color.BLACK);
		registrar.setUndecorated(true);
		registrar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		registrar.setSize(200, 177);
		registrar.setLocationRelativeTo(null);
		registrar.getContentPane().setLayout(null);

		JLabel textoUsuario = new JLabel("Usu\u00E1rio:");
		textoUsuario.setForeground(Color.WHITE);
		textoUsuario.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		textoUsuario.setBounds(10, 11, 65, 21);
		registrar.getContentPane().add(textoUsuario);

		JLabel textoIdade = new JLabel("Idade:");
		textoIdade.setForeground(Color.WHITE);
		textoIdade.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		textoIdade.setBounds(10, 75, 65, 21);
		registrar.getContentPane().add(textoIdade);

		JLabel textoNumero = new JLabel("N\u00FAmero:");
		textoNumero.setForeground(Color.WHITE);
		textoNumero.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		textoNumero.setBounds(10, 107, 65, 21);
		registrar.getContentPane().add(textoNumero);

		JLabel senha = new JLabel("Senha:");
		senha.setForeground(Color.WHITE);
		senha.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		senha.setBounds(10, 43, 65, 21);
		registrar.getContentPane().add(senha);
		
		// Campo para registrar seu login
		campoUsuario = new JTextField();
		campoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		campoUsuario.setBounds(85, 11, 105, 21);
		registrar.getContentPane().add(campoUsuario);
		campoUsuario.setColumns(10);

		// Campo para registrar sua idade
		campoIdade = new JTextField();
		campoIdade.setFont(new Font("Tahoma", Font.PLAIN, 17));
		campoIdade.setColumns(10);
		campoIdade.setBounds(66, 75, 124, 21);
		registrar.getContentPane().add(campoIdade);

		// Campo para registrar seu número
		campoNumero = new JTextField();
		campoNumero.setFont(new Font("Tahoma", Font.PLAIN, 17));
		campoNumero.setColumns(10);
		campoNumero.setBounds(85, 107, 105, 21);
		registrar.getContentPane().add(campoNumero);

		// Campo para cadastrar sua senha
		campoSenha = new JPasswordField();
		campoSenha.setFont(new Font("Tahoma", Font.PLAIN, 17));
		campoSenha.setBounds(69, 43, 121, 21);

		// Campo para finalizar o cadastro
		JButton botaoRegistrar = new JButton("Registrar");
		botaoRegistrar.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		botaoRegistrar.setBackground(Color.LIGHT_GRAY);
		botaoRegistrar.setBounds(101, 143, 89, 23);
		registrar.getContentPane().add(botaoRegistrar);

		// Ação do botão registrar
		botaoRegistrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Variáveis
				String usuario = campoUsuario.getText();
				String senha = campoSenha.getText();
				int idade = Integer.parseInt(campoIdade.getText());
				int numero = Integer.parseInt(campoNumero.getText());

				// Instanciando cadastro
				Cadastros d = new Cadastros();
				d.Cadastros(usuario, senha, numero, idade);

				// Validando campos
				if ((usuario.equals("")) || (senha.equals("")) || (idade == 0) || (numero == 0)) {

					JOptionPane.showMessageDialog(null, "Não deixe NENHUM campo vazio", "ERRO", 0);

				} else {
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso", "Cadastrado", -1);
					registrar.dispose();
					TelaLogin logar = new TelaLogin();

				}

			}
		});
		
		// Botão voltar
		JButton voltar = new JButton("< Voltar");
		voltar.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		voltar.setBackground(Color.LIGHT_GRAY);
		voltar.setBounds(10, 143, 81, 23);
		registrar.getContentPane().add(voltar);

		// Ação do botão voltar
		voltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				TelaLogin voltar = new TelaLogin();
				registrar.dispose();
			}
		});

		registrar.getContentPane().add(campoSenha);
		registrar.setVisible(true);
	}

}