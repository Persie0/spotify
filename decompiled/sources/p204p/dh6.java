package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dh6 extends fh6 {

    /* JADX INFO: renamed from: a */
    public final String f48986a;

    /* JADX INFO: renamed from: b */
    public final String f48987b;

    /* JADX INFO: renamed from: c */
    public final boolean f48988c;

    /* JADX INFO: renamed from: d */
    public final boolean f48989d;

    /* JADX INFO: renamed from: e */
    public final boolean f48990e;

    public dh6(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.f48986a = str;
        this.f48987b = str2;
        this.f48988c = z;
        this.f48989d = z2;
        this.f48990e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh6)) {
            return false;
        }
        dh6 dh6Var = (dh6) obj;
        return wj50.m88271j(this.f48986a, dh6Var.f48986a) && wj50.m88271j(this.f48987b, dh6Var.f48987b) && this.f48988c == dh6Var.f48988c && this.f48989d == dh6Var.f48989d && this.f48990e == dh6Var.f48990e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f48990e) + s571.m77245d(s571.m77245d(s571.m77243b(this.f48986a.hashCode() * 31, 31, this.f48987b), 31, this.f48988c), 31, this.f48989d);
    }
}
