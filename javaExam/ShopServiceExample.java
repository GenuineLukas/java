package javaExam;

public class ShopServiceExample {
    public static void main(String[] args) {
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if(obj1 == obj2) {
            System.out.println("obj1 and obj2 are the same ShopService object.");
        } else {
            System.out.println("obj1 and obj2 are not the same ShopService object.");
        }
    }
}
