package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s06 {

    /* JADX INFO: renamed from: a */
    public final String f204309a;

    /* JADX INFO: renamed from: b */
    public final String f204310b;

    /* JADX INFO: renamed from: c */
    public final String f204311c;

    public s06(String str, String str2, String str3) {
        this.f204309a = str;
        this.f204310b = str2;
        this.f204311c = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m76853a() {
        return this.f204311c;
    }

    /* JADX INFO: renamed from: b */
    public final String m76854b() {
        return this.f204310b;
    }

    /* JADX INFO: renamed from: c */
    public final String m76855c() {
        return this.f204309a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s06)) {
            return false;
        }
        s06 s06Var = (s06) obj;
        return wj50.m88271j(this.f204309a, s06Var.f204309a) && wj50.m88271j(this.f204310b, s06Var.f204310b) && wj50.m88271j(this.f204311c, s06Var.f204311c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f204309a.hashCode() * 31, 31, this.f204310b);
        String str = this.f204311c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
