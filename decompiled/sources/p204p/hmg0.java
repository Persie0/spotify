package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class hmg0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f92978a;

    /* JADX INFO: renamed from: b */
    public final List f92979b;

    public hmg0(String str, String str2) {
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-creative-work-page";
        yt91VarM50626j.f276052f = "7.3.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = str;
        yt91VarM50626j.f276050d = str2;
        this.f92978a = yt91VarM50626j.m94607a();
        this.f92979b = h6f.m46715L("album", "podcast", "podcast/episode", "shows/audio", "podcast/show/audiobook", "prerelease/audiobook");
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f92978a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
