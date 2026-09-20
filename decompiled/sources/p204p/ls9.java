package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ls9 {

    /* JADX INFO: renamed from: a */
    public final ks9 f136475a;

    /* JADX INFO: renamed from: b */
    public final String f136476b;

    /* JADX INFO: renamed from: c */
    public final String f136477c;

    /* JADX INFO: renamed from: d */
    public final boolean f136478d;

    public ls9(ks9 ks9Var, String str, String str2, boolean z) {
        this.f136475a = ks9Var;
        this.f136476b = str;
        this.f136477c = str2;
        this.f136478d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls9)) {
            return false;
        }
        ls9 ls9Var = (ls9) obj;
        return wj50.m88271j(this.f136475a, ls9Var.f136475a) && wj50.m88271j(this.f136476b, ls9Var.f136476b) && wj50.m88271j(this.f136477c, ls9Var.f136477c) && this.f136478d == ls9Var.f136478d;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f136475a.hashCode() * 31, 31, this.f136476b);
        String str = this.f136477c;
        return Boolean.hashCode(this.f136478d) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
