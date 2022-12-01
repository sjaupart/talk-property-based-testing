package demo.pbt.cesar;

public class CesarEncryptor {

    private static final char FIRST_CESAR_CHARACTER = 'A';
    private static final char LAST_CESAR_CHARACTER = 'Z';
    private static final int NUMBER_OF_CESAR_CHARACTERS = LAST_CESAR_CHARACTER - FIRST_CESAR_CHARACTER + 1;

    public static char cipher(char character, int key) {
        if (key < 0) {
            throw new IllegalArgumentException("Cipher key must be positive.");
        }

        int cipheredCharacter = character + moduloKey(key);

        if (cipheredCharacter > LAST_CESAR_CHARACTER) {
            cipheredCharacter -= NUMBER_OF_CESAR_CHARACTERS;
        }

        return (char) cipheredCharacter;
    }

    public static char decipher(char character, int key) {
        if (key < 0) {
            throw new IllegalArgumentException("Cipher key must be positive.");
        }

        int decipheredCharacter = character - moduloKey(key);

        if (decipheredCharacter < FIRST_CESAR_CHARACTER) {
            decipheredCharacter += NUMBER_OF_CESAR_CHARACTERS;
        }

        return (char) decipheredCharacter;
    }

    private static int moduloKey(int key) {
        return key % NUMBER_OF_CESAR_CHARACTERS;
    }
}
