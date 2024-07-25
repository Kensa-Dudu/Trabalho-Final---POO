public class Item {
    private int idItem;
    private int quantidade;
    private double precoUnitario;
    
    
    public Item (int idPedido, int quantidade, double precoUnitario) {
        this.idItem = idItem;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }
    
    public double calcularSubtotal() {
        return quantidade * precoUnitario;
    }
    
    // Getters and Setters
    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
