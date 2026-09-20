package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class e19 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55146a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p19 f55147b;

    public /* synthetic */ e19(p19 p19Var, int i) {
        this.f55146a = i;
        this.f55147b = p19Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f55146a) {
            case 0:
                this.f55147b.m68778d();
                break;
            default:
                this.f55147b.m68778d();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f55146a) {
            case 1:
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.f55147b.f172995d;
                snackbarContentLayout.f2162a.setAlpha(0.0f);
                long j = 180;
                long j2 = 70;
                snackbarContentLayout.f2162a.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
                if (snackbarContentLayout.f2163b.getVisibility() == 0) {
                    snackbarContentLayout.f2163b.setAlpha(0.0f);
                    snackbarContentLayout.f2163b.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
