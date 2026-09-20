package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class x8g0 implements xt91, qv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f259146a;

    public x8g0(String str) {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-ads-cta-cards";
        yt91VarM50626j.f276052f = "2.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276049c = null;
        yt91VarM50626j.f276051e = str;
        this.f259146a = yt91VarM50626j.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(lau.f131415a);
        zt91 zt91Var = this.f259146a;
        ofg1.m66846o(zt91Var, "location");
        arrayList.add(zt91Var);
        return new st91(arrayList);
    }

    @Override // p204p.qv91
    /* JADX INFO: renamed from: e */
    public final kt91 mo29028e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f259146a;
        nu91Var.f248108b = st91.f213865b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return new kt91((ou91) nu91Var.m87248a());
    }
}
