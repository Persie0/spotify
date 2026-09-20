package p204p;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class ct9 implements zn5 {

    /* JADX INFO: renamed from: a */
    public final kv91 f41812a;

    /* JADX INFO: renamed from: b */
    public final erg0 f41813b;

    /* JADX INFO: renamed from: c */
    public final gag0 f41814c;

    public ct9(kv91 kv91Var, int i) {
        this.f41812a = kv91Var;
        int iM38547C = edb.m38547C(i);
        int i2 = 1;
        if (iM38547C != 0) {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 2;
        }
        erg0 erg0Var = new erg0(i2);
        this.f41813b = erg0Var;
        this.f41814c = new gag0(erg0Var.mo24361d(), 15);
    }

    @Override // p204p.zn5
    /* JADX INFO: renamed from: a */
    public final d850 mo32667a() {
        erg0 erg0Var = this.f41813b;
        erg0Var.getClass();
        yt91 yt91VarM96903c = erg0Var.f62130a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("disclosure_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        return this.f41812a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.zn5
    /* JADX INFO: renamed from: b */
    public final d850 mo32668b(String str) {
        return null;
    }

    @Override // p204p.zn5
    /* JADX INFO: renamed from: c */
    public final void mo33825c() {
        gag0 gag0Var = this.f41814c;
        gag0Var.getClass();
        yt91 yt91VarM96903c = gag0Var.f78050c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("save_for_next_episode_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f41812a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), gag0Var.f78049b, System.currentTimeMillis()), null);
    }

    @Override // p204p.zn5
    /* JADX INFO: renamed from: d */
    public final d850 mo32669d(String str) {
        erg0 erg0Var = this.f41813b;
        erg0Var.getClass();
        yt91 yt91VarM96903c = erg0Var.f62130a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("cancel_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        return this.f41812a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.zn5
    /* JADX INFO: renamed from: e */
    public final void mo33826e() {
        this.f41812a.mo57449i(this.f41814c.mo24514e(), null);
    }

    @Override // p204p.zn5
    /* JADX INFO: renamed from: f */
    public final d850 mo32670f() {
        erg0 erg0Var = this.f41813b;
        erg0Var.getClass();
        yt91 yt91VarM96903c = erg0Var.f62130a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("primary_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        return this.f41812a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("submit", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.zn5
    /* JADX INFO: renamed from: g */
    public final d850 mo32671g(String str) {
        erg0 erg0Var = this.f41813b;
        erg0Var.getClass();
        yt91 yt91VarM96903c = erg0Var.f62130a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("disclaimer_link", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        if (string == null) {
            string = "";
        }
        return this.f41812a.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.zn5
    /* JADX INFO: renamed from: h */
    public final void mo33827h() {
        gag0 gag0Var = this.f41814c;
        gag0Var.getClass();
        yt91 yt91VarM96903c = gag0Var.f78050c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("generate_now_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f41812a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("create_episode", 1, nau.f152117a), yt91VarM96903c.m94607a(), gag0Var.f78049b, System.currentTimeMillis()), null);
    }
}
