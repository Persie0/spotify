package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class f19 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64817a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f64818b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f64819c;

    public /* synthetic */ f19(Object obj, int i, int i2) {
        this.f64817a = i2;
        this.f64819c = obj;
        this.f64818b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f64817a) {
            case 0:
                ((p19) this.f64819c).m68777c(this.f64818b);
                break;
            case 1:
                ((p19) this.f64819c).m68777c(this.f64818b);
                break;
            default:
                ((uk61) this.f64819c).f231247b = this.f64818b;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f64817a) {
            case 1:
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) ((p19) this.f64819c).f172995d;
                snackbarContentLayout.f2162a.setAlpha(1.0f);
                long j = 180;
                long j2 = 0;
                snackbarContentLayout.f2162a.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
                if (snackbarContentLayout.f2163b.getVisibility() == 0) {
                    snackbarContentLayout.f2163b.setAlpha(1.0f);
                    snackbarContentLayout.f2163b.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
                }
                break;
            case 2:
                ((uk61) this.f64819c).f231247b = this.f64818b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
