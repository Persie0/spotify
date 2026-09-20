package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d7t0 {

    /* JADX INFO: renamed from: a */
    public final String f46268a;

    /* JADX INFO: renamed from: b */
    public final String f46269b;

    /* JADX INFO: renamed from: c */
    public final int f46270c;

    /* JADX INFO: renamed from: d */
    public final boolean f46271d;

    /* JADX INFO: renamed from: e */
    public final String f46272e;

    public d7t0(int i, String str, String str2, boolean z, String str3) {
        this.f46268a = str;
        this.f46269b = str2;
        this.f46270c = i;
        this.f46271d = z;
        this.f46272e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7t0)) {
            return false;
        }
        d7t0 d7t0Var = (d7t0) obj;
        return wj50.m88271j(this.f46268a, d7t0Var.f46268a) && wj50.m88271j(this.f46269b, d7t0Var.f46269b) && this.f46270c == d7t0Var.f46270c && this.f46271d == d7t0Var.f46271d && wj50.m88271j(this.f46272e, d7t0Var.f46272e);
    }

    public final int hashCode() {
        return this.f46272e.hashCode() + s571.m77245d(mt60.m62800g(this.f46270c, s571.m77243b(this.f46268a.hashCode() * 31, 31, this.f46269b), 31), 31, this.f46271d);
    }
}
