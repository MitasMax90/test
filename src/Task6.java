import java.util.regex.Matcher;
import java.util.regex.Pattern;



    public class Task6 {
        public static void main(String[] args) {
            String text = "До свиданья, друг мой, до свиданья." +
                    "Милый мой, ты у меня в груди." +
                    "Предназначенное расставанье" +
                    "Обещает встречу впереди." +

                    "До свиданья, друг мой, без руки, без слова," +
                    "Не грусти и не печаль бровей, —" +
                    "В этой жизни умирать не ново," +
                    "Но и жить, конечно, не новей.";
            Pattern p = Pattern.compile("\\b[Д][а-я]+\\b"); // что ищем
            Matcher m = p.matcher(text);
            while (m.find()) {
                int start = m.start();
                int end = m.end();
                System.out.println(text.substring(start, end));
            }
        }

    }


