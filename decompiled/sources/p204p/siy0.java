package p204p;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final class siy0 implements q440 {

    /* JADX INFO: renamed from: a */
    public ValueAnimator f209685a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tiy0 f209686b;

    public siy0(tiy0 tiy0Var) {
        this.f209686b = tiy0Var;
    }

    @Override // p204p.q440
    public final void clear() {
        vie1.m85624f("ScreenFlashView");
        ValueAnimator valueAnimator = this.f209685a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f209685a = null;
        }
        tiy0 tiy0Var = this.f209686b;
        tiy0Var.setAlpha(0.0f);
        tiy0Var.setBrightness(0.0f);
    }
}
