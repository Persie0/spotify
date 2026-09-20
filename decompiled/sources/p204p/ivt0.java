package p204p;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes10.dex */
public final class ivt0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f106286a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e1e0 f106287b;

    public /* synthetic */ ivt0(e1e0 e1e0Var, int i) {
        this.f106286a = i;
        this.f106287b = e1e0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f106286a) {
            case 0:
                lvt0 lvt0Var = (lvt0) this.f106287b.f55187c;
                if (lvt0Var != null) {
                    lvt0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                break;
            default:
                lvt0 lvt0Var2 = (lvt0) this.f106287b.f55187c;
                if (lvt0Var2 != null) {
                    lvt0Var2.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                break;
        }
    }
}
