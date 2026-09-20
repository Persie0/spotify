package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mgn0 implements tgn0 {

    /* JADX INFO: renamed from: a */
    public final double f143601a;

    public mgn0(double d) {
        this.f143601a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mgn0) && Double.compare(this.f143601a, ((mgn0) obj).f143601a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f143601a);
    }
}
