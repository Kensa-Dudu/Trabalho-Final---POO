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
        return true;
    }
}
