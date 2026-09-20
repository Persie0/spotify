package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pqd1 {

    /* JADX INFO: renamed from: a */
    public final int f180289a;

    /* JADX INFO: renamed from: b */
    public final int f180290b;

    /* JADX INFO: renamed from: c */
    public final int f180291c;

    /* JADX INFO: renamed from: d */
    public final int f180292d;

    public pqd1(int i, int i2, int i3, int i4) {
        this.f180289a = i;
        this.f180290b = i2;
        this.f180291c = i3;
        this.f180292d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqd1)) {
            return false;
        }
        pqd1 pqd1Var = (pqd1) obj;
        return this.f180289a == pqd1Var.f180289a && this.f180290b == pqd1Var.f180290b && this.f180291c == pqd1Var.f180291c && this.f180292d == pqd1Var.f180292d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f180292d) + mt60.m62800g(this.f180291c, mt60.m62800g(this.f180290b, Integer.hashCode(this.f180289a) * 31, 31), 31);
    }
}
