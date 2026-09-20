package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class v231 {

    /* JADX INFO: renamed from: a */
    public final kv91 f236534a;

    /* JADX INFO: renamed from: b */
    public final wg61 f236535b = new wg61(aa11.f13715S0);

    public v231(kv91 kv91Var) {
        this.f236534a = kv91Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m84494a() {
        zng0 zng0Var = (zng0) this.f236535b.getValue();
        zng0Var.getClass();
        yt91 yt91VarM96903c = zng0Var.f284494a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("back", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f236534a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: b */
    public final void m84495b() {
        this.f236534a.mo57449i(((zng0) this.f236535b.getValue()).mo24514e(), null);
    }

    /* JADX INFO: renamed from: c */
    public final d850 m84496c() {
        zng0 zng0Var = (zng0) this.f236535b.getValue();
        zng0Var.getClass();
        yt91 yt91VarM96903c = zng0Var.f284494a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("shuffle_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        return this.f236534a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("select_shuffle_mode", 1, kkc0.m56695h0(new pqm0("previous_mode", "linear"), new pqm0("selected_mode", "shuffle"))), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: d */
    public final d850 m84497d() {
        zng0 zng0Var = (zng0) this.f236535b.getValue();
        zng0Var.getClass();
        yt91 yt91VarM96903c = zng0Var.f284494a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("smart_shuffle_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        return this.f236534a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("select_shuffle_mode", 1, kkc0.m56695h0(new pqm0("previous_mode", "linear"), new pqm0("selected_mode", "smart_shuffle"))), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }
}
