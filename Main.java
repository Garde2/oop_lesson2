public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.setRadio(new Radio());

        zoo.addList(new Wolf("Wolf"))
                .addList(new Hare("Hare"))
                .addList(new Duck("Donald"))
                .addList(new Bat("Komori"))
                .addList(new Seal("Lucky"));

        for (var item : zoo.getListAnimal()) {
            System.out.println(item);
        }

        System.out.println("______________");

        for (var item: zoo.getSayable()){
            System.out.println(item.say());
        }

        System.out.println("______________");

        for (var item: zoo.walkables()){
            System.out.printf("%s - %d\n ", item.toString(), item.walkingSpeed());
        }

        System.out.println("______________");
        for (var item:zoo.flyables()) {
            System.out.printf("%s - %d\n ", item.toString(), item.flyingSpeed());
        }
        System.out.println("______________");
        System.out.println("Winner (walking) " + zoo.winnerWalk());

        System.out.println("______________");
        System.out.println("Winner (flying) " + zoo.winnerFly());

        System.out.println("______________");
        System.out.println("Winner (swimming) " + zoo.winnerSwim());
    

    }
}
