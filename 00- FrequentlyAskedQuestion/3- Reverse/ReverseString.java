public class ReverseString {
    public static void main(String[] args) {

        // using + concatenation
        String str = "ABCD";
        String rev = null;
        
        int length = str.length();
        //int i = 0;
        for(int i = length-1; i>=0; i++) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse string is: " + rev );
    }
}