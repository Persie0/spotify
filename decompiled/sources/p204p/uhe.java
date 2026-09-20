package p204p;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes4.dex */
public final class uhe implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f230434a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vhe f230435b;

    public /* synthetic */ uhe(vhe vheVar, int i) {
        this.f230434a = i;
        this.f230435b = vheVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f230434a) {
            case 0:
                this.f230435b.f257281c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vhe vheVar = this.f230435b;
                vheVar.f257281c.setScaleX(fFloatValue);
                vheVar.f257281c.setScaleY(fFloatValue);
                break;
        }
    }
}
