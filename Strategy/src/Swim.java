public interface Swim {

    String swim();

}

class CanSwim implements Swim { // Which is better ?

    @Override
    public String swim() {
        return "Moves like the water ~";
    }
}