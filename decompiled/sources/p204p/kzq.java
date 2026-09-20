package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kzq implements k0r {

    /* JADX INFO: renamed from: a */
    public final int f128181a;

    /* JADX INFO: renamed from: b */
    public final int f128182b;

    public kzq(int i, int i2) {
        this.f128181a = i;
        this.f128182b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzq)) {
            return false;
        }
        kzq kzqVar = (kzq) obj;
        return this.f128181a == kzqVar.f128181a && this.f128182b == kzqVar.f128182b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + f710.m40938f(this.f128182b, edb.m38547C(this.f128181a) * 31, 31);
    }
}
