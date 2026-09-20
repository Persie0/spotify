package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kk70 {

    /* JADX INFO: renamed from: a */
    public final String f123521a;

    /* JADX INFO: renamed from: b */
    public final String f123522b;

    /* JADX INFO: renamed from: c */
    public final String f123523c;

    /* JADX INFO: renamed from: d */
    public final d850 f123524d;

    public kk70(String str, String str2, String str3, d850 d850Var) {
        this.f123521a = str;
        this.f123522b = str2;
        this.f123523c = str3;
        this.f123524d = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk70)) {
            return false;
        }
        kk70 kk70Var = (kk70) obj;
        return wj50.m88271j(this.f123521a, kk70Var.f123521a) && wj50.m88271j(this.f123522b, kk70Var.f123522b) && wj50.m88271j(this.f123523c, kk70Var.f123523c) && wj50.m88271j(this.f123524d, kk70Var.f123524d);
    }

    public final int hashCode() {
        int iHashCode = this.f123521a.hashCode() * 31;
        String str = this.f123522b;
        int iM77243b = s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f123523c);
        d850 d850Var = this.f123524d;
        return iM77243b + (d850Var != null ? d850Var.hashCode() : 0);
    }
}
