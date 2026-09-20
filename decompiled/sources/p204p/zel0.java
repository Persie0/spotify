package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zel0 {

    /* JADX INFO: renamed from: a */
    public final String f282050a;

    /* JADX INFO: renamed from: b */
    public final d850 f282051b;

    public zel0(String str, d850 d850Var) {
        this.f282050a = str;
        this.f282051b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zel0)) {
            return false;
        }
        zel0 zel0Var = (zel0) obj;
        return wj50.m88271j(this.f282050a, zel0Var.f282050a) && wj50.m88271j(this.f282051b, zel0Var.f282051b);
    }

    public final int hashCode() {
        int iHashCode = this.f282050a.hashCode() * 31;
        d850 d850Var = this.f282051b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
