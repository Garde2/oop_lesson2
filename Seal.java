public class Seal extends Predator implements Swimmable, Walkable {
    
    public Seal(String name) {
        super(name);
    }    

    @Override
    public String say() {
        return "grgrgr";
    }

    @Override
    public String toString() {
        return String.format("Seal, %s", super.toString());
    }

    @Override
    public int walkingSpeed(){
        return 1;
    }    

    @Override
    public int swimmingSpeed(){
        return 55;
    }


}
