import java.util.ArrayList;

public class Day5_Text {

    static Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static void main(String[] args) {

        String text = "IntelliJ IDEA Community Edition";
        System.out.println(textEncoding(text));
        System.out.println(textDecoding(textEncoding(text)));

    }

    public static String textEncoding(String text) {
        ArrayList<Character> letter = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                Character textCharacter = text.charAt(i);
                Character textLowerCase = Character.toLowerCase(textCharacter);
                Character character = alphabet[j];
                if(textCharacter.equals(' ')) {
                    letter.add(i, textCharacter);
                } else if (character.equals(textLowerCase)) {
                    int x = j + 1;
                    if(textLowerCase.equals('z')) {
                        x = 0;
                    }
                    if(Character.isLowerCase(textCharacter)) {
                        letter.add(i, Character.toUpperCase(alphabet[x]));
                    } else {
                        letter.add(i, Character.toLowerCase(alphabet[x]));
                    }
                }
            }
        }
        return stringBuilder(letter);
    }

    public static String textDecoding(String text) {
        ArrayList<Character> letter = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                Character textCharacter = text.charAt(i);
                Character textLowerCase = Character.toLowerCase(textCharacter);
                Character character = alphabet[j];
                if(textCharacter.equals(' ')) {
                    letter.add(i, textCharacter);
                } else if (character.equals(textLowerCase)) {
                    int x = j - 1;
                    if(textLowerCase.equals('a')) {
                        x = 25;
                    }
                    if(Character.isLowerCase(textCharacter)) {
                        letter.add(i, Character.toUpperCase(alphabet[x]));
                    } else {
                        letter.add(i, Character.toLowerCase(alphabet[x]));
                    }
                }
            }
        }
        return stringBuilder(letter);
    }

    public static String stringBuilder(ArrayList<Character> list) {
        StringBuilder sb = new StringBuilder();
        for (char ch : list) {
            sb.append(ch);
        }
        String string = sb.toString();
        return string;
    }
}
