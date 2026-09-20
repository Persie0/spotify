package p204p;

import android.view.View;
import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class kd61 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121625a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f121626b;

    public /* synthetic */ kd61(View view, int i) {
        this.f121625a = i;
        this.f121626b = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.f121625a) {
            case 0:
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f121626b;
                id61 id61Var = new id61(swipeRefreshLayout, 0);
                swipeRefreshLayout.f1328c1 = id61Var;
                id61Var.setDuration(150L);
                rde rdeVar = swipeRefreshLayout.f1317U0;
                rdeVar.f198106a = null;
                rdeVar.clearAnimation();
                swipeRefreshLayout.f1317U0.startAnimation(swipeRefreshLayout.f1328c1);
                break;
            default:
                this.f121626b.setVisibility(8);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.f121625a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.f121625a;
    }

    /* JADX INFO: renamed from: a */
    private final void m56165a(Animation animation) {
    }

    /* JADX INFO: renamed from: b */
    private final void m56166b(Animation animation) {
    }

    /* JADX INFO: renamed from: c */
    private final void m56167c(Animation animation) {
    }

    /* JADX INFO: renamed from: d */
    private final void m56168d(Animation animation) {
    }
}
