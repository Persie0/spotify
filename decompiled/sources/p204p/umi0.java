package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class umi0 {

    /* JADX INFO: renamed from: a */
    public final smi0 f231871a;

    /* JADX INFO: renamed from: b */
    public final v1p0 f231872b;

    public umi0(smi0 smi0Var, v1p0 v1p0Var) {
        this.f231871a = smi0Var;
        this.f231872b = v1p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umi0)) {
            return false;
        }
        umi0 umi0Var = (umi0) obj;
        return wj50.m88271j(this.f231871a, umi0Var.f231871a) && wj50.m88271j(this.f231872b, umi0Var.f231872b);
    }

    public final int hashCode() {
        return this.f231872b.hashCode() + (this.f231871a.hashCode() * 31);
    }
}
