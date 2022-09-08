import java.util.HashMap;

public class OrderSystem {
    // Attribute
    private static HashMap<Integer, Menu> menus = new HashMap<>(); // Damit wir eine Hashmap erstellen müssen wir eine = new  HashMap erstellen
                                                                   // Also dann jetzt in diese menus ist diese HashMap drin

    // Methode addMenu
    // Also wir würden jetzt in den HashMap was hinzufügen
    public Menu addMenu(Menu menuAdd) {
        menus.put(menuAdd.getNumber(), menuAdd); // In den menus.put kommt erst  ein Key und dann Value
        return menuAdd;
    }

    // Methode placeOrder
    public static Menu placeOrder(Integer number){  // Anhand diese Zahl > (Integer number) geht ins menus rein
        Menu foundMenu = menus.get(number); // Dann gehen wir ins menus und machen wir get(number)
        System.out.println("Folgendes Burger Menü wurde bestellt: ");
        System.out.println(foundMenu);

        return foundMenu;
    }

}