package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n0v0 {

    /* JADX INFO: renamed from: a */
    public final String f149182a;

    /* JADX INFO: renamed from: b */
    public final String f149183b;

    /* JADX INFO: renamed from: c */
    public final rcm0 f149184c;

    /* JADX INFO: renamed from: d */
    public final is9 f149185d;

    /* JADX INFO: renamed from: e */
    public final int f149186e;

    /* JADX INFO: renamed from: f */
    public final boolean f149187f;

    public n0v0(String str, String str2, rcm0 rcm0Var, is9 is9Var, int i, boolean z) {
        this.f149182a = str;
        this.f149183b = str2;
        this.f149184c = rcm0Var;
        this.f149185d = is9Var;
        this.f149186e = i;
        this.f149187f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0v0)) {
            return false;
        }
        n0v0 n0v0Var = (n0v0) obj;
        return wj50.m88271j(this.f149182a, n0v0Var.f149182a) && wj50.m88271j(this.f149183b, n0v0Var.f149183b) && wj50.m88271j(this.f149184c, n0v0Var.f149184c) && wj50.m88271j(this.f149185d, n0v0Var.f149185d) && this.f149186e == n0v0Var.f149186e && this.f149187f == n0v0Var.f149187f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149187f) + mt60.m62800g(this.f149186e, (this.f149185d.hashCode() + yds.m93483m(this.f149184c, s571.m77243b(this.f149182a.hashCode() * 31, 31, this.f149183b), 31)) * 31, 31);
    }
}
