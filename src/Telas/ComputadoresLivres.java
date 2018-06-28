package Telas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Acoes.DadosEMetodos;
import java.awt.Frame;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dimension;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ComputadoresLivres {
	private JTextField campoUsu�rio;
	private JTextField campoTempo;

	public ComputadoresLivres() {

		// Instanciar
		DadosEMetodos c = new DadosEMetodos();

		JFrame construtor = new JFrame(c.getComputador());
		construtor.getContentPane().setBackground(Color.BLACK);
		construtor.setType(Type.UTILITY);
		construtor.setLocationByPlatform(true);
		construtor.setResizable(false);
		construtor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		construtor.setSize(322, 300);
		construtor.setLocationRelativeTo(null);
		construtor.getContentPane().setLayout(null);

		// Status do computador - Livre ou ocupado
		JLabel status = new JLabel("Status:");
		status.setForeground(Color.WHITE);
		status.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		status.setBounds(10, 11, 67, 32);
		construtor.getContentPane().add(status);

		// Definir status
		boolean valida = false;

		JLabel statusLivre = new JLabel("Livre");
		statusLivre.setForeground(Color.GREEN);
		statusLivre.setFont(new Font("Arial Narrow", Font.BOLD, 22));
		statusLivre.setBounds(71, 17, 46, 20);
		construtor.getContentPane().add(statusLivre);
		valida = true;

		// Texto usu�rio
		JLabel lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		lblUsuario.setBounds(10, 76, 67, 20);
		construtor.getContentPane().add(lblUsuario);
		lblUsuario.requestFocus();

		// Campo para digitar o usu�rio
		campoUsu�rio = new JTextField();
		campoUsu�rio.setBounds(82, 79, 86, 20);
		campoUsu�rio.setColumns(10);
		campoUsu�rio.requestFocus();
		construtor.getContentPane().add(campoUsu�rio);

		// Texto tempo
		JLabel lblTempo = new JLabel("Tempo:");
		lblTempo.setForeground(Color.WHITE);
		lblTempo.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		lblTempo.setBounds(10, 113, 67, 20);
		construtor.getContentPane().add(lblTempo);

		// Campo indicando o tempo que a pessoa ir� utilizar o pc
		campoTempo = new JTextField();
		campoTempo.setColumns(10);
		campoTempo.setBounds(82, 116, 46, 20);
		construtor.getContentPane().add(campoTempo);

		// Medida de tempo
		JLabel horas = new JLabel("h");
		horas.setForeground(Color.WHITE);
		horas.setFont(new Font("Tahoma", Font.PLAIN, 17));
		horas.setBounds(133, 116, 67, 20);
		construtor.getContentPane().add(horas);

		// Bot�o para cancelar o processo
		JButton cancelar = new JButton("Cancelar");
		cancelar.setFont(new Font("Arial Narrow", Font.PLAIN, 17));
		cancelar.setBackground(Color.LIGHT_GRAY);
		cancelar.setBounds(26, 212, 117, 42);
		construtor.getContentPane().add(cancelar);

		// A��o do bot�o cancelar
		cancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				construtor.dispose();
				ListaComputadores l = new ListaComputadores();

			}
		});

		// Finalizar o processo
		JButton continuar = new JButton("Continuar");
		continuar.setFont(new Font("Arial Narrow", Font.PLAIN, 17));
		continuar.setBackground(Color.LIGHT_GRAY);
		continuar.setBounds(172, 212, 117, 42);
		construtor.getContentPane().add(continuar);

		// A��o do bot�o continuar
		continuar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (campoUsu�rio.getText().equals("") || (campoTempo.getText().equals(""))) {
					JOptionPane.showMessageDialog(null, "N�o deixe NENHUM campo vazio", "Erro", 0);

				} else {

					// Vari�vel para validar aviso
					boolean validar = false;

					// La�o para verificar se a conta existe
					for (int i = 0; i < DadosEMetodos.usuarios.size(); i++) {

						// Vari�vel para calcular tempo e total a ser pago
						int tempo = Integer.parseInt(campoTempo.getText());
						double preco = tempo * 3;

						// Verificar se a conta esta registrada
						if (campoUsu�rio.getText().equals(DadosEMetodos.usuarios.get(i).getUsuario())) {
							JOptionPane.showMessageDialog(null,
									"O usu�rio " + campoUsu�rio.getText() + " tem " + campoTempo.getText()
											+ " horas de uso\nTotal a pagar: R$ " + String.format("%.2f", preco),
									"Concluido", -1);

							// Validar aviso
							validar = true;
							construtor.dispose();

							// Instanciar objeto
							DadosEMetodos d = new DadosEMetodos();

							// Definir status de ocupado para o computador
							if (d.getComputador().equals("Computador 1")) {
								d.statusComputadores[0] = false;
								d.nomeUsuario[0] = campoUsu�rio.getText();

								d.setUsuarioDoComputador(campoUsu�rio.getText());

								// Definir quem esta usando o computador
								DadosEMetodos.nomeUsuario[0] = campoUsu�rio.getText();

								ListaComputadores l = new ListaComputadores();
							} else if (d.getComputador().equals("Computador 2")) {
								d.statusComputadores[1] = false;
								DadosEMetodos.nomeUsuario[1] = campoUsu�rio.getText();
								d.setUsuarioDoComputador(campoUsu�rio.getText());

								ListaComputadores l = new ListaComputadores();
							} else if (d.getComputador().equals("Computador 3")) {
								d.statusComputadores[2] = false;
								d.nomeUsuario[2] = campoUsu�rio.getText();
								DadosEMetodos.nomeUsuario[2] = campoUsu�rio.getText();

								ListaComputadores l = new ListaComputadores();
							} else if (d.getComputador().equals("Computador 4")) {
								d.statusComputadores[3] = false;
								d.nomeUsuario[3] = campoUsu�rio.getText();

								ListaComputadores l = new ListaComputadores();
							} else if (d.getComputador().equals("Computador 5")) {
								d.statusComputadores[4] = false;
								d.nomeUsuario[4] = campoUsu�rio.getText();
								DadosEMetodos.nomeUsuario[4] = campoUsu�rio.getText();

								ListaComputadores l = new ListaComputadores();
							} else if (d.getComputador().equals("Computador 6")) {
								d.statusComputadores[5] = false;
								d.nomeUsuario[5] = campoUsu�rio.getText();
								DadosEMetodos.nomeUsuario[5] = campoUsu�rio.getText();

								ListaComputadores l = new ListaComputadores();
							} else if (d.getComputador().equals("Computador 7")) {
								d.statusComputadores[6] = false;
								d.nomeUsuario[6] = campoUsu�rio.getText();
								DadosEMetodos.nomeUsuario[6] = campoUsu�rio.getText();

								ListaComputadores l = new ListaComputadores();
							} else if (d.getComputador().equals("Computador 8")) {
								d.statusComputadores[7] = false;
								d.nomeUsuario[7] = campoUsu�rio.getText();
								DadosEMetodos.nomeUsuario[7] = campoUsu�rio.getText();

								ListaComputadores l = new ListaComputadores();
							} else if (d.getComputador().equals("Computador 9")) {
								d.statusComputadores[8] = false;
								d.nomeUsuario[8] = campoUsu�rio.getText();
								DadosEMetodos.nomeUsuario[8] = campoUsu�rio.getText();

								ListaComputadores l = new ListaComputadores();
							} else if (d.getComputador().equals("Computador 10")) {
								d.statusComputadores[9] = false;
								d.nomeUsuario[9] = campoUsu�rio.getText();
								DadosEMetodos.nomeUsuario[9] = campoUsu�rio.getText();

								ListaComputadores l = new ListaComputadores();
							} else if (d.getComputador().equals("Computador 11")) {
								d.statusComputadores[10] = false;
								d.nomeUsuario[10] = campoUsu�rio.getText();
								DadosEMetodos.nomeUsuario[10] = campoUsu�rio.getText();

								ListaComputadores l = new ListaComputadores();
							} else if (d.getComputador().equals("Computador 12")) {
								d.statusComputadores[11] = false;
								d.nomeUsuario[11] = campoUsu�rio.getText();
								DadosEMetodos.nomeUsuario[11] = campoUsu�rio.getText();

								ListaComputadores l = new ListaComputadores();
							} else if (d.getComputador().equals("Computador 13")) {
								d.statusComputadores[12] = false;
								d.nomeUsuario[12] = campoUsu�rio.getText();
								DadosEMetodos.nomeUsuario[12] = campoUsu�rio.getText();

								ListaComputadores l = new ListaComputadores();
							} else if (d.getComputador().equals("Computador 14")) {
								d.statusComputadores[13] = false;
								d.nomeUsuario[13] = campoUsu�rio.getText();
								DadosEMetodos.nomeUsuario[13] = campoUsu�rio.getText();

								ListaComputadores l = new ListaComputadores();
							} else if (d.getComputador().equals("Computador 15")) {
								d.statusComputadores[14] = false;
								d.nomeUsuario[14] = campoUsu�rio.getText();
								DadosEMetodos.nomeUsuario[14] = campoUsu�rio.getText();

								ListaComputadores l = new ListaComputadores();
							} else if (d.getComputador().equals("Computador 16")) {
								d.statusComputadores[15] = false;
								d.nomeUsuario[12] = campoUsu�rio.getText();
								DadosEMetodos.nomeUsuario[15] = campoUsu�rio.getText();

								ListaComputadores l = new ListaComputadores();

							}
						}
					}
					
					if (validar == false) {
						JOptionPane.showMessageDialog(null, "Usu�rio n�o encontrado", "", 0);
					}
				}
			}
		});

		// Divis�ria de enfeite
		JButton linha = new JButton("");
		linha.setBackground(new Color(0, 128, 0));
		linha.setBounds(0, 51, 328, 9);
		construtor.getContentPane().add(linha);

		construtor.setVisible(true);
	}
}