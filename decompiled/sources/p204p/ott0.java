package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ott0 {

    /* JADX INFO: renamed from: a */
    public final na01 f170097a;

    /* JADX INFO: renamed from: b */
    public final wwu f170098b;

    public ott0(na01 na01Var, wwu wwuVar) {
        this.f170097a = na01Var;
        this.f170098b = wwuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ott0)) {
            return false;
        }
        ott0 ott0Var = (ott0) obj;
        return wj50.m88271j(this.f170097a, ott0Var.f170097a) && wj50.m88271j(this.f170098b, ott0Var.f170098b);
    }

    public final int hashCode() {
        return this.f170098b.hashCode() + (this.f170097a.hashCode() * 31);
    }
}
