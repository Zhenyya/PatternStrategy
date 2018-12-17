package improved.strategies;

public class WarmClothesStrategy implements MyClothesStrategy {

    @Override
    public String getClothes() {
        return "T-shirt and jeans";
    }

    @Override
    public String getAccessories() {
        return "sunglasses";
    }
}

