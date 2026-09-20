package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yhz0 implements zhz0 {

    /* JADX INFO: renamed from: a */
    public final String f272999a;

    /* JADX INFO: renamed from: b */
    public final long f273000b;

    /* JADX INFO: renamed from: c */
    public final long f273001c;

    /* JADX INFO: renamed from: d */
    public final boolean f273002d;

    public yhz0(long j, long j2, String str, boolean z) {
        this.f272999a = str;
        this.f273000b = j;
        this.f273001c = j2;
        this.f273002d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhz0)) {
            return false;
        }
        yhz0 yhz0Var = (yhz0) obj;
        return wj50.m88271j(this.f272999a, yhz0Var.f272999a) && this.f273000b == yhz0Var.f273000b && this.f273001c == yhz0Var.f273001c && this.f273002d == yhz0Var.f273002d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273002d) + dq60.m36605e(dq60.m36605e(this.f272999a.hashCode() * 31, this.f273000b, 31), this.f273001c, 31);
    }
}
