package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class p16 {

    /* JADX INFO: renamed from: a */
    public final String f172956a;

    /* JADX INFO: renamed from: b */
    public final String f172957b;

    /* JADX INFO: renamed from: c */
    public final String f172958c;

    public p16(String str, String str2, String str3) {
        this.f172956a = str;
        this.f172957b = str2;
        this.f172958c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p16)) {
            return false;
        }
        p16 p16Var = (p16) obj;
        return wj50.m88271j(this.f172956a, p16Var.f172956a) && wj50.m88271j(this.f172957b, p16Var.f172957b) && wj50.m88271j(this.f172958c, p16Var.f172958c);
    }

    public final int hashCode() {
        return this.f172958c.hashCode() + s571.m77243b(this.f172956a.hashCode() * 31, 31, this.f172957b);
    }
}
