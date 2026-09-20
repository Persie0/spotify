package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xk70 implements al70 {

    /* JADX INFO: renamed from: a */
    public final String f262293a;

    /* JADX INFO: renamed from: b */
    public final String f262294b;

    /* JADX INFO: renamed from: c */
    public final String f262295c;

    /* JADX INFO: renamed from: d */
    public final d850 f262296d;

    public xk70(String str, String str2, String str3, d850 d850Var) {
        this.f262293a = str;
        this.f262294b = str2;
        this.f262295c = str3;
        this.f262296d = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk70)) {
            return false;
        }
        xk70 xk70Var = (xk70) obj;
        return wj50.m88271j(this.f262293a, xk70Var.f262293a) && wj50.m88271j(this.f262294b, xk70Var.f262294b) && wj50.m88271j(this.f262295c, xk70Var.f262295c) && wj50.m88271j(this.f262296d, xk70Var.f262296d);
    }

    public final int hashCode() {
        int iHashCode = this.f262293a.hashCode() * 31;
        String str = this.f262294b;
        int iM77243b = s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f262295c);
        d850 d850Var = this.f262296d;
        return iM77243b + (d850Var != null ? d850Var.hashCode() : 0);
    }
}
