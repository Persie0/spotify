package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hv50 {

    /* JADX INFO: renamed from: a */
    public final int f95585a;

    public hv50(int i) {
        this.f95585a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hv50) && this.f95585a == ((hv50) obj).f95585a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + mt60.m62800g(0, mt60.m62800g(this.f95585a, Integer.hashCode(0) * 31, 31), 31);
    }
}
