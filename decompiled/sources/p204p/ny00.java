package p204p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public final class ny00 implements MobiusLoop.Logger {

    /* JADX INFO: renamed from: a */
    public final kv91 f159656a;

    /* JADX INFO: renamed from: b */
    public final xlg0 f159657b;

    public ny00(String str, kv91 kv91Var) {
        this.f159656a = kv91Var;
        this.f159657b = new xlg0(str, 18);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: a */
    public final void mo15583a(Object obj, Object obj2, Next next) {
        qy00 qy00Var = (qy00) obj;
        ly00 ly00Var = (ly00) obj2;
        boolean zEquals = ly00Var.equals(jy00.f117261a);
        xlg0 xlg0Var = this.f159657b;
        kv91 kv91Var = this.f159656a;
        if (zEquals) {
            xlg0Var.getClass();
            yt91 yt91VarM96903c = xlg0Var.f263144b.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("safety_center_label", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("navigate_to_external_uri", 1, Collections.singletonMap("destination", "")), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
            return;
        }
        if (ly00Var.equals(gy00.f85400a)) {
            xlg0Var.getClass();
            yt91 yt91VarM96903c2 = xlg0Var.f263144b.m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("done_button", null, null, null, null));
            yt91VarM96903c2.f276056j = false;
            zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
            String str = qy00Var.f193776a;
            dv91 dv91Var = new dv91("hit", 1);
            String string = str != null ? str.toString() : null;
            kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("block_content", 1, Collections.singletonMap("item_to_be_blocked", string != null ? string : "")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
            return;
        }
        if (ly00Var.equals(dy00.f54142a)) {
            xlg0Var.getClass();
            yt91 yt91VarM96903c3 = xlg0Var.f263144b.m96903c();
            yt91VarM96903c3.f276055i.add(new bu91("close_button", null, null, null, null));
            yt91VarM96903c3.f276056j = false;
            kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
            return;
        }
        if (ly00Var instanceof fy00) {
            Integer numValueOf = Integer.valueOf(((fy00) ly00Var).f74501a);
            xlg0Var.getClass();
            yt91 yt91VarM96903c4 = xlg0Var.f263144b.m96903c();
            yt91VarM96903c4.f276055i.add(new bu91("user_row", null, numValueOf, null, null));
            yt91VarM96903c4.f276056j = false;
            kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("toggle_state", 1, kkc0.m56695h0(new pqm0("state_before_toggle", "unblocked"), new pqm0("state_after_toggle", "blocked"))), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
            return;
        }
        if (ly00Var instanceof ky00) {
            Integer numValueOf2 = Integer.valueOf(((ky00) ly00Var).f127610a);
            xlg0Var.getClass();
            yt91 yt91VarM96903c5 = xlg0Var.f263144b.m96903c();
            yt91VarM96903c5.f276055i.add(new bu91("user_row", null, numValueOf2, null, null));
            yt91VarM96903c5.f276056j = false;
            kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("toggle_state", 1, kkc0.m56695h0(new pqm0("state_before_toggle", "blocked"), new pqm0("state_after_toggle", "unblocked"))), yt91VarM96903c5.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
        }
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
