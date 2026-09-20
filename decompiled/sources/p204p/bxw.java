package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bxw implements i2x {

    /* JADX INFO: renamed from: a */
    public final int f31988a;

    public bxw(int i) {
        this.f31988a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxw) && this.f31988a == ((bxw) obj).f31988a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f31988a);
    }
}
