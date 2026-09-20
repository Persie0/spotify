package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ygs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final String f272632a;

    /* JADX INFO: renamed from: b */
    public final String f272633b;

    /* JADX INFO: renamed from: c */
    public final long f272634c;

    /* JADX INFO: renamed from: d */
    public final boolean f272635d;

    public ygs0(String str, String str2, long j, boolean z) {
        this.f272632a = str;
        this.f272633b = str2;
        this.f272634c = j;
        this.f272635d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygs0)) {
            return false;
        }
        ygs0 ygs0Var = (ygs0) obj;
        return this.f272632a.equals(ygs0Var.f272632a) && this.f272633b.equals(ygs0Var.f272633b) && this.f272634c == ygs0Var.f272634c && this.f272635d == ygs0Var.f272635d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f272635d) + dq60.m36605e(s571.m77243b(this.f272632a.hashCode() * 31, 31, this.f272633b), this.f272634c, 31);
    }
}
