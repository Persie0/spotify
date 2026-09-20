package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tfh0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f219985a;

    /* JADX INFO: renamed from: b */
    public final List f219986b;

    public tfh0(String str) {
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-side-drawer";
        yt91VarM50626j.f276052f = "7.1.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = str;
        yt91VarM50626j.f276050d = "spotify:activitycenter";
        this.f219985a = yt91VarM50626j.m94607a();
        this.f219986b = h6f.m46715L("sidedrawer", "home", "home-funkis", "yourlibrary", "search", "find");
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        sr31 sr31VarM25937i = ahf1.m25937i();
        sr31VarM25937i.m78998o(this.f219985a);
        return sr31VarM25937i.m78989b();
    }
}
