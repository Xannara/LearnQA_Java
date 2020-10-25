import java.util.Calendar;

public class Day1_GetCurrentTime {

    public static void main(String[] args) {

        String username = "Oksana";
        Calendar calendar = Calendar.getInstance();
        int currentTime = calendar.get(Calendar.HOUR);
        printTime(username, currentTime);
    }

    public static void printTime(String username, int currentTime) {

        if(currentTime >= 0 && currentTime <= 4 ) {
            System.out.println("Доброй ночи, " + username);
        } else if (currentTime >=5 && currentTime <= 9) {
            System.out.println("Доброе утро" + username);
        } else if (currentTime >= 10 && currentTime <= 16) {
            System.out.println("Добрый день" + username);
        } else if (currentTime >= 17 && currentTime <= 23) {
            System.out.println("Добрый вечер" + username);
        } else {
            System.out.println("Время не попадает в указанные диапазоны");
        }
    }
}
