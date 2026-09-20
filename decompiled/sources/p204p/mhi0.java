package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mhi0 {

    /* JADX INFO: renamed from: a */
    public final kv91 f143799a;

    /* JADX INFO: renamed from: b */
    public final jtg0 f143800b;

    public mhi0(kv91 kv91Var, jtg0 jtg0Var) {
        this.f143799a = kv91Var;
        this.f143800b = jtg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m61779a() {
        jtg0 jtg0Var = this.f143800b;
        jtg0Var.getClass();
        yt91 yt91VarM96903c = jtg0Var.f115863a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("error_modal", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("error_modal_primary_action", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        this.f143799a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: b */
    public final void m61780b() {
        jtg0 jtg0Var = this.f143800b;
        jtg0Var.getClass();
        yt91 yt91VarM96903c = jtg0Var.f115863a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("error_modal", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = zt91VarM94607a;
        nu91Var.f248108b = st91.f213865b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        this.f143799a.mo57449i((ou91) nu91Var.m87248a(), null);
    }
}
