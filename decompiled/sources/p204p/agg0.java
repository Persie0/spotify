package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class agg0 implements xt91, rv91 {

    /* JADX INFO: renamed from: a */
    public final st91 f15369a;

    /* JADX INFO: renamed from: b */
    public final zt91 f15370b;

    public agg0(Integer num, String str, String str2, st91 st91Var) {
        this.f15369a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-concert-campaign-promo-card";
        yt91VarM50626j.f276052f = "3.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276049c = num;
        yt91VarM50626j.f276051e = str;
        yt91VarM50626j.f276050d = str2;
        this.f15370b = yt91VarM50626j.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        st91 st91Var2 = this.f15369a;
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f15370b;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f15370b;
        nu91Var.f248108b = this.f15369a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
