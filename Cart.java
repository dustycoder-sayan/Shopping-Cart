import java.util.Scanner;

abstract class groceryproduct {
    private String name;
    private double price;
    private double discount;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public groceryproduct(String name, double price, double discount) {
        super();
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    public double getActualPrice()
    {
        return (price -(price *(discount/100)));
    }
    public String toString() {
        return("Name:" + name + "\n" +"Price:" + price + "\n" + "Discount:" + discount
                + "\n");
    }
}
//dairyproduct
class DairyProduct extends groceryproduct{
    private Fat Fat;
    public DairyProduct(String name, double price, double discount,Fat Fat) {
        super(name, price, discount);
        this.Fat=Fat;
// TODO Auto-generated constructor stub
    }
    public Fat getFat() {
        return Fat;
    }
    public void setFat(Fat fat) {
        Fat = fat;
    }
    public String toString() {
        return super.toString() + "Fat Level:" + Fat;
    }
}
//beverageproduct
class BeverageProduct extends groceryproduct implements Drinkable {
    private SugarLevel SugarLevel;
    public BeverageProduct(String name, double price, double discount, SugarLevel
            SugarLevel) {
        super(name, price, discount);
        this.SugarLevel=SugarLevel;
// TODO Auto-generated constructor stub
    }
    public SugarLevel getSugarLevel() {
        return SugarLevel;
    }
    public void setSugarLevel(SugarLevel sugarLevel) {
        SugarLevel = sugarLevel;
    }
    public String toString() {
        return super.toString() + "Sugar Level:" + SugarLevel;
    }
    @Override
    public boolean isHealthy() {
        return SugarLevel!=SugarLevel.ADDED_SUGAR;
    }
}
//sugarlevel
enum SugarLevel {
    LIGHT, ZERO, ADDED_SUGAR, NO_ADDEDSUGAR
}
//fat
enum Fat {
    FULLCREAM, HALFCREAM, SKIMMED ,NOFAT
}
//drinkable
interface Drinkable {
    public boolean isHealthy();
}

//cart
public class Cart {

    public static void displayMenu() {
        System.out.println("Choose between the following by pressing respective numbers");
        System.out.println("1. Dairy Products\n2. Beverages\n3. Exit Cart");
    }

    public static void displayDairy() {
        System.out.println("Choose from the following Dairy Products");
        System.out.println("1. Yogu\n2. Juhayna\n3. Paneer\n4.Cheese\n5. Soya\n6. Milk");
    }

    public static void displayBeverages() {
        System.out.println("Choose from the following Beverage Products");
        System.out.println("1. Sprite\n2. Cola\n3. Mirinda\n4. Fanta\n5. Sting\n6. Rum");
    }

    public static void dairyInfo(int choice) {
        switch(choice) {
            case 1:
                DairyProduct Yogu=new DairyProduct("Yogu" , 5.5, 15, Fat.SKIMMED);
                System.out.println(Yogu.getActualPrice()) ;
                System.out.println(Yogu);
                System.out.println();
                break;
            case 2:
                DairyProduct Juhayna=new DairyProduct("Juhayna" , 4, 25, Fat.FULLCREAM);
                System.out.println(Juhayna.getActualPrice()) ;
                System.out.println(Juhayna);
                System.out.println();
                break;
            case 3:
                DairyProduct Paneer=new DairyProduct("Paneer" , 5, 35, Fat.FULLCREAM);
                System.out.println(Paneer.getActualPrice()) ;
                System.out.println(Paneer);
                System.out.println();
                break;
            case 4:
                DairyProduct Cheese=new DairyProduct("Cheese" , 6, 25, Fat.FULLCREAM);
                System.out.println(Cheese.getActualPrice());
                System.out.println(Cheese);
                System.out.println();
                break;
            case 5:
                DairyProduct Soya=new DairyProduct("Soya" , 0, 5, Fat.NOFAT);
                System.out.println(Soya.getActualPrice()) ;
                System.out.println(Soya);
                System.out.println();
                break;
            case 6:
                DairyProduct Milk=new DairyProduct("Milk" , 4, 25, Fat.FULLCREAM);
                System.out.println(Milk.getActualPrice()) ;
                System.out.println(Milk);
                System.out.println();
                break;
        }
    }

    public static void beverageInfo(int choice) {
        switch(choice) {
            case 1:
                BeverageProduct Sprite = new BeverageProduct("Sprite", 2.5, 10, SugarLevel.LIGHT);
                System.out.println(Sprite.isHealthy());
                System.out.println(Sprite.getActualPrice());
                System.out.println(Sprite);
                System.out.println();
                break;
            case 2:
                BeverageProduct Cola = new BeverageProduct("Cola", 4, 0, SugarLevel.ADDED_SUGAR);
                System.out.println(Cola.isHealthy());
                System.out.println(Cola.getActualPrice());
                System.out.println(Cola);
                System.out.println();
                break;
            case 3:
                BeverageProduct Mirinda = new BeverageProduct("Mirinda", 1.5, 10, SugarLevel.LIGHT);
                System.out.println(Mirinda.isHealthy()) ;
                System.out.println(Mirinda.getActualPrice());
                System.out.println(Mirinda);
                System.out.println();
                break;
            case 4:
                BeverageProduct Fanta = new BeverageProduct("Fanta", 8, 0, SugarLevel.ADDED_SUGAR);
                System.out.println(Fanta.isHealthy());
                System.out.println(Fanta.getActualPrice());
                System.out.println(Fanta);
                System.out.println();
                break;
            case 5:
                BeverageProduct Sting = new BeverageProduct("Sting", 9, 10, SugarLevel.ADDED_SUGAR);
                System.out.println(Sting.isHealthy()) ;
                System.out.println(Sting.getActualPrice());
                System.out.println(Sting);
                System.out.println();
                break;
            case 6:
                BeverageProduct Rum = new BeverageProduct("Rum", 0.8, 0, SugarLevel.LIGHT);
                System.out.println(Rum.isHealthy());
                System.out.println(Rum.getActualPrice());
                System.out.println(Rum);
                System.out.println();
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        while(true) {
            displayMenu();
            int menuChoice = sn.nextInt();
            switch(menuChoice) {
                case 1:
                    displayDairy();
                    int dairyChoice = sn.nextInt();
                    dairyInfo(dairyChoice);
                    break;
                case 2:
                    displayBeverages();
                    int beverageChoice = sn.nextInt();
                    beverageInfo(beverageChoice);
                    break;
                case 3:
                    System.out.println("Thank you for Shopping with us!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Item. Please try again!");
            }
        }
    }
}
