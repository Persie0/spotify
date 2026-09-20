package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u1y0 implements v1y0 {

    /* JADX INFO: renamed from: a */
    public final double f225936a;

    public u1y0(double d) {
        this.f225936a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1y0) && Double.compare(this.f225936a, ((u1y0) obj).f225936a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f225936a);
    }
}
