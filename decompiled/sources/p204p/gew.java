package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gew {

    /* JADX INFO: renamed from: a */
    public final i4t0 f79208a;

    /* JADX INFO: renamed from: b */
    public final xvm0 f79209b;

    public gew(i4t0 i4t0Var, xvm0 xvm0Var) {
        this.f79208a = i4t0Var;
        this.f79209b = xvm0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m44529a(String str) {
        st91 st91VarMo36745b = this.f79209b.mo36745b();
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-your-library-error-dialog";
        yt91VarM50626j.f276052f = "1.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276051e = str;
        yt91 yt91VarM96903c = yt91VarM50626j.m94607a().m96903c();
        yt91VarM96903c.f276055i.add(new bu91("dismiss_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        ((kv91) this.f79208a.get()).mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91VarMo36745b, System.currentTimeMillis()), null);
    }
}
