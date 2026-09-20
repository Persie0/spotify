package p204p;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* JADX INFO: loaded from: classes3.dex */
public final class bqe extends w400 {

    /* JADX INFO: renamed from: f */
    public final long f29796f;

    /* JADX INFO: renamed from: g */
    public final long f29797g;

    /* JADX INFO: renamed from: h */
    public final long f29798h;

    /* JADX INFO: renamed from: i */
    public final boolean f29799i;

    public bqe(qp71 qp71Var, long j, long j2, boolean z) throws ClippingMediaSource$IllegalClippingException {
        super(qp71Var);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new ClippingMediaSource$IllegalClippingException(2, j, j2);
        }
        boolean z2 = false;
        if (qp71Var.mo26652h() != 1) {
            throw new ClippingMediaSource$IllegalClippingException(0);
        }
        mp71 mp71VarMo26654n = qp71Var.mo26654n(0, new mp71(), 0L);
        long jMax = Math.max(0L, j);
        if (!z && !mp71VarMo26654n.f145936k && jMax != 0 && !mp71VarMo26654n.f145933h) {
            throw new ClippingMediaSource$IllegalClippingException(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? mp71VarMo26654n.f145938m : Math.max(0L, j2);
        long j3 = mp71VarMo26654n.f145938m;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.f29796f = jMax;
        this.f29797g = jMax2;
        this.f29798h = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (mp71VarMo26654n.f145934i && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z2 = true;
        }
        this.f29799i = z2;
    }

    @Override // p204p.w400, p204p.qp71
    /* JADX INFO: renamed from: f */
    public final bp71 mo26651f(int i, bp71 bp71Var, boolean z) {
        this.f247672e.mo26651f(0, bp71Var, z);
        long j = bp71Var.f29347e - this.f29796f;
        long j2 = this.f29798h;
        bp71Var.m30112i(bp71Var.f29343a, bp71Var.f29344b, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, kt0.f126088f, bp71Var.f29348f);
        return bp71Var;
    }

    @Override // p204p.w400, p204p.qp71
    /* JADX INFO: renamed from: n */
    public final mp71 mo26654n(int i, mp71 mp71Var, long j) {
        this.f247672e.mo26654n(0, mp71Var, 0L);
        long j2 = mp71Var.f145941p;
        long j3 = this.f29796f;
        mp71Var.f145941p = j2 + j3;
        mp71Var.f145938m = this.f29798h;
        mp71Var.f145934i = this.f29799i;
        long j4 = mp71Var.f145937l;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            mp71Var.f145937l = jMax;
            long j5 = this.f29797g;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            mp71Var.f145937l = jMax - j3;
        }
        long jM46326n0 = h0b1.m46326n0(j3);
        long j6 = mp71Var.f145930e;
        if (j6 != -9223372036854775807L) {
            mp71Var.f145930e = j6 + jM46326n0;
        }
        long j7 = mp71Var.f145931f;
        if (j7 != -9223372036854775807L) {
            mp71Var.f145931f = j7 + jM46326n0;
        }
        return mp71Var;
    }
}
