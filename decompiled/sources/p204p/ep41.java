package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ep41 implements n05 {

    /* JADX INFO: renamed from: a */
    public final n05 f61545a;

    /* JADX INFO: renamed from: b */
    public final long f61546b;

    public ep41(n05 n05Var, long j) {
        this.f61545a = n05Var;
        this.f61546b = j;
    }

    @Override // p204p.n05
    /* JADX INFO: renamed from: a */
    public final g5b1 mo31113a(tm91 tm91Var) {
        return new fp41(this.f61545a.mo31113a(tm91Var), this.f61546b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ep41)) {
            return false;
        }
        ep41 ep41Var = (ep41) obj;
        return ep41Var.f61546b == this.f61546b && wj50.m88271j(ep41Var.f61545a, this.f61545a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f61546b) + (this.f61545a.hashCode() * 31);
    }
}
