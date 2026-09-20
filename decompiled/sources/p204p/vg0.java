package p204p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.music.SpotifyMainActivity;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import java.util.Deque;

/* JADX INFO: loaded from: classes8.dex */
public final class vg0 {

    /* JADX INFO: renamed from: a */
    public final ekx0 f241076a;

    /* JADX INFO: renamed from: b */
    public final o700 f241077b;

    /* JADX INFO: renamed from: c */
    public final k201 f241078c;

    /* JADX INFO: renamed from: d */
    public final ica f241079d;

    /* JADX INFO: renamed from: e */
    public final wvp f241080e;

    /* JADX INFO: renamed from: f */
    public final r55 f241081f;

    /* JADX INFO: renamed from: g */
    public final dic1 f241082g;

    public vg0(ekx0 ekx0Var, o700 o700Var, k201 k201Var, ica icaVar, wvp wvpVar, r55 r55Var, dic1 dic1Var) {
        this.f241076a = ekx0Var;
        this.f241077b = o700Var;
        this.f241078c = k201Var;
        this.f241079d = icaVar;
        this.f241080e = wvpVar;
        this.f241081f = r55Var;
        this.f241082g = dic1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m85388a() {
        r55 r55Var = this.f241081f;
        if (r55Var.isDestroyed() || r55Var.isFinishing()) {
            return;
        }
        ((SpotifyMainActivity) this.f241077b).m15687w0().f60741a = Bundle.EMPTY;
        r55Var.setIntent((Intent) this.f241082g.m36074a(r55Var, WidgetInteraction.Background.DESTINATION_HOME).f120028b);
        r55Var.recreate();
    }

    /* JADX INFO: renamed from: b */
    public final u301 m85389b() {
        this.f241076a.mo39318D();
        ((x0p) this.f241079d).m89591e();
        k201 k201Var = this.f241078c;
        l5j0 l5j0Var = k201Var.f118465a;
        l5j0Var.mo58251n();
        k201Var.f118466b.f34940b.mo33104m(null);
        l8j0 l8j0VarMo58241d = l5j0Var.mo58241d();
        k5j0 k5j0Var = l8j0VarMo58241d.f130877a;
        Deque deque = l8j0VarMo58241d.f130880d;
        Deque deque2 = l8j0VarMo58241d.f130879c;
        k5j0 k5j0Var2 = l8j0VarMo58241d.f130878b;
        boolean z = true;
        boolean z2 = k5j0Var == null && k5j0Var2 == null && deque2.isEmpty() && deque.isEmpty();
        boolean z3 = k5j0Var != null;
        boolean z4 = k5j0Var2 != null;
        String str = "currentEntry=" + z3 + ", previousEntry=" + z4 + ", normalBackStack=" + deque2.size() + ", overlayBackStack=" + deque.size();
        this.f241080e.m89135a();
        elq elqVarM15687w0 = ((SpotifyMainActivity) this.f241077b).m15687w0();
        elqVarM15687w0.f60741a = null;
        i700 i700Var = elqVarM15687w0.f60742b;
        z4y z4yVar = i700Var.f99398g;
        if (i700Var.f99389X) {
            prv0 prv0Var = i700Var.f99388M0;
            if (prv0Var != null) {
                prv0Var.m70734a();
            }
            i700Var.f99388M0 = null;
            fxi fxiVar = i700Var.f99396e;
            if (fxiVar.f74378a) {
                fxiVar.f74380c.removeCallbacksAndMessages(null);
                gb80 gb80Var = fxiVar.f74379b;
                if (gb80Var != null) {
                    gb80Var.mo31988d(fxiVar.f74382e);
                }
                fxiVar.f74379b = null;
                fxiVar.f74378a = false;
            }
            oc80 oc80Var = fxiVar.f74381d;
            fb80 fb80Var = oc80Var.f163857d;
            fb80 fb80Var2 = fb80.f67752c;
            boolean zM41223a = fb80Var.m41223a(fb80Var2);
            fb80 fb80Var3 = fb80.f67750a;
            if (zM41223a) {
                oc80Var.m66678i(fb80Var3);
            }
            fxi fxiVar2 = i700Var.f99397f;
            if (fxiVar2.f74381d.f163857d == fb80.f67751b) {
                z4yVar.m95394g();
                i700Var.f99399h.m66676g(ta80.ON_DESTROY);
            } else {
                if (fxiVar2.f74378a) {
                    fxiVar2.f74380c.removeCallbacksAndMessages(null);
                    gb80 gb80Var2 = fxiVar2.f74379b;
                    if (gb80Var2 != null) {
                        gb80Var2.mo31988d(fxiVar2.f74382e);
                    }
                    fxiVar2.f74379b = null;
                    fxiVar2.f74378a = false;
                }
                oc80 oc80Var2 = fxiVar2.f74381d;
                if (oc80Var2.f163857d.m41223a(fb80Var2)) {
                    oc80Var2.m66678i(fb80Var3);
                }
            }
            z = ((c600) z4yVar.f279405b).f34326N0.f34659L;
        }
        if (z && z2) {
            m85388a();
            return wjr0.f252021X;
        }
        return new t301("fragmentTeardown=" + z + ", navigation=[" + str + "]");
    }
}
