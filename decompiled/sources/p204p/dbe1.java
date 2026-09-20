package p204p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes.dex */
public final class dbe1 extends exh0 implements dp70 {

    /* JADX INFO: renamed from: M0 */
    public int f47305M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f47306N0;

    /* JADX INFO: renamed from: O0 */
    public th00 f47307O0;

    @Override // p204p.dp70
    /* JADX INFO: renamed from: i */
    public final n6d0 mo25071i(o6d0 o6d0Var, h6d0 h6d0Var, long j) {
        int iM28432k = this.f47305M0 != 1 ? 0 : b8j.m28432k(j);
        int iM28431j = this.f47305M0 == 2 ? b8j.m28431j(j) : 0;
        int i = this.f47305M0;
        int iM28429h = Alert.DURATION_SHOW_INDEFINITELY;
        int iM28430i = (i == 1 || !this.f47306N0) ? b8j.m28430i(j) : Integer.MAX_VALUE;
        if (this.f47305M0 == 2 || !this.f47306N0) {
            iM28429h = b8j.m28429h(j);
        }
        t5o0 t5o0VarMo39619B = h6d0Var.mo39619B(e8j.m38110a(iM28432k, iM28430i, iM28431j, iM28429h));
        int iM63437n = n0e1.m63437n(t5o0VarMo39619B.f217322a, b8j.m28432k(j), b8j.m28430i(j));
        int iM63437n2 = n0e1.m63437n(t5o0VarMo39619B.f217323b, b8j.m28431j(j), b8j.m28429h(j));
        return o6d0Var.mo44714T(iM63437n, iM63437n2, nau.f152117a, new hrx0(this, iM63437n, t5o0VarMo39619B, iM63437n2, o6d0Var));
    }
}
