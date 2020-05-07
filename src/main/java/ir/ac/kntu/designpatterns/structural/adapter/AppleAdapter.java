package ir.ac.kntu.designpatterns.structural.adapter;

public class AppleAdapter extends Apple {
    private Orange orange;

    public AppleAdapter(Orange orange) {
        super(orange.getPieceMass() * orange.getPieces());
        this.orange = orange;
    }


    @Override
    public void eat(Integer bite) {
        orange.peel();
        int pieces = bite / orange.getPieceMass();
        orange.eat(pieces);
    }
}
