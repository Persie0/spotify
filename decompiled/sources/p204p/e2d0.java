package p204p;

/* JADX INFO: loaded from: classes.dex */
@rtz0(with = f2d0.class)
public final class e2d0 {
    public static final d2d0 Companion = new d2d0();

    /* JADX INFO: renamed from: a */
    public final boolean f55429a;

    /* JADX INFO: renamed from: b */
    public final String f55430b;

    /* JADX INFO: renamed from: c */
    public final String f55431c;

    /* JADX INFO: renamed from: d */
    public final double f55432d;

    /* JADX INFO: renamed from: e */
    public final String f55433e;

    /* JADX INFO: renamed from: f */
    public final String f55434f;

    public e2d0(boolean z, String str, String str2, double d, String str3, String str4) {
        this.f55429a = z;
        this.f55430b = str;
        this.f55431c = str2;
        this.f55432d = d;
        this.f55433e = str3;
        this.f55434f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2d0)) {
            return false;
        }
        e2d0 e2d0Var = (e2d0) obj;
        return this.f55429a == e2d0Var.f55429a && wj50.m88271j(this.f55430b, e2d0Var.f55430b) && wj50.m88271j(this.f55431c, e2d0Var.f55431c) && Double.compare(this.f55432d, e2d0Var.f55432d) == 0 && wj50.m88271j(this.f55433e, e2d0Var.f55433e) && wj50.m88271j(this.f55434f, e2d0Var.f55434f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f55429a) * 31;
        String str = this.f55430b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f55431c;
        int iM91399h = xl81.m91399h(this.f55432d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f55433e;
        int iHashCode3 = (iM91399h + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f55434f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
