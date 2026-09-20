package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes9.dex */
public final class xs0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f265440a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f265441b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eh00 f265442c;

    public /* synthetic */ xs0(eh00 eh00Var, eh00 eh00Var2, int i) {
        this.f265440a = i;
        this.f265441b = eh00Var;
        this.f265442c = eh00Var2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f265440a) {
            case 0:
                eh00 eh00Var = this.f265442c;
                if (eh00Var != null) {
                    eh00Var.invoke();
                }
                break;
            default:
                eh00 eh00Var2 = this.f265442c;
                if (eh00Var2 != null) {
                    eh00Var2.invoke();
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f265440a) {
            case 0:
                eh00 eh00Var = this.f265441b;
                if (eh00Var != null) {
                    eh00Var.invoke();
                }
                break;
            default:
                eh00 eh00Var2 = this.f265441b;
                if (eh00Var2 != null) {
                    eh00Var2.invoke();
                }
                break;
        }
    }
}
