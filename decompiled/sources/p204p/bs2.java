package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bs2 extends ds2 {

    /* JADX INFO: renamed from: a */
    public final String f30214a;

    /* JADX INFO: renamed from: b */
    public final d850 f30215b;

    public bs2(String str, d850 d850Var) {
        this.f30214a = str;
        this.f30215b = d850Var;
    }

    @Override // p204p.ds2
    /* JADX INFO: renamed from: a */
    public final String mo30342a() {
        return this.f30214a;
    }

    /* JADX INFO: renamed from: b */
    public final d850 m30343b() {
        return this.f30215b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs2)) {
            return false;
        }
        bs2 bs2Var = (bs2) obj;
        return wj50.m88271j(this.f30214a, bs2Var.f30214a) && wj50.m88271j(this.f30215b, bs2Var.f30215b);
    }

    public final int hashCode() {
        int iHashCode = this.f30214a.hashCode() * 31;
        d850 d850Var = this.f30215b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
