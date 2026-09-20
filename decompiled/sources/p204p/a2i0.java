package p204p;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class a2i0 extends ValueAnimator {

    /* JADX INFO: renamed from: a */
    public final y1i0 f11680a;

    public a2i0(y1i0 y1i0Var) {
        rx4 rx4Var = new rx4(this, 14);
        this.f11680a = y1i0Var;
        addUpdateListener(rx4Var);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void start() {
        this.f11680a.mo69082b();
        super.start();
    }
}
