package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class kqg0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f125313a;

    /* JADX INFO: renamed from: b */
    public final List f125314b;

    public kqg0() {
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-gen-alpha-parental-control-manage-content";
        yt91VarM50626j.f276052f = "1.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        this.f125313a = yt91VarM50626j.m94607a();
        this.f125314b = Collections.singletonList("parental-control/manage-content");
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f125313a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
