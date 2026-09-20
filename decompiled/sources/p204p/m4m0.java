package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class m4m0 extends exh0 implements dp70 {

    /* JADX INFO: renamed from: M0 */
    public f4m0 f139994M0;

    @Override // p204p.dp70
    /* JADX INFO: renamed from: i */
    public final n6d0 mo25071i(o6d0 o6d0Var, h6d0 h6d0Var, long j) {
        float fMo29186b = this.f139994M0.mo29186b(o6d0Var.getLayoutDirection());
        float fMo29188d = this.f139994M0.mo29188d();
        float fMo29187c = this.f139994M0.mo29187c(o6d0Var.getLayoutDirection());
        float fMo29185a = this.f139994M0.mo29185a();
        float f = 0;
        if (!((ybs.m93300a(fMo29185a, f) >= 0) & (ybs.m93300a(fMo29186b, f) >= 0) & (ybs.m93300a(fMo29188d, f) >= 0) & (ybs.m93300a(fMo29187c, f) >= 0))) {
            kt40.m57301a("Padding must be non-negative");
        }
        int iMo35990l0 = o6d0Var.mo35990l0(fMo29186b);
        int iMo35990l1 = o6d0Var.mo35990l0(fMo29187c) + iMo35990l0;
        int iMo35990l2 = o6d0Var.mo35990l0(fMo29188d);
        int iMo35990l3 = o6d0Var.mo35990l0(fMo29185a) + iMo35990l2;
        t5o0 t5o0VarMo39619B = h6d0Var.mo39619B(e8j.m38118i(-iMo35990l1, j, -iMo35990l3));
        return o6d0Var.mo44714T(e8j.m38116g(t5o0VarMo39619B.f217322a + iMo35990l1, j), e8j.m38115f(t5o0VarMo39619B.f217323b + iMo35990l3, j), nau.f152117a, new jx40(t5o0VarMo39619B, iMo35990l0, iMo35990l2, 3));
    }
}
