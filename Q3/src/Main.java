import java.util.HashMap;
import java.util.Map;

class CoinChangingtoPKR  {

    public static void main(String[] args) {
        int money = 1988;
        int[] denomination = {5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1};
        Map<Integer, Integer> change = getChange(money, denomination);

        System.out.println("Money is : Rs. " + money);
        System.out.println("denomination and counts are :");
        for (Map.Entry<Integer, Integer> entry : change.entrySet()) {
            System.out.println("denomination is : Rs. " + entry.getKey() + ", Count is: " + entry.getValue());
        }
    }
    //************************************************************************
    public static Map<Integer, Integer> getChange(int money, int[] denoms) {
        Map<Integer, Integer> result = new HashMap<>();
        int leftedmoney = money;

        for (int denom : denoms) {
            int counting = leftedmoney / denom;
            if (counting > 0) {
                result.put(denom, counting);
                leftedmoney -= counting * denom;
            }
        }
        return result;
    }
}//***************************end****************************************



