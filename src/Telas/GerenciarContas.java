package Telas;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JTable;

import Acoes.MetodoTabelas;
import java.awt.Font;
import java.awt.Color;
import java.awt.Window.Type;

public class GerenciarContas {
	private JTable table;

	public GerenciarContas() {

		JFrame gerenciar = new JFrame();
		gerenciar.setType(Type.UTILITY);
		gerenciar.setResizable(false);
		gerenciar.getContentPane().setBackground(Color.BLACK);
		gerenciar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		gerenciar.setSize(300, 300);
		gerenciar.setLocationRelativeTo(null);
		gerenciar.getContentPane().setLayout(null);

		// Instanciar modelo
		MetodoTabelas m = new MetodoTabelas();

		table = new JTable(m.listarContas());

		JScrollPane barra = new JScrollPane(table);
		barra.setBounds(10, 11, 272, 214);
		gerenciar.getContentPane().add(barra);

		JButton button = new JButton("< Voltar");
		button.setBackground(Color.LIGHT_GRAY);
		button.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(10, 239, 91, 23);
		gerenciar.getContentPane().add(button);

		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				PainelAdministrador p = new PainelAdministrador();
				gerenciar.dispose();
				
			}
		});
		
		// Acao na tabela
		table.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {

				// Obter linha
				int linha = table.getSelectedRow();

				// Obter dados
				String nomeUsuario = table.getValueAt(linha, 0).toString();
				int numeroUsuario = Integer.parseInt(table.getValueAt(linha, 1).toString());

				AlterarConta a = new AlterarConta(nomeUsuario, numeroUsuario, linha);
				gerenciar.dispose();

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

		gerenciar.setVisible(true);
	}

}
