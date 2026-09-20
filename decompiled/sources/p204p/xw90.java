package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xw90 implements jx90 {

    /* JADX INFO: renamed from: a */
    public final int f266619a;

    public xw90(int i) {
        this.f266619a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xw90) && this.f266619a == ((xw90) obj).f266619a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f266619a);
    }
}
