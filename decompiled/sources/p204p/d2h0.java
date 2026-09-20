package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class d2h0 implements xt91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f44567a;

    public d2h0(String str, String str2) {
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-plan-overview";
        yt91VarM50626j.f276052f = "6.2.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = str;
        yt91VarM50626j.f276050d = str2;
        this.f44567a = yt91VarM50626j.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        sr31 sr31VarM25937i = ahf1.m25937i();
        sr31VarM25937i.m78998o(this.f44567a);
        return sr31VarM25937i.m78989b();
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91VarM69987f = phf1.m69987f();
        nu91VarM69987f.m87253i(this.f44567a);
        nu91VarM69987f.m87249c(System.currentTimeMillis());
        return (ou91) nu91VarM69987f.m87248a();
    }
}
