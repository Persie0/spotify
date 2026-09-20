package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x2r0 {

    /* JADX INFO: renamed from: a */
    public final String f257549a;

    /* JADX INFO: renamed from: b */
    public final String f257550b;

    /* JADX INFO: renamed from: c */
    public final String f257551c;

    /* JADX INFO: renamed from: d */
    public final int f257552d;

    /* JADX INFO: renamed from: e */
    public final boolean f257553e;

    public x2r0(int i, String str, String str2, boolean z, String str3) {
        this.f257549a = str;
        this.f257550b = str2;
        this.f257551c = str3;
        this.f257552d = i;
        this.f257553e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2r0)) {
            return false;
        }
        x2r0 x2r0Var = (x2r0) obj;
        return wj50.m88271j(this.f257549a, x2r0Var.f257549a) && wj50.m88271j(this.f257550b, x2r0Var.f257550b) && wj50.m88271j(this.f257551c, x2r0Var.f257551c) && this.f257552d == x2r0Var.f257552d && this.f257553e == x2r0Var.f257553e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f257549a.hashCode() * 31, 31, this.f257550b);
        String str = this.f257551c;
        return Boolean.hashCode(this.f257553e) + f710.m40938f(this.f257552d, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
