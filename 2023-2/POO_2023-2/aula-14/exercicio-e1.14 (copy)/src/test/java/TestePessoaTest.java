import org.junit.Test;
import static org.junit.Assert.*;
import org.example.Pessoa;
import org.example.Telefone;

public class TestePessoaTest {

    @Test
    public void testAdicionarRemoverTelefones() {
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

        // Verificar se os telefones foram adicionados corretamente
        assertTrue(pessoa.getTelefones().contains(telefone1));
        assertTrue(pessoa.getTelefones().contains(telefone2));
        assertTrue(pessoa.getTelefones().contains(telefone3));
        assertTrue(pessoa.getTelefones().contains(telefone4));
        assertTrue(pessoa.getTelefones().contains(telefone5));

        // Tentar adicionar novamente o mesmo telefone (sem efeito)
        pessoa.adicionarTelefone(telefone1);

        // Verificar se a adição duplicada não teve efeito
        assertEquals(5, pessoa.getTelefones().size());

        // Remover um telefone
        pessoa.removerTelefone(telefone3);

        // Verificar se o telefone foi removido corretamente
        assertFalse(pessoa.getTelefones().contains(telefone3));

        // Tentar remover novamente o mesmo telefone (sem efeito)
        pessoa.removerTelefone(telefone3);

        // Verificar se a remoção duplicada não teve efeito
        assertEquals(4, pessoa.getTelefones().size());
    }
}
