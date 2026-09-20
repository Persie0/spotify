package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class v8g0 implements xt91, rv91 {

    /* JADX INFO: renamed from: a */
    public final st91 f238573a;

    /* JADX INFO: renamed from: b */
    public final zt91 f238574b;

    /* JADX INFO: renamed from: c */
    public final List f238575c;

    public v8g0(String str, String str2, st91 st91Var) {
        this.f238573a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-ads-context-menu-element";
        yt91VarM50626j.f276052f = "3.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = str;
        yt91VarM50626j.f276051e = null;
        yt91VarM50626j.f276050d = str2;
        this.f238574b = yt91VarM50626j.m94607a();
        this.f238575c = h6f.m46715L("home", "browse", "playlist");
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        st91 st91Var2 = this.f238573a;
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f238574b;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f238574b;
        nu91Var.f248108b = this.f238573a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = this.f238575c;
        return (ou91) nu91Var.m87248a();
    }

    /* JADX INFO: renamed from: h */
    public final av91 m84917h() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f238574b, this.f238573a, System.currentTimeMillis());
    }
}
