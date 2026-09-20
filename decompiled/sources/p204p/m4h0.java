package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class m4h0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final st91 f139965a;

    /* JADX INFO: renamed from: b */
    public final zt91 f139966b;

    /* JADX INFO: renamed from: c */
    public final List f139967c;

    public m4h0(String str, String str2, st91 st91Var) {
        this.f139965a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-playlist-extender";
        yt91VarM50626j.f276052f = "11.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = str;
        yt91VarM50626j.f276050d = str2;
        this.f139966b = yt91VarM50626j.m94607a();
        this.f139967c = h6f.m46715L("playlist/ondemand", "playlist");
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        st91 st91Var2 = this.f139965a;
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f139966b;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
