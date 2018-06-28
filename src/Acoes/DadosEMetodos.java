package Acoes;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

import Telas.ComputadoresLivres;
import Telas.ComputadoresOcupados;

public class DadosEMetodos {

	// Variáveis
	public static ArrayList<DadosEMetodos> usuarios = new ArrayList<>();
	private String usuario;
	private String senha;
	private int idade;
	private int numero;
	private String email;
	
	/// Variaveis para definir o computador escolhido e quem esta usando ele
	private static String computador;
	private static String usuarioDoComputador;
	public static boolean[] statusComputadores = new boolean[16]; // true = livre || false = ocupado
	public static int computadorEscolhido;
	public static String[] nomeUsuario = new String[16];
	
	// ArrayList de produtos
	public static ArrayList<DadosEMetodos> produtos = new ArrayList<>();
	private String nomeProduto;
	private double valorProduto;
	private int quantidadeProduto;
	
	// Métodos mágicos do computador 
	public String getComputador() {
		return computador;
	}

	public void setComputador(String computador) {
		this.computador = computador;
	}

	// Metodos magicos do usuario
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return usuario;
	}

	public void setSenha(String Senha) {
		this.senha = Senha;
	}

	public int getNumero() {
		return numero;
	}

	public void setnumero(int numero) {
		this.numero = numero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	// Metodo para atribuir o estado LIVRE para os computadores
	public void atribuirBoolean() {

		for (int i = 0; i < 16; i++) {

			
			if (statusComputadores[i] =! false) {
				statusComputadores[i] = true;
			}
		}
		
	}

	
	// Pegar o usuario que esta usando o computador
	public void setUsuarioDoComputador(String usuarioDoComputador) {
		this.usuarioDoComputador = usuarioDoComputador;
	}
	
	public String getUsuarioDoComputador() {
		return usuarioDoComputador;
	}
	
	// Metodo para definir se vai abrir a janela LIVRE ou OCUPADO
	public void definirQualJanelaAbrir() {
	boolean valida = false;
		
	for (int i = 0; valida == false; i++) {
		
		if (DadosEMetodos.computadorEscolhido == i) {
			
			if ((DadosEMetodos.statusComputadores[i] == false)) {
				ComputadoresOcupados compsOcupados = new ComputadoresOcupados();
				valida = true;
			} else {
				ComputadoresLivres c = new ComputadoresLivres();
				valida = true;
			}
		}
	}
	
	}
	
	// Get and set produto
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	public double getValorProduto() {
		return valorProduto;
	}
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	
	

	
}