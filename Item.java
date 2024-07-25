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
        return 0;
    }
}
