package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ow8 {

    /* JADX INFO: renamed from: a */
    public final cw8 f170667a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f170668b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f170669c;

    public ow8(fw8 fw8Var, i4t0 i4t0Var, i4t0 i4t0Var2) {
        this.f170667a = fw8Var;
        this.f170668b = i4t0Var;
        this.f170669c = i4t0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow8)) {
            return false;
        }
        ow8 ow8Var = (ow8) obj;
        return wj50.m88271j(this.f170667a, ow8Var.f170667a) && wj50.m88271j(this.f170668b, ow8Var.f170668b) && wj50.m88271j(this.f170669c, ow8Var.f170669c);
    }

    public final int hashCode() {
        return this.f170669c.hashCode() + ((this.f170668b.hashCode() + (this.f170667a.hashCode() * 31)) * 31);
    }
}
