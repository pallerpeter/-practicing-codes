package coincombination;

// test path
public class CoinCombinations {

    public static void main(String[] args) {
        int [] coins = {1, 2};
        int totalAmount = 2;

        System.out.println(calculateCombo(coins, totalAmount, 0));
    }

    public static int calculateCombo(int[] coins, int amount, int currentIndex){

        if (amount == 0){
            return 1;
        }
        if(amount < 0){
            return 0;
        }

        int combos = 0;
        for (int i = currentIndex; i < coins.length; i++){
            combos += calculateCombo(coins, amount - coins[i], i);
        }
        return combos;
    }

}
