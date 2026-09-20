package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class cfp0 implements zn5 {

    /* JADX INFO: renamed from: a */
    public final kv91 f37418a;

    /* JADX INFO: renamed from: b */
    public final xug0 f37419b = new xug0(26, (byte) 0);

    public cfp0(kv91 kv91Var) {
        this.f37418a = kv91Var;
    }

    @Override // p204p.zn5
    /* JADX INFO: renamed from: a */
    public final d850 mo32667a() {
        xug0 xug0Var = this.f37419b;
        xug0Var.getClass();
        yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("disclosure_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        return this.f37418a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.zn5
    /* JADX INFO: renamed from: b */
    public final d850 mo32668b(String str) {
        xug0 xug0Var = this.f37419b;
        xug0Var.getClass();
        yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("copy_prompt_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        if (string == null) {
            string = "";
        }
        return this.f37418a.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.zn5
    /* JADX INFO: renamed from: d */
    public final d850 mo32669d(String str) {
        xug0 xug0Var = this.f37419b;
        xug0Var.getClass();
        yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("close_button", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        return this.f37418a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.zn5
    /* JADX INFO: renamed from: f */
    public final d850 mo32670f() {
        xug0 xug0Var = this.f37419b;
        xug0Var.getClass();
        yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("generate_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        return this.f37418a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("create_playlist", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.zn5
    /* JADX INFO: renamed from: g */
    public final d850 mo32671g(String str) {
        return null;
    }
}
