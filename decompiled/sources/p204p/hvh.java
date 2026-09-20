package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hvh {

    /* JADX INFO: renamed from: a */
    public final String f95715a;

    /* JADX INFO: renamed from: b */
    public final d850 f95716b;

    public hvh(String str, d850 d850Var) {
        this.f95715a = str;
        this.f95716b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvh)) {
            return false;
        }
        hvh hvhVar = (hvh) obj;
        return wj50.m88271j(this.f95715a, hvhVar.f95715a) && wj50.m88271j(this.f95716b, hvhVar.f95716b);
    }

    public final int hashCode() {
        int iHashCode = this.f95715a.hashCode() * 31;
        d850 d850Var = this.f95716b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
