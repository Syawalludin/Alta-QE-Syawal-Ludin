public class Palindrome {

        private static boolean palindrome(String value) {
            String poli = "";
            for(int i=value.length()-1; i>-1; i--){
                char c = value.charAt(i);
                poli += String.valueOf(c);
            }

            if(value.equals(poli)){
                return true;
            }else{
                return false;
            }

        }
        public static void main(String[] args){
            System.out.println(palindrome("civic"));
            System.out.println(palindrome("katak"));
            System.out.println(palindrome("kita"));
            System.out.println(palindrome("kupu-kupu"));
            System.out.println(palindrome("lion"));

        }
}
