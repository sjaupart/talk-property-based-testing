package demo.pbt.cesar;

public class CesarEncryptor {

    public static char encode(char character, int key) {
        if (key < 0) {
            throw new IllegalArgumentException("Cipher key must be positive.");
        }

        int mod_key = key % 26;

        if (character + mod_key > 'Z') {
            return (char) (character + mod_key - 26);
        }

        return (char) (character + mod_key);
    }

    public static char decode(char character, int key) {
        if (key < 0) {
            throw new IllegalArgumentException("Cipher key must be positive.");
        }

        int mod_key = key % 26;

        if (character - mod_key < 'A') {
            return (char) (character - mod_key + 26);
        }

        return (char) (character - mod_key);
    }
}
