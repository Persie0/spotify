package p204p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes.dex */
public final class qj50 extends sj50 {

    /* JADX INFO: renamed from: M0 */
    public int f189158M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f189159N0;

    @Override // p204p.sj50, p204p.dp70
    /* JADX INFO: renamed from: C */
    public final int mo35395C(d3b0 d3b0Var, h6d0 h6d0Var, int i) {
        return this.f189158M0 == 1 ? h6d0Var.mo39621l(i) : h6d0Var.mo39620d(i);
    }

    @Override // p204p.sj50
    /* JADX INFO: renamed from: H1 */
    public final long mo72891H1(h6d0 h6d0Var, long j) {
        int iMo39621l = this.f189158M0 == 1 ? h6d0Var.mo39621l(b8j.m28430i(j)) : h6d0Var.mo39620d(b8j.m28430i(j));
        if (iMo39621l < 0) {
            iMo39621l = 0;
        }
        if (iMo39621l < 0) {
            ot40.m67767a("height must be >= 0");
        }
        return e8j.m38117h(0, Alert.DURATION_SHOW_INDEFINITELY, iMo39621l, iMo39621l);
    }

    @Override // p204p.sj50
    /* JADX INFO: renamed from: I1 */
    public final boolean mo72892I1() {
        return this.f189159N0;
    }

    @Override // p204p.sj50, p204p.dp70
    /* JADX INFO: renamed from: u0 */
    public final int mo35402u0(d3b0 d3b0Var, h6d0 h6d0Var, int i) {
        return this.f189158M0 == 1 ? h6d0Var.mo39621l(i) : h6d0Var.mo39620d(i);
    }
}
