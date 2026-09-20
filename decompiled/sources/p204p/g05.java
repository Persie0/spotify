package p204p;

import android.view.animation.Animation;
import com.spotify.appendix.contentviewstate.view.LoadingView;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public final class g05 extends b05 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f75271a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f75272b;

    public g05(LoadingView loadingView) {
        this.f75272b = loadingView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.f75271a) {
            case 0:
                px0 px0Var = (px0) this.f75272b;
                LinkedList linkedList = (LinkedList) px0Var.f182174b;
                linkedList.remove();
                if (linkedList.size() >= 1) {
                    px0Var.m71329l();
                }
                break;
            default:
                LoadingView loadingView = (LoadingView) this.f75272b;
                if (animation != loadingView.f2987i) {
                    if (animation == loadingView.f2988t) {
                        loadingView.f2974L0 = 6;
                        loadingView.setVisibility(8);
                    }
                } else if (loadingView.f2974L0 == 3) {
                    loadingView.f2974L0 = 4;
                }
                break;
        }
    }

    public g05(px0 px0Var, h05 h05Var) {
        this.f75272b = px0Var;
    }
}
