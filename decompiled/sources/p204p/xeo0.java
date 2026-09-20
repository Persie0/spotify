package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xeo0 {

    /* JADX INFO: renamed from: a */
    public final String f260750a;

    /* JADX INFO: renamed from: b */
    public final boolean f260751b;

    /* JADX INFO: renamed from: c */
    public final boolean f260752c;

    /* JADX INFO: renamed from: d */
    public final weo0 f260753d;

    /* JADX INFO: renamed from: e */
    public final int f260754e;

    public xeo0(String str, boolean z, boolean z2, weo0 weo0Var, int i) {
        str = (i & 1) != 0 ? "" : str;
        z = (i & 2) != 0 ? true : z;
        z2 = (i & 4) != 0 ? false : z2;
        weo0Var = (i & 8) != 0 ? new ueo0(z2, 0) : weo0Var;
        int i2 = (i & 16) == 0 ? 0 : 1;
        this.f260750a = str;
        this.f260751b = z;
        this.f260752c = z2;
        this.f260753d = weo0Var;
        this.f260754e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xeo0)) {
            return false;
        }
        xeo0 xeo0Var = (xeo0) obj;
        return wj50.m88271j(this.f260750a, xeo0Var.f260750a) && this.f260751b == xeo0Var.f260751b && this.f260752c == xeo0Var.f260752c && wj50.m88271j(this.f260753d, xeo0Var.f260753d) && this.f260754e == xeo0Var.f260754e;
    }

    public final int hashCode() {
        int iHashCode = (this.f260753d.hashCode() + s571.m77245d(s571.m77245d(this.f260750a.hashCode() * 31, 31, this.f260751b), 31, this.f260752c)) * 31;
        int i = this.f260754e;
        return iHashCode + (i == 0 ? 0 : edb.m38547C(i));
    }
}
