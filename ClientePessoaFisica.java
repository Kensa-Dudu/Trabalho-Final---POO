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
}
