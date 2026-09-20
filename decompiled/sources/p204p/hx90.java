package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hx90 implements jx90 {

    /* JADX INFO: renamed from: a */
    public final int f96168a;

    public hx90(int i) {
        this.f96168a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hx90) && this.f96168a == ((hx90) obj).f96168a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f96168a);
    }
}
