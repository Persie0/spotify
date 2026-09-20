package p204p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes3.dex */
public final class uj50 extends sj50 {

    /* JADX INFO: renamed from: M0 */
    public int f230906M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f230907N0;

    @Override // p204p.sj50
    /* JADX INFO: renamed from: H1 */
    public final long mo72891H1(h6d0 h6d0Var, long j) {
        int iMo39622u = this.f230906M0 == 1 ? h6d0Var.mo39622u(b8j.m28429h(j)) : h6d0Var.mo39623w(b8j.m28429h(j));
        if (iMo39622u < 0) {
            iMo39622u = 0;
        }
        if (iMo39622u < 0) {
            ot40.m67767a("width must be >= 0");
        }
        return e8j.m38117h(iMo39622u, iMo39622u, 0, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // p204p.sj50
    /* JADX INFO: renamed from: I1 */
    public final boolean mo72892I1() {
        return this.f230907N0;
    }

    @Override // p204p.sj50, p204p.dp70
    /* JADX INFO: renamed from: R0 */
    public final int mo35400R0(d3b0 d3b0Var, h6d0 h6d0Var, int i) {
        return this.f230906M0 == 1 ? h6d0Var.mo39622u(i) : h6d0Var.mo39623w(i);
    }

    @Override // p204p.sj50, p204p.dp70
    /* JADX INFO: renamed from: X0 */
    public final int mo35401X0(d3b0 d3b0Var, h6d0 h6d0Var, int i) {
        return this.f230906M0 == 1 ? h6d0Var.mo39622u(i) : h6d0Var.mo39623w(i);
    }
}
