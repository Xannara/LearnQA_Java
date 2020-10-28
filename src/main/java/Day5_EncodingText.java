import java.util.ArrayList;

public class Day5_EncodingText {
    public static void main(String[] args) {
        String text = "IntelliJ IDEA Community Edition";
        System.out.println(textEncoding(text));
        System.out.println(textDecoding(textEncoding(text)));
    }

    public static String textEncoding(String text) {
        char[] letter = text.toCharArray();
        ArrayList<Character> small = smallLetters();
        ArrayList<Character> big = bigLetters();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < small.size(); j++) {
                if(letter[i] == small.get(small.size()-1)) {
                    letter[i] = big.get(0);
                } else if(letter[i] == small.get(j)) {
                    letter[i] = big.get(j+1);
                } else if(letter[i] == big.get(big.size())-1) {
                    letter[i] = small.get(0);
                } else if(letter[i] == big.get(j)) {
                    letter[i] = small.get(j+1);
                }
            }
        }
        return String.valueOf(letter);
    }

    public static String textDecoding(String text) {
        char[] letter = text.toCharArray();
        ArrayList<Character> small = smallLetters();
        ArrayList<Character> big = bigLetters();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < small.size(); j++) {
                if(letter[i] == small.get(0)) {
                    letter[i] = big.get(big.size()-1);
                } else if(letter[i] == small.get(j)) {
                    letter[i] = big.get(j-1);
                } else if(letter[i] == big.get(0)) {
                    letter[i] = small.get(0);
                } else if(letter[i] == big.get(j)) {
                    letter[i] = small.get(j-1);
                }
            }
        }
        return String.valueOf(letter);
    }

    public static ArrayList<Character> smallLetters() {
        ArrayList<Character> small = new ArrayList<>();
        for(char i = 'a'; i <='z'; i++) {
            small.add(i);
        }
        return small;
    }

    public static ArrayList<Character> bigLetters() {
        ArrayList<Character> big = new ArrayList<>();
        for(char i = 'A'; i <='Z'; i++) {
            big.add(i);
        }
        return big;
    }
}
