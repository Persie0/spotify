package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xbf0 implements ybf0 {

    /* JADX INFO: renamed from: a */
    public final double f259905a;

    public xbf0(double d) {
        this.f259905a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xbf0) && Double.compare(this.f259905a, ((xbf0) obj).f259905a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f259905a);
    }
}
