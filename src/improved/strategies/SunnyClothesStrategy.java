package improved.strategies;

public class SunnyClothesStrategy implements MyClothesStrategy {

    @Override
    public String getClothes() {
        return "dress";
    }

    @Override
    public String getAccessories() {
        return "sunglasses and sunhat";
    }
}
