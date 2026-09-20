package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gha0 {

    /* JADX INFO: renamed from: a */
    public final ema0 f79862a;

    /* JADX INFO: renamed from: b */
    public final eh00 f79863b;

    /* JADX INFO: renamed from: c */
    public final eh00 f79864c;

    public gha0(ema0 ema0Var, eh00 eh00Var, eh00 eh00Var2) {
        this.f79862a = ema0Var;
        this.f79863b = eh00Var;
        this.f79864c = eh00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gha0)) {
            return false;
        }
        gha0 gha0Var = (gha0) obj;
        return wj50.m88271j(this.f79862a, gha0Var.f79862a) && wj50.m88271j(this.f79863b, gha0Var.f79863b) && wj50.m88271j(this.f79864c, gha0Var.f79864c);
    }

    public final int hashCode() {
        return this.f79864c.hashCode() + p1v.m68853j(this.f79862a.hashCode() * 31, this.f79863b, 31);
    }
}
