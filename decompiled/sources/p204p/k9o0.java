package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class k9o0 {

    /* JADX INFO: renamed from: a */
    public final h9o0 f120627a;

    /* JADX INFO: renamed from: b */
    public final String f120628b;

    /* JADX INFO: renamed from: c */
    public final String f120629c;

    /* JADX INFO: renamed from: d */
    public final String f120630d;

    /* JADX INFO: renamed from: e */
    public final boolean f120631e;

    public k9o0(String str, String str2, String str3, h9o0 h9o0Var, boolean z) {
        this.f120627a = h9o0Var;
        this.f120628b = str;
        this.f120629c = str2;
        this.f120630d = str3;
        this.f120631e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9o0)) {
            return false;
        }
        k9o0 k9o0Var = (k9o0) obj;
        return wj50.m88271j(this.f120627a, k9o0Var.f120627a) && wj50.m88271j(this.f120628b, k9o0Var.f120628b) && wj50.m88271j(this.f120629c, k9o0Var.f120629c) && wj50.m88271j(this.f120630d, k9o0Var.f120630d) && this.f120631e == k9o0Var.f120631e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f120627a.hashCode() * 31, 31, this.f120628b);
        String str = this.f120629c;
        return Boolean.hashCode(this.f120631e) + s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f120630d);
    }
}
