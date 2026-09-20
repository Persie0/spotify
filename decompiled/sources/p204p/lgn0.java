package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lgn0 implements tgn0 {

    /* JADX INFO: renamed from: a */
    public final double f133250a;

    public lgn0(double d) {
        this.f133250a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lgn0) && Double.compare(this.f133250a, ((lgn0) obj).f133250a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f133250a);
    }
}
