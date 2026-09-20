package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class jv41 {

    /* JADX INFO: renamed from: a */
    public final boolean f116253a;

    /* JADX INFO: renamed from: b */
    public final String f116254b;

    /* JADX INFO: renamed from: c */
    public final String f116255c;

    /* JADX INFO: renamed from: d */
    public final String f116256d;

    /* JADX INFO: renamed from: e */
    public final String f116257e;

    /* JADX INFO: renamed from: f */
    public final int f116258f;

    /* JADX INFO: renamed from: g */
    public final boolean f116259g;

    public jv41(int i, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f116253a = z;
        this.f116254b = str;
        this.f116255c = str2;
        this.f116256d = str3;
        this.f116257e = str4;
        this.f116258f = i;
        this.f116259g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv41)) {
            return false;
        }
        jv41 jv41Var = (jv41) obj;
        return this.f116253a == jv41Var.f116253a && wj50.m88271j(this.f116254b, jv41Var.f116254b) && wj50.m88271j(this.f116255c, jv41Var.f116255c) && this.f116256d.equals(jv41Var.f116256d) && wj50.m88271j(this.f116257e, jv41Var.f116257e) && this.f116258f == jv41Var.f116258f && this.f116259g == jv41Var.f116259g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(Boolean.hashCode(this.f116253a) * 31, 31, this.f116254b), 31, this.f116255c), 31, this.f116256d);
        String str = this.f116257e;
        return Boolean.hashCode(this.f116259g) + f710.m40938f(this.f116258f, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
