package Acoes;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class MetodoTabelas {

	// ArrayList para os produtos pedidos
	ArrayList<MetodoTabelas> produtosPedidos = new ArrayList<>();
	

	// Metodo para atualizar a lista de cadastros
	public DefaultTableModel listarProdutos() {
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Produto");
		modelo.addColumn("Preço");
		modelo.addColumn("Quantidade");
		
		for(int i = 0; i < DadosEMetodos.produtos.size(); i++) {
			
			modelo.addRow(new Object[] {
					DadosEMetodos.produtos.get(i).getNomeProduto(),
					DadosEMetodos.produtos.get(i).getValorProduto(),
					DadosEMetodos.produtos.get(i).getQuantidadeProduto()
			});		
		}
		
	return modelo;	
	
	}	
	
	// Metodo para atualizar a lista de contas cadastradas
	public DefaultTableModel listarContas() {
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Usuário");
		modelo.addColumn("Idade");
		modelo.addColumn("Número");
		
		
		for(int i = 0; i < DadosEMetodos.usuarios.size(); i++) {
			
			modelo.addRow(new Object[] {
				
					DadosEMetodos.usuarios.get(i).getUsuario(),
					DadosEMetodos.usuarios.get(i).getIdade(),
					DadosEMetodos.usuarios.get(i).getNumero()
					
			});
		}
		
		return modelo;
		
	}
	
	// Metodo tabela carrinho
	
	
	
	
}
