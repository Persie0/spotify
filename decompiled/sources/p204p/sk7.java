package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class sk7 {

    /* JADX INFO: renamed from: a */
    public final boolean f210044a;

    /* JADX INFO: renamed from: b */
    public final String f210045b;

    /* JADX INFO: renamed from: c */
    public final String f210046c;

    /* JADX INFO: renamed from: d */
    public final rk7 f210047d;

    public sk7(String str, String str2, rk7 rk7Var, boolean z) {
        this.f210044a = z;
        this.f210045b = str;
        this.f210046c = str2;
        this.f210047d = rk7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk7)) {
            return false;
        }
        sk7 sk7Var = (sk7) obj;
        return this.f210044a == sk7Var.f210044a && wj50.m88271j(this.f210045b, sk7Var.f210045b) && wj50.m88271j(this.f210046c, sk7Var.f210046c) && this.f210047d == sk7Var.f210047d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f210044a) * 31;
        String str = this.f210045b;
        return this.f210047d.hashCode() + s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f210046c);
    }
}
