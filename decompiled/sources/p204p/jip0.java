package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jip0 {

    /* JADX INFO: renamed from: a */
    public final String f112806a;

    /* JADX INFO: renamed from: b */
    public final String f112807b;

    /* JADX INFO: renamed from: c */
    public final String f112808c;

    /* JADX INFO: renamed from: d */
    public final int f112809d;

    /* JADX INFO: renamed from: e */
    public final int f112810e;

    public jip0(int i, int i2, String str, String str2, String str3) {
        this.f112806a = str;
        this.f112807b = str2;
        this.f112808c = str3;
        this.f112809d = i;
        this.f112810e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jip0)) {
            return false;
        }
        jip0 jip0Var = (jip0) obj;
        return wj50.m88271j(this.f112806a, jip0Var.f112806a) && wj50.m88271j(this.f112807b, jip0Var.f112807b) && wj50.m88271j(this.f112808c, jip0Var.f112808c) && this.f112809d == jip0Var.f112809d && this.f112810e == jip0Var.f112810e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f112806a.hashCode() * 31, 31, this.f112807b);
        String str = this.f112808c;
        return Integer.hashCode(this.f112810e) + f710.m40938f(this.f112809d, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
