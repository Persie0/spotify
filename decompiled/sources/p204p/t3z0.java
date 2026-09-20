package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class t3z0 extends w3z0 {

    /* JADX INFO: renamed from: d */
    public final String f216865d;

    /* JADX INFO: renamed from: e */
    public final String f216866e;

    /* JADX INFO: renamed from: f */
    public final d850 f216867f;

    /* JADX INFO: renamed from: g */
    public final s0z0 f216868g;

    public t3z0(String str, String str2, d850 d850Var, s0z0 s0z0Var) {
        this.f216865d = str;
        this.f216866e = str2;
        this.f216867f = d850Var;
        this.f216868g = s0z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3z0)) {
            return false;
        }
        t3z0 t3z0Var = (t3z0) obj;
        return wj50.m88271j(this.f216865d, t3z0Var.f216865d) && wj50.m88271j(this.f216866e, t3z0Var.f216866e) && wj50.m88271j(this.f216867f, t3z0Var.f216867f) && wj50.m88271j(this.f216868g, t3z0Var.f216868g);
    }

    public final int hashCode() {
        int iHashCode = this.f216865d.hashCode() * 31;
        String str = this.f216866e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        d850 d850Var = this.f216867f;
        return this.f216868g.hashCode() + ((iHashCode2 + (d850Var != null ? d850Var.hashCode() : 0)) * 31);
    }
}
