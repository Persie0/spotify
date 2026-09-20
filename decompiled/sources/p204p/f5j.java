package p204p;

/* JADX INFO: loaded from: classes3.dex */
public class f5j implements ddz0 {

    /* JADX INFO: renamed from: a */
    public final long f66086a;

    /* JADX INFO: renamed from: b */
    public final long f66087b;

    /* JADX INFO: renamed from: c */
    public final int f66088c;

    /* JADX INFO: renamed from: d */
    public final long f66089d;

    /* JADX INFO: renamed from: e */
    public final int f66090e;

    /* JADX INFO: renamed from: f */
    public final long f66091f;

    /* JADX INFO: renamed from: g */
    public final boolean f66092g;

    /* JADX INFO: renamed from: h */
    public final boolean f66093h;

    public f5j(long j, long j2, int i, int i2, boolean z, boolean z2) {
        this.f66086a = j;
        this.f66087b = j2;
        this.f66088c = i2 == -1 ? 1 : i2;
        this.f66090e = i;
        this.f66092g = z;
        this.f66093h = z2;
        if (j == -1) {
            this.f66089d = -1L;
            this.f66091f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.f66089d = j3;
            this.f66091f = (Math.max(0L, j3) * 8000000) / ((long) i);
        }
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: a */
    public final boolean mo35759a() {
        return this.f66093h;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: b */
    public cdz0 mo25847b(long j) {
        long j2 = this.f66089d;
        long j3 = this.f66087b;
        if (j2 == -1 && !this.f66092g) {
            ndz0 ndz0Var = new ndz0(0L, j3);
            return new cdz0(ndz0Var, ndz0Var);
        }
        int i = this.f66090e;
        long j4 = this.f66088c;
        long jMin = (((((long) i) * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / ((long) i);
        ndz0 ndz0Var2 = new ndz0(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.f66086a) {
                return new cdz0(ndz0Var2, new ndz0((Math.max(0L, j5 - j3) * 8000000) / ((long) i), j5));
            }
        }
        return new cdz0(ndz0Var2, ndz0Var2);
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: d */
    public final boolean mo25849d() {
        return this.f66089d != -1 || this.f66092g;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: g */
    public long mo25852g() {
        return this.f66091f;
    }
}
