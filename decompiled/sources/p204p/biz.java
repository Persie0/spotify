package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class biz implements qhz {

    /* JADX INFO: renamed from: a */
    public final int f27568a;

    /* JADX INFO: renamed from: b */
    public final bqs f27569b;

    /* JADX INFO: renamed from: c */
    public final long f27570c;

    /* JADX INFO: renamed from: d */
    public final long f27571d;

    public biz(int i, int i2) {
        this(i, i2, iqs.f104839a);
    }

    @Override // p204p.qhz
    /* JADX INFO: renamed from: b */
    public final float mo26119b(float f, float f2, float f3, long j) {
        long j2 = j - this.f27571d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.f27570c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (mo26122e(f, f2, f3, j4) - mo26122e(f, f2, f3, j4 - 1000000)) * 1000.0f;
    }

    @Override // p204p.qhz
    /* JADX INFO: renamed from: d */
    public final long mo26121d(float f, float f2, float f3) {
        return this.f27571d + this.f27570c;
    }

    @Override // p204p.qhz
    /* JADX INFO: renamed from: e */
    public final float mo26122e(float f, float f2, float f3, long j) {
        long j2 = j - this.f27571d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.f27570c;
        if (j2 > j3) {
            j2 = j3;
        }
        float fMo30276a = this.f27569b.mo30276a(this.f27568a == 0 ? 1.0f : j2 / j3);
        return (f2 * fMo30276a) + ((1 - fMo30276a) * f);
    }

    public biz(int i, int i2, bqs bqsVar) {
        this.f27568a = i;
        this.f27569b = bqsVar;
        this.f27570c = ((long) i) * 1000000;
        this.f27571d = ((long) i2) * 1000000;
    }
}
