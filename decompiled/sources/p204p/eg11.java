package p204p;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class eg11 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fg11 f59199a;

    public eg11(fg11 fg11Var) {
        this.f59199a = fg11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f59199a.invalidateSelf();
    }
}
