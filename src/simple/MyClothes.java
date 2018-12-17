package simple;

public class MyClothes {

    private Weather weather = Weather.SUNNY;

    public void changeClothesStrategy(Weather weather) {
        this.weather = weather;
    }

    public void goOutside() {
        String clothes = getClothes(weather);
        String accessories = getAccessories(weather);
        System.out.println("Today I am wearing " + clothes + " and " + accessories +".");
    }

    private String getClothes(Weather weather) {
        String clothes;
        switch (weather) {
            case SUNNY:
                clothes = "dress";
                break;
            case RAIN:
                clothes = "dress ans jacket";
                break;
            case COLD:
                clothes = "coat";
                break;
            case WARM:
                clothes = "T-shirt and jeans";
                break;
            case WARM_AND_RAIN:
                clothes = "dress and raincoat";
                break;
            default:
                clothes = "nothing. Stay at home )";
        }
        return clothes;
    }

    private String getAccessories(Weather weather) {
        String accessories;
        switch (weather) {
            case SUNNY:
                accessories = "sunglasses and sunhat";
                break;
            case RAIN:
                accessories = "umbrella";
                break;
            case COLD:
                accessories = "scarf and gloves";
                break;
            case WARM:
                accessories = "sunglasses";
                break;
            case WARM_AND_RAIN:
                accessories = "umbrella and hat";
                break;
            default:
                accessories = "Stay at home";
        }
        return accessories;
    }

    // In case snowing, it will be need to add case SNOW twice

}

