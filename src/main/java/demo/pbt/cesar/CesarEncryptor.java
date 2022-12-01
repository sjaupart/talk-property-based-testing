package demo.pbt.cesar;

public class CesarEncryptor {

    private static final char FIRST_CESAR_CHARACTER = 'A';
    private static final char LAST_CESAR_CHARACTER = 'Z';
    private static final int NUMBER_OF_CESAR_CHARACTERS = LAST_CESAR_CHARACTER - FIRST_CESAR_CHARACTER + 1;

    public static char cipher(char character, int key) {
        if (key < 0) {
            throw new IllegalArgumentException("Cipher key must be positive.");
        }

        int moduloKey = moduloKey(key);

        if (character + moduloKey > LAST_CESAR_CHARACTER) {
            return (char) (character + moduloKey - NUMBER_OF_CESAR_CHARACTERS);
        }

        return (char) (character + moduloKey);
    }

    public static char decipher(char character, int key) {
        if (key < 0) {
            throw new IllegalArgumentException("Cipher key must be positive.");
        }

        int moduloKey = moduloKey(key);

        if (character - moduloKey < FIRST_CESAR_CHARACTER) {
            return (char) (character - moduloKey + NUMBER_OF_CESAR_CHARACTERS);
        }

        return (char) (character - moduloKey);
    }

    private static int moduloKey(int key) {
        return key % NUMBER_OF_CESAR_CHARACTERS;
    }
}
