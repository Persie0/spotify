package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class aey extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f14982a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bey f14983b;

    public aey(bey beyVar) {
        this.f14983b = beyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f14982a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f14982a) {
            this.f14982a = false;
            return;
        }
        bey beyVar = this.f14983b;
        if (((Float) beyVar.f26480X0.getAnimatedValue()).floatValue() == 0.0f) {
            beyVar.f26482Y0 = 0;
            beyVar.m28977l(0);
        } else {
            beyVar.f26482Y0 = 2;
            beyVar.f26472Q0.invalidate();
        }
    }
}
