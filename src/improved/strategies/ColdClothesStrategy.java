package improved.strategies;

public class ColdClothesStrategy implements MyClothesStrategy {

    @Override
    public String getClothes() {
        return "coat";
    }

    @Override
    public String getAccessories() {
        return "scarf and gloves";
    }
}

