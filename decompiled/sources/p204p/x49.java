package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x49 {

    /* JADX INFO: renamed from: a */
    public final String f258015a;

    /* JADX INFO: renamed from: b */
    public final int f258016b;

    /* JADX INFO: renamed from: c */
    public final ieu f258017c;

    /* JADX INFO: renamed from: d */
    public final long f258018d;

    /* JADX INFO: renamed from: e */
    public final long f258019e;

    /* JADX INFO: renamed from: f */
    public final boolean f258020f;

    public x49(String str) {
        ieu ieuVar = new ieu(63, null, null);
        this.f258015a = str;
        this.f258016b = 1;
        this.f258017c = ieuVar;
        this.f258018d = 120L;
        this.f258019e = 2L;
        this.f258020f = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x49)) {
            return false;
        }
        x49 x49Var = (x49) obj;
        return wj50.m88271j(this.f258015a, x49Var.f258015a) && this.f258016b == x49Var.f258016b && wj50.m88271j(this.f258017c, x49Var.f258017c) && this.f258018d == x49Var.f258018d && this.f258019e == x49Var.f258019e && this.f258020f == x49Var.f258020f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f258020f) + dq60.m36605e(dq60.m36605e((this.f258017c.hashCode() + f710.m40938f(this.f258016b, this.f258015a.hashCode() * 31, 31)) * 31, this.f258018d, 31), this.f258019e, 961);
    }
}
