package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xk31 {

    /* JADX INFO: renamed from: a */
    public final String f262267a;

    /* JADX INFO: renamed from: b */
    public final long f262268b;

    /* JADX INFO: renamed from: c */
    public final j4m0 f262269c;

    /* JADX INFO: renamed from: d */
    public final wk31 f262270d;

    public xk31(String str, long j, j4m0 j4m0Var, wk31 wk31Var) {
        this.f262267a = str;
        this.f262268b = j;
        this.f262269c = j4m0Var;
        this.f262270d = wk31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk31)) {
            return false;
        }
        xk31 xk31Var = (xk31) obj;
        if (!wj50.m88271j(this.f262267a, xk31Var.f262267a)) {
            return false;
        }
        long j = xk31Var.f262268b;
        int i = n6f.f150872l;
        return as91.m27074b(this.f262268b, j) && wj50.m88271j(this.f262269c, xk31Var.f262269c) && wj50.m88271j(this.f262270d, xk31Var.f262270d);
    }

    public final int hashCode() {
        int iHashCode = this.f262267a.hashCode() * 31;
        int i = n6f.f150872l;
        return this.f262270d.hashCode() + ((this.f262269c.hashCode() + dq60.m36605e(iHashCode, this.f262268b, 31)) * 31);
    }

    public /* synthetic */ xk31(String str, long j, wk31 wk31Var, int i) {
        this(str, j, zsf1.m96848h(0.0f, 0.0f, 3), (i & 8) != 0 ? zkq0.f283809P0 : wk31Var);
    }
}
