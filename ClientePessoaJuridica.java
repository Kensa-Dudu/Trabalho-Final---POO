public class ClientePessoaJuridica extends Cliente {
    private String cnpj;
    private String razaoSocial;
    private String inscricaoEstadual;
    
    
    public ClientePessoaJuridica(int idCliente, String nome, String email, String endereco, String telefone, String userName, String password, String cnpj, String razaoSocial, String inscricaoEstadual) {
        super(idCliente, nome, email, endereco, telefone, userName, password);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
        
    }
    
    public boolean validarCNPJ(String cnpj) {
        //return this.cnpj.equals(cnpj);
        if (this.cnpj == cnpj) return true;
        return false;
    }
    
    @Override
    public void atualizaDados(Cliente cliente) {
        if (cliente instanceof ClientePessoaJuridica) {
            ClientePessoaJuridica pj = (ClientePessoaJuridica) cliente;
            this.setNome(pj.getNome());
            this.setEmail(pj.getEmail());
            this.setEndereco(pj.getEndereco());
            this.setTelefone(pj.getTelefone());
            this.setUserName(pj.getUserName());
            this.setPassword(pj.getPassword());
            this.setCnpj(pj.getCnpj());
            this.setRazaoSocial(pj.getRazaoSocial());
            this.setInscricaoEstadual(pj.getInscricaoEstadual());
        }
    }
    
    // Getters and Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
}
