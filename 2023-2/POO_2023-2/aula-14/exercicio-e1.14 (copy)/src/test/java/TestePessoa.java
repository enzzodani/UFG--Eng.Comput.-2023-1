import org.example.Pessoa;
import org.example.Telefone;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João");

        Telefone telefone1 = new Telefone("123456789");
        Telefone telefone2 = new Telefone("987654321");
        Telefone telefone3 = new Telefone("111222333");
        Telefone telefone4 = new Telefone("444555666");
        Telefone telefone5 = new Telefone("777888999");

        pessoa.adicionarTelefone(telefone1);
        pessoa.adicionarTelefone(telefone2);
        pessoa.adicionarTelefone(telefone3);
        pessoa.adicionarTelefone(telefone4);
        pessoa.adicionarTelefone(telefone5);

        // Tentando adicionar novamente o mesmo telefone (sem efeito)
        pessoa.adicionarTelefone(telefone1);

        // Removendo um telefone
        pessoa.removerTelefone(telefone3);

        // Tentando remover novamente o mesmo telefone (sem efeito)
        pessoa.removerTelefone(telefone3);

        // Exibindo as informações da pessoa
        System.out.println(pessoa);
    }
}