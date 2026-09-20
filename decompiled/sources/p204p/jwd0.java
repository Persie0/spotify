package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jwd0 {

    /* JADX INFO: renamed from: a */
    public final String f116626a;

    /* JADX INFO: renamed from: b */
    public final String f116627b;

    /* JADX INFO: renamed from: c */
    public final long f116628c;

    /* JADX INFO: renamed from: d */
    public final long f116629d;

    public jwd0(String str, long j, long j2, String str2) {
        this.f116626a = str;
        this.f116627b = str2;
        this.f116628c = j;
        this.f116629d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwd0)) {
            return false;
        }
        jwd0 jwd0Var = (jwd0) obj;
        return wj50.m88271j(this.f116626a, jwd0Var.f116626a) && wj50.m88271j(this.f116627b, jwd0Var.f116627b) && mu71.m62836c(this.f116628c, jwd0Var.f116628c) && mu71.m62836c(this.f116629d, jwd0Var.f116629d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f116629d) + dq60.m36605e(s571.m77243b(this.f116626a.hashCode() * 31, 31, this.f116627b), this.f116628c, 31);
    }
}
