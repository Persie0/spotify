package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class d561 {

    /* JADX INFO: renamed from: a */
    public final String f45350a;

    /* JADX INFO: renamed from: b */
    public final String f45351b;

    /* JADX INFO: renamed from: c */
    public final boolean f45352c;

    /* JADX INFO: renamed from: d */
    public final String f45353d;

    /* JADX INFO: renamed from: e */
    public final String f45354e;

    /* JADX INFO: renamed from: f */
    public final ok11 f45355f;

    /* JADX INFO: renamed from: g */
    public final he7 f45356g;

    public d561(String str, String str2, boolean z, String str3, String str4, ok11 ok11Var, he7 he7Var) {
        this.f45350a = str;
        this.f45351b = str2;
        this.f45352c = z;
        this.f45353d = str3;
        this.f45354e = str4;
        this.f45355f = ok11Var;
        this.f45356g = he7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d561)) {
            return false;
        }
        d561 d561Var = (d561) obj;
        return wj50.m88271j(this.f45350a, d561Var.f45350a) && wj50.m88271j(this.f45351b, d561Var.f45351b) && this.f45352c == d561Var.f45352c && wj50.m88271j(this.f45353d, d561Var.f45353d) && wj50.m88271j(this.f45354e, d561Var.f45354e) && wj50.m88271j(this.f45355f, d561Var.f45355f) && wj50.m88271j(this.f45356g, d561Var.f45356g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77245d(s571.m77243b(this.f45350a.hashCode() * 31, 31, this.f45351b), 31, this.f45352c), 31, this.f45353d);
        String str = this.f45354e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        ok11 ok11Var = this.f45355f;
        int iHashCode2 = (iHashCode + (ok11Var == null ? 0 : ok11Var.hashCode())) * 31;
        he7 he7Var = this.f45356g;
        return iHashCode2 + (he7Var != null ? he7Var.f90337a.hashCode() : 0);
    }
}
