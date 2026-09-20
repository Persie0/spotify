package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class d0u0 {

    /* JADX INFO: renamed from: a */
    public final c0u0 f44053a;

    /* JADX INFO: renamed from: b */
    public final b0u0 f44054b;

    public d0u0(c0u0 c0u0Var, b0u0 b0u0Var) {
        this.f44053a = c0u0Var;
        this.f44054b = b0u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0u0)) {
            return false;
        }
        d0u0 d0u0Var = (d0u0) obj;
        return wj50.m88271j(this.f44053a, d0u0Var.f44053a) && wj50.m88271j(this.f44054b, d0u0Var.f44054b);
    }

    public final int hashCode() {
        return this.f44054b.hashCode() + (this.f44053a.hashCode() * 31);
    }
}
