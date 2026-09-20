package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j8k0 {

    /* JADX INFO: renamed from: a */
    public final xt81 f109952a;

    /* JADX INFO: renamed from: b */
    public final g6p0 f109953b;

    /* JADX INFO: renamed from: c */
    public final h8k0 f109954c;

    /* JADX INFO: renamed from: d */
    public final boolean f109955d;

    /* JADX INFO: renamed from: e */
    public final eh00 f109956e;

    public j8k0(xt81 xt81Var, g6p0 g6p0Var, h8k0 h8k0Var, boolean z, eh00 eh00Var) {
        this.f109952a = xt81Var;
        this.f109953b = g6p0Var;
        this.f109954c = h8k0Var;
        this.f109955d = z;
        this.f109956e = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8k0)) {
            return false;
        }
        j8k0 j8k0Var = (j8k0) obj;
        return wj50.m88271j(this.f109952a, j8k0Var.f109952a) && wj50.m88271j(this.f109953b, j8k0Var.f109953b) && this.f109954c == j8k0Var.f109954c && this.f109955d == j8k0Var.f109955d && wj50.m88271j(this.f109956e, j8k0Var.f109956e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f109954c.hashCode() + ((this.f109953b.hashCode() + (this.f109952a.hashCode() * 31)) * 31)) * 31, 31, this.f109955d);
        eh00 eh00Var = this.f109956e;
        return iM77245d + (eh00Var == null ? 0 : eh00Var.hashCode());
    }
}
