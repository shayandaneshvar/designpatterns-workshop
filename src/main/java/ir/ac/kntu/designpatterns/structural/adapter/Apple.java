package ir.ac.kntu.designpatterns.structural.adapter;

// our program contains apple
public class Apple {
    private Integer mass;

    public Apple(Integer mass) {
        this.mass = mass;
    }

    public Integer getMass() {
        return mass;
    }

    public void eat(Integer bite) {
        mass -= bite;
        if (mass < 0) {
            mass = 0;
        }
    }
}
