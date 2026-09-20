package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class nfg0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f153376a;

    /* JADX INFO: renamed from: b */
    public final List f153377b;

    public nfg0() {
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-collection-snooze-recommendation";
        yt91VarM50626j.f276052f = "2.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276050d = "spotify:internal:snooze-recommendation";
        this.f153376a = yt91VarM50626j.m94607a();
        this.f153377b = Collections.singletonList("snooze-recommendation");
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f153376a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
