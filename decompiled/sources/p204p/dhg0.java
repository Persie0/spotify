package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dhg0 implements xt91, qv91 {

    /* JADX INFO: renamed from: a */
    public final st91 f49103a;

    /* JADX INFO: renamed from: b */
    public final zt91 f49104b;

    public dhg0(Integer num, String str, st91 st91Var) {
        this.f49103a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-content-evaluation-row";
        yt91VarM50626j.f276052f = "2.1.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276049c = num;
        yt91VarM50626j.f276050d = str;
        this.f49104b = yt91VarM50626j.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m36039a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, c95.m31821M(pft0.m69840u("destination", string))), this.f49104b, this.f49103a, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        sr31 sr31VarM25937i = ahf1.m25937i();
        sr31VarM25937i.m78998o(this.f49104b);
        sr31VarM25937i.m79004u(this.f49103a);
        return sr31VarM25937i.m78989b();
    }

    @Override // p204p.qv91
    /* JADX INFO: renamed from: e */
    public final kt91 mo29028e() {
        nu91 nu91VarM69987f = phf1.m69987f();
        nu91VarM69987f.m87253i(this.f49104b);
        nu91VarM69987f.m87254j(this.f49103a);
        nu91VarM69987f.m87249c(System.currentTimeMillis());
        return new kt91((ou91) nu91VarM69987f.m87248a());
    }

    /* JADX INFO: renamed from: g */
    public final av91 m36040g() {
        return new av91("", "", new dv91("long_hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f49104b, this.f49103a, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: h */
    public final av91 m36041h(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("play", 1, c95.m31821M(pft0.m69840u("item_to_be_played", string))), this.f49104b, this.f49103a, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public final av91 m36042i(String str) {
        dv91 dv91Var = new dv91("swipe_right", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("add_item_to_queue", 1, c95.m31821M(pft0.m69840u("item_to_add_to_queue", string))), this.f49104b, this.f49103a, System.currentTimeMillis());
    }
}
