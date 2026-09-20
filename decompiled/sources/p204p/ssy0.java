package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ssy0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final v0z0 f213737a;

    /* JADX INFO: renamed from: b */
    public final d850 f213738b;

    public ssy0(v0z0 v0z0Var, d850 d850Var) {
        this.f213737a = v0z0Var;
        this.f213738b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssy0)) {
            return false;
        }
        ssy0 ssy0Var = (ssy0) obj;
        return wj50.m88271j(this.f213737a, ssy0Var.f213737a) && wj50.m88271j(this.f213738b, ssy0Var.f213738b);
    }

    public final int hashCode() {
        int iHashCode = this.f213737a.hashCode() * 31;
        d850 d850Var = this.f213738b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
