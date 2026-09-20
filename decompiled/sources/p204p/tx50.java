package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class tx50 {

    /* JADX INFO: renamed from: a */
    public final String f224565a;

    /* JADX INFO: renamed from: b */
    public final String f224566b;

    /* JADX INFO: renamed from: c */
    public final String f224567c;

    /* JADX INFO: renamed from: d */
    public final String f224568d;

    /* JADX INFO: renamed from: e */
    public final boolean f224569e;

    /* JADX INFO: renamed from: f */
    public final boolean f224570f;

    /* JADX INFO: renamed from: g */
    public final boolean f224571g;

    public tx50(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.f224565a = str;
        this.f224566b = str2;
        this.f224567c = str3;
        this.f224568d = str4;
        this.f224569e = z;
        this.f224570f = z2;
        this.f224571g = z3;
    }

    /* JADX INFO: renamed from: a */
    public static tx50 m81879a(tx50 tx50Var, String str, String str2) {
        String str3 = tx50Var.f224565a;
        String str4 = tx50Var.f224567c;
        boolean z = tx50Var.f224569e;
        boolean z2 = tx50Var.f224570f;
        boolean z3 = tx50Var.f224571g;
        tx50Var.getClass();
        return new tx50(str3, str, str4, str2, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx50)) {
            return false;
        }
        tx50 tx50Var = (tx50) obj;
        return wj50.m88271j(this.f224565a, tx50Var.f224565a) && wj50.m88271j(this.f224566b, tx50Var.f224566b) && wj50.m88271j(this.f224567c, tx50Var.f224567c) && wj50.m88271j(this.f224568d, tx50Var.f224568d) && this.f224569e == tx50Var.f224569e && this.f224570f == tx50Var.f224570f && this.f224571g == tx50Var.f224571g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f224565a.hashCode() * 31, 31, this.f224566b), 31, this.f224567c);
        String str = this.f224568d;
        return Boolean.hashCode(this.f224571g) + s571.m77245d(s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f224569e), 31, this.f224570f);
    }
}
