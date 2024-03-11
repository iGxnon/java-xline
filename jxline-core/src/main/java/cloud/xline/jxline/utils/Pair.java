package cloud.xline.jxline.utils;

import java.util.Objects;
import java.util.function.BiFunction;

public final class Pair<A, B> {
    final A a;
    final B b;

    public Pair(A a, B b) {
        this.a = Objects.requireNonNull(a);
        this.b = Objects.requireNonNull(b);
    }

    /** Gets the first value. */
    public A getFirst() {
        return a;
    }

    /** Gets the second value. */
    public B getSecond() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Pair<?, ?>) {
            Pair<?, ?> e = (Pair<?, ?>) o;
            return a.equals(e.getFirst()) && b.equals(e.getSecond());
        }
        return false;
    }

    public <T> T apply(BiFunction<A, B, T> fn) {
        return fn.apply(a, b);
    }

    @Override
    public int hashCode() {
        return a.hashCode() ^ b.hashCode();
    }

    @Override
    public String toString() {
        return "(" + a + "," + b + ")";
    }
}