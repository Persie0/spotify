package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hao0 {

    /* JADX INFO: renamed from: a */
    public final String f89259a;

    /* JADX INFO: renamed from: b */
    public final d850 f89260b;

    public hao0(String str, d850 d850Var) {
        this.f89259a = str;
        this.f89260b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hao0)) {
            return false;
        }
        hao0 hao0Var = (hao0) obj;
        return wj50.m88271j(this.f89259a, hao0Var.f89259a) && wj50.m88271j(this.f89260b, hao0Var.f89260b);
    }

    public final int hashCode() {
        int iHashCode = this.f89259a.hashCode() * 31;
        d850 d850Var = this.f89260b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
