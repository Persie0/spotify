package p204p;

import android.content.Context;
import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingFrameLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class lwb1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f137522a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qwb1 f137523b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lwb1(qwb1 qwb1Var, int i) {
        super(0);
        this.f137522a = i;
        this.f137523b = qwb1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f137522a) {
            case 0:
                return this.f137523b.f193287g1;
            case 1:
                qwb1 qwb1Var = this.f137523b;
                return qwb1Var.f193301m1.m86495a(new xup((Context) qwb1Var.f193268a.f60293a.f220237b));
            case 2:
                return new bjc0(this.f137523b.f193290h1, kwb1.f127068g);
            case 3:
                kxb1 kxb1Var = this.f137523b.f193314s2;
                if (kxb1Var != null) {
                    kxb1Var.f127444u.mo30411m(rwb1.f203318c);
                    return w2a1.f247311a;
                }
                wj50.m88260d0("pageStateController");
                throw null;
            case 4:
                kxb1 kxb1Var2 = this.f137523b.f193314s2;
                if (kxb1Var2 == null) {
                    wj50.m88260d0("pageStateController");
                    throw null;
                }
                if (kxb1Var2.f127439p) {
                    kxb1Var2.f127444u.mo30411m(swb1.f214640c);
                }
                return w2a1.f247311a;
            case 5:
                qwb1 qwb1Var2 = this.f137523b;
                OverlayHidingFrameLayout overlayHidingFrameLayout = qwb1Var2.f193242O1;
                if (overlayHidingFrameLayout == null) {
                    wj50.m88260d0("overlayControlsView");
                    throw null;
                }
                if (overlayHidingFrameLayout.m15998e()) {
                    qwb1Var2.f193310q2 = true;
                }
                OverlayHidingFrameLayout overlayHidingFrameLayout2 = qwb1Var2.f193242O1;
                if (overlayHidingFrameLayout2 != null) {
                    overlayHidingFrameLayout2.mo15995a(false);
                    return w2a1.f247311a;
                }
                wj50.m88260d0("overlayControlsView");
                throw null;
            case 6:
                qwb1 qwb1Var3 = this.f137523b;
                if (qwb1Var3.f193310q2) {
                    OverlayHidingFrameLayout overlayHidingFrameLayout3 = qwb1Var3.f193242O1;
                    if (overlayHidingFrameLayout3 == null) {
                        wj50.m88260d0("overlayControlsView");
                        throw null;
                    }
                    overlayHidingFrameLayout3.mo15997c(false);
                }
                qwb1Var3.f193310q2 = false;
                return w2a1.f247311a;
            default:
                kxb1 kxb1Var3 = this.f137523b.f193314s2;
                if (kxb1Var3 != null) {
                    kxb1Var3.f127444u.mo30411m(vwb1.f245453c);
                    return w2a1.f247311a;
                }
                wj50.m88260d0("pageStateController");
                throw null;
        }
    }
}
