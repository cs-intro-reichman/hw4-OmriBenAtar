

public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 65 && c <= 90)
                newString += (char)(c + 32);
            else
                newString += c;
        }
        return newString;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        boolean flag = true;
        //check for empty contain
        if(str2.length() < 1)
            return true;
        if(str2.length() < 1)
            return false;
        for (int i = 0; i < (str1.length() - str2.length()) + 1; i++) {
            if(str1.charAt(i) == str2.charAt(0)){
                flag = true;
                for(int j = 1; j < str2.length(); j++){
                    if(str1.charAt(i+j) != str2.charAt(j))
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    return true;
            }
        }
        return false;
    }
}
