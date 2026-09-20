package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class q5a1 extends exh0 implements dp70 {

    /* JADX INFO: renamed from: M0 */
    public float f185490M0;

    /* JADX INFO: renamed from: N0 */
    public float f185491N0;

    @Override // p204p.dp70
    /* JADX INFO: renamed from: C */
    public final int mo35395C(d3b0 d3b0Var, h6d0 h6d0Var, int i) {
        int iMo39620d = h6d0Var.mo39620d(i);
        int iMo35990l0 = !Float.isNaN(this.f185491N0) ? d3b0Var.mo35990l0(this.f185491N0) : 0;
        return iMo39620d < iMo35990l0 ? iMo35990l0 : iMo39620d;
    }

    @Override // p204p.dp70
    /* JADX INFO: renamed from: R0 */
    public final int mo35400R0(d3b0 d3b0Var, h6d0 h6d0Var, int i) {
        int iMo39622u = h6d0Var.mo39622u(i);
        int iMo35990l0 = !Float.isNaN(this.f185490M0) ? d3b0Var.mo35990l0(this.f185490M0) : 0;
        return iMo39622u < iMo35990l0 ? iMo35990l0 : iMo39622u;
    }

    @Override // p204p.dp70
    /* JADX INFO: renamed from: X0 */
    public final int mo35401X0(d3b0 d3b0Var, h6d0 h6d0Var, int i) {
        int iMo39623w = h6d0Var.mo39623w(i);
        int iMo35990l0 = !Float.isNaN(this.f185490M0) ? d3b0Var.mo35990l0(this.f185490M0) : 0;
        return iMo39623w < iMo35990l0 ? iMo35990l0 : iMo39623w;
    }

    @Override // p204p.dp70
    /* JADX INFO: renamed from: i */
    public final n6d0 mo25071i(o6d0 o6d0Var, h6d0 h6d0Var, long j) {
        int iM28432k;
        int iM28431j;
        if (Float.isNaN(this.f185490M0) || b8j.m28432k(j) != 0) {
            iM28432k = b8j.m28432k(j);
        } else {
            int iMo35990l0 = o6d0Var.mo35990l0(this.f185490M0);
            iM28432k = b8j.m28430i(j);
            if (iMo35990l0 < 0) {
                iMo35990l0 = 0;
            }
            if (iMo35990l0 <= iM28432k) {
                iM28432k = iMo35990l0;
            }
        }
        int iM28430i = b8j.m28430i(j);
        if (Float.isNaN(this.f185491N0) || b8j.m28431j(j) != 0) {
            iM28431j = b8j.m28431j(j);
        } else {
            int iMo35990l1 = o6d0Var.mo35990l0(this.f185491N0);
            iM28431j = b8j.m28429h(j);
            int i = iMo35990l1 >= 0 ? iMo35990l1 : 0;
            if (i <= iM28431j) {
                iM28431j = i;
            }
        }
        t5o0 t5o0VarMo39619B = h6d0Var.mo39619B(e8j.m38110a(iM28432k, iM28430i, iM28431j, b8j.m28429h(j)));
        return o6d0Var.mo44714T(t5o0VarMo39619B.f217322a, t5o0VarMo39619B.f217323b, nau.f152117a, new C2484v6(t5o0VarMo39619B, 20));
    }

    @Override // p204p.dp70
    /* JADX INFO: renamed from: u0 */
    public final int mo35402u0(d3b0 d3b0Var, h6d0 h6d0Var, int i) {
        int iMo39621l = h6d0Var.mo39621l(i);
        int iMo35990l0 = !Float.isNaN(this.f185491N0) ? d3b0Var.mo35990l0(this.f185491N0) : 0;
        return iMo39621l < iMo35990l0 ? iMo35990l0 : iMo39621l;
    }
}
