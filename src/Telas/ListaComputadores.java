package Telas;

import javax.swing.JFrame;

import Acoes.Cadastros;
import Acoes.DadosEMetodos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class ListaComputadores {

	public ListaComputadores() {

		JFrame computadores = new JFrame();
		computadores.getContentPane().setForeground(Color.WHITE);
		computadores.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		computadores.getContentPane().setBackground(Color.BLACK);
		computadores.setUndecorated(true);
		computadores.setSize(787, 370);
		computadores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		computadores.setLocationRelativeTo(null);
		computadores.getContentPane().setLayout(null);

		// Instanciar objeto
		DadosEMetodos d = new DadosEMetodos();
		
		// Variavel para sair do loop
		boolean valida = false;
		
		// Computador 1
		JButton computador1 = new JButton("Computador 1");
		computador1.setForeground(Color.BLACK);
		computador1.setBackground(Color.LIGHT_GRAY);
		computador1.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		computador1.setBounds(25, 22, 140, 50);
		computadores.getContentPane().add(computador1);

		// Ação do botão
		computador1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DadosEMetodos d = new DadosEMetodos();
				d.setComputador("Computador 1");
				DadosEMetodos.computadorEscolhido = 0;

				d.definirQualJanelaAbrir();
				computadores.dispose();

			}
		});

		// Computador 2
		JButton computador2 = new JButton("Computador 2");
		computador2.setBackground(Color.LIGHT_GRAY);
		computador2.setForeground(Color.BLACK);
		computador2.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		computador2.setBounds(191, 22, 140, 50);
		computadores.getContentPane().add(computador2);

		// Ação do botão
		computador2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DadosEMetodos c = new DadosEMetodos();
				c.setComputador("Computador 2");
				DadosEMetodos.computadorEscolhido = 1;
				d.definirQualJanelaAbrir();
				computadores.dispose();

			}
		});

		// Computador 3
		JButton computador3 = new JButton("Computador 3");
		computador3.setForeground(Color.BLACK);
		computador3.setBackground(Color.LIGHT_GRAY);
		computador3.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		computador3.setBounds(25, 99, 140, 50);
		computadores.getContentPane().add(computador3);

		// Ação do botão
		computador3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DadosEMetodos c = new DadosEMetodos();
				c.setComputador("Computador 3");
				DadosEMetodos.computadorEscolhido = 2;
				d.definirQualJanelaAbrir();
				computadores.dispose();

			}
		});

		// Computador 4
		JButton computador4 = new JButton("Computador 4");
		computador4.setBackground(Color.LIGHT_GRAY);
		computador4.setForeground(Color.BLACK);
		computador4.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		computador4.setBounds(191, 99, 140, 50);
		computadores.getContentPane().add(computador4);

		// Ação do botão
		computador4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DadosEMetodos c = new DadosEMetodos();
				c.setComputador("Computador 4");
				DadosEMetodos.computadorEscolhido = 3;
				d.definirQualJanelaAbrir();
				computadores.dispose();

			}
		});

		// Computador 5
		JButton computador5 = new JButton("Computador 5");
		computador5.setForeground(Color.BLACK);
		computador5.setBackground(Color.LIGHT_GRAY);
		computador5.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		computador5.setBounds(25, 171, 140, 50);
		computadores.getContentPane().add(computador5);

		// Ação do botão
		computador5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DadosEMetodos c = new DadosEMetodos();
				c.setComputador("Computador 5");
				DadosEMetodos.computadorEscolhido = 4;
				d.definirQualJanelaAbrir();
				computadores.dispose();

			}
		});

		// Computador 6
		JButton computador6 = new JButton("Computador 6");
		computador6.setBackground(Color.LIGHT_GRAY);
		computador6.setForeground(Color.BLACK);
		computador6.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		computador6.setBounds(191, 171, 140, 50);
		computadores.getContentPane().add(computador6);

		// Ação do botão
		computador6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DadosEMetodos c = new DadosEMetodos();
				c.setComputador("Computador 6");
				DadosEMetodos.computadorEscolhido = 5;
				d.definirQualJanelaAbrir();
				computadores.dispose();
				
			}
		});

		// Computador 7
		JButton computador7 = new JButton("Computador 7");
		computador7.setForeground(Color.BLACK);
		computador7.setBackground(Color.LIGHT_GRAY);
		computador7.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		computador7.setBounds(25, 244, 140, 50);
		computadores.getContentPane().add(computador7);

		// Ação do botão
		computador7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DadosEMetodos c = new DadosEMetodos();
				c.setComputador("Computador 7");
				DadosEMetodos.computadorEscolhido = 6;
				d.definirQualJanelaAbrir();
				computadores.dispose();

			}
		});

		// Computador 8
		JButton computador8 = new JButton("Computador 8");
		computador8.setBackground(Color.LIGHT_GRAY);
		computador8.setForeground(Color.BLACK);
		computador8.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		computador8.setBounds(191, 244, 140, 50);
		computadores.getContentPane().add(computador8);

		// Ação do botão
		computador8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DadosEMetodos c = new DadosEMetodos();
				c.setComputador("Computador 8");
				DadosEMetodos.computadorEscolhido = 7;
				d.definirQualJanelaAbrir();
				computadores.dispose();

			}
		});

		// Computador 9
		JButton computador9 = new JButton("Computador 9");
		computador9.setBackground(Color.LIGHT_GRAY);
		computador9.setForeground(Color.BLACK);
		computador9.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		computador9.setBounds(449, 22, 140, 50);
		computadores.getContentPane().add(computador9);

		// Ação do botão
		computador9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DadosEMetodos c = new DadosEMetodos();
				c.setComputador("Computador 9");
				DadosEMetodos.computadorEscolhido = 8;
				d.definirQualJanelaAbrir();
				computadores.dispose();

			}
		});

		// Computador 10
		JButton computador10 = new JButton("Computador 10");
		computador10.setBackground(Color.LIGHT_GRAY);
		computador10.setForeground(Color.BLACK);
		computador10.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		computador10.setBounds(619, 22, 140, 50);
		computadores.getContentPane().add(computador10);

		// Ação do botão
		computador10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DadosEMetodos c = new DadosEMetodos();
				c.setComputador("Computador 10");
				DadosEMetodos.computadorEscolhido = 9;
				d.definirQualJanelaAbrir();
				computadores.dispose();

			}
		});

		// Computador 11
		JButton computador11 = new JButton("Computador 11");
		computador11.setBackground(Color.LIGHT_GRAY);
		computador11.setForeground(Color.BLACK);
		computador11.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		computador11.setBounds(449, 99, 140, 50);
		computadores.getContentPane().add(computador11);

		// Ação do botão
		computador11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DadosEMetodos c = new DadosEMetodos();
				c.setComputador("Computador 11");
				DadosEMetodos.computadorEscolhido = 10;
				d.definirQualJanelaAbrir();
				computadores.dispose();

			}
		});

		// Computador 12
		JButton computador12 = new JButton("Computador 12");
		computador12.setBackground(Color.LIGHT_GRAY);
		computador12.setForeground(Color.BLACK);
		computador12.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		computador12.setBounds(619, 99, 140, 50);
		computadores.getContentPane().add(computador12);

		// Ação do botão
		computador12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DadosEMetodos c = new DadosEMetodos();
				c.setComputador("Computador 12");
				DadosEMetodos.computadorEscolhido = 11;
				d.definirQualJanelaAbrir();
				computadores.dispose();

			}
		});

		// Computador 13
		JButton computador13 = new JButton("Computador 13");
		computador13.setBackground(Color.LIGHT_GRAY);
		computador13.setForeground(Color.BLACK);
		computador13.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		computador13.setBounds(449, 171, 140, 50);
		computadores.getContentPane().add(computador13);

		// Ação do botão
		computador13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DadosEMetodos c = new DadosEMetodos();
				c.setComputador("Computador 13");
				DadosEMetodos.computadorEscolhido = 12;
				d.definirQualJanelaAbrir();
				computadores.dispose();

			}
		});

		// Computador 14
		JButton computador14 = new JButton("Computador 14");
		computador14.setBackground(Color.LIGHT_GRAY);
		computador14.setForeground(Color.BLACK);
		computador14.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		computador14.setBounds(619, 171, 140, 50);
		computadores.getContentPane().add(computador14);

		// Ação do botão
		computador14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DadosEMetodos c = new DadosEMetodos();
				c.setComputador("Computador 14");
				DadosEMetodos.computadorEscolhido = 13;
				d.definirQualJanelaAbrir();
				computadores.dispose();

			}
		});

		// Computador 15
		JButton computador15 = new JButton("Computador 15");
		computador15.setBackground(Color.LIGHT_GRAY);
		computador15.setForeground(Color.BLACK);
		computador15.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		computador15.setBounds(449, 244, 140, 50);
		computadores.getContentPane().add(computador15);

		// Ação do botão
		computador15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DadosEMetodos c = new DadosEMetodos();
				c.setComputador("Computador 15");
				DadosEMetodos.computadorEscolhido = 14;
				d.definirQualJanelaAbrir();
				computadores.dispose();

			}
		});

		// Computador 16
		JButton computador16 = new JButton("Computador 16");
		computador16.setBackground(Color.LIGHT_GRAY);
		computador16.setForeground(Color.BLACK);
		computador16.setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		computador16.setBounds(619, 244, 140, 50);
		computadores.getContentPane().add(computador16);

		// Ação do botão
		computador16.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DadosEMetodos c = new DadosEMetodos();
				c.setComputador("Computador 16");
				DadosEMetodos.computadorEscolhido = 15;
				d.definirQualJanelaAbrir();
				computadores.dispose();

			}
		});

		// Botão voltar
		JButton voltar = new JButton("< Voltar");
		voltar.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		voltar.setBackground(Color.LIGHT_GRAY);
		voltar.setBounds(25, 336, 89, 23);
		computadores.getContentPane().add(voltar);

		// Ação voltar
		voltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(Cadastros.admin == false) {
					PainelFuncionario p = new PainelFuncionario();
				} else {
					PainelAdministrador voltar = new PainelAdministrador();
				}
				
				computadores.dispose();
			}
		});

		// Barra para mostrar se o computador está em uso ou não
		JButton statusComputador1 = new JButton("");
		statusComputador1.setBounds(25, 70, 140, 9);

		JButton statusComputador2 = new JButton("");
		statusComputador2.setBounds(191, 70, 140, 9);

		JButton statusComputador3 = new JButton("");
		statusComputador3.setBounds(25, 148, 140, 9);

		JButton statusComputador4 = new JButton("");
		statusComputador4.setBounds(191, 148, 140, 9);

		JButton statusComputador5 = new JButton("");
		statusComputador5.setBounds(25, 219, 140, 9);

		JButton statusComputador6 = new JButton("");
		statusComputador6.setBounds(191, 219, 140, 9);

		JButton statusComputador7 = new JButton("");
		statusComputador7.setBounds(25, 293, 140, 9);

		JButton statusComputador8 = new JButton("");
		statusComputador8.setBounds(191, 293, 140, 9);

		JButton statusComputador15 = new JButton("");
		statusComputador15.setBounds(449, 293, 140, 9);

		JButton statusComputador13 = new JButton("");
		statusComputador13.setBounds(449, 219, 140, 9);

		JButton statusComputador11 = new JButton("");
		statusComputador11.setBounds(449, 148, 140, 9);

		JButton statusComputador9 = new JButton("");
		statusComputador9.setBounds(449, 70, 140, 9);

		JButton statusComputador10 = new JButton("");
		statusComputador10.setBounds(619, 70, 140, 9);

		JButton statusComputador12 = new JButton("");
		statusComputador12.setBounds(619, 148, 140, 9);

		JButton statusComputador14 = new JButton("");
		statusComputador14.setBounds(619, 219, 140, 9);

		JButton statusComputador16 = new JButton("");
		statusComputador16.setBounds(619, 293, 140, 9);

		// Atribuir status da barra - em uso ou livre

		if (DadosEMetodos.statusComputadores[0] == true) {
			statusComputador1.setBackground(Color.GREEN);
		} else {
			statusComputador1.setBackground(Color.RED);
		}
		if (DadosEMetodos.statusComputadores[1] == true) {
			statusComputador2.setBackground(Color.GREEN);
		} else {
			statusComputador2.setBackground(Color.RED);
		}
		if (DadosEMetodos.statusComputadores[2] == true) {
			statusComputador3.setBackground(Color.GREEN);
		} else {
			statusComputador3.setBackground(Color.RED);
		}
		if (DadosEMetodos.statusComputadores[3] == true) {
			statusComputador4.setBackground(Color.GREEN);
		} else {
			statusComputador4.setBackground(Color.RED);
		}
		if (DadosEMetodos.statusComputadores[4] == true) {
			statusComputador5.setBackground(Color.GREEN);
		} else {
			statusComputador5.setBackground(Color.RED);
		}
		if (DadosEMetodos.statusComputadores[5] == true) {
			statusComputador6.setBackground(Color.GREEN);
		} else {
			statusComputador6.setBackground(Color.RED);
		}
		if (DadosEMetodos.statusComputadores[6] == true) {
			statusComputador7.setBackground(Color.GREEN);
		} else {
			statusComputador7.setBackground(Color.RED);
		}
		if (DadosEMetodos.statusComputadores[7] == true) {
			statusComputador8.setBackground(Color.GREEN);
		} else {
			statusComputador8.setBackground(Color.RED);
		}
		if (DadosEMetodos.statusComputadores[8] == true) {
			statusComputador9.setBackground(Color.GREEN);
		} else {
			statusComputador9.setBackground(Color.RED);
		}
		if (DadosEMetodos.statusComputadores[9] == true) {
			statusComputador10.setBackground(Color.GREEN);
		} else {
			statusComputador10.setBackground(Color.RED);
		}
		if (DadosEMetodos.statusComputadores[10] == true) {
			statusComputador11.setBackground(Color.GREEN);
		} else {
			statusComputador11.setBackground(Color.RED);
		}
		if (DadosEMetodos.statusComputadores[11] == true) {
			statusComputador12.setBackground(Color.GREEN);
		} else {
			statusComputador12.setBackground(Color.RED);
		}
		if (DadosEMetodos.statusComputadores[12] == true) {
			statusComputador13.setBackground(Color.GREEN);
		} else {
			statusComputador13.setBackground(Color.RED);
		}
		if (DadosEMetodos.statusComputadores[13] == true) {
			statusComputador14.setBackground(Color.GREEN);
		} else {
			statusComputador14.setBackground(Color.RED);
		}
		if (DadosEMetodos.statusComputadores[14] == true) {
			statusComputador15.setBackground(Color.GREEN);
		} else {
			statusComputador15.setBackground(Color.RED);
		}
		if (DadosEMetodos.statusComputadores[15] == true) {
			statusComputador16.setBackground(Color.GREEN);
		} else {
			statusComputador16.setBackground(Color.RED);
		}

		// Adicionar componentes
		computadores.getContentPane().add(statusComputador1);
		computadores.getContentPane().add(statusComputador2);
		computadores.getContentPane().add(statusComputador3);
		computadores.getContentPane().add(statusComputador4);
		computadores.getContentPane().add(statusComputador5);
		computadores.getContentPane().add(statusComputador6);
		computadores.getContentPane().add(statusComputador7);
		computadores.getContentPane().add(statusComputador8);
		computadores.getContentPane().add(statusComputador9);
		computadores.getContentPane().add(statusComputador10);
		computadores.getContentPane().add(statusComputador11);
		computadores.getContentPane().add(statusComputador12);
		computadores.getContentPane().add(statusComputador13);
		computadores.getContentPane().add(statusComputador14);
		computadores.getContentPane().add(statusComputador15);
		computadores.getContentPane().add(statusComputador16);

		computadores.setVisible(true);
	}

}