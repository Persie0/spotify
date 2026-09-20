package p204p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class rat0 implements MobiusLoop.Logger {

    /* JADX INFO: renamed from: a */
    public final kv91 f197382a;

    /* JADX INFO: renamed from: b */
    public final xxg0 f197383b;

    public rat0(kv91 kv91Var) {
        this.f197382a = kv91Var;
        st91 st91Var = st91.f213865b;
        this.f197383b = new xxg0(21, (byte) 0);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: a */
    public final void mo15583a(Object obj, Object obj2, Next next) {
        qat0 qat0Var = (qat0) obj2;
        boolean zM88271j = wj50.m88271j(qat0Var, mat0.f141672a);
        nau nauVar = nau.f152117a;
        xxg0 xxg0Var = this.f197383b;
        kv91 kv91Var = this.f197382a;
        if (zM88271j) {
            xxg0Var.getClass();
            yt91 yt91VarM96903c = xxg0Var.f267003b.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("final_page", null, null, null, null));
            yt91VarM96903c.f276056j = true;
            yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("close_button", null, null, null, null));
            yt91VarM96903c2.f276056j = false;
            kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
            return;
        }
        if (!wj50.m88271j(qat0Var, pat0.f175613a)) {
            if (!(qat0Var instanceof kat0) && !wj50.m88271j(qat0Var, lat0.f131414a) && !wj50.m88271j(qat0Var, nat0.f152116a) && !wj50.m88271j(qat0Var, oat0.f163456a)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        xxg0Var.getClass();
        yt91 yt91VarM96903c3 = xxg0Var.f267003b.m96903c();
        yt91VarM96903c3.f276055i.add(new bu91("final_page", null, null, null, null));
        yt91VarM96903c3.f276056j = true;
        yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
        yt91VarM96903c4.f276055i.add(new bu91("end_button", null, null, null, null));
        yt91VarM96903c4.f276056j = false;
        kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
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
}
