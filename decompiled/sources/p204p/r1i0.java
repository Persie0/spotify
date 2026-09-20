package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class r1i0 implements s5f0 {

    /* JADX INFO: renamed from: a */
    public final long f194864a;

    /* JADX INFO: renamed from: b */
    public final long f194865b;

    /* JADX INFO: renamed from: c */
    public final long f194866c;

    /* JADX INFO: renamed from: d */
    public final long f194867d;

    /* JADX INFO: renamed from: e */
    public final long f194868e;

    public r1i0(long j, long j2, long j3, long j4, long j5) {
        this.f194864a = j;
        this.f194865b = j2;
        this.f194866c = j3;
        this.f194867d = j4;
        this.f194868e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1i0.class == obj.getClass()) {
            r1i0 r1i0Var = (r1i0) obj;
            if (this.f194864a == r1i0Var.f194864a && this.f194865b == r1i0Var.f194865b && this.f194866c == r1i0Var.f194866c && this.f194867d == r1i0Var.f194867d && this.f194868e == r1i0Var.f194868e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return kgg1.m56352o(this.f194868e) + ((kgg1.m56352o(this.f194867d) + ((kgg1.m56352o(this.f194866c) + ((kgg1.m56352o(this.f194865b) + ((kgg1.m56352o(this.f194864a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f194864a + ", photoSize=" + this.f194865b + ", photoPresentationTimestampUs=" + this.f194866c + ", videoStartPosition=" + this.f194867d + ", videoSize=" + this.f194868e;
    }
}
