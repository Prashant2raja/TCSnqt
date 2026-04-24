package TCSnqt;
import java.util.*;

class String_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String....");
        String s = sc.nextLine();
        int n = s.length();
        boolean ans = true;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                ans = false;
                break;
            }
        }
        if (ans) {
            System.out.println("Yesssss");
        } else {
            System.out.println("Noooooo");
        }
    }
}
