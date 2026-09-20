package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kts0 {

    /* JADX INFO: renamed from: a */
    public final String f126391a;

    /* JADX INFO: renamed from: b */
    public final int f126392b;

    /* JADX INFO: renamed from: c */
    public final boolean f126393c;

    /* JADX INFO: renamed from: d */
    public final boolean f126394d;

    public kts0(String str, int i, boolean z, boolean z2) {
        this.f126391a = str;
        this.f126392b = i;
        this.f126393c = z;
        this.f126394d = z2;
    }

    /* JADX INFO: renamed from: a */
    public static kts0 m57361a(kts0 kts0Var, boolean z, boolean z2, int i) {
        String str = kts0Var.f126391a;
        int i2 = (i & 2) != 0 ? kts0Var.f126392b : 2;
        if ((i & 4) != 0) {
            z = kts0Var.f126393c;
        }
        if ((i & 8) != 0) {
            z2 = kts0Var.f126394d;
        }
        kts0Var.getClass();
        return new kts0(str, i2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kts0)) {
            return false;
        }
        kts0 kts0Var = (kts0) obj;
        return wj50.m88271j(this.f126391a, kts0Var.f126391a) && this.f126392b == kts0Var.f126392b && this.f126393c == kts0Var.f126393c && this.f126394d == kts0Var.f126394d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f126394d) + s571.m77245d(f710.m40938f(this.f126392b, this.f126391a.hashCode() * 31, 31), 31, this.f126393c);
    }
}
