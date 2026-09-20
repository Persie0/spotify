package p204p;

import android.animation.ValueAnimator;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes6.dex */
public final class u481 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f226622a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w481 f226623b;

    public /* synthetic */ u481(w481 w481Var, int i) {
        this.f226622a = i;
        this.f226623b = w481Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f226622a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w481 w481Var = this.f226623b;
                w481.m87167a(w481Var, fFloatValue);
                float f = w481Var.f247756h * fFloatValue;
                RectF rectF = w481Var.f247748R0;
                float f2 = -f;
                rectF.left = f2;
                rectF.top = f2;
                rectF.right = f;
                rectF.bottom = f;
                w481Var.invalidate();
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w481 w481Var2 = this.f226623b;
                w481.m87167a(w481Var2, fFloatValue2);
                float f3 = w481Var2.f247756h * fFloatValue2;
                RectF rectF2 = w481Var2.f247748R0;
                float f4 = -f3;
                rectF2.left = f4;
                rectF2.top = f4;
                rectF2.right = f3;
                rectF2.bottom = f3;
                w481Var2.invalidate();
                break;
        }
    }
}
