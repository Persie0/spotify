package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final class xlp extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f263215a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dkv0 f263216b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f263217c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f263218d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ cmp f263219e;

    public xlp(cmp cmpVar, dkv0 dkv0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f263219e = cmpVar;
        this.f263216b = dkv0Var;
        this.f263218d = viewPropertyAnimator;
        this.f263217c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f263215a) {
            case 1:
                this.f263217c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f263215a) {
            case 0:
                this.f263218d.setListener(null);
                this.f263217c.setAlpha(1.0f);
                cmp cmpVar = this.f263219e;
                dkv0 dkv0Var = this.f263216b;
                cmpVar.m61992d(dkv0Var);
                cmpVar.f39754q.remove(dkv0Var);
                cmpVar.m33404p();
                break;
            default:
                this.f263218d.setListener(null);
                cmp cmpVar2 = this.f263219e;
                dkv0 dkv0Var2 = this.f263216b;
                cmpVar2.m61992d(dkv0Var2);
                cmpVar2.f39752o.remove(dkv0Var2);
                cmpVar2.m33404p();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f263215a) {
            case 0:
                this.f263219e.getClass();
                break;
            default:
                this.f263219e.getClass();
                break;
        }
    }

    public xlp(cmp cmpVar, dkv0 dkv0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f263219e = cmpVar;
        this.f263216b = dkv0Var;
        this.f263217c = view;
        this.f263218d = viewPropertyAnimator;
    }
}
