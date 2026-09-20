package p204p;

import android.graphics.drawable.Drawable;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes8.dex */
public final class n77 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f151089a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o77 f151090b;

    public /* synthetic */ n77(o77 o77Var, int i) {
        this.f151089a = i;
        this.f151090b = o77Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f151089a) {
            case 0:
                o77 o77Var = this.f151090b;
                AppCompatTextView appCompatTextView = o77Var.f162477b;
                ViewPropertyAnimator viewPropertyAnimator = o77Var.f162480e;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                float f = o77Var.getLayoutParams().width;
                appCompatTextView.setVisibility(0);
                Drawable drawable = o77Var.f162479d;
                if (drawable != null) {
                    drawable.setTintList(o77Var.f162483h);
                }
                appCompatTextView.setAlpha(0.0f);
                appCompatTextView.setTranslationX(f);
                TransitionManager.beginDelayedTransition((ViewGroup) o77Var.getParent());
                o77Var.f162480e = appCompatTextView.animate().setInterpolator(new ydy()).setDuration(600L).translationX(0.0f).alpha(1.0f).withEndAction(new n77(o77Var, 1));
                o77Var.f162481f = null;
                break;
            default:
                o77 o77Var2 = this.f151090b;
                Drawable drawable2 = o77Var2.f162479d;
                if (drawable2 != null) {
                    drawable2.setTintList(o77Var2.f162482g);
                }
                o77Var2.f162480e = null;
                break;
        }
    }
}
