public class Duck extends Herbivores implements Walkable, Flyable, Swimmable {
    
    public Duck(String name) {
        super(name);
    }    

    @Override
    public String say() {
        return "Krya-krya";
    }

    @Override
    public String toString() {
        return String.format("Duck, %s", super.toString());
    }

    @Override
    public int walkingSpeed(){
        return 5;
    }

    @Override
    public int flyingSpeed(){
        return 56;
    }

    @Override
    public int swimmingSpeed(){
        return 20;
    }


}
