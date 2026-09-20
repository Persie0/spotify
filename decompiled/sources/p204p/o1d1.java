package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class o1d1 implements s1d1 {

    /* JADX INFO: renamed from: a */
    public final String f160699a;

    /* JADX INFO: renamed from: b */
    public final String f160700b;

    /* JADX INFO: renamed from: c */
    public final String f160701c;

    /* JADX INFO: renamed from: d */
    public final r1d1 f160702d;

    /* JADX INFO: renamed from: e */
    public final q1d1 f160703e;

    /* JADX INFO: renamed from: f */
    public final int f160704f;

    /* JADX INFO: renamed from: g */
    public final String f160705g;

    /* JADX INFO: renamed from: h */
    public final String f160706h;

    public o1d1(String str, String str2, String str3, r1d1 r1d1Var, q1d1 q1d1Var, int i, String str4, String str5, int i2) {
        str4 = (i2 & 64) != 0 ? null : str4;
        str5 = (i2 & 128) != 0 ? "" : str5;
        this.f160699a = str;
        this.f160700b = str2;
        this.f160701c = str3;
        this.f160702d = r1d1Var;
        this.f160703e = q1d1Var;
        this.f160704f = i;
        this.f160705g = str4;
        this.f160706h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1d1)) {
            return false;
        }
        o1d1 o1d1Var = (o1d1) obj;
        return wj50.m88271j(this.f160699a, o1d1Var.f160699a) && wj50.m88271j(this.f160700b, o1d1Var.f160700b) && wj50.m88271j(this.f160701c, o1d1Var.f160701c) && this.f160702d.equals(o1d1Var.f160702d) && wj50.m88271j(this.f160703e, o1d1Var.f160703e) && this.f160704f == o1d1Var.f160704f && wj50.m88271j(this.f160705g, o1d1Var.f160705g) && wj50.m88271j(this.f160706h, o1d1Var.f160706h);
    }

    @Override // p204p.s1d1
    public final int getType() {
        return this.f160704f;
    }

    public final int hashCode() {
        int iHashCode = (this.f160702d.hashCode() + s571.m77243b(s571.m77243b(this.f160699a.hashCode() * 31, 31, this.f160700b), 31, this.f160701c)) * 31;
        q1d1 q1d1Var = this.f160703e;
        int iM40938f = f710.m40938f(this.f160704f, (iHashCode + (q1d1Var == null ? 0 : q1d1Var.hashCode())) * 31, 31);
        String str = this.f160705g;
        return this.f160706h.hashCode() + ((iM40938f + (str != null ? str.hashCode() : 0)) * 31);
    }
}
