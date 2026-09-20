package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xj1 {

    /* JADX INFO: renamed from: a */
    public final boolean f261986a;

    /* JADX INFO: renamed from: b */
    public final boolean f261987b;

    /* JADX INFO: renamed from: c */
    public final String f261988c;

    /* JADX INFO: renamed from: d */
    public final String f261989d;

    /* JADX INFO: renamed from: e */
    public final boolean f261990e;

    public xj1(String str, String str2, boolean z, int i, boolean z2, boolean z3) {
        str = (i & 8) != 0 ? "" : str;
        str2 = (i & 16) != 0 ? "" : str2;
        z3 = (i & 32) != 0 ? false : z3;
        this.f261986a = z;
        this.f261987b = z2;
        this.f261988c = str;
        this.f261989d = str2;
        this.f261990e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj1)) {
            return false;
        }
        xj1 xj1Var = (xj1) obj;
        return this.f261986a == xj1Var.f261986a && this.f261987b == xj1Var.f261987b && wj50.m88271j(this.f261988c, xj1Var.f261988c) && wj50.m88271j(this.f261989d, xj1Var.f261989d) && this.f261990e == xj1Var.f261990e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f261990e) + s571.m77243b(s571.m77243b(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f261986a) * 31, 31, this.f261987b), 31, false), 31, this.f261988c), 31, this.f261989d);
    }
}
