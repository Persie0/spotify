package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class gpg0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f83186a;

    /* JADX INFO: renamed from: b */
    public final List f83187b;

    public gpg0() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-gen-alpha-child-led-signup-request-parental-consent";
        yt91VarM50626j.f276052f = "1.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        this.f83186a = yt91VarM50626j.m94607a();
        this.f83187b = Collections.singletonList("child-led-signup/request-parental-consent");
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(lau.f131415a);
        zt91 zt91Var = this.f83186a;
        ofg1.m66846o(zt91Var, "location");
        arrayList.add(zt91Var);
        return new st91(arrayList);
    }
}
