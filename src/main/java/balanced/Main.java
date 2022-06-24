package balanced;

public class Main {
    public static void main(String[] args) {
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        System.out.println(balancedWordsCounter.count("aabbabcccba"));
    }
}
