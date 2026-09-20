package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qkf implements bmf {

    /* JADX INFO: renamed from: a */
    public final hp7 f189545a;

    /* JADX INFO: renamed from: b */
    public final d850 f189546b;

    public qkf(hp7 hp7Var, d850 d850Var) {
        this.f189545a = hp7Var;
        this.f189546b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkf)) {
            return false;
        }
        qkf qkfVar = (qkf) obj;
        return wj50.m88271j(this.f189545a, qkfVar.f189545a) && wj50.m88271j(this.f189546b, qkfVar.f189546b);
    }

    public final int hashCode() {
        int iHashCode = this.f189545a.hashCode() * 31;
        d850 d850Var = this.f189546b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
