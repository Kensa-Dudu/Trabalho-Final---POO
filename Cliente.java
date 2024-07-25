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
        return true;
    }
    
    public void atualizaDados(Cliente cliente){
        if (cliente != null) {
            this.nome = cliente.getNome();
            this.email = cliente.getEmail();
            this.endereco = cliente.getEndereco();
            this.telefone = cliente.getTelefone();
            this.userName = cliente.getUserName();
            this.password = cliente.getPassword();
        }
    }
    
    // Getters and Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}


/*
Cadastrar Cliente - Cadastrar novo cliente no sistema; Atualizar os dados de um
cliente.
Realizar Pedido - Escolher itens para compra; Confirmar os itens do pedido; Listar
histórico de pedidos efetuados.
//*/
