package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class g5j extends f5j implements xez0 {

    /* JADX INFO: renamed from: i */
    public final long f76687i;

    /* JADX INFO: renamed from: j */
    public final long f76688j;

    public g5j(long j, long j2, int i, int i2, boolean z, boolean z2, long j3) {
        super(j, j2, i, i2, z, z2);
        long j4 = j;
        this.f76687i = j3;
        this.f76688j = j4 == -1 ? -1L : j4;
    }

    @Override // p204p.f5j, p204p.ddz0
    /* JADX INFO: renamed from: b */
    public final cdz0 mo25847b(long j) {
        long j2 = this.f76687i;
        if (j2 != -9223372036854775807L && j >= j2) {
            long j3 = this.f76688j;
            if (j3 != -1) {
                long j4 = this.f66088c;
                long j5 = this.f66087b;
                ndz0 ndz0Var = new ndz0(Math.max(0L, j2 - ((Math.max(0L, (j4 + j5) - j5) * 8000000) / ((long) this.f66090e))), Math.max(j5, j3 - j4));
                return new cdz0(ndz0Var, ndz0Var);
            }
        }
        return super.mo25847b(j);
    }

    @Override // p204p.xez0
    /* JADX INFO: renamed from: c */
    public final long mo25848c() {
        return this.f76688j;
    }

    @Override // p204p.xez0
    /* JADX INFO: renamed from: e */
    public final long mo25850e(long j) {
        return (Math.max(0L, j - this.f66087b) * 8000000) / ((long) this.f66090e);
    }

    @Override // p204p.xez0
    /* JADX INFO: renamed from: f */
    public final int mo25851f() {
        return this.f66090e;
    }

    @Override // p204p.f5j, p204p.ddz0
    /* JADX INFO: renamed from: g */
    public final long mo25852g() {
        long j = this.f76687i;
        return j != -9223372036854775807L ? j : this.f66091f;
    }
}
