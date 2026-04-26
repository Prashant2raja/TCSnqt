package TCSnqt;

public class RotateCheck {
    public static void main(String[] args) {
        String str1 = "aeiou";
        String str2 = "iouae";

        String str3 = str1 + str1;

        if(str1.length() == str2.length() && str3.contains(str2)) {
            System.out.println(str2 + " is the rotation of " + str1);
        } else {
            System.out.println("Noooo");
        }
    }
}