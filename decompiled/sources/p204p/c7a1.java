package p204p;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class c7a1 extends zz8 implements b7a1 {

    /* JADX INFO: renamed from: M0 */
    public final zam0 f34840M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f34841N0;

    public c7a1(zam0 zam0Var, fnm0 fnm0Var, afm0 afm0Var, lbm0 lbm0Var, mv91 mv91Var, ot91 ot91Var, xre xreVar, dbm0 dbm0Var, Set set, gfm0 gfm0Var, gt91 gt91Var, boolean z) {
        super(zam0Var, fnm0Var, afm0Var, lbm0Var, mv91Var, ot91Var, xreVar, dbm0Var, set, gfm0Var, gt91Var, z);
        this.f34840M0 = zam0Var;
    }

    /* JADX INFO: renamed from: F */
    public final void m31703F() {
        this.f34841N0 = false;
        int i = this.f287920i;
        if (i == 3) {
            return;
        }
        if (i == 4 && !wj50.m88271j(this.f287909X.f277729c, this.f287911Z)) {
            yz8 yz8Var = this.f287909X;
            m97276C(yz8Var.f277727a, yz8Var.f277728b);
        }
        m97282w();
        this.f287920i = 3;
    }

    /* JADX INFO: renamed from: G */
    public final void m31704G() {
        this.f34841N0 = false;
        m97283x();
    }

    @Override // p204p.b7a1
    /* JADX INFO: renamed from: b */
    public void mo28370b(Bundle bundle) {
        m97285z(bundle);
        gfm0 gfm0Var = this.f287917f;
        if (gfm0Var.f79397c && gfm0Var.f79396b) {
            gfm0Var.f79402h = true;
            gfm0Var.f79403i = true;
        }
    }

    @Override // p204p.b7a1
    /* JADX INFO: renamed from: f */
    public Bundle mo28371f() {
        if (!this.f34841N0) {
            return null;
        }
        this.f34841N0 = false;
        return m97274A();
    }
}
