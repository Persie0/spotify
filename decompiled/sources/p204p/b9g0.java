package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class b9g0 implements xt91, rv91 {

    /* JADX INFO: renamed from: a */
    public final st91 f24903a;

    /* JADX INFO: renamed from: b */
    public final zt91 f24904b;

    public b9g0(String str, String str2, st91 st91Var) {
        this.f24903a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-ads-embedded-npv-video-card";
        yt91VarM50626j.f276052f = "1.1.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = str;
        yt91VarM50626j.f276051e = null;
        yt91VarM50626j.f276050d = str2;
        this.f24904b = yt91VarM50626j.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        st91 st91Var2 = this.f24903a;
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f24904b;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f24904b;
        nu91Var.f248108b = this.f24903a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }

    /* JADX INFO: renamed from: h */
    public final s8g0 m28474h() {
        return new s8g0(this);
    }
}
