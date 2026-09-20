package p204p;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class gd61 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SwipeRefreshLayout f78745a;

    public gd61(SwipeRefreshLayout swipeRefreshLayout) {
        this.f78745a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        md61 md61Var;
        SwipeRefreshLayout swipeRefreshLayout = this.f78745a;
        if (!swipeRefreshLayout.f1327c) {
            swipeRefreshLayout.m1126m();
            return;
        }
        swipeRefreshLayout.f1324a1.setAlpha(255);
        swipeRefreshLayout.f1324a1.start();
        if (swipeRefreshLayout.f1334f1 && (md61Var = swipeRefreshLayout.f1325b) != null) {
            ((qfx) md61Var).m72723a();
        }
        swipeRefreshLayout.f1311O0 = swipeRefreshLayout.f1317U0.getTop();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
