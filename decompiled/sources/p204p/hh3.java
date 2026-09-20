package p204p;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class hh3 implements fl20, f1s0, vcu, dpy0, r3v0, b701, zb6 {

    /* JADX INFO: renamed from: a */
    public final i4t0 f91278a;

    /* JADX INFO: renamed from: b */
    public final th3 f91279b;

    public hh3(h4t0 h4t0Var, th3 th3Var) {
        this.f91278a = h4t0Var;
        this.f91279b = th3Var;
    }

    @Override // p204p.b701
    /* JADX INFO: renamed from: a */
    public final d850 mo28342a() {
        yt91 yt91VarM96903c = this.f91279b.m80820e().f35816b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("settings_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        String str = ih3.f102141d;
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return m47495l().mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.r3v0
    /* JADX INFO: renamed from: b */
    public final d850 mo26426b() {
        yt91 yt91VarM96903c = this.f91279b.m80820e().f35816b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("recents_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        String str = ih3.f102140c;
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return m47495l().mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.fl20
    /* JADX INFO: renamed from: c */
    public final d850 mo41978c() {
        return m47495l().mo57453r(new av91("", "", new dv91("hit", 1), new bv91("quick_scroll", 1, nau.f152117a), this.f91279b.m80820e().f35816b, st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.vcu
    /* JADX INFO: renamed from: d */
    public final void mo47490d(String str) {
        kv91 kv91VarM47495l = m47495l();
        pkh0 pkh0VarM80819d = this.f91279b.m80819d();
        yt91 yt91VarM96903c = pkh0VarM80819d.f178463b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("empty_view_deprecated", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = zt91VarM94607a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = pkh0VarM80819d.f178464c;
        kv91VarM47495l.mo57449i((ou91) nu91Var.m87248a(), null);
    }

    @Override // p204p.fl20
    /* JADX INFO: renamed from: e */
    public final d850 mo41979e() {
        kv91 kv91VarM47495l = m47495l();
        yt91 yt91VarM96903c = this.f91279b.m80820e().f35816b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("create_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        String str = ih3.f102138a;
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return kv91VarM47495l.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.zb6
    /* JADX INFO: renamed from: f */
    public final d850 mo47491f(String str, String str2) {
        yt91 yt91VarM96903c = this.f91279b.m80818c().f189016b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("assistant", str, -1, null, null));
        yt91VarM96903c.f276056j = true;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("action_button", str, null, null, null));
        yt91VarM96903c2.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str2.toString();
        if (string == null) {
            string = "";
        }
        return m47495l().mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.zb6
    /* JADX INFO: renamed from: g */
    public final d850 mo47492g(String str, String str2) {
        yt91 yt91VarM96903c = this.f91279b.m80818c().f189016b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("assistant", str, -1, null, null));
        yt91VarM96903c.f276056j = true;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("action_button", str, null, null, null));
        yt91VarM96903c2.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str2.toString();
        if (string == null) {
            string = "";
        }
        return m47495l().mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.zb6
    /* JADX INFO: renamed from: h */
    public final void mo47493h(String str) {
        yt91 yt91VarM96903c = this.f91279b.m80818c().f189016b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("assistant", str, -1, null, null));
        yt91VarM96903c.f276056j = true;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("close_button", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        m47495l().mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.zb6
    /* JADX INFO: renamed from: i */
    public final void mo47494i(String str) {
        yt91 yt91VarM96903c = this.f91279b.m80818c().f189016b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("assistant", str, -1, null, null));
        yt91VarM96903c.f276056j = true;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("close_button", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        m47495l().mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.f1s0
    /* JADX INFO: renamed from: j */
    public final d850 mo40559j(String str) {
        yt91 yt91VarM96903c = this.f91279b.m80820e().f35816b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("profile_button", null, null, str, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        if (string == null) {
            string = "";
        }
        return m47495l().mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.dpy0
    /* JADX INFO: renamed from: k */
    public final d850 mo36588k() {
        yt91 yt91VarM96903c = this.f91279b.m80820e().f35816b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("search_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        String str = ih3.f102139b;
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return m47495l().mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: l */
    public final kv91 m47495l() {
        return (kv91) this.f91278a.get();
    }

    /* JADX INFO: renamed from: m */
    public final qkh0 m47496m(lw8 lw8Var) {
        vch0 vch0Var = new vch0(this.f91279b.mo36745b(), 20);
        int iOrdinal = lw8Var.ordinal();
        int i = 2;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i = 9;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 1;
            }
        }
        return new qkh0(vch0Var, i);
    }
}
