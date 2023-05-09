public class Bat extends Predator implements Flyable {
    
    public Bat(String name) {
        super(name);
    }    

    @Override
    public String say() {
        return "infrasound";
    }

    @Override
    public String toString() {
        return String.format("Bat, %s", super.toString());
    }

    @Override
    public int flyingSpeed(){
        return 60;
    }


}
