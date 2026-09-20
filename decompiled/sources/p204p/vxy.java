package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class vxy extends exh0 implements dp70 {

    /* JADX INFO: renamed from: M0 */
    public int f245857M0;

    /* JADX INFO: renamed from: N0 */
    public float f245858N0;

    @Override // p204p.dp70
    /* JADX INFO: renamed from: i */
    public final n6d0 mo25071i(o6d0 o6d0Var, h6d0 h6d0Var, long j) {
        int iM28432k;
        int iM28430i;
        int iM28429h;
        int iM28429h2;
        if (!b8j.m28426e(j) || this.f245857M0 == 1) {
            iM28432k = b8j.m28432k(j);
            iM28430i = b8j.m28430i(j);
        } else {
            int iRound = Math.round(b8j.m28430i(j) * this.f245858N0);
            int iM28432k2 = b8j.m28432k(j);
            iM28432k = b8j.m28430i(j);
            if (iRound < iM28432k2) {
                iRound = iM28432k2;
            }
            if (iRound <= iM28432k) {
                iM28432k = iRound;
            }
            iM28430i = iM28432k;
        }
        if (!b8j.m28425d(j) || this.f245857M0 == 2) {
            int iM28431j = b8j.m28431j(j);
            iM28429h = b8j.m28429h(j);
            iM28429h2 = iM28431j;
        } else {
            int iRound2 = Math.round(b8j.m28429h(j) * this.f245858N0);
            int iM28431j2 = b8j.m28431j(j);
            iM28429h2 = b8j.m28429h(j);
            if (iRound2 < iM28431j2) {
                iRound2 = iM28431j2;
            }
            if (iRound2 <= iM28429h2) {
                iM28429h2 = iRound2;
            }
            iM28429h = iM28429h2;
        }
        t5o0 t5o0VarMo39619B = h6d0Var.mo39619B(e8j.m38110a(iM28432k, iM28430i, iM28429h2, iM28429h));
        return o6d0Var.mo44714T(t5o0VarMo39619B.f217322a, t5o0VarMo39619B.f217323b, nau.f152117a, new C2484v6(t5o0VarMo39619B, 6));
    }
}
