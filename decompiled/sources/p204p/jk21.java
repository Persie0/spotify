package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jk21 {

    /* JADX INFO: renamed from: a */
    public final boolean f113189a;

    /* JADX INFO: renamed from: b */
    public final int f113190b;

    /* JADX INFO: renamed from: c */
    public final boolean f113191c;

    /* JADX INFO: renamed from: d */
    public final long f113192d;

    public jk21(int i, long j, boolean z, boolean z2) {
        this.f113189a = z;
        this.f113190b = i;
        this.f113191c = z2;
        this.f113192d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk21)) {
            return false;
        }
        jk21 jk21Var = (jk21) obj;
        return this.f113189a == jk21Var.f113189a && this.f113190b == jk21Var.f113190b && this.f113191c == jk21Var.f113191c && this.f113192d == jk21Var.f113192d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f113192d) + s571.m77245d(f710.m40938f(this.f113190b, Boolean.hashCode(this.f113189a) * 31, 31), 31, this.f113191c);
    }
}
