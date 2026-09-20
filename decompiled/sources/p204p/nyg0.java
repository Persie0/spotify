package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class nyg0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final st91 f159808a;

    /* JADX INFO: renamed from: b */
    public final zt91 f159809b;

    /* JADX INFO: renamed from: c */
    public final List f159810c;

    public nyg0(String str, String str2, st91 st91Var) {
        this.f159808a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-now-playing-view-default";
        yt91VarM50626j.f276052f = "27.1.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = str;
        yt91VarM50626j.f276050d = str2;
        this.f159809b = yt91VarM50626j.m94607a();
        this.f159810c = Collections.singletonList("nowplaying");
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        st91 st91Var2 = this.f159808a;
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f159809b;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
