package demo.pbt.cesar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CesarEncryptorTest {

    @Test
    void encoding_key_must_be_positive() {
        assertThatThrownBy(() -> CesarEncryptor.cipher('A', -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Cipher key must be positive.");
    }

    @Test
    void decoding_key_must_be_positive() {
        assertThatThrownBy(() -> CesarEncryptor.decipher('A', -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Cipher key must be positive.");
    }

    @Test
    void cipher_a_character() {
        assertThat(CesarEncryptor.cipher('B', 3)).isEqualTo('E');
    }

    @Test
    void decipher_a_character() {
        assertThat(CesarEncryptor.decipher('T', 3)).isEqualTo('Q');
    }

    @Test
    void ciphering_is_circular() {
        assertThat(CesarEncryptor.cipher('Y', 30)).isEqualTo('C');
    }

    @Test
    void deciphering_is_circular() {
        assertThat(CesarEncryptor.decipher('B', 31)).isEqualTo('W');
    }
}
