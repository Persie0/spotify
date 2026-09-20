package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class veh0 implements xt91, rv91 {

    /* JADX INFO: renamed from: a */
    public final st91 f240756a;

    /* JADX INFO: renamed from: b */
    public final zt91 f240757b;

    public veh0(Integer num, String str, String str2, st91 st91Var) {
        this.f240756a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-shelf-card";
        yt91VarM50626j.f276052f = "4.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276049c = num;
        yt91VarM50626j.f276051e = str;
        yt91VarM50626j.f276050d = str2;
        this.f240757b = yt91VarM50626j.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m85323a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, c95.m31821M(pft0.m69840u("destination", string))), this.f240757b, this.f240756a, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        sr31 sr31VarM25937i = ahf1.m25937i();
        sr31VarM25937i.m78998o(this.f240757b);
        sr31VarM25937i.m79004u(this.f240756a);
        return sr31VarM25937i.m78989b();
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91VarM69987f = phf1.m69987f();
        nu91VarM69987f.m87253i(this.f240757b);
        nu91VarM69987f.m87254j(this.f240756a);
        nu91VarM69987f.m87249c(System.currentTimeMillis());
        return (ou91) nu91VarM69987f.m87248a();
    }

    /* JADX INFO: renamed from: g */
    public final av91 m85324g() {
        return new av91("", "", new dv91("long_hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f240757b, this.f240756a, System.currentTimeMillis());
    }
}
