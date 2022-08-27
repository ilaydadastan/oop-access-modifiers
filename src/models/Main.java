package models;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Restaurant kfc = new Restaurant();
        kfc.name = "KFC";
        kfc.address = "Istanbul";
        kfc.phoneNumber = "555";

        Menu kfcMenu = new Menu();
        kfcMenu.name = "kfc menu";

        kfc.menu = kfcMenu;


        kfcMenu.foods = getKfcFoods();
        kfc.tables = getKfcTables();
        kfc.employers = getKfcEmployers();

        Restaurant hunger = new Restaurant();
        hunger.name = "Hunger";
        hunger.address = "Istanbul";
        hunger.phoneNumber = "444";



        String password = kfc.employers.get(0).getPassword();


        // TODO hunger için veriler girilecek
    }

    public static List<Food> getKfcFoods() {
        Food kfcFoodBurger = new Food();
        kfcFoodBurger.name = "Tavuk Burger";
        kfcFoodBurger.content = "Tavuk, Ekmek, Ketçap, Mayonez, Marul";
        kfcFoodBurger.imageUrl = "http:/....";
        kfcFoodBurger.price = 49.90;

        Food kfcFoodPatates = new Food();
        kfcFoodPatates.name = "Patates";
        kfcFoodPatates.content = "Patates, Ketçap";
        kfcFoodPatates.imageUrl = "http:/....";
        kfcFoodPatates.price = 19.90;

        Food kfcFoodKofte = new Food();
        kfcFoodKofte.name = "Kofte Burger";
        kfcFoodKofte.content = "Kofte, Ekmek, Ketçap, Mayonez, Marul";
        kfcFoodKofte.imageUrl = "http:/....";
        kfcFoodKofte.price = 69.90;

        return Arrays.asList(kfcFoodBurger, kfcFoodKofte, kfcFoodPatates);
    }

    public static List<Table> getKfcTables() {
        Table kfcTable1 = new Table();
        kfcTable1.no = 1;
        kfcTable1.status = Table.Status.EMPTY;

        Table kfcTable2 = new Table();
        kfcTable2.no = 2;
        kfcTable2.status = Table.Status.EMPTY;

        Table kfcTable3 = new Table();
        kfcTable3.no = 3;
        kfcTable3.status = Table.Status.EMPTY;

        return Arrays.asList(kfcTable1, kfcTable2, kfcTable3);
    }

    public static List<Employer> getKfcEmployers(){
        Employer kfcEmployer1 = new Employer();
        kfcEmployer1.name = "İlayda";
        kfcEmployer1.no = 1;

        Employer kfcEmployer2 = new Employer();
        kfcEmployer2.name = "Ahmet Can";
        kfcEmployer2.no = 2;
        kfcEmployer2.setPassword("12345");

        return Arrays.asList(kfcEmployer1, kfcEmployer2);
    }
}
