package p204p;

import android.animation.Animator;

/* JADX INFO: loaded from: classes8.dex */
public final class b0m0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21985a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c0m0 f21986b;

    public b0m0(int i, c0m0 c0m0Var) {
        this.f21985a = i;
        this.f21986b = c0m0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        c0m0 c0m0Var = this.f21986b;
        int i = this.f21985a;
        if (i == 0) {
            c0m0Var.f32823b.setBackgroundColor(i);
        }
        yxb0 yxb0Var = c0m0Var.f32830i;
        if (yxb0Var != null) {
            yxb0Var.invoke();
        }
        c0m0Var.f32830i = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
