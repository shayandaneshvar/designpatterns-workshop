package ir.ac.kntu.designpatterns.structural.adapter;

public class Orange {
    private Integer pieces;
    private final Integer pieceMass;
    private boolean peeled = false;

    public Orange(Integer pieces, Integer pieceMass) {
        this.pieces = pieces;
        this.pieceMass = pieceMass;
    }

    public void eat(Integer piece) {
        if (!peeled) {
            return;
        }
        pieces -= piece;
        if (pieces < 0) {
            pieces = 0;
        }
    }

    public void peel() {
        if (!peeled) {
            peeled = true;
        }
    }

    public Integer getPieces() {
        return pieces;
    }

    public Integer getPieceMass() {
        return pieceMass;
    }

    public boolean isPeeled() {
        return peeled;
    }
}
