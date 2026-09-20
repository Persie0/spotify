package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final class ylp extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dkv0 f274065a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f274066b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f274067c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f274068d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f274069e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ cmp f274070f;

    public ylp(cmp cmpVar, dkv0 dkv0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f274070f = cmpVar;
        this.f274065a = dkv0Var;
        this.f274066b = i;
        this.f274067c = view;
        this.f274068d = i2;
        this.f274069e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f274066b;
        View view = this.f274067c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f274068d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f274069e.setListener(null);
        cmp cmpVar = this.f274070f;
        dkv0 dkv0Var = this.f274065a;
        cmpVar.m61992d(dkv0Var);
        cmpVar.f39753p.remove(dkv0Var);
        cmpVar.m33404p();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f274070f.getClass();
    }
}
