public class BonusMilesService {
    public int calculate(int cost) {
        int quantity = 20;
        int miles = cost / quantity;
        return miles;
    }
}
