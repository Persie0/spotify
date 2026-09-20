package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class euh0 {

    /* JADX INFO: renamed from: a */
    public final Object f62982a;

    /* JADX INFO: renamed from: b */
    public final int f62983b;

    public euh0(pqm0 pqm0Var, int i) {
        this.f62982a = pqm0Var;
        this.f62983b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euh0)) {
            return false;
        }
        euh0 euh0Var = (euh0) obj;
        return wj50.m88271j(this.f62982a, euh0Var.f62982a) && this.f62983b == euh0Var.f62983b;
    }

    public final int hashCode() {
        Object obj = this.f62982a;
        return Integer.hashCode(this.f62983b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
