package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r5b1 {

    /* JADX INFO: renamed from: a */
    public final double f196009a;

    public r5b1(double d) {
        this.f196009a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r5b1) && Double.compare(this.f196009a, ((r5b1) obj).f196009a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f196009a);
    }
}
