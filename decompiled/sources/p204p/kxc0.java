package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kxc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final String f127451a;

    /* JADX INFO: renamed from: b */
    public final d850 f127452b;

    public kxc0(String str, d850 d850Var) {
        this.f127451a = str;
        this.f127452b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxc0)) {
            return false;
        }
        kxc0 kxc0Var = (kxc0) obj;
        return wj50.m88271j(this.f127451a, kxc0Var.f127451a) && wj50.m88271j(this.f127452b, kxc0Var.f127452b);
    }

    public final int hashCode() {
        int iHashCode = this.f127451a.hashCode() * 31;
        d850 d850Var = this.f127452b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
