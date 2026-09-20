package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qi21 extends exh0 implements dp70 {

    /* JADX INFO: renamed from: M0 */
    public float f188910M0;

    /* JADX INFO: renamed from: N0 */
    public float f188911N0;

    /* JADX INFO: renamed from: O0 */
    public float f188912O0;

    /* JADX INFO: renamed from: P0 */
    public float f188913P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f188914Q0;

    @Override // p204p.dp70
    /* JADX INFO: renamed from: C */
    public final int mo35395C(d3b0 d3b0Var, h6d0 h6d0Var, int i) {
        long jM72848H1 = m72848H1(d3b0Var);
        if (b8j.m28427f(jM72848H1)) {
            return b8j.m28429h(jM72848H1);
        }
        if (!this.f188914Q0) {
            i = e8j.m38116g(i, jM72848H1);
        }
        return e8j.m38115f(h6d0Var.mo39620d(i), jM72848H1);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX INFO: renamed from: H1 */
    public final long m72848H1(o6d0 o6d0Var) {
        int iMo35990l0;
        int iMo35990l1;
        int iMo35990l2;
        int i = 0;
        if (Float.isNaN(this.f188912O0)) {
            iMo35990l0 = Integer.MAX_VALUE;
        } else {
            iMo35990l0 = o6d0Var.mo35990l0(this.f188912O0);
            if (iMo35990l0 < 0) {
                iMo35990l0 = 0;
            }
        }
        if (Float.isNaN(this.f188913P0)) {
            iMo35990l1 = Integer.MAX_VALUE;
        } else {
            iMo35990l1 = o6d0Var.mo35990l0(this.f188913P0);
            if (iMo35990l1 < 0) {
                iMo35990l1 = 0;
            }
        }
        if (Float.isNaN(this.f188910M0)) {
            iMo35990l2 = 0;
        } else {
            iMo35990l2 = o6d0Var.mo35990l0(this.f188910M0);
            if (iMo35990l2 < 0) {
                iMo35990l2 = 0;
            }
            if (iMo35990l2 > iMo35990l0) {
                iMo35990l2 = iMo35990l0;
            }
            if (iMo35990l2 == Integer.MAX_VALUE) {
                iMo35990l2 = 0;
            }
        }
        if (!Float.isNaN(this.f188911N0)) {
            int iMo35990l3 = o6d0Var.mo35990l0(this.f188911N0);
            if (iMo35990l3 < 0) {
                iMo35990l3 = 0;
            }
            if (iMo35990l3 > iMo35990l1) {
                iMo35990l3 = iMo35990l1;
            }
            if (iMo35990l3 != Integer.MAX_VALUE) {
                i = iMo35990l3;
            }
        }
        return e8j.m38110a(iMo35990l2, iMo35990l0, i, iMo35990l1);
    }

    @Override // p204p.dp70
    /* JADX INFO: renamed from: R0 */
    public final int mo35400R0(d3b0 d3b0Var, h6d0 h6d0Var, int i) {
        long jM72848H1 = m72848H1(d3b0Var);
        if (b8j.m28428g(jM72848H1)) {
            return b8j.m28430i(jM72848H1);
        }
        if (!this.f188914Q0) {
            i = e8j.m38115f(i, jM72848H1);
        }
        return e8j.m38116g(h6d0Var.mo39622u(i), jM72848H1);
    }

    @Override // p204p.dp70
    /* JADX INFO: renamed from: X0 */
    public final int mo35401X0(d3b0 d3b0Var, h6d0 h6d0Var, int i) {
        long jM72848H1 = m72848H1(d3b0Var);
        if (b8j.m28428g(jM72848H1)) {
            return b8j.m28430i(jM72848H1);
        }
        if (!this.f188914Q0) {
            i = e8j.m38115f(i, jM72848H1);
        }
        return e8j.m38116g(h6d0Var.mo39623w(i), jM72848H1);
    }

    @Override // p204p.dp70
    /* JADX INFO: renamed from: i */
    public final n6d0 mo25071i(o6d0 o6d0Var, h6d0 h6d0Var, long j) {
        int iM28432k;
        int iM28430i;
        int iM28431j;
        int iM28429h;
        long jM38110a;
        long jM72848H1 = m72848H1(o6d0Var);
        if (this.f188914Q0) {
            jM38110a = e8j.m38114e(j, jM72848H1);
        } else {
            if (Float.isNaN(this.f188910M0)) {
                iM28432k = b8j.m28432k(j);
                int iM28430i2 = b8j.m28430i(jM72848H1);
                if (iM28432k > iM28430i2) {
                    iM28432k = iM28430i2;
                }
            } else {
                iM28432k = b8j.m28432k(jM72848H1);
            }
            if (Float.isNaN(this.f188912O0)) {
                iM28430i = b8j.m28430i(j);
                int iM28432k2 = b8j.m28432k(jM72848H1);
                if (iM28430i < iM28432k2) {
                    iM28430i = iM28432k2;
                }
            } else {
                iM28430i = b8j.m28430i(jM72848H1);
            }
            if (Float.isNaN(this.f188911N0)) {
                iM28431j = b8j.m28431j(j);
                int iM28429h2 = b8j.m28429h(jM72848H1);
                if (iM28431j > iM28429h2) {
                    iM28431j = iM28429h2;
                }
            } else {
                iM28431j = b8j.m28431j(jM72848H1);
            }
            if (Float.isNaN(this.f188913P0)) {
                iM28429h = b8j.m28429h(j);
                int iM28431j2 = b8j.m28431j(jM72848H1);
                if (iM28429h < iM28431j2) {
                    iM28429h = iM28431j2;
                }
            } else {
                iM28429h = b8j.m28429h(jM72848H1);
            }
            jM38110a = e8j.m38110a(iM28432k, iM28430i, iM28431j, iM28429h);
        }
        t5o0 t5o0VarMo39619B = h6d0Var.mo39619B(jM38110a);
        return o6d0Var.mo44714T(t5o0VarMo39619B.f217322a, t5o0VarMo39619B.f217323b, nau.f152117a, new C2484v6(t5o0VarMo39619B, 12));
    }

    @Override // p204p.dp70
    /* JADX INFO: renamed from: u0 */
    public final int mo35402u0(d3b0 d3b0Var, h6d0 h6d0Var, int i) {
        long jM72848H1 = m72848H1(d3b0Var);
        if (b8j.m28427f(jM72848H1)) {
            return b8j.m28429h(jM72848H1);
        }
        if (!this.f188914Q0) {
            i = e8j.m38116g(i, jM72848H1);
        }
        return e8j.m38115f(h6d0Var.mo39621l(i), jM72848H1);
    }
}
