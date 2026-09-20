package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class yde extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f271742a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zde f271743b;

    public /* synthetic */ yde(zde zdeVar, int i) {
        this.f271742a = i;
        this.f271743b = zdeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f271742a) {
            case 1:
                super.onAnimationEnd(animator);
                zde zdeVar = this.f271743b;
                zdeVar.mo29747d();
                fw4 fw4Var = zdeVar.f281697Y;
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
        switch (this.f271742a) {
            case 0:
                super.onAnimationRepeat(animator);
                zde zdeVar = this.f271743b;
                zdeVar.f281702i = (zdeVar.f281702i + 4) % zdeVar.f281701h.f107387c.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
