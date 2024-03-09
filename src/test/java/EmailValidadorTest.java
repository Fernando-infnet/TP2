import org.example.EmailValidador;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.Assert.*;
public class EmailValidadorTest {

    @ParameterizedTest
    @ValueSource(strings = {"", "mail", "mail@mail", "mail@mail.com"})
    public void verificaSeEmailEValido(String email) {
        Assertions.assertTrue(EmailValidador.validar(email));
    }
}