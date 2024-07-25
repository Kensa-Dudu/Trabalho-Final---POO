public abstract class Cliente {
    private int idCliente;
    private String nome;
    private String email;
    private String endereco;
    private String telefone;
    private String userName;
    private String password;

    
    public Cliente(int idCliente, String nome, String email, String endereco, String telefone, String userName, String password) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.userName = userName;
        this.password = password;
    }

    public boolean login(String userName, String password){
        
    }
    
    public void atualizaDados(Cliente cliente){
        
    }
}


/*
Cadastrar Cliente - Cadastrar novo cliente no sistema; Atualizar os dados de um
cliente.
Realizar Pedido - Escolher itens para compra; Confirmar os itens do pedido; Listar
histórico de pedidos efetuados.
//*/
