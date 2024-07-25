import java.util.Date;

public class Pedido {
    private int idPedido;
    private Date dataPedido;
    private String status;
    
    
    public Pedido (int idPedido, Date dataPedido, String status) {
        this.idPedido = idPedido;
        this.dataPedido = dataPedido;
        this.status = status;
        
    }
    
    public boolean calcularTotal() {
        return true;
    }
    
    public void atualizarStatus(String status) {
        this.status = status;
    }
}
