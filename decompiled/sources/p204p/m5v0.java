package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m5v0 extends gwg1 {

    /* JADX INFO: renamed from: b */
    public final String f140292b;

    /* JADX INFO: renamed from: c */
    public final d850 f140293c;

    public m5v0(String str, d850 d850Var) {
        this.f140292b = str;
        this.f140293c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5v0)) {
            return false;
        }
        m5v0 m5v0Var = (m5v0) obj;
        return wj50.m88271j(this.f140292b, m5v0Var.f140292b) && wj50.m88271j(this.f140293c, m5v0Var.f140293c);
    }

    public final int hashCode() {
        int iHashCode = this.f140292b.hashCode() * 31;
        d850 d850Var = this.f140293c;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
