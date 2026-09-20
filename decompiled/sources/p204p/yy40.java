package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yy40 {

    /* JADX INFO: renamed from: a */
    public final String f277401a;

    /* JADX INFO: renamed from: b */
    public final d850 f277402b;

    public yy40(String str, d850 d850Var) {
        this.f277401a = str;
        this.f277402b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy40)) {
            return false;
        }
        yy40 yy40Var = (yy40) obj;
        return wj50.m88271j(this.f277401a, yy40Var.f277401a) && wj50.m88271j(this.f277402b, yy40Var.f277402b);
    }

    public final int hashCode() {
        int iHashCode = this.f277401a.hashCode() * 31;
        d850 d850Var = this.f277402b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
