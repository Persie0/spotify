package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sc31 {

    /* JADX INFO: renamed from: a */
    public final rc31 f207642a;

    /* JADX INFO: renamed from: b */
    public final qc31 f207643b;

    public sc31(rc31 rc31Var, qc31 qc31Var) {
        this.f207642a = rc31Var;
        this.f207643b = qc31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc31)) {
            return false;
        }
        sc31 sc31Var = (sc31) obj;
        return wj50.m88271j(this.f207642a, sc31Var.f207642a) && wj50.m88271j(this.f207643b, sc31Var.f207643b);
    }

    public final int hashCode() {
        return (((Boolean.hashCode(true) * 31) + (this.f207642a == null ? 0 : -1534415360)) * 31) + (this.f207643b != null ? 1620797559 : 0);
    }
}
