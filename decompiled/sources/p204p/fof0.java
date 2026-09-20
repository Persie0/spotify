package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fof0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final String f71525a;

    /* JADX INFO: renamed from: b */
    public final d850 f71526b;

    public fof0(String str, d850 d850Var) {
        this.f71525a = str;
        this.f71526b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fof0)) {
            return false;
        }
        fof0 fof0Var = (fof0) obj;
        return wj50.m88271j(this.f71525a, fof0Var.f71525a) && wj50.m88271j(this.f71526b, fof0Var.f71526b);
    }

    public final int hashCode() {
        int iHashCode = this.f71525a.hashCode() * 31;
        d850 d850Var = this.f71526b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
