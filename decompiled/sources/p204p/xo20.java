package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xo20 implements zo20 {

    /* JADX INFO: renamed from: a */
    public final hp20 f263747a;

    /* JADX INFO: renamed from: b */
    public final a6z f263748b;

    public xo20(hp20 hp20Var, a6z a6zVar) {
        this.f263747a = hp20Var;
        this.f263748b = a6zVar;
    }

    @Override // p204p.zo20
    /* JADX INFO: renamed from: a */
    public final jp20 mo91521a() {
        return this.f263747a;
    }

    @Override // p204p.zo20
    /* JADX INFO: renamed from: b */
    public final a6z mo91522b() {
        return this.f263748b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo20)) {
            return false;
        }
        xo20 xo20Var = (xo20) obj;
        return wj50.m88271j(this.f263747a, xo20Var.f263747a) && wj50.m88271j(this.f263748b, xo20Var.f263748b);
    }

    public final int hashCode() {
        return this.f263748b.hashCode() + (this.f263747a.hashCode() * 31);
    }
}
