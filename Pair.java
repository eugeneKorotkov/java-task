package ru.korotkov.javaexam;

public class Pair<L,R> {

    private L left;
    private R right;

    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Pair)) {
            return false;
        }
        Pair p = (Pair) o;

        //compare types
        if (left.getClass() != p.left.getClass() || right.getClass() != p.right.getClass()) return false;

        //compare values
        if (!left.equals(p.left) || !right.equals(p.right)) return false;

        return true;
    }

}
