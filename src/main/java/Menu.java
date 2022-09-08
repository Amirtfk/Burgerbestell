import java.util.Objects;

public class Menu {

    private int Number;
    private float Price;
    private String name;
    private String mainDish;
    private String sideDish;
    private String beverage;

    // Constructor
    public Menu(int Number, float Price, String name, String mainDish, String sideDish, String beverage) {
        this.Number = Number;
        this.Price = Price;
        this.name = name;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.beverage = beverage;
    }

    // Getter und Setter
    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainDish() {
        return mainDish;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    // Equals und HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Menu menu = (Menu) o;

        if (Number != menu.Number) return false;
        if (Float.compare(menu.Price, Price) != 0) return false;
        if (!Objects.equals(name, menu.name)) return false;
        if (!Objects.equals(mainDish, menu.mainDish)) return false;
        if (!Objects.equals(sideDish, menu.sideDish)) return false;
        return Objects.equals(beverage, menu.beverage);
    }

    @Override
    public int hashCode() {
        int result = Number;
        result = 31 * result + (Price != +0.0f ? Float.floatToIntBits(Price) : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (mainDish != null ? mainDish.hashCode() : 0);
        result = 31 * result + (sideDish != null ? sideDish.hashCode() : 0);
        result = 31 * result + (beverage != null ? beverage.hashCode() : 0);
        return result;
    }

    //toString
    @Override
    public String toString() {
        return "Menu{" +
                "Number=" + Number +
                ", Price=" + Price +
                ", name='" + name + '\'' +
                ", mainDish='" + mainDish + '\'' +
                ", sideDish='" + sideDish + '\'' +
                ", beverage='" + beverage + '\'' +
                '}';
    }
}
