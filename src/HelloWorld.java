public class HelloWorld {

    static String multString(String p , int n) {
        String result = "";
        for (int i = 0; i < n; i++)
            result += p;
            return result;

    }
        public static void main(String[] args) {
             System.out.println(multString("A", 1000));
         }

}
