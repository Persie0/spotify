package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class bu11 {

    /* JADX INFO: renamed from: a */
    public final lu11 f30984a;

    /* JADX INFO: renamed from: b */
    public final String f30985b;

    /* JADX INFO: renamed from: c */
    public final String f30986c;

    /* JADX INFO: renamed from: d */
    public final String f30987d;

    /* JADX INFO: renamed from: e */
    public final f5u f30988e;

    /* JADX INFO: renamed from: f */
    public final stf f30989f;

    /* JADX INFO: renamed from: g */
    public final int f30990g;

    /* JADX INFO: renamed from: h */
    public final int f30991h;

    /* JADX INFO: renamed from: i */
    public final String f30992i;

    public bu11(lu11 lu11Var, String str, String str2, String str3, f5u f5uVar, stf stfVar, int i, int i2, String str4) {
        this.f30984a = lu11Var;
        this.f30985b = str;
        this.f30986c = str2;
        this.f30987d = str3;
        this.f30988e = f5uVar;
        this.f30989f = stfVar;
        this.f30990g = i;
        this.f30991h = i2;
        this.f30992i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu11)) {
            return false;
        }
        bu11 bu11Var = (bu11) obj;
        return this.f30984a.equals(bu11Var.f30984a) && wj50.m88271j(this.f30985b, bu11Var.f30985b) && wj50.m88271j(this.f30986c, bu11Var.f30986c) && wj50.m88271j(this.f30987d, bu11Var.f30987d) && this.f30988e.equals(bu11Var.f30988e) && wj50.m88271j(this.f30989f, bu11Var.f30989f) && this.f30990g == bu11Var.f30990g && this.f30991h == bu11Var.f30991h && wj50.m88271j(this.f30992i, bu11Var.f30992i);
    }

    public final int hashCode() {
        int iHashCode = (this.f30988e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f30984a.hashCode() * 31, 31, this.f30985b), 31, this.f30986c), 31, this.f30987d)) * 31;
        stf stfVar = this.f30989f;
        int iM40938f = f710.m40938f(this.f30991h, f710.m40938f(this.f30990g, (iHashCode + (stfVar == null ? 0 : stfVar.hashCode())) * 31, 31), 31);
        String str = this.f30992i;
        return iM40938f + (str != null ? str.hashCode() : 0);
    }
}
