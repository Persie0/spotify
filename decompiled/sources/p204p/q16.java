package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class q16 {

    /* JADX INFO: renamed from: a */
    public final String f184216a;

    /* JADX INFO: renamed from: b */
    public final String f184217b;

    /* JADX INFO: renamed from: c */
    public final String f184218c;

    public q16(String str, String str2, String str3) {
        this.f184216a = str;
        this.f184217b = str2;
        this.f184218c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q16)) {
            return false;
        }
        q16 q16Var = (q16) obj;
        return wj50.m88271j(this.f184216a, q16Var.f184216a) && wj50.m88271j(this.f184217b, q16Var.f184217b) && wj50.m88271j(this.f184218c, q16Var.f184218c);
    }

    public final int hashCode() {
        return this.f184218c.hashCode() + s571.m77243b(this.f184216a.hashCode() * 31, 31, this.f184217b);
    }
}
