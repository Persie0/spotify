package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b6v0 extends h6v0 {

    /* JADX INFO: renamed from: a */
    public final String f24052a;

    /* JADX INFO: renamed from: b */
    public final String f24053b;

    /* JADX INFO: renamed from: c */
    public final String f24054c;

    /* JADX INFO: renamed from: d */
    public final c7v0 f24055d;

    /* JADX INFO: renamed from: e */
    public final boolean f24056e;

    public b6v0(String str, String str2, String str3, c7v0 c7v0Var, boolean z) {
        this.f24052a = str;
        this.f24053b = str2;
        this.f24054c = str3;
        this.f24055d = c7v0Var;
        this.f24056e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6v0)) {
            return false;
        }
        b6v0 b6v0Var = (b6v0) obj;
        return wj50.m88271j(this.f24052a, b6v0Var.f24052a) && wj50.m88271j(this.f24053b, b6v0Var.f24053b) && wj50.m88271j(this.f24054c, b6v0Var.f24054c) && wj50.m88271j(this.f24055d, b6v0Var.f24055d) && this.f24056e == b6v0Var.f24056e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f24052a.hashCode() * 31, 31, this.f24053b);
        String str = this.f24054c;
        return Boolean.hashCode(this.f24056e) + ((this.f24055d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
