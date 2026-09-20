package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hby0 implements iby0 {

    /* JADX INFO: renamed from: a */
    public final float f89629a;

    /* JADX INFO: renamed from: b */
    public final long f89630b;

    /* JADX INFO: renamed from: c */
    public final long f89631c;

    public hby0(float f, long j, long j2) {
        this.f89629a = f;
        this.f89630b = j;
        this.f89631c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hby0)) {
            return false;
        }
        hby0 hby0Var = (hby0) obj;
        return Float.compare(this.f89629a, hby0Var.f89629a) == 0 && this.f89630b == hby0Var.f89630b && this.f89631c == hby0Var.f89631c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f89631c) + dq60.m36605e(Float.hashCode(this.f89629a) * 31, this.f89630b, 31);
    }
}
