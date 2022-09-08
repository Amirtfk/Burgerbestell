public class Main {
    public static void main(String[] args) {

        Menu menu1 = new Menu(1, 2.50f, "Small Burger Menu", "Burger", "Fries", "Softdrink" );
        Menu menu2 = new Menu(2, 2.70f, "Big Burger Menu", "Burger", "Fish", "Energydrink" );
        Menu menu3 = new Menu(3, 3.10f, "Small Burger Menu", "Burger", "Chips", "Cola" );
        Menu menu4 = new Menu(4, 4.90f, "Small Burger Menu", "Burger", "Salad", "Africa" );
        Menu menu5 = new Menu(5, 5.60f, "Small Burger Menu", "Burger", "CurryWurst", "Sprite" );

        OrderSystem amirFoods = new OrderSystem(); // OrderSystem wird hier erstellt

        // Hier werden die alle menu1 bis menu4 eingefüft damit sie aufrufbar sein, ansonsten wird 0 angezeigt
        amirFoods.addMenu(menu1);
        amirFoods.addMenu(menu2);
        amirFoods.addMenu(menu3);
        amirFoods.addMenu(menu4);
        amirFoods.addMenu(menu5);

        amirFoods.placeOrder(3); // Wird hier placeHolder Methode aufgeruft und dann suchen wir welche menü
    }
}
