/* 1. Создать метод, который проверяет, является ли строка палиндромом.
Палиндром - шалаш */

public class task_1 {
    private static boolean isPalindrome(String targetStr){
        if (targetStr.length() == 1)
            return true;
        for (int i = 0; i < targetStr.length()/2; i++) {
            if (targetStr.toLowerCase().charAt(i) != targetStr.toLowerCase().charAt(targetStr.length() - 1 - i))
                return false;
        }
        return true;
    }
 
    public static void main(String[] args) {
        String [] arrStr = {"qwq","qwerty","qwqw","maybe","шалаш","qwqsqwqa","987656789"};
        for (String s: arrStr)
            if (isPalindrome(s))
                System.out.printf("%s - полиндром \n", s);
    }
}
