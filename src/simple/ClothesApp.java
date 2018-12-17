package simple;

public class ClothesApp {

    public static void main(String[] args) {

        MyClothes myClothes = new MyClothes();
        myClothes.goOutside();

        System.out.println("The weather changed!");

        myClothes.changeClothesStrategy(Weather.RAIN);
        myClothes.goOutside();
    }
}

