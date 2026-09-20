package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s1s0 {

    /* JADX INFO: renamed from: a */
    public final String f204786a;

    /* JADX INFO: renamed from: b */
    public final String f204787b;

    /* JADX INFO: renamed from: c */
    public final String f204788c;

    /* JADX INFO: renamed from: d */
    public final boolean f204789d;

    public s1s0(String str, String str2, String str3, boolean z) {
        this.f204786a = str;
        this.f204787b = str2;
        this.f204788c = str3;
        this.f204789d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1s0)) {
            return false;
        }
        s1s0 s1s0Var = (s1s0) obj;
        return wj50.m88271j(this.f204786a, s1s0Var.f204786a) && wj50.m88271j(this.f204787b, s1s0Var.f204787b) && wj50.m88271j(this.f204788c, s1s0Var.f204788c) && this.f204789d == s1s0Var.f204789d;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f204786a.hashCode() * 31, 31, this.f204787b);
        String str = this.f204788c;
        return Boolean.hashCode(this.f204789d) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
