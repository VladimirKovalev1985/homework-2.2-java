public class Main {
    public static void main(String[] args) {
        int personalAccounts = 100;
        int bonus = 0;
        int replenishment = 1100;
        if (replenishment >= 1000) {
            bonus = replenishment/100;} else {
            bonus = 0;}
        int totalAmount = personalAccounts+bonus+replenishment;
        System.out.println(totalAmount);
        System.out.println(bonus);

        }


    }

