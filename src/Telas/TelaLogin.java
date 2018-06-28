package Telas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;

import Acoes.Cadastros;
import Acoes.DadosEMetodos;

import javax.swing.JPasswordField;
import javax.swing.JButton;

public class TelaLogin {
	private JTextField textField;
	private JPasswordField passwordField;

	public TelaLogin() {

		// Login e senha do administrador
		String userAdm = "admin";
		String passAdm = "admin";

		String userFuncionario = "funcionario";
		String passFuncionario = "funcionario";

		// Tela login logar
		JFrame login = new JFrame();
		login.getContentPane().setBackground(Color.BLACK);
		login.setSize(200, 190);
		login.setUndecorated(true);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.setLocationRelativeTo(null);
		login.getContentPane().setLayout(null);

		// Texto usuário
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setForeground(Color.WHITE);
		lblUsurio.setFont(new Font("Arial Narrow", Font.PLAIN, 22));
		lblUsurio.setBounds(21, 21, 79, 20);
		login.getContentPane().add(lblUsurio);

		// Texto senha
		JLabel lblNewLabel = new JLabel("Senha:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Narrow", Font.PLAIN, 22));
		lblNewLabel.setBounds(21, 58, 65, 20);
		login.getContentPane().add(lblNewLabel);

		// Campo para usuário
		JTextField user = new JTextField();
		user.setFont(new Font("Tahoma", Font.PLAIN, 17));
		user.setBounds(93, 21, 86, 20);
		login.getContentPane().add(user);
		user.setColumns(10);

		// Campo para senha
		JPasswordField password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 17));
		password.setBounds(93, 58, 86, 20);
		login.getContentPane().add(password);

		// Botão para logar
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnEntrar.setBackground(Color.LIGHT_GRAY);
		btnEntrar.setForeground(new Color(0, 0, 0));
		btnEntrar.setBounds(56, 105, 89, 23);
		login.getContentPane().add(btnEntrar);

		JLabel texto = new JLabel("ou");
		texto.setFont(new Font("Arial Narrow", Font.PLAIN, 22));
		texto.setForeground(Color.WHITE);
		texto.setBounds(87, 139, 46, 20);
		login.getContentPane().add(texto);

		// Botão para se registrar
		JButton registrar = new JButton("Registre-se");
		registrar.setBackground(Color.LIGHT_GRAY);
		registrar.setBounds(0, 170, 200, 20);
		login.getContentPane().add(registrar);

		// Ação do botão
		registrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Registrar r = new Registrar();
				login.dispose();

			}
		});

		// Ação do botão
		btnEntrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (user.getText().equals(userAdm) && (password.getText().equals(passAdm))) {
					JOptionPane.showMessageDialog(null, "Logado com sucesso", "Admin", -1);
					PainelAdministrador painel = new PainelAdministrador();
					login.dispose();
					Cadastros a = new Cadastros();
					Cadastros.admin = true;
					
					// Fechar tela de login
					login.dispose();
					
				} else if (user.getText().equals(userFuncionario) && (password.getText().equals(passFuncionario))) {
					JOptionPane.showMessageDialog(null, "Logado com sucesso", "Funcionário", -1);
					PainelFuncionario p = new PainelFuncionario();
					Cadastros.admin = false;
				
					login.dispose();
					
				} else {
					
					// Variável para indicar se a conta existe ou nãos
					boolean valida = false;

					for (int i = 0; i < DadosEMetodos.usuarios.size(); i++) {

						// Verificar se a conta existe
						if ((DadosEMetodos.usuarios.get(i).getUsuario().equals(user.getText()))
								&& (DadosEMetodos.usuarios.get(i).getSenha().equals(password.getText()))) {
							JOptionPane.showMessageDialog(null, "Logado com sucesso",
									DadosEMetodos.usuarios.get(i).getUsuario(), -1);
							valida = true;
							login.dispose();
						}

					}
					if (valida == false) {
						JOptionPane.showMessageDialog(null, "Usuário ou senha incorreta", "", -1);
					}

				}

			}
		});

		// Tornar visível
		login.setVisible(true);
	}

}