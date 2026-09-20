package p204p;

import android.R;
import android.view.animation.AlphaAnimation;
import com.spotify.appendix.contentviewstate.view.LoadingView;

/* JADX INFO: loaded from: classes3.dex */
public final class naa0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f152008a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LoadingView f152009b;

    public /* synthetic */ naa0(LoadingView loadingView, int i) {
        this.f152008a = i;
        this.f152009b = loadingView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f152008a) {
            case 0:
                LoadingView loadingView = this.f152009b;
                int i = loadingView.f2974L0;
                if (i == 3 || i == 4) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(loadingView.f2982d);
                    loadingView.f2979a.startAnimation(alphaAnimation);
                    loadingView.f2979a.setVisibility(0);
                }
                break;
            default:
                LoadingView loadingView2 = this.f152009b;
                int iM38547C = edb.m38547C(loadingView2.f2974L0);
                if (iM38547C == 0 || iM38547C == 1) {
                    if (loadingView2.f2974L0 == 2) {
                        loadingView2.removeCallbacks(loadingView2.f2975M0);
                    }
                    loadingView2.f2974L0 = 6;
                    LoadingView.m3272a(loadingView2);
                    loadingView2.f2980b.mo58464a();
                    loadingView2.setVisibility(8);
                } else if (iM38547C == 2 || iM38547C == 3) {
                    if (loadingView2.f2974L0 == 3) {
                        LoadingView.m3272a(loadingView2);
                    }
                    loadingView2.removeCallbacks(loadingView2.f2976N0);
                    loadingView2.f2974L0 = 5;
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(loadingView2.f2985g / 255.0f, 0.0f);
                    loadingView2.f2988t = alphaAnimation2;
                    alphaAnimation2.setFillAfter(true);
                    loadingView2.f2988t.setFillEnabled(true);
                    loadingView2.f2988t.setDuration(loadingView2.f2983e);
                    loadingView2.f2987i.setInterpolator(loadingView2.getContext(), R.interpolator.decelerate_quad);
                    loadingView2.f2988t.setAnimationListener(loadingView2.f2978P0);
                    loadingView2.startAnimation(loadingView2.f2988t);
                    loadingView2.f2980b.mo58464a();
                }
                break;
        }
    }
}
