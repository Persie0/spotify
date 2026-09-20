package p204p;

import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class if0 {

    /* JADX INFO: renamed from: c */
    public static final mab0 f101598c = new mab0(new l45(18), 10);

    /* JADX INFO: renamed from: a */
    public final btv0 f101599a;

    /* JADX INFO: renamed from: b */
    public final m500 f101600b;

    public if0(btv0 btv0Var, m500 m500Var) {
        this.f101599a = btv0Var;
        this.f101600b = m500Var;
    }

    /* JADX INFO: renamed from: a */
    public static final void m50408a(if0 if0Var, gf0 gf0Var, mab0 mab0Var, boolean z) {
        m500 m500Var = if0Var.f101600b;
        c700 c700VarMo15683g0 = m500Var.mo15683g0();
        c700VarMo15683g0.getClass();
        xi8 xi8Var = new xi8(c700VarMo15683g0);
        if (((l45) mab0Var.f141550b) != null) {
            xi8Var.m91104o(R.anim.nav_slide_in_right, R.anim.nav_slide_out_left, R.anim.nav_slide_in_left, R.anim.nav_slide_out_right);
        }
        if (gf0Var instanceof ef0) {
            xi8Var.m91103n(R.id.zero_navigation_container, ((ef0) gf0Var).f58897a, "flow_fragment");
        } else {
            if (!(gf0Var instanceof ff0)) {
                throw new NoWhenBranchMatchedException();
            }
            ff0 ff0Var = (ff0) gf0Var;
            xi8Var.m91103n(R.id.zero_navigation_container, xi8Var.m91099j(ff0Var.f68870b, ff0Var.f68869a), "flow_fragment");
        }
        if (m500Var.mo15683g0().m31604F("flow_fragment") == null || z) {
            xi8Var.m91098i();
        } else {
            xi8Var.m91092c(null);
            xi8Var.m91096g(true, true);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m50410b(boolean z) {
        m500 m500Var = this.f101600b;
        ugr ugrVar = (ugr) m500Var.mo15683g0().m31604F("zero_dialog_fragment");
        i500 i500VarM31604F = m500Var.mo15683g0().m31604F("flow_fragment");
        if (ugrVar != null && i500VarM31604F != null) {
            ugrVar.dismiss();
            return true;
        }
        if (ugrVar != null && i500VarM31604F == null && !z) {
            ugrVar.dismiss();
            return true;
        }
        if (ugrVar != null && i500VarM31604F == null && z) {
            m500Var.finish();
            return true;
        }
        if (m500Var.mo15683g0().m31606K() == 0 && z) {
            m500Var.finish();
            return true;
        }
        if (m500Var.mo15683g0().m31606K() == 0 && !z) {
            return false;
        }
        c700 c700VarMo15683g0 = m500Var.mo15683g0();
        c700VarMo15683g0.getClass();
        c700VarMo15683g0.m31656x(new z600(c700VarMo15683g0, null, -1, 0), false);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m50411c(k0r k0rVar) {
        m50412d(k0rVar, null, false);
    }

    /* JADX INFO: renamed from: d */
    public final void m50412d(k0r k0rVar, mab0 mab0Var, boolean z) {
        this.f101600b.runOnUiThread(new hf0(mab0Var, z, this, k0rVar));
    }

    /* JADX INFO: renamed from: e */
    public void m50413e(k0r k0rVar, boolean z) {
        m50412d(k0rVar, null, z);
    }
}
