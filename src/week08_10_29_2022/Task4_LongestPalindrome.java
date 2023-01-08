package week08_10_29_2022;

public class Task4_LongestPalindrome {

    public static void main(String[] args) {

        /*
        Task 4 :  For Each - Nested For
    		Longest Palindrome

       		 Given a String array. Find the longest Palindrome String in your array.
			        Ex:
			        Input: ["java", "longer word", "civic" "apple", "racecar", "mom", "anna"] Output: racecar
			        Ex:
			        Input: ["abc", "dna", "kevin", "joe", "lamp"]
			        Output: No palindrome
 */
        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longestPalindrome= "";

        // we need to get word one by one

        for (String eachword : words) {

            //is palindrome or not

            boolean isPalindrome = true;

            for (int i = 0; i < eachword.length()/2; i++) {

                //racecar
                char ch1 = eachword.charAt(i);
                char ch2 = eachword.charAt(eachword.length()-i-1);

                if (ch1!=ch2){
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome&&eachword.length()>longestPalindrome.length()) {
                longestPalindrome = eachword;
            }
        }
        System.out.println(longestPalindrome);


    }
}
