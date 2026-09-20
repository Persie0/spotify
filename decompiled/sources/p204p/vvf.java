package p204p;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vvf implements zb80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f245225a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f245226b;

    public /* synthetic */ vvf(Object obj, int i) {
        this.f245225a = i;
        this.f245226b = obj;
    }

    @Override // p204p.zb80
    /* JADX INFO: renamed from: y */
    public final void mo26206y(hc80 hc80Var, ta80 ta80Var) {
        Window window;
        View viewPeekDecorView;
        switch (this.f245225a) {
            case 0:
                cwf cwfVar = (cwf) this.f245226b;
                if (ta80Var == ta80.ON_STOP && (window = cwfVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                cwf cwfVar2 = (cwf) this.f245226b;
                if (ta80Var == ta80.ON_DESTROY) {
                    cwfVar2.f42738b.m43223d();
                    if (!cwfVar2.isChangingConfigurations()) {
                        cwfVar2.mo34134w().m47681a();
                    }
                    yvf yvfVar = cwfVar2.f42742f;
                    cwf cwfVar3 = yvfVar.f276658d;
                    cwfVar3.getWindow().getDecorView().removeCallbacks(yvfVar);
                    cwfVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(yvfVar);
                }
                break;
            default:
                g9y0 g9y0Var = (g9y0) this.f245226b;
                if (ta80Var == ta80.ON_START) {
                    g9y0Var.f77926h = true;
                } else if (ta80Var == ta80.ON_STOP) {
                    g9y0Var.f77926h = false;
                }
                break;
        }
    }
}
