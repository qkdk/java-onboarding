package onboarding;

import java.util.List;

public class Problem3 {

    public static int solution(int number) {
        int answer = 0;


        return answer;
    }
    static int checkNumber(int number) {
        int count = 0;
        for (char c : makeString(number).toCharArray()) {
            if (c == '3' || c == '6' || c == '9') {
                count++;
            }
        }
        return count;
    }

    static String makeString(int number) {
        return Integer.toString(number);
    }

}
