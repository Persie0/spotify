package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class slh0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f210419a;

    /* JADX INFO: renamed from: b */
    public final List f210420b;

    public slh0(nlh0 nlh0Var, Integer num, String str) {
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-your-listening-stats-details";
        yt91VarM50626j.f276052f = "11.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = nlh0Var.f155103a;
        yt91VarM50626j.f276049c = num;
        yt91VarM50626j.f276051e = str;
        this.f210419a = yt91VarM50626j.m94607a();
        this.f210420b = Collections.singletonList("listeningstats/details");
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f210419a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
