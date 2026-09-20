package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
public final class h0a implements ffz {

    /* JADX INFO: renamed from: a */
    public final i4t0 f86188a;

    public /* synthetic */ h0a(i4t0 i4t0Var) {
        this.f86188a = i4t0Var;
    }

    /* JADX INFO: renamed from: a */
    public static cag0 m46269a() {
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-your-library-folder-page";
        yt91VarM50626j.f276052f = "3.0.1";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = null;
        zt91 zt91VarM94607a = yt91VarM50626j.m94607a();
        Collections.singletonList("playlist/folder");
        st91 st91Var = st91.f213865b;
        return new cag0(new vch0(new st91(fr0.m42467k(zt91VarM94607a)), 19));
    }

    /* JADX INFO: renamed from: b */
    public void m46270b() {
        kv91 kv91Var = (kv91) this.f86188a.get();
        cag0 cag0VarM46269a = m46269a();
        yt91 yt91VarM96903c = cag0VarM46269a.f35816b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("cancel_action", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), ((vch0) cag0VarM46269a.f35817c).f240134b, System.currentTimeMillis()), null);
    }

    @Override // p204p.ffz
    /* JADX INFO: renamed from: e */
    public Object mo24334e() {
        return Integer.valueOf(((m0a) this.f86188a.get()).m60447w());
    }
}
