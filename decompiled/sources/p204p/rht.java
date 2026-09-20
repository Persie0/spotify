package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rht {

    /* JADX INFO: renamed from: a */
    public final String f199339a;

    /* JADX INFO: renamed from: b */
    public final d850 f199340b;

    public rht(String str, d850 d850Var) {
        this.f199339a = str;
        this.f199340b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rht)) {
            return false;
        }
        rht rhtVar = (rht) obj;
        return wj50.m88271j(this.f199339a, rhtVar.f199339a) && wj50.m88271j(this.f199340b, rhtVar.f199340b);
    }

    public final int hashCode() {
        int iHashCode = this.f199339a.hashCode() * 31;
        d850 d850Var = this.f199340b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
