package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class erg0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f62130a;

    /* JADX INFO: renamed from: b */
    public final List f62131b;

    public erg0(int i) {
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-genpods-prompt-page";
        yt91VarM50626j.f276052f = "1.2.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276051e = spg0.m78882a(i);
        this.f62130a = yt91VarM50626j.m94607a();
        this.f62131b = geg1.m44518y("bluejay/create");
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        sr31 sr31VarM25937i = ahf1.m25937i();
        sr31VarM25937i.m78998o(this.f62130a);
        return sr31VarM25937i.m78989b();
    }
}
