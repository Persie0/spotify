package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rch0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f197867a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sch0 f197868b;

    public rch0(sch0 sch0Var) {
        this.f197868b = sch0Var;
        yt91 yt91VarM96903c = sch0Var.f207746a.m96903c();
        oyp0 oyp0VarM80908q = ti5.m80908q();
        oyp0VarM80908q.m68548q("confirm_button");
        yt91VarM96903c.f276055i.add(oyp0VarM80908q.m68536c());
        yt91VarM96903c.f276056j = false;
        this.f197867a = yt91VarM96903c.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m75307a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, c95.m31821M(pft0.m69840u("destination", string))), this.f197867a, this.f197868b.f207747b.f195144b, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        sr31 sr31VarM25937i = ahf1.m25937i();
        sr31VarM25937i.m78998o(this.f197867a);
        sr31VarM25937i.m79004u(this.f197868b.f207747b.f195144b);
        return sr31VarM25937i.m78989b();
    }

    /* JADX INFO: renamed from: e */
    public final av91 m75308e() {
        return new av91("", "", new dv91("hit", 1), new bv91("setting_enable", 1, nau.f152117a), this.f197867a, this.f197868b.f207747b.f195144b, System.currentTimeMillis());
    }
}
