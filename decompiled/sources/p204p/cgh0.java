package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class cgh0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final st91 f37665a;

    /* JADX INFO: renamed from: b */
    public final zt91 f37666b;

    public cgh0(String str, st91 st91Var) {
        this.f37665a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-sleep-timer";
        yt91VarM50626j.f276052f = "4.1.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276050d = str;
        this.f37666b = yt91VarM50626j.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        st91 st91Var2 = this.f37665a;
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f37666b;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
