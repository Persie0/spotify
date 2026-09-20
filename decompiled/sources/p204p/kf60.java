package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kf60 {

    /* JADX INFO: renamed from: d */
    public static final kf60 f122067d = new kf60(rfg1.m75434d(4279887500L), rfg1.m75434d(3424573372L), rfg1.m75432b(2132710871));

    /* JADX INFO: renamed from: a */
    public final long f122068a;

    /* JADX INFO: renamed from: b */
    public final long f122069b;

    /* JADX INFO: renamed from: c */
    public final long f122070c;

    public kf60(long j, long j2, long j3) {
        this.f122068a = j;
        this.f122069b = j2;
        this.f122070c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf60)) {
            return false;
        }
        kf60 kf60Var = (kf60) obj;
        long j = kf60Var.f122068a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f122068a, j) && as91.m27074b(this.f122069b, kf60Var.f122069b) && as91.m27074b(this.f122070c, kf60Var.f122070c);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f122070c) + dq60.m36605e(Long.hashCode(this.f122068a) * 31, this.f122069b, 31);
    }
}
