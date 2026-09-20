package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class w6u0 extends arg1 {

    /* JADX INFO: renamed from: g */
    public final double f248469g;

    public w6u0(double d) {
        this.f248469g = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6u0) && Double.compare(this.f248469g, ((w6u0) obj).f248469g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f248469g);
    }
}
