package p204p;

import android.animation.ValueAnimator;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public final class g19 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f75550a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p19 f75551b;

    public /* synthetic */ g19(p19 p19Var, int i, byte b) {
        this.f75550a = i;
        this.f75551b = p19Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f75550a;
        p19 p19Var = this.f75551b;
        switch (i) {
            case 0:
                p19Var.f172994c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p19Var.f172994c.setScaleX(fFloatValue);
                p19Var.f172994c.setScaleY(fFloatValue);
                break;
            case 2:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Handler handler = p19.f172990p;
                p19Var.f172994c.setTranslationY(iIntValue);
                break;
            default:
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Handler handler2 = p19.f172990p;
                p19Var.f172994c.setTranslationY(iIntValue2);
                break;
        }
    }

    public g19(p19 p19Var, int i) {
        this.f75550a = 2;
        this.f75551b = p19Var;
    }
}
