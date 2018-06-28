package Acoes;

public class Cadastros {

	// Variavel para obter quem logou - funcionario ou administrador
	public static boolean admin; // true = admin logado || false = funcionario
	
	// Método para cadastrar
	public void Cadastros(String usuario, String senha, int numero, int idade) {
		
		// Criar objeto
		DadosEMetodos d = new DadosEMetodos();
		d.setSenha(senha);
		d.setUsuario(usuario);
		d.setIdade(idade);
		d.setnumero(numero);
		
		// Adicionar ao ArrayList
		DadosEMetodos.usuarios.add(d);
		
	}
	
	// Metodo para cadastrar os produtos
	public void cadastrarProduto(String nomeProduto, double valorProduto, int quantidadeProduto) {
			
		DadosEMetodos d = new DadosEMetodos();
		d.setNomeProduto(nomeProduto);
		d.setValorProduto(valorProduto);
		d.setQuantidadeProduto(quantidadeProduto);
		
		// Adicionar ao ArrayList
		DadosEMetodos.produtos.add(d);
			
	}
	
	// Metodo para alterar produtos
	public void alterarProduto(String nomeProduto, double valorProduto, int quantidadeProduto, int linha) {
		
		DadosEMetodos d = new DadosEMetodos();
		d.setNomeProduto(nomeProduto);
		d.setValorProduto(valorProduto);
		d.setQuantidadeProduto(quantidadeProduto);
		
		DadosEMetodos.produtos.set(linha, d);
		
		
		
	}
	
	
	
}