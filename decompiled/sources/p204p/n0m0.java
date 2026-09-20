package p204p;

import android.view.View;
import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingFrameLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class n0m0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f149114a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ OverlayHidingFrameLayout f149115b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0m0(OverlayHidingFrameLayout overlayHidingFrameLayout, int i) {
        super(0);
        this.f149114a = i;
        this.f149115b = overlayHidingFrameLayout;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f149114a) {
            case 0:
                this.f149115b.f6311a.onNext(l1m0.f128756b);
                break;
            case 1:
                View view = this.f149115b.f6318h;
                if (view != null) {
                    view.setVisibility(4);
                }
                break;
            default:
                OverlayHidingFrameLayout overlayHidingFrameLayout = this.f149115b;
                overlayHidingFrameLayout.f6311a.onNext(l1m0.f128755a);
                View view2 = overlayHidingFrameLayout.f6318h;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
