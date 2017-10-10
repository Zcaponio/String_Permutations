/**
 * Created by Zack on 2017-08-25.
 */
public class Permutations {
    public static void main(String[] args) {
        displayPermutations("abc");
    }

    public static void displayPermutations(String s) {
        displayPermutations("",s);
    }

    private static void displayPermutations(String s1, String s2) {
        if (s2.length() == 0) {
            System.out.println(s1);
        }else{
            for(int i=0; i < s2.length(); i++){
                displayPermutations(s1 + s2.charAt(i),s2.substring(0,i) + s2.substring(i+1, s2.length()));
            }
        }
    }
}