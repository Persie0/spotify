package p204p;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes9.dex */
public final class j6c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f109274a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f109275b;

    public /* synthetic */ j6c(View view, int i) {
        this.f109274a = i;
        this.f109275b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f109274a) {
            case 0:
                View view = this.f109275b;
                h6j h6jVar = (h6j) view.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) h6jVar).height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.setLayoutParams(h6jVar);
                view.requestLayout();
                break;
            default:
                this.f109275b.getBackground().setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
