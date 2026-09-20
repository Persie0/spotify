package p204p;

import android.view.View;
import com.spotify.nowplayingmodes.adsmode.p115ui.overlay.AdsOverlayControlsLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class n12 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f149267a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AdsOverlayControlsLayout f149268b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n12(AdsOverlayControlsLayout adsOverlayControlsLayout, int i) {
        super(0);
        this.f149267a = i;
        this.f149268b = adsOverlayControlsLayout;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f149267a) {
            case 0:
                this.f149268b.f6371g.onNext(l1m0.f128756b);
                break;
            case 1:
                View view = this.f149268b.f6356P0;
                if (view != null) {
                    view.setVisibility(4);
                }
                break;
            default:
                AdsOverlayControlsLayout adsOverlayControlsLayout = this.f149268b;
                adsOverlayControlsLayout.f6371g.onNext(l1m0.f128755a);
                View view2 = adsOverlayControlsLayout.f6356P0;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
