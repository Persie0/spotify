package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tyw implements y2x {

    /* JADX INFO: renamed from: a */
    public final double f225067a;

    public tyw(double d) {
        this.f225067a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tyw) && Double.compare(this.f225067a, ((tyw) obj).f225067a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f225067a);
    }
}
