package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k7c implements qaq0 {

    /* JADX INFO: renamed from: a */
    public final long f120037a;

    /* JADX INFO: renamed from: b */
    public final int f120038b;

    /* JADX INFO: renamed from: c */
    public final int f120039c;

    /* JADX INFO: renamed from: d */
    public final c450 f120040d;

    /* JADX INFO: renamed from: e */
    public final boolean f120041e;

    /* JADX INFO: renamed from: f */
    public final yqq f120042f;

    /* JADX INFO: renamed from: g */
    public final kqi0 f120043g;

    /* JADX INFO: renamed from: h */
    public Integer f120044h;

    public k7c(long j, int i, int i2, c450 c450Var, boolean z, yqq yqqVar, kqi0 kqi0Var) {
        this.f120037a = j;
        this.f120038b = i;
        this.f120039c = i2;
        this.f120040d = c450Var;
        this.f120041e = z;
        this.f120042f = yqqVar;
        this.f120043g = kqi0Var;
    }

    @Override // p204p.qaq0
    /* JADX INFO: renamed from: a */
    public final long mo26626a(c450 c450Var, long j, ko70 ko70Var, long j2) {
        int iIntValue;
        long j3 = this.f120037a;
        int i = (int) (j3 >> 32);
        int i2 = (int) (j2 >> 32);
        int i3 = i2 / 2;
        int i4 = i - i3;
        c450 c450Var2 = this.f120040d;
        int i5 = c450Var2.f33848a;
        int i6 = this.f120039c;
        int i7 = i5 + i6;
        int i8 = (c450Var2.f33850c - i6) - i2;
        if (i8 < i7) {
            i8 = i7;
        }
        int iM63437n = n0e1.m63437n(i4, i7, i8);
        float fMo35987O0 = this.f120042f.mo35987O0(i - (i3 + iM63437n));
        kqi0 kqi0Var = this.f120043g;
        if (!ybs.m93301b(((ybs) kqi0Var.getValue()).f271238a, fMo35987O0)) {
            ptl.m70999t(fMo35987O0, kqi0Var);
        }
        Integer num = this.f120044h;
        boolean z = this.f120041e;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            int i9 = this.f120038b;
            iIntValue = z ? ((int) (j3 & 4294967295L)) - i9 : ((int) (j3 & 4294967295L)) + i9;
            this.f120044h = Integer.valueOf(iIntValue);
        }
        if (z) {
            iIntValue -= (int) (j2 & 4294967295L);
        }
        return (((long) iM63437n) << 32) | (((long) iIntValue) & 4294967295L);
    }
}
