package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class qng0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final st91 f190580a;

    /* JADX INFO: renamed from: b */
    public final zt91 f190581b;

    public qng0(st91 st91Var) {
        this.f190580a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-empty-results-error";
        yt91VarM50626j.f276052f = "0.1.0";
        yt91VarM50626j.f276053g = "20.0.5";
        this.f190581b = yt91VarM50626j.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        st91 st91Var2 = this.f190580a;
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f190581b;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
