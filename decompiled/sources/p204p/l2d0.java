package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class l2d0 {

    /* JADX INFO: renamed from: a */
    public final String f128981a;

    /* JADX INFO: renamed from: b */
    public final String f128982b;

    /* JADX INFO: renamed from: c */
    public final long f128983c;

    /* JADX INFO: renamed from: d */
    public final long f128984d;

    public l2d0(String str, long j, long j2, String str2) {
        this.f128981a = str;
        this.f128982b = str2;
        this.f128983c = j;
        this.f128984d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2d0)) {
            return false;
        }
        l2d0 l2d0Var = (l2d0) obj;
        return wj50.m88271j(this.f128981a, l2d0Var.f128981a) && wj50.m88271j(this.f128982b, l2d0Var.f128982b) && this.f128983c == l2d0Var.f128983c && this.f128984d == l2d0Var.f128984d;
    }

    public final int hashCode() {
        return dq60.m36605e(dq60.m36605e(s571.m77243b(this.f128981a.hashCode() * 31, 31, this.f128982b), this.f128983c, 31), this.f128984d, 31);
    }
}
