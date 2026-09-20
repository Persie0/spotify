package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class m691 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uj5 f140430a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z691 f140431b;

    public m691(z691 z691Var, uj5 uj5Var) {
        this.f140431b = z691Var;
        this.f140430a = uj5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f140430a.remove(animator);
        this.f140431b.f279782L0.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f140431b.f279782L0.add(animator);
    }
}
