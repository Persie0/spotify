package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class da6 extends exh0 implements dp70 {

    /* JADX INFO: renamed from: M0 */
    public float f46981M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f46982N0;

    @Override // p204p.dp70
    /* JADX INFO: renamed from: C */
    public final int mo35395C(d3b0 d3b0Var, h6d0 h6d0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.f46981M0) : h6d0Var.mo39620d(i);
    }

    /* JADX INFO: renamed from: H1 */
    public final long m35396H1(long j, boolean z) {
        int iRound;
        int iM28429h = b8j.m28429h(j);
        if (iM28429h == Integer.MAX_VALUE || (iRound = Math.round(iM28429h * this.f46981M0)) <= 0) {
            return 0L;
        }
        if (!z || cv9.m33999s(iRound, j, iM28429h)) {
            return (((long) iRound) << 32) | (((long) iM28429h) & 4294967295L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: I1 */
    public final long m35397I1(long j, boolean z) {
        int iRound;
        int iM28430i = b8j.m28430i(j);
        if (iM28430i == Integer.MAX_VALUE || (iRound = Math.round(iM28430i / this.f46981M0)) <= 0) {
            return 0L;
        }
        if (!z || cv9.m33999s(iM28430i, j, iRound)) {
            return (((long) iM28430i) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: J1 */
    public final long m35398J1(long j, boolean z) {
        int iM28431j = b8j.m28431j(j);
        int iRound = Math.round(iM28431j * this.f46981M0);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || cv9.m33999s(iRound, j, iM28431j)) {
            return (((long) iRound) << 32) | (((long) iM28431j) & 4294967295L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: K1 */
    public final long m35399K1(long j, boolean z) {
        int iM28432k = b8j.m28432k(j);
        int iRound = Math.round(iM28432k / this.f46981M0);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || cv9.m33999s(iM28432k, j, iRound)) {
            return (((long) iM28432k) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // p204p.dp70
    /* JADX INFO: renamed from: R0 */
    public final int mo35400R0(d3b0 d3b0Var, h6d0 h6d0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.f46981M0) : h6d0Var.mo39622u(i);
    }

    @Override // p204p.dp70
    /* JADX INFO: renamed from: X0 */
    public final int mo35401X0(d3b0 d3b0Var, h6d0 h6d0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.f46981M0) : h6d0Var.mo39623w(i);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    @Override // p204p.dp70
    /* JADX INFO: renamed from: i */
    public final n6d0 mo25071i(o6d0 o6d0Var, h6d0 h6d0Var, long j) {
        long jM35396H1;
        if (this.f46982N0) {
            jM35396H1 = m35396H1(j, true);
            if (g450.m43520b(jM35396H1, 0L)) {
                jM35396H1 = m35397I1(j, true);
                if (g450.m43520b(jM35396H1, 0L)) {
                    jM35396H1 = m35398J1(j, true);
                    if (g450.m43520b(jM35396H1, 0L)) {
                        jM35396H1 = m35399K1(j, true);
                        if (g450.m43520b(jM35396H1, 0L)) {
                            jM35396H1 = m35396H1(j, false);
                            if (g450.m43520b(jM35396H1, 0L)) {
                                jM35396H1 = m35397I1(j, false);
                                if (g450.m43520b(jM35396H1, 0L)) {
                                    jM35396H1 = m35398J1(j, false);
                                    if (g450.m43520b(jM35396H1, 0L)) {
                                        jM35396H1 = m35399K1(j, false);
                                        if (g450.m43520b(jM35396H1, 0L)) {
                                            jM35396H1 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            jM35396H1 = m35397I1(j, true);
            if (g450.m43520b(jM35396H1, 0L)) {
                jM35396H1 = m35396H1(j, true);
                if (g450.m43520b(jM35396H1, 0L)) {
                    jM35396H1 = m35399K1(j, true);
                    if (g450.m43520b(jM35396H1, 0L)) {
                        jM35396H1 = m35398J1(j, true);
                        if (g450.m43520b(jM35396H1, 0L)) {
                            jM35396H1 = m35397I1(j, false);
                            if (g450.m43520b(jM35396H1, 0L)) {
                                jM35396H1 = m35396H1(j, false);
                                if (g450.m43520b(jM35396H1, 0L)) {
                                    jM35396H1 = m35399K1(j, false);
                                    if (g450.m43520b(jM35396H1, 0L)) {
                                        jM35396H1 = m35398J1(j, false);
                                        if (g450.m43520b(jM35396H1, 0L)) {
                                            jM35396H1 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!g450.m43520b(jM35396H1, 0L)) {
            int i = (int) (jM35396H1 >> 32);
            int i2 = (int) (4294967295L & jM35396H1);
            if (!((i >= 0) & (i2 >= 0))) {
                ot40.m67767a("width and height must be >= 0");
            }
            j = e8j.m38117h(i, i, i2, i2);
        }
        t5o0 t5o0VarMo39619B = h6d0Var.mo39619B(j);
        return o6d0Var.mo44714T(t5o0VarMo39619B.f217322a, t5o0VarMo39619B.f217323b, nau.f152117a, new C2484v6(t5o0VarMo39619B, 1));
    }

    @Override // p204p.dp70
    /* JADX INFO: renamed from: u0 */
    public final int mo35402u0(d3b0 d3b0Var, h6d0 h6d0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.f46981M0) : h6d0Var.mo39621l(i);
    }
}
