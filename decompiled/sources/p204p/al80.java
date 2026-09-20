package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class al80 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16796a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bl80 f16797b;

    public /* synthetic */ al80(bl80 bl80Var, int i) {
        this.f16796a = i;
        this.f16797b = bl80Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f16796a) {
            case 1:
                super.onAnimationEnd(animator);
                bl80 bl80Var = this.f16797b;
                bl80Var.mo29747d();
                fw4 fw4Var = bl80Var.f28120Y;
                if (fw4Var != null) {
                    fw4Var.mo24427a();
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f16796a) {
            case 0:
                super.onAnimationRepeat(animator);
                bl80 bl80Var = this.f16797b;
                bl80Var.f28125i = (bl80Var.f28125i + 1) % bl80Var.f28124h.f107387c.length;
                bl80Var.f28126t = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
