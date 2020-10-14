public class TextWork {

    public static void main(String[] args) {

        String text = "Не забывайте о том, что все великие волшебники в истории в свое время " +
                "были такими же, как мы, - школьниками. Если у них получилось, то получится и у нас";
        int maxLength = 35;
        textAnalysis(text, maxLength);
    }

    public static void textAnalysis(String text, int maxLength) {

        System.out.println("Количество символов в тексте - " + text.length());
        System.out.println("Количество символов без учета пробелов - " + text.replace(" ", "").length());
        if (text.length() %2 == 0) {
            System.out.println("Количество символов в тексте четное");
        } else {
            System.out.println("Количество символов в тексте не четное");
        }
        if (text.length() > maxLength) {
            System.out.println("Длина текста превышает длину " + maxLength + " символов");
        }
    }

}
