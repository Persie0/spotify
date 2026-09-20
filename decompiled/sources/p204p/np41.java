package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class np41 implements rtr {

    /* JADX INFO: renamed from: a */
    public final ro0 f156876a;

    /* JADX INFO: renamed from: b */
    public final int f156877b;

    public np41(ro0 ro0Var, int i) {
        this.f156876a = ro0Var;
        this.f156877b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np41)) {
            return false;
        }
        np41 np41Var = (np41) obj;
        return wj50.m88271j(this.f156876a, np41Var.f156876a) && this.f156877b == np41Var.f156877b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f156877b) + (this.f156876a.hashCode() * 31);
    }
}
