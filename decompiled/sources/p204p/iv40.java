package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class iv40 implements mv40 {

    /* JADX INFO: renamed from: a */
    public final String f106116a;

    /* JADX INFO: renamed from: b */
    public final d850 f106117b;

    public iv40(String str, d850 d850Var) {
        this.f106116a = str;
        this.f106117b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv40)) {
            return false;
        }
        iv40 iv40Var = (iv40) obj;
        return wj50.m88271j(this.f106116a, iv40Var.f106116a) && wj50.m88271j(this.f106117b, iv40Var.f106117b);
    }

    public final int hashCode() {
        int iHashCode = this.f106116a.hashCode() * 31;
        d850 d850Var = this.f106117b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
