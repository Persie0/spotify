package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zj11 {

    /* JADX INFO: renamed from: a */
    public final String f283329a;

    /* JADX INFO: renamed from: b */
    public final String f283330b;

    /* JADX INFO: renamed from: c */
    public final long f283331c;

    /* JADX INFO: renamed from: d */
    public final long f283332d;

    public zj11(String str, long j, long j2, String str2) {
        this.f283329a = str;
        this.f283330b = str2;
        this.f283331c = j;
        this.f283332d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj11)) {
            return false;
        }
        zj11 zj11Var = (zj11) obj;
        return wj50.m88271j(this.f283329a, zj11Var.f283329a) && wj50.m88271j(this.f283330b, zj11Var.f283330b) && this.f283331c == zj11Var.f283331c && this.f283332d == zj11Var.f283332d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f283332d) + dq60.m36605e(s571.m77243b(this.f283329a.hashCode() * 31, 31, this.f283330b), this.f283331c, 31);
    }
}
