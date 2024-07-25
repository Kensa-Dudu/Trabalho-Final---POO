public class Produto {
    private int idProduto;
    private String nome;
    private String descricao;
    private double preco;
    private int estoque;
    
    
    public Produto (int idProduto, String nome,  String descricao, double preco, int estoque) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
        
    }
    
    public void atualizarEstoque(int quantidade) {
        
    }
    
    public void atualizarPreco(double preco) {
        
    }
}
