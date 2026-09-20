package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s801 implements t801 {

    /* JADX INFO: renamed from: a */
    public final String f206508a;

    /* JADX INFO: renamed from: b */
    public final d850 f206509b;

    public s801(String str, d850 d850Var) {
        this.f206508a = str;
        this.f206509b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s801)) {
            return false;
        }
        s801 s801Var = (s801) obj;
        return wj50.m88271j(this.f206508a, s801Var.f206508a) && wj50.m88271j(this.f206509b, s801Var.f206509b);
    }

    public final int hashCode() {
        int iHashCode = this.f206508a.hashCode() * 31;
        d850 d850Var = this.f206509b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
