package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zih0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final st91 f283169a;

    /* JADX INFO: renamed from: b */
    public final zt91 f283170b;

    /* JADX INFO: renamed from: c */
    public final List f283171c;

    public zih0(st91 st91Var) {
        this.f283169a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-voting-experience";
        yt91VarM50626j.f276052f = "5.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        this.f283170b = yt91VarM50626j.m94607a();
        this.f283171c = h6f.m46715L("playlist/ondemand", "voting/root", "voting/confirmation", "voting/share");
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        sr31 sr31VarM25937i = ahf1.m25937i();
        sr31VarM25937i.m78998o(this.f283170b);
        sr31VarM25937i.m79004u(this.f283169a);
        return sr31VarM25937i.m78989b();
    }
}
