package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class thz0 implements zhz0 {

    /* JADX INFO: renamed from: a */
    public final String f220520a;

    /* JADX INFO: renamed from: b */
    public final long f220521b;

    /* JADX INFO: renamed from: c */
    public final long f220522c;

    /* JADX INFO: renamed from: d */
    public final boolean f220523d;

    public thz0(long j, long j2, String str, boolean z) {
        this.f220520a = str;
        this.f220521b = j;
        this.f220522c = j2;
        this.f220523d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thz0)) {
            return false;
        }
        thz0 thz0Var = (thz0) obj;
        return wj50.m88271j(this.f220520a, thz0Var.f220520a) && this.f220521b == thz0Var.f220521b && this.f220522c == thz0Var.f220522c && this.f220523d == thz0Var.f220523d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f220523d) + dq60.m36605e(dq60.m36605e(this.f220520a.hashCode() * 31, this.f220521b, 31), this.f220522c, 31);
    }
}
