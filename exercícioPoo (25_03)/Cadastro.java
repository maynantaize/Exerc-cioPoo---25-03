public class Cadastro {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Maynan Taize");
        cliente.setCpf("000.000.000-00");
        
        Telefone telefone = new Telefone();
        telefone.setDdd(11);
        telefone.setNumero("99999-9999");
        cliente.setTelefone(telefone);
        
        // Imprime dados do cliente
        cliente.imprimirDados();
        
        // Altera o número do telefone e imprime novamente os dados do cliente
        cliente.getTelefone().alterarNumero("88888-8888");
        cliente.imprimirDados();
    }
}









 