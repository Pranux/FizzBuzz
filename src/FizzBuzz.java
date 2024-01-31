import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        String word = "";
        int count = 0;
        for(int i = 1; i <=n; ++i) {
            if(i % 3 == 0) {
                word += "Fizz";
                ++count;
            }
            if(i % 5 == 0) {
                word += "Buzz";
                ++count;
            }
            if(i % 7 == 0) {
                word += "Jazz";
                ++count;
            }
            if(count == 0) {
                word += Integer.toString(i);
            }
            result.add(word);
            word = "";
            count = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 20;
        List<String> result = fizzBuzz(n);
        for(String s : result) {
            System.out.print(s + " ");
        }
    }
}