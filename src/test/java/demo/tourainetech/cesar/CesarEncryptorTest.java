package demo.tourainetech.cesar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CesarEncryptorTest {

    @Test
    void encoding_key_must_be_positive() {
        assertThatThrownBy(() -> CesarEncryptor.encode('A', -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Cipher key must be positive.");
    }

    @Test
    void decoding_key_must_be_positive() {
        assertThatThrownBy(() -> CesarEncryptor.decode('A', -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Cipher key must be positive.");
    }

    @Test
    void encode_a_character() {
        assertThat(CesarEncryptor.encode('B', 3)).isEqualTo('E');
    }

    @Test
    void decode_a_character() {
        assertThat(CesarEncryptor.decode('T', 3)).isEqualTo('Q');
    }

    @Test
    void encoding_is_circular() {
        assertThat(CesarEncryptor.encode('Y', 30)).isEqualTo('C');
    }

    @Test
    void decoding_is_circular() {
        assertThat(CesarEncryptor.decode('B', 31)).isEqualTo('W');
    }
}
