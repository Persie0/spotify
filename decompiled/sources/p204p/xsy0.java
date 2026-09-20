package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xsy0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final wfz f265688a;

    /* JADX INFO: renamed from: b */
    public final d850 f265689b;

    public xsy0(wfz wfzVar, d850 d850Var) {
        this.f265688a = wfzVar;
        this.f265689b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsy0)) {
            return false;
        }
        xsy0 xsy0Var = (xsy0) obj;
        return wj50.m88271j(this.f265688a, xsy0Var.f265688a) && wj50.m88271j(this.f265689b, xsy0Var.f265689b);
    }

    public final int hashCode() {
        int iHashCode = this.f265688a.hashCode() * 31;
        d850 d850Var = this.f265689b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
