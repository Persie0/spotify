package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hs50 implements is50 {

    /* JADX INFO: renamed from: a */
    public final double f94609a;

    public hs50(double d) {
        this.f94609a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hs50) && Double.compare(this.f94609a, ((hs50) obj).f94609a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f94609a);
    }
}
