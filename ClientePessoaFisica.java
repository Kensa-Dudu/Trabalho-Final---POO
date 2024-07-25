import java.util.Date;

public class ClientePessoaFisica extends Cliente {
    private String cpf;
    private String rg;
    private Date dataNascimento;
    
    
    public ClientePessoaFisica(int idCliente, String nome, String email, String endereco, String telefone, String userName, String password, String cpf, String rg, Date dataNascimento) {
        super(idCliente, nome, email, endereco, telefone, userName, password);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        
    }
    
    public boolean validarCPF(String cpf) {
        if (this.cpf == cpf) return true;
        return false;
    }
    
    @Override
    public void atualizaDados(Cliente cliente) {
        if (cliente instanceof ClientePessoaFisica) {
            ClientePessoaFisica pf = (ClientePessoaFisica) cliente;
            this.setNome(pf.getNome());
            this.setEmail(pf.getEmail());
            this.setEndereco(pf.getEndereco());
            this.setTelefone(pf.getTelefone());
            this.setUserName(pf.getUserName());
            this.setPassword(pf.getPassword());
            this.setCpf(pf.getCpf());
            this.setRg(pf.getRg());
            this.setDataNascimento(pf.getDataNascimento());
        }
    }
    
    // Getters and Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
