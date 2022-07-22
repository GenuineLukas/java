package Human;

public class Main {
    public static void main(String[] args) {
        Human grandParent = new GrandParent("grandpa", 78);
        Human parent = new Parent("mom", 50);
        Human child = new Child("me", 20);

        Human[] humans = {grandParent, parent ,child};
        for(Human human: humans) {
            System.out.println(human.name + ", age:" + human.age + ", speed:" + human.speed + ", current location: " + human.getLocation());
        }
        System.out.println("----- the activity starts here -----");
        for (Human human: humans) {
            if(human instanceof Walkable) {
                //casting about the human as the instance of Walkable
                ((Walkable) human).walk(1,1);
                System.out.println("-------");
            }
            if (human instanceof Runnable) {
                ((Runnable) human).run(2,2);
                System.out.println("-------");
            }
            if (human instanceof Swimmable) {
                ((Swimmable) human).swim(3, -1);
                System.out.println("-------");
            }
        }
    }
}

