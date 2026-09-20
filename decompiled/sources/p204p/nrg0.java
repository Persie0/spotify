package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nrg0 implements xt91, rv91 {

    /* JADX INFO: renamed from: a */
    public final st91 f157552a;

    /* JADX INFO: renamed from: b */
    public final zt91 f157553b;

    public nrg0(int i, String str, st91 st91Var) {
        this.f157552a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-heading";
        yt91VarM50626j.f276052f = "10.3.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = spg0.m78883b(i);
        yt91VarM50626j.f276050d = str;
        this.f157553b = yt91VarM50626j.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m65479a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, c95.m31821M(pft0.m69840u("destination", string))), this.f157553b, this.f157552a, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        sr31 sr31VarM25937i = ahf1.m25937i();
        sr31VarM25937i.m78998o(this.f157553b);
        sr31VarM25937i.m79004u(this.f157552a);
        return sr31VarM25937i.m78989b();
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91VarM69987f = phf1.m69987f();
        nu91VarM69987f.m87253i(this.f157553b);
        nu91VarM69987f.m87254j(this.f157552a);
        nu91VarM69987f.m87249c(System.currentTimeMillis());
        return (ou91) nu91VarM69987f.m87248a();
    }

    /* JADX INFO: renamed from: h */
    public final av91 m65480h() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f157553b, this.f157552a, System.currentTimeMillis());
    }
}
