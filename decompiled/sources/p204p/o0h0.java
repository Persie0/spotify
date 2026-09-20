package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class o0h0 implements xt91, rv91 {

    /* JADX INFO: renamed from: a */
    public final st91 f160391a;

    /* JADX INFO: renamed from: b */
    public final zt91 f160392b;

    public o0h0(Integer num, st91 st91Var) {
        this.f160391a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-npv-scroll-card-companion-content";
        yt91VarM50626j.f276052f = "6.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276049c = num;
        this.f160392b = yt91VarM50626j.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        st91 st91Var2 = this.f160391a;
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f160392b;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f160392b;
        nu91Var.f248108b = this.f160391a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
