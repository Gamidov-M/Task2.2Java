public class Main {
    public static void main(String[] args) {
        int StartingScore = 500;
        int replenishment = 900;
        int Balance = StartingScore + replenishment;
        int bonus;
        if (Balance > 1000) {
            bonus = Balance / 100;
        } else {
            bonus = 0;
        }
        int FinalBalance = StartingScore + replenishment + bonus;
        System.out.println("Итоговый баланс " + FinalBalance);
        System.out.println("Бонус " + bonus);
    }
}


