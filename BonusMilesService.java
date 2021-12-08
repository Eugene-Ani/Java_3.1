public class BonusMilesService {
    public int calculate (int cost) {
        int amountMoney = 20;
        int miles = cost / amountMoney;
        return miles;
    }
}
