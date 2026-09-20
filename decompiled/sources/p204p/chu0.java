package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class chu0 implements ehu0 {

    /* JADX INFO: renamed from: a */
    public final pgu0 f38089a;

    /* JADX INFO: renamed from: b */
    public final Throwable f38090b;

    public chu0(pgu0 pgu0Var, Throwable th) {
        this.f38089a = pgu0Var;
        this.f38090b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chu0)) {
            return false;
        }
        chu0 chu0Var = (chu0) obj;
        return wj50.m88271j(this.f38089a, chu0Var.f38089a) && wj50.m88271j(this.f38090b, chu0Var.f38090b);
    }

    public final int hashCode() {
        return this.f38090b.hashCode() + (this.f38089a.hashCode() * 31);
    }
}
