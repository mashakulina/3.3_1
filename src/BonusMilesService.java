public class BonusMilesService {

    public int calculate(int price) {
        int forMiles = 20;
        int miles = price / forMiles;

        return miles;
    }

}
