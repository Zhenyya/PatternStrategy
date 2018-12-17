package improved;

import improved.strategies.MyClothesStrategy;
import improved.strategies.SunnyClothesStrategy;

public class MyClothes {

    private MyClothesStrategy clothesStrategy = new SunnyClothesStrategy();

    public void changeClothesStrategy(MyClothesStrategy clothesStrategy) {
        this.clothesStrategy = clothesStrategy;
    }

    public void goOutside() {
        String clothes = clothesStrategy.getClothes();
        String accessories = clothesStrategy.getAccessories();
        System.out.println("Today I am wearing " + clothes + " and " + accessories +".");
    }
}

