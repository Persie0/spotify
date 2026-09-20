package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class tfn0 {

    /* JADX INFO: renamed from: a */
    public final String f220023a;

    /* JADX INFO: renamed from: b */
    public final String f220024b;

    /* JADX INFO: renamed from: c */
    public final boolean f220025c;

    /* JADX INFO: renamed from: d */
    public final String f220026d;

    /* JADX INFO: renamed from: e */
    public final String f220027e;

    /* JADX INFO: renamed from: f */
    public final ok11 f220028f;

    /* JADX INFO: renamed from: g */
    public final tu00 f220029g;

    public tfn0(String str, String str2, boolean z, String str3, String str4, ok11 ok11Var, tu00 tu00Var) {
        this.f220023a = str;
        this.f220024b = str2;
        this.f220025c = z;
        this.f220026d = str3;
        this.f220027e = str4;
        this.f220028f = ok11Var;
        this.f220029g = tu00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfn0)) {
            return false;
        }
        tfn0 tfn0Var = (tfn0) obj;
        return wj50.m88271j(this.f220023a, tfn0Var.f220023a) && wj50.m88271j(this.f220024b, tfn0Var.f220024b) && this.f220025c == tfn0Var.f220025c && wj50.m88271j(this.f220026d, tfn0Var.f220026d) && wj50.m88271j(this.f220027e, tfn0Var.f220027e) && wj50.m88271j(this.f220028f, tfn0Var.f220028f) && wj50.m88271j(this.f220029g, tfn0Var.f220029g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77245d(s571.m77243b(this.f220023a.hashCode() * 31, 31, this.f220024b), 31, this.f220025c), 31, this.f220026d);
        String str = this.f220027e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        ok11 ok11Var = this.f220028f;
        int iHashCode2 = (iHashCode + (ok11Var == null ? 0 : ok11Var.hashCode())) * 31;
        tu00 tu00Var = this.f220029g;
        return iHashCode2 + (tu00Var != null ? tu00Var.f223736a.hashCode() : 0);
    }
}
