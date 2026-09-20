package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qjt0 {

    /* JADX INFO: renamed from: a */
    public final String f189309a;

    /* JADX INFO: renamed from: b */
    public final wit0 f189310b;

    /* JADX INFO: renamed from: c */
    public final boolean f189311c;

    /* JADX INFO: renamed from: d */
    public final boolean f189312d;

    /* JADX INFO: renamed from: e */
    public final boolean f189313e;

    /* JADX INFO: renamed from: f */
    public final eh00 f189314f;

    /* JADX INFO: renamed from: g */
    public final eh00 f189315g;

    public qjt0(String str, wit0 wit0Var, boolean z, boolean z2, boolean z3, eh00 eh00Var, eh00 eh00Var2) {
        this.f189309a = str;
        this.f189310b = wit0Var;
        this.f189311c = z;
        this.f189312d = z2;
        this.f189313e = z3;
        this.f189314f = eh00Var;
        this.f189315g = eh00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjt0)) {
            return false;
        }
        qjt0 qjt0Var = (qjt0) obj;
        return wj50.m88271j(this.f189309a, qjt0Var.f189309a) && wj50.m88271j(this.f189310b, qjt0Var.f189310b) && this.f189311c == qjt0Var.f189311c && this.f189312d == qjt0Var.f189312d && this.f189313e == qjt0Var.f189313e && wj50.m88271j(this.f189314f, qjt0Var.f189314f) && wj50.m88271j(this.f189315g, qjt0Var.f189315g);
    }

    public final int hashCode() {
        return this.f189315g.hashCode() + p1v.m68853j(s571.m77245d(s571.m77245d(s571.m77245d((this.f189310b.hashCode() + (this.f189309a.hashCode() * 31)) * 31, 31, this.f189311c), 31, this.f189312d), 31, this.f189313e), this.f189314f, 31);
    }
}
