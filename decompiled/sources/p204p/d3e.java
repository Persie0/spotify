package p204p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class d3e implements MobiusLoop.Logger {

    /* JADX INFO: renamed from: a */
    public final xlg0 f44854a;

    /* JADX INFO: renamed from: b */
    public final gag0 f44855b;

    /* JADX INFO: renamed from: c */
    public final wg61 f44856c;

    public d3e(akm akmVar, xlg0 xlg0Var, gag0 gag0Var) {
        this.f44854a = xlg0Var;
        this.f44855b = gag0Var;
        this.f44856c = new wg61(new fub(akmVar, 26));
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: a */
    public final void mo15583a(Object obj, Object obj2, Next next) {
        u2e u2eVar = (u2e) obj;
        q2e q2eVar = (q2e) obj2;
        gag0 gag0Var = this.f44855b;
        zt91 zt91Var = gag0Var.f78050c;
        zt91 zt91Var2 = this.f44854a.f263144b;
        boolean zM88271j = wj50.m88271j(q2eVar, p2e.f173335a);
        nau nauVar = nau.f152117a;
        if (zM88271j) {
            kv91 kv91VarM34828g = m34828g();
            yt91 yt91VarM96903c = zt91Var2.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("close_account_button", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            kv91VarM34828g.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
        } else if (wj50.m88271j(q2eVar, p2e.f173340f)) {
            kv91 kv91VarM34828g2 = m34828g();
            yt91 yt91VarM96903c2 = zt91Var2.m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("close_account_dialog", null, null, null, null));
            yt91VarM96903c2.f276056j = true;
            yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
            yt91VarM96903c3.f276055i.add(new bu91("cancel_button", null, null, null, null));
            yt91VarM96903c3.f276056j = false;
            kv91VarM34828g2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
        } else if (wj50.m88271j(q2eVar, p2e.f173338d)) {
            kv91 kv91VarM34828g3 = m34828g();
            yt91 yt91VarM96903c4 = zt91Var2.m96903c();
            yt91VarM96903c4.f276055i.add(new bu91("close_account_dialog", null, null, null, null));
            yt91VarM96903c4.f276056j = true;
            yt91 yt91VarM96903c5 = yt91VarM96903c4.m94607a().m96903c();
            yt91VarM96903c5.f276055i.add(new bu91("cancel_button", null, null, null, null));
            yt91VarM96903c5.f276056j = false;
            kv91VarM34828g3.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c5.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
        } else if (wj50.m88271j(q2eVar, p2e.f173339e)) {
            kv91 kv91VarM34828g4 = m34828g();
            yt91 yt91VarM96903c6 = zt91Var2.m96903c();
            yt91VarM96903c6.f276055i.add(new bu91("close_account_dialog", null, null, null, null));
            yt91VarM96903c6.f276056j = true;
            yt91 yt91VarM96903c7 = yt91VarM96903c6.m94607a().m96903c();
            yt91VarM96903c7.f276055i.add(new bu91("confirm_button", null, null, null, null));
            yt91VarM96903c7.f276056j = false;
            kv91VarM34828g4.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c7.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
        } else if (!wj50.m88271j(q2eVar, p2e.f173336b) && !wj50.m88271j(q2eVar, p2e.f173337c)) {
            if (wj50.m88271j(q2eVar, p2e.f173341g)) {
                kv91 kv91VarM34828g5 = m34828g();
                yt91 yt91VarM96903c8 = zt91Var.m96903c();
                yt91VarM96903c8.f276055i.add(new bu91("dismiss_button", null, null, null, null));
                yt91VarM96903c8.f276056j = false;
                kv91VarM34828g5.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c8.m94607a(), gag0Var.f78049b, System.currentTimeMillis()), null);
            } else {
                if (!wj50.m88271j(q2eVar, p2e.f173342h)) {
                    throw new NoWhenBranchMatchedException();
                }
                kv91 kv91VarM34828g6 = m34828g();
                yt91 yt91VarM96903c9 = zt91Var.m96903c();
                yt91VarM96903c9.f276055i.add(new bu91("try_again_button", null, null, null, null));
                yt91VarM96903c9.f276056j = false;
                kv91VarM34828g6.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("retry", 1, nauVar), yt91VarM96903c9.m94607a(), gag0Var.f78049b, System.currentTimeMillis()), null);
            }
        }
        next.m15611e(new c3e(0, u2eVar, this));
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15584b(Object obj, Object obj2, Exception exc) {
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15585c(Object obj, First first) {
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo15586d(Object obj, Object obj2) {
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15587e(Object obj) {
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15588f(Object obj, Exception exc) {
    }

    /* JADX INFO: renamed from: g */
    public final kv91 m34828g() {
        return (kv91) this.f44856c.getValue();
    }
}
