package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jdc1 {

    /* JADX INFO: renamed from: a */
    public final String f111326a;

    /* JADX INFO: renamed from: b */
    public final String f111327b;

    /* JADX INFO: renamed from: c */
    public final rcm0 f111328c;

    public jdc1(String str, String str2, rcm0 rcm0Var) {
        this.f111326a = str;
        this.f111327b = str2;
        this.f111328c = rcm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdc1)) {
            return false;
        }
        jdc1 jdc1Var = (jdc1) obj;
        return wj50.m88271j(this.f111326a, jdc1Var.f111326a) && wj50.m88271j(this.f111327b, jdc1Var.f111327b) && wj50.m88271j(this.f111328c, jdc1Var.f111328c);
    }

    public final int hashCode() {
        return this.f111328c.hashCode() + s571.m77243b(this.f111326a.hashCode() * 31, 31, this.f111327b);
    }
}
