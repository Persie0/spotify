package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class umc0 {

    /* JADX INFO: renamed from: a */
    public final long f231795a;

    /* JADX INFO: renamed from: b */
    public final long f231796b;

    /* JADX INFO: renamed from: c */
    public final long f231797c;

    /* JADX INFO: renamed from: d */
    public final long f231798d;

    public umc0(long j, long j2, long j3, long j4) {
        this.f231795a = j;
        this.f231796b = j2;
        this.f231797c = j3;
        this.f231798d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umc0)) {
            return false;
        }
        umc0 umc0Var = (umc0) obj;
        long j = umc0Var.f231795a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f231795a, j) && as91.m27074b(this.f231796b, umc0Var.f231796b) && as91.m27074b(this.f231797c, umc0Var.f231797c) && as91.m27074b(this.f231798d, umc0Var.f231798d);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f231798d) + dq60.m36605e(dq60.m36605e(Long.hashCode(this.f231795a) * 31, this.f231796b, 31), this.f231797c, 31);
    }
}
