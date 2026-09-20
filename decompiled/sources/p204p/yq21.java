package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class yq21 {

    /* JADX INFO: renamed from: a */
    public final long f275118a;

    /* JADX INFO: renamed from: b */
    public final long f275119b;

    /* JADX INFO: renamed from: c */
    public final long f275120c;

    /* JADX INFO: renamed from: d */
    public final long f275121d;

    /* JADX INFO: renamed from: e */
    public final long f275122e;

    /* JADX INFO: renamed from: f */
    public final long f275123f;

    /* JADX INFO: renamed from: g */
    public final long f275124g;

    /* JADX INFO: renamed from: h */
    public final long f275125h;

    /* JADX INFO: renamed from: i */
    public final long f275126i;

    /* JADX INFO: renamed from: j */
    public final long f275127j;

    public yq21(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.f275118a = j;
        this.f275119b = j2;
        this.f275120c = j3;
        this.f275121d = j4;
        this.f275122e = j5;
        this.f275123f = j6;
        this.f275124g = j7;
        this.f275125h = j8;
        this.f275126i = j9;
        this.f275127j = j10;
    }

    /* JADX INFO: renamed from: a */
    public final long m94332a(boolean z, boolean z2) {
        if (z) {
            return z2 ? this.f275119b : this.f275121d;
        }
        return z2 ? this.f275124g : this.f275126i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof yq21)) {
            return false;
        }
        yq21 yq21Var = (yq21) obj;
        long j = yq21Var.f275118a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f275118a, j) && as91.m27074b(this.f275119b, yq21Var.f275119b) && as91.m27074b(this.f275120c, yq21Var.f275120c) && as91.m27074b(this.f275121d, yq21Var.f275121d) && as91.m27074b(this.f275122e, yq21Var.f275122e) && as91.m27074b(this.f275123f, yq21Var.f275123f) && as91.m27074b(this.f275124g, yq21Var.f275124g) && as91.m27074b(this.f275125h, yq21Var.f275125h) && as91.m27074b(this.f275126i, yq21Var.f275126i) && as91.m27074b(this.f275127j, yq21Var.f275127j);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f275127j) + dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(Long.hashCode(this.f275118a) * 31, this.f275119b, 31), this.f275120c, 31), this.f275121d, 31), this.f275122e, 31), this.f275123f, 31), this.f275124g, 31), this.f275125h, 31), this.f275126i, 31);
    }
}
